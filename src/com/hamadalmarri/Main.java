package com.hamadalmarri;

import com.hamadalmarri.NeuralNetwork.NeuralNetwork;
import com.hamadalmarri.NeuralNetwork.Trainers.XorTrainer;

public class Main {

	public static void main(String[] args) {
		int[] config = new int[] { 2, 4, 1 };
		NeuralNetwork nw = new NeuralNetwork(config, 0.02, 0.15);
		String inputPath = "/Users/hamadalmarri/Development/eclipse/NeuralNetwork/input.txt";
		String outputPath = "/Users/hamadalmarri/Development/eclipse/NeuralNetwork/output.txt";
		XorTrainer xorT = new XorTrainer(inputPath, outputPath, nw, 1000000);
		long startTime, endTime;
		
		startTime = System.currentTimeMillis();
		
//		xorT.generateTest();
		xorT.train();
		
		endTime = System.currentTimeMillis();
		System.out.println("took: " + (endTime - startTime) + "ms");
	}

}
