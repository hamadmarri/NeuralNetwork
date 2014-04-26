package com.hamadalmarri;

import com.hamadalmarri.NeuralNetwork.NeuralNetwork;

public class Main {

	public static void main(String[] args) {
		final int inputs = 2;
		final int outputs = 1;
		final int hiddenLayerNodes = 4;
		final int hiddenLayers = 1;
		NeuralNetwork nw = new NeuralNetwork(inputs, outputs, hiddenLayers, hiddenLayerNodes);
		
	}

}
