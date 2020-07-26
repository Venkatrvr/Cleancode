package com.epam.cleancode;
import java.util.*;
public class HouseConstruction {
	public static void check(String s) {
		if(s.equals("standard materials"))
			standard();
		else if(s.equals("above standard materials"))
			above_standard();
		else if(s.equals("high standard material"))
			high_standard();
		else if(s.equals("high standard material and fully automated house"))
			high_standard_fully_automated();
		else
			noValidOption();
	}
	public static int standard() {
		return 1200;
	}
	public static int above_standard() {
		return 1500;
	}
	public static int high_standard() {
		return 1800;
	}
	public static int high_standard_fully_automated() {
		return 2500;
}
	public static String noValidOption()
	{
		return "Select valid option in type of house";
	}
	public static void main(String[] args){
	
			Scanner obj=new Scanner(System.in);
			String s=obj.nextLine();
			check(s);
			obj.close();
		
	
	}
}


