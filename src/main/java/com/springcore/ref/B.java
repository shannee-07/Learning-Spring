package com.springcore.ref;

public class B {
	private int y;

	@Override
	public String toString() {
		return "B [y=" + y + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
}
