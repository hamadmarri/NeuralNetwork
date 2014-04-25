package com.hamadalmarri.NeuralNetwork;

public class Node {
	private double threshould;
	private double value;
	private Edge[] inputEdges;
	private Edge[] outputEdges;



	public Node() {
		// Initialise threshold nodes with a random
		// number between -1 and 1
		this.threshould = -1 + (2 * Math.random());
	}



	public Node(float threshould) {
		this.threshould = threshould;
	}



	public double getThreshould() {
		return threshould;
	}



	public void setThreshould(double threshould) {
		this.threshould = threshould;
	}



	public double getValue() {
		return value;
	}



	public void setValue(double value) {
		this.value = value;
	}



	public Edge[] getInputEdges() {
		return inputEdges;
	}



	public void setInputEdges(Edge[] inputEdges) {
		this.inputEdges = inputEdges;
	}



	public Edge[] getOutputEdges() {
		return outputEdges;
	}



	public void setOutputEdges(Edge[] outputEdges) {
		this.outputEdges = outputEdges;

		for (int i = 0; i < this.outputEdges.length; i++)
			this.outputEdges[i] = new Edge(this, null);

	}

}
