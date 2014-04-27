package com.hamadalmarri.NeuralNetwork.layers;

import com.hamadalmarri.NeuralNetwork.Edge;

public class HiddenLayer extends Layer {

	private Layer previousLayer;
	private int numberOfOutputEdges;



	public HiddenLayer(int numberOfNodes, Layer previousLayer, int numberOfOutputEdges) {
		super(numberOfNodes);
		this.numberOfOutputEdges = numberOfOutputEdges + 1; // bais
		this.previousLayer = previousLayer;
		for (int i = 0; i < this.neurons.length; i++)
			this.neurons[i].setOutputEdges(new Edge[this.numberOfOutputEdges]);

		Layer.connectTwoLayers(this.previousLayer, this);
	}

}
