package edu.eci.arsw.primefinder;

public class Main {

	public static void main(String[] args) {
		
		PrimeFinderThread pft=new PrimeFinderThread(0, 9999999);
		PrimeFinderThread t2=new PrimeFinderThread(10000000, 19999999);
		PrimeFinderThread t3=new PrimeFinderThread(20000000, 30000000);
		
		pft.start();
		t2.start();
		t3.start();
		
		
	}
	
}
