package com.hamadalmarri.NeuralNetwork;

public class Edge {
	private Node leftNode;
	private Node rightNode;
	private double weight;



	public Edge(Node leftNode, Node rightNode) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;

		// Initialise weight with a random
		// number between -1 and 1
		this.weight = -1 + (2 * Math.random());
	}



	public Node getLeftNode() {
		return leftNode;
	}



	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}



	public Node getRightNode() {
		return rightNode;
	}



	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
}
