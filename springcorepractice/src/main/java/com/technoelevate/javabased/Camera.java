package com.technoelevate.javabased;

public class Camera {
	private String pixels;
	private String lens;
	private String clarity;

	public String getPixels() {
		return pixels;
	}

	public void setPixels(String pixels) {
		this.pixels = pixels;
	}

	public String getLens() {
		return lens;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public String getClarity() {
		return clarity;
	}

	public void setClarity(String clarity) {
		this.clarity = clarity;
	}

	@Override
	public String toString() {
		return "Camera [pixels=" + pixels + ", lens=" + lens + ", clarity=" + clarity + "]";
	}

	
}
