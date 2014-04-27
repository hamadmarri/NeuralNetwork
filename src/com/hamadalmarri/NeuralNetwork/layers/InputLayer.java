package com.hamadalmarri.NeuralNetwork.layers;

import com.hamadalmarri.NeuralNetwork.Edge;

public class InputLayer extends Layer {

	private int numberOfOutputEdges;



	public InputLayer(int numberOfNodes, int numberOfOutputEdges) {
		super(numberOfNodes);
		this.numberOfOutputEdges = numberOfOutputEdges + 1; // bais

		for (int i = 0; i < this.neurons.length; i++)
			this.neurons[i].setOutputEdges(new Edge[this.numberOfOutputEdges]);

	}



	@Override
	public void feedForward() {
		// just do nothing since input layer
		// doesn't have to feed from previous layer
	}

}
