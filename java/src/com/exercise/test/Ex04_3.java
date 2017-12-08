package com.exercise.test;

public class Ex04_3 {

	public static void main(String[] args) {
		
		int num=0;
		
		/*while (sum<=100) { //sum 100보다 작을때
			num++;
			if (num%2==0) {// 삼항연산자 가능
				sum=sum-num;
			}else{
				sum=sum+num;
			}
			
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);
		int sum=0;
		int totalsum=0;
		
		for(int i =0;i<=10;i++){
			sum+=i;
			totalsum+=sum;
		}
		System.out.println(totalsum);*/
		
		 {
			 for(int i=1;i<=6;i++)
			 for(int j=1;j<=6;j++)
			 if(i+j==6)
			 System.out.println(i+"+"+j+"="+(i+j));
			 } 
	}

}
