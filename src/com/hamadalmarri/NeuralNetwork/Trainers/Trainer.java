package com.hamadalmarri.NeuralNetwork.Trainers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import com.hamadalmarri.NeuralNetwork.NeuralNetwork;

public abstract class Trainer {
	private Scanner inputFile;
	private PrintWriter outputFile;
	private NeuralNetwork neuralNetwork;



	public Trainer(String inputFileName, String outputFileName, NeuralNetwork neuralNetwork) {
		this.neuralNetwork = neuralNetwork;
		initializeInputFile(inputFileName);
		initializeOutputFile(outputFileName);
	}



	private void initializeInputFile(String inputFileName) {
		try {
			this.inputFile = new Scanner(new FileInputStream(inputFileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}



	private void initializeOutputFile(String outputFileName) {
		try {
			this.outputFile = new PrintWriter(outputFileName, "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return;
		}
	}



	public abstract void train();

}
