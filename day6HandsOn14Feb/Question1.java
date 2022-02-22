/*
 * 
 * Q1) Write a java program declare the string array Batch Id and just 
mention some batch id with different years eg. ACD22XD, & find 
out all the batch ids which belongs to the year 22 and print the 
total count of all those batch ids.
 * 
 * */


package com.org.gen.day6HandsOn14Feb;

public class Question1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt =0;
		String batchId[] = {"ACD22XD", "PONDDF22XDF", "GAL21FDPPD", "MACSWE20LKD", "LCMS22PXD"};
		for(int i=0;i<batchId.length;i++) {
			if(batchId[i].contains("22")) {
				System.out.println("batchID of Year 22 => "+ batchId[i]);
				cnt++;
			}
		}
		System.out.println("Total No. of Batches in 2022 => "+cnt);
	}

}
