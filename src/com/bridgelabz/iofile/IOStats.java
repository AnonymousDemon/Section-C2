package com.bridgelabz.iofile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utilityC2.StatsU;

public class IOStats {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		StatsU utility = new StatsU();
		File file = new File("/home/slot2/eclipse-workspace/SectionC2/src/com/bridgelabz/file/Num");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		try {
			str = bufferedReader.readLine();
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		String[] stringArray = str.split(",");
		double[] arr = Arrays.stream(stringArray).mapToDouble(Double::parseDouble).toArray();
		System.out.println("MAX :" + utility.max(arr));
		System.out.println("MIN :" + utility.min(arr));
		System.out.println("MEAN :" + StatsU.mean(arr));
		System.out.println("VARIANCE :" + utility.variance(arr));
		System.out.println("STANDARD DEVIATION :" + utility.standardDeviation(arr));
		System.out.println("MEDIAN :" + StatsU.median(arr));
	}

}
