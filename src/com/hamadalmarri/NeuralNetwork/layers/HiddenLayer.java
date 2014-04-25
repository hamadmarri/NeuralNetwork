package com.hamadalmarri.NeuralNetwork.layers;

import com.hamadalmarri.NeuralNetwork.Edge;

public class HiddenLayer extends Layer {

	private Layer previousLayer;
	private int numberOfOutputEdges;



	public HiddenLayer(int numberOfNodes, Layer previousLayer, int numberOfOutputEdges) {
		super(numberOfNodes);
		this.numberOfOutputEdges = numberOfOutputEdges;
		this.previousLayer = previousLayer;
		for (int i = 0; i < this.nodes.length; i++)
			this.nodes[i].setOutputEdges(new Edge[this.numberOfOutputEdges]);

		Layer.connectTwoLayers(this.previousLayer, this);
	}
}
