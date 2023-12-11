package com.walking.HomeWork_lesson28_task1;

public class MyNumber<N extends Number> {
	private final N n;

	public N getN() {return n;}
	
	MyNumber(N n) {this.n = n;}

	double makePow(double pow){return Math.pow(n.doubleValue(), pow);}
}