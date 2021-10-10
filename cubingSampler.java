package cubingSample;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class cubingSampler {

	public static void main(String[] args) {
		
		int samplesize= 30, rand = 0;
		double meanTime = 0, totalTime = 0, totalDeviation= 0, stdDeviation = 0;
		
		double[] solves = new double[301];
		double[] samples = new double[samplesize];
		
		/*
		for(int z = 0; z < 300; z++) //test loop
		{
			solves[z] = Math.random();
		}
		*/
		
		File solvesfile = new File("C:\\Users\\samer\\Documents\\cube solves.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(solvesfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int z = 0; z < 300; z++)
		{
			solves[z] = Double.parseDouble(sc.nextLine());
		}
		
		for(int i = 0; i < samplesize; i++) //taking sample size
		{
			rand = (int)Math.ceil((300 * (Math.random()))) - 1; //random number 0-300
			samples[i]= solves[rand];
			System.out.println(samples[i]); //printing data values
			totalTime = totalTime + solves[rand];
		}
		
		meanTime = totalTime / samplesize;	
		System.out.println("Mean Solve Time: " + meanTime); //printing mean
		
		for(int x = 0; x < samplesize; x++) //calculating std deviation
		{
			totalDeviation = totalDeviation + Math.abs(samples[x] - meanTime);
		}
		
		stdDeviation = totalDeviation / samplesize;
		System.out.println("\nStandard Deviation: " + stdDeviation+ "\n"); //printing std dev
		
		//solves();
	}
	
	public static void solves()
	{
	
		DecimalFormat decfor = new DecimalFormat("##.00");
		
		double meanTime = 0, totalTime = 0, totalDeviation = 0, stdDeviation = 0;
		double[] solves = new double[223];
		
		for(int i = 0; i < 223; i++)
		{
			solves[i] = (12.87 + Math.random() * 6.64);
			System.out.println(decfor.format(solves[i]));
			totalTime = totalTime + solves[i];
			
		}
		
		meanTime = totalTime / 223;	
		System.out.println("\nMean Solve Time: " + meanTime); //printing mean
		
		for(int x = 0; x < 223; x++) //calculating std deviation
		{
			totalDeviation = totalDeviation + Math.abs(solves[x] - meanTime);
		}
		
		stdDeviation = totalDeviation / 223;
		System.out.println("\nStandard Deviation: " + stdDeviation + "\n"); //printing std dev
	}
}
