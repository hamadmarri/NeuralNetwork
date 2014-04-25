package com.hamadalmarri.NeuralNetwork.layers;

public class OutputLayer extends Layer {
	private Layer previousLayer;



	public OutputLayer(int numberOfNodes, Layer previousLayer) {
		super(numberOfNodes);
		this.previousLayer = previousLayer;

		Layer.connectTwoLayers(this.previousLayer, this);
	}

}
