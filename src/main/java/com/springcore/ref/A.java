package com.springcore.ref;

public class A {
	private int x;
	private B b;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getB() {
		return b;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}

	public void setB(B b) {
		this.b = b;
	}
}
