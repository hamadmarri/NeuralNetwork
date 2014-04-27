package com.hamadalmarri.NeuralNetwork;

import com.hamadalmarri.NeuralNetwork.layers.*;

public class NeuralNetwork {

	private int numberOfInputNodes;
	private int numberOfOutputNodes;
	private int numberOfHiddenLayers;
	private int numberOfHiddenNodes;
	private InputLayer inputLayer;
	private HiddenLayer[] hiddenLayers;
	private OutputLayer outputLayer;



	public NeuralNetwork(int numberOfInputNodes, int numberOfOutputNodes, int numberOfHiddenLayers,
			int numberOfHiddenNodes) {
		this.numberOfInputNodes = numberOfInputNodes;
		this.numberOfOutputNodes = numberOfOutputNodes;
		this.numberOfHiddenLayers = numberOfHiddenLayers;
		this.numberOfHiddenNodes = numberOfHiddenNodes;

		initializeInputLayer();
		initializeHidderLayers();
		initializeOutputLayer();
	}



	public void setInputValues(double values[]) {
		for (int i = 0; i < values.length; i++) {
			this.inputLayer.getNeurons()[i].setOutput(values[i]);
		}
	}



	public void feedForward() {

		// starting from hidden layers
		for (int i = 0; i < this.hiddenLayers.length; i++)
			this.hiddenLayers[i].feedForward();

		// and also the output layer
		this.outputLayer.feedForward();
	}



	private void initializeOutputLayer() {
		this.outputLayer = new OutputLayer(this.numberOfOutputNodes, this.hiddenLayers[this.numberOfHiddenLayers - 1]);
	}



	private void initializeHidderLayers() {
		this.hiddenLayers = new HiddenLayer[this.numberOfHiddenLayers];
		Layer prevLayer = this.inputLayer;
		for (int i = 0; i < this.numberOfHiddenLayers - 1; i++) {
			prevLayer = this.hiddenLayers[i] = new HiddenLayer(this.numberOfHiddenNodes, prevLayer,
					this.numberOfOutputNodes);
		}

		// the last hidden layer is different in number of
		// output edges
		this.hiddenLayers[this.numberOfHiddenLayers - 1] = new HiddenLayer(this.numberOfHiddenNodes, prevLayer,
				this.numberOfOutputNodes);
	}



	private void initializeInputLayer() {
		this.inputLayer = new InputLayer(this.numberOfInputNodes, this.numberOfHiddenNodes);
	}

}
