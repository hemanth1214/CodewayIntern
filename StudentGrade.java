package com.pratice.codesoft;

import java.util.Scanner;

public class StudentGrade 
{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 1st Subject Marks :");
			float sub1 = input.nextFloat();
			if(sub1<=100) {
				System.out.println("enter 2nd subject marks");
				float sub2 = input.nextFloat();
					if(sub2<=100) {
						System.out.println("entre the 3rd subject marks");
						float sub3 = input.nextFloat();
						if(sub3<=100) {
							System.out.println("entre th 4th subject marks");
							float sub4 = input.nextFloat();
							if(sub4<=100) {
								System.out.println("entre the 5th subject marks");
								float sub5 = input.nextFloat();
								if(sub5<=100) {
									float total =sub1+sub2+sub3+sub4+sub5;
									System.out.println("the total marks = "+total);
									float percentage = total/5;
									System.out.println("the total percentage is "+percentage+"%");
									if(percentage>=90)
										System.out.println("Grade A");
									else if(percentage>=80)
										System.out.println("Grade B");
									else if(percentage>=70)
										System.out.println("Grade C");
									else if(percentage>=60)
										System.out.println("Grade D");
									else if(percentage>=40)
										System.out.println("Grade E");
									else
										System.out.println("Grade F");
								}
								else {
									System.out.println("you entred the wrong number in the sub5");
								}
								
							}else {
								System.out.println("you entred the wrong number in the sub4");
							}
							
						}else {
							System.out.println("you entre the wrong number in sub3");
						}
				}else {
					System.out.println("you entred the wrong number in sub2");
				}
				
			}else {
				System.out.println("you entred the wrong number in sub1");
			}
		}
}