package com.myspace.rhpam_demo;

public class Fib implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int sequence;
	private long value;

	public Fib() {
	}

	public Fib(int sequence, long value) {
		super();
		this.sequence = sequence;
		this.value = value;
	}

	public Fib(int sequence) {
		super();
		this.sequence = sequence;
		this.value = -1;
	}

	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public long getValue() {
		return this.value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public String toString() {
		return "Fib(" + this.sequence + "/" + this.value + ")";
	}

}