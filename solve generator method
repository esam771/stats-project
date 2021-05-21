public static void solves()
	{
	
		DecimalFormat decfor = new DecimalFormat("##.00");
		
		double meanTime = 0;
		double totalTime = 0;
		double totalDeviation = 0;
		double stdDeviation = 0;
		
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
