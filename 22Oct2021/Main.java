package threads;

import java.util.Scanner;

class primeNumber extends Thread {
	public synchronized void run()
	{
		int i = 0;
		int number = 0;
		String primenumbers= "";
	
		for (i = 1; i <= 50000; i++) {
			int countPrimeNumber = 0;
			for (number = i; number >= 1; number--) {
			
				if (i % number == 0) {
			countPrimeNumber = countPrimeNumber + 1;
				}
			}
		
			if (countPrimeNumber == 2) {
				primenumbers = primenumbers + i + " ";
			}
		}
	
		System.out.println("\nPrime numbers from 0 to 50000 : \n"
			+ primenumbers);
	
		System.out.println();
	}
}

public class Main {
	public static void main(String args[])
	{	
		primeNumber findPrimeNumber = new primeNumber();

		Thread m1 = new Thread(findPrimeNumber);
		Scanner sc = new Scanner(System.in);

		m1.start();

		long startTime = System.currentTimeMillis();

		try {

			m1.join();
		}
		catch (Exception e) {
			
		}
		long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("TotalTime: "+elapsedTime+" Milliseconds");
	}
}


