package com.epam.cleancode;

public class Intrest {
	public static double Simple(double p,double t,double r)
	{
		return(p*t*r)/100;
	}
    public static double Compound(double p,double t,double r)
    {
		return p*Math.pow(1.0+r/100.0,t)-p;
    }
    public static void main(String[] args)
    {
		Simple(3000,2,2);
		Compound(5000,3,3);
    }
}
