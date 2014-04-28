package com.hamadalmarri.NeuralNetwork;

public class Neuron {
	private double threshold;
	private double output;
	private double error;
	private double DeltaThreshold = 0;
	private Edge[] inputEdges;
	private Edge[] outputEdges;



	public Neuron() {
		// Initialise threshold nodes with a random
		// number between -1 and 1
		this.threshold = -1 + (2 * Math.random());
	}



	public void feedForward() {
		double net = this.threshold;

		for (Edge inputEdge : this.inputEdges)
			net += inputEdge.getLeftNeuron().output * inputEdge.getWeight();

		this.output = Neuron.sigmoid(net);
	}



	public void updateThreshold(double learningRate, double momentum) {
		// update delta threshold
		this.setDeltaThreshold(learningRate * this.getError() + momentum * this.getDeltaThreshold());

		// update threshold
		this.setThreshold(this.getThreshold() + this.getDeltaThreshold());
	}



	private static double sigmoid(double net) {
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



	public double getError() {
		return error;
	}



	public void setError(double error) {
		this.error = error;
	}



	public double getDeltaThreshold() {
		return DeltaThreshold;
	}



	public void setDeltaThreshold(double deltaThreshold) {
		DeltaThreshold = deltaThreshold;
	}

}
