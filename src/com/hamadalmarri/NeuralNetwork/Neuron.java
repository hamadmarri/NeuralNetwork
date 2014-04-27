package com.hamadalmarri.NeuralNetwork;

public class Neuron {
	private double threshold;
	private double output;
	private Edge[] inputEdges;
	private Edge[] outputEdges;



	public Neuron() {
		// Initialise threshold nodes with a random
		// number between -1 and 1
		this.threshold = -1 + (2 * Math.random());
	}



	public void feedForward() {
		Neuron inputNeuron;
		Edge inputEdge;
		double net = this.threshold;

		for (int i = 0; i < this.inputEdges.length; i++) {
			inputEdge = this.inputEdges[i];
			inputNeuron = inputEdge.getLeftNeuron();
			net = net + inputNeuron.output * inputEdge.getWeight();
		}

		this.output = Neuron.Sigmoid(net);
	}



	private static double Sigmoid(double net) {
		return 1 / (1 + Math.exp(-net));
	}



	public double getThreshold() {
		return threshold;
	}



	public void setThreshold(double threshould) {
		this.threshold = threshould;
	}



	public double getOutput() {
		return output;
	}



	public void setOutput(double value) {
		this.output = value;
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
