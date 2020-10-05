package com.loops;

public class IfElseIf {

	public static void main(String[] args) {
		
		
		String condition1="Option1";
		String condition2="Option2";
		
		
		
		//scenario 1
		if(condition1=="Option1") {
			System.out.println("Print if block");
			
		}else {
			System.out.println("Print else block");
		}
		
		//scenario 2
		if(condition1=="Option2") {
			System.out.println("Print if block");
		}else if(condition1=="Option1") {
			System.out.println("Print else if block");
		}else {
			System.out.println("Print else block");
		}
		
		//scenario 3
		if(condition1=="Option2") {
			System.out.println("Print if block");
		}else if (condition2=="Option1") {
			System.out.println("Print else if block");
		}else {
			System.out.println("Print else block");
		}
	}
}
