package com.greatlearning.main;

import java.util.Scanner;


import com.greatlearning.service.Floors;

public class DriverClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of Floors in the building ");
		int floors = sc.nextInt();
		
		Floors obj = new Floors();
		obj.sizeOfFloor(floors);
		obj.orderOfFloors();
		
		sc.close();

	}

}
