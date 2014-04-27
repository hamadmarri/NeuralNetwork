package com.hamadalmarri.NeuralNetwork.layers;

import com.hamadalmarri.NeuralNetwork.Edge;
import com.hamadalmarri.NeuralNetwork.Neuron;

public class Layer {
	protected int numberOfNodes = 0;
	protected Neuron nodes[];



	public Layer(int numberOfNodes) {
		this.numberOfNodes = numberOfNodes;
		this.nodes = new Neuron[numberOfNodes];

		// initialize nodes
		for (int i = 0; i < this.nodes.length; i++)
			this.nodes[i] = new Neuron();

	}



	public static void connectTwoLayers(Layer previous, Layer next) {
		// set previous layer's nodes to connect to next
		// layer's nodes
		for (int i = 0; i < previous.numberOfNodes; i++) {
			Edge[] edgesPerNode = previous.nodes[i].getOutputEdges();
			for (int j = 0; j < edgesPerNode.length; j++) {
				edgesPerNode[j].setRightNode(next.nodes[j]);
			}
		}

		// set next layer's nodes to connct to
		// previous layer's nodes
		for (int i = 0; i < next.numberOfNodes; i++) {
			Edge[] inputEdges = new Edge[previous.nodes.length];
			for (int j = 0; j < inputEdges.length; j++) {
				inputEdges[j] = previous.nodes[j].getOutputEdges()[i];
			}
			next.nodes[i].setInputEdges(inputEdges);
		}

	}



	public Neuron[] getNodes() {
		return nodes;
	}

}
