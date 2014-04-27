package com.hamadalmarri.NeuralNetwork;

public class Edge {
	private Neuron leftNode;
	private Neuron rightNode;
	private double weight;



	public Edge(Neuron leftNode, Neuron rightNode) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;

		// Initialise weight with a random
		// number between -1 and 1
		this.weight = -1 + (2 * Math.random());
	}



	public Neuron getLeftNode() {
		return leftNode;
	}



	public void setLeftNode(Neuron leftNode) {
		this.leftNode = leftNode;
	}



	public Neuron getRightNode() {
		return rightNode;
	}



	public void setRightNode(Neuron rightNode) {
		this.rightNode = rightNode;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
}
