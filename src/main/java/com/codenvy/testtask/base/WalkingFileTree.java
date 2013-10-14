package com.codenvy.testtask.base;

import java.io.File;

public class WalkingFileTree {

	
	    public static void main(String[] args) {
	        String rootDir = "d:\\a\\b\\c\\d\\e\\f\\g";
	        File root = new File(rootDir);
	        root.mkdir();
	        File[] files = root.listFiles();
	        int i = 0;

	        while(i<files.length) {
	            File firstElement = files[i];
	            File[] subFiles = null;

	            if (firstElement.isDirectory()) {
	                subFiles = firstElement.listFiles();
	            }
	            else {
	                i++;
	                continue;
	            }
	            File[] temp = new File[files.length + subFiles.length];
	            for (int j = 0; j<=i; j++) 
	                temp[j] = files[j];
	            for (int k = 0; k<subFiles.length; k++)
	                temp[i+1+k] = subFiles[k];
	            for (int m = i+1; m<files.length; m++)
	                temp[m+subFiles.length] = files[m];

	            files = temp;
	            i++;
	        }

	        for (File file : files)
	            System.out.println(file.getPath());
	    }

}
