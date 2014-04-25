package com.hamadalmarri.NeuralNetwork.layers;

import com.hamadalmarri.NeuralNetwork.Edge;

public class InputLayer extends Layer {

	private int numberOfOutputEdges;



	public InputLayer(int numberOfNodes, int numberOfOutputEdges) {
		super(numberOfNodes);
		this.numberOfOutputEdges = numberOfOutputEdges;

		for (int i = 0; i < this.nodes.length; i++)
			this.nodes[i].setOutputEdges(new Edge[this.numberOfOutputEdges]);

	}

}
