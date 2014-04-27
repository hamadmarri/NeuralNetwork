package com.hamadalmarri.NeuralNetwork;

public class Edge {
	private Neuron leftNeuron;
	private Neuron rightNeuron;
	private double weight;



	public Edge(Neuron leftNode, Neuron rightNode) {
		this.leftNeuron = leftNode;
		this.rightNeuron = rightNode;

		// Initialise weight with a random
		// number between -1 and 1
		this.weight = -1 + (2 * Math.random());
	}



	public Neuron getLeftNeuron() {
		return leftNeuron;
	}



	public void setLeftNeuron(Neuron leftNode) {
		this.leftNeuron = leftNode;
	}



	public Neuron getRightNeuron() {
		return rightNeuron;
	}



	public void setRightNeuron(Neuron rightNode) {
		this.rightNeuron = rightNode;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
}
