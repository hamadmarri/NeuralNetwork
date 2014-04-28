package com.hamadalmarri.NeuralNetwork;

import java.io.PrintWriter;

import com.hamadalmarri.NeuralNetwork.layers.*;

public class NeuralNetwork {

	private InputLayer inputLayer;
	private HiddenLayer[] hiddenLayers;
	private OutputLayer outputLayer;
	private double learningRate = 0.02;
	private double momentum = 0.15;



	public NeuralNetwork(int[] config) {
		initializeInputLayer(config);
		initializeHidderLayers(config);
		initializeOutputLayer(config);
	}



	public void setInputValues(double values[]) {
		for (int i = 0; i < values.length; i++) {
			this.inputLayer.getNeurons()[i].setOutput(values[i]);
		}
	}



	public void feedForward() {

		// starting from hidden layers
		for (HiddenLayer hl : this.hiddenLayers)
			hl.feedForward();

		// and also the output layer
		this.outputLayer.feedForward();
	}



	public void printResult(PrintWriter pw) {
		for (int i = 0; i < this.outputLayer.getNeurons().length - 1; i++) {
			Neuron n = this.outputLayer.getNeurons()[i];
			pw.println("output: " + n.getOutput());
			pw.println("error: " + n.getError());
		}
	}



	public void backPropagate() {
		this.outputLayer.backPropagate(new double[] { 1, 1 }, this.learningRate, this.momentum);

		// Calculate error for all neurons in the hidden layers
		// (back propagate the errors
		for (HiddenLayer hl : this.hiddenLayers)
			hl.backPropagate(this.learningRate, this.momentum);

	}



	private void initializeOutputLayer(int[] config) {
		this.outputLayer = new OutputLayer(config[config.length - 1], this.hiddenLayers[hiddenLayers.length - 1]);
	}



	private void initializeHidderLayers(int[] config) {
		this.hiddenLayers = new HiddenLayer[config.length - 2];
		Layer prevLayer = this.inputLayer;

		for (int i = 0; i < this.hiddenLayers.length; i++)
			prevLayer = this.hiddenLayers[i] = new HiddenLayer(config[i + 1], prevLayer, config[i + 2]);
	}



	private void initializeInputLayer(int[] config) {
		this.inputLayer = new InputLayer(config[0], config[1]);
	}



	public InputLayer getInputLayer() {
		return inputLayer;
	}



	public HiddenLayer[] getHiddenLayers() {
		return hiddenLayers;
	}



	public OutputLayer getOutputLayer() {
		return outputLayer;
	}

	
	
}
