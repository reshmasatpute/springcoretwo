package com.technoelevate.javabased;

public class Mobile {
	private String brand;
	private String model;
	private String color;
	private Integer prize;
	private Camera camera;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrize() {
		return prize;
	}

	public void setPrize(Integer prize) {
		this.prize = prize;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", color=" + color + ", prize=" + prize + ", camera="
				+ camera + "]";
	}
   

}
