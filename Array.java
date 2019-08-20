package com.revature;

public class Array {
	
	static int[] marks= {10,20,30,40,50,60};
	
	public static int getTotal(int[] marks) {
		
		int total=0;
		for(int i=0; i<marks.length;i++) {
			
			 total+=marks[i];
		}
		
		return total;
	}
	
	/*public static double getAverage(int[] marks) {
		
		double average=0.0;
		int total=0;
		for(int i=0; i<marks.length;i++) {
			
			 total+=marks[i];
			 
		}
		average=total/marks.length;
		return average;
	}*/
	
	public static double getAverage(int total) {
		
		double average=total/marks.length;
		return average;
	}
	

	public static void main(String[] args) {
		
		int Total=getTotal(marks);
		
		System.out.println(Total);
		
      double avg=getAverage(Total);
		
		System.out.println(avg);
	
		

	}

}
