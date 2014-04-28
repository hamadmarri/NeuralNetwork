package com.hamadalmarri;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import com.hamadalmarri.NeuralNetwork.NeuralNetwork;

public class Main {

	public static void main(String[] args) {
		int[] config = new int[] { 2, 4, 1 };
		NeuralNetwork nw = new NeuralNetwork(config);
		PrintWriter pw = null;

		try {
			pw = new PrintWriter("/Users/hamadalmarri/Development/eclipse/NeuralNetwork/output.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return;
		}

		
		nw.setInputValues(new double[] { 1, 0 });

		for (int i = 1; i <= 2000; i++) {
			pw.println("\npass: " + i);

			nw.feedForward();
			nw.backPropagate();
			nw.printResult(pw);
		}

		pw.close();

	}

}
