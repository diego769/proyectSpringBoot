package com.endpoint.model;

import java.sql.Array;

public class geometryModel {
	private String type;
	private Array coordinates;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Array getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Array coordinates) {
		this.coordinates = coordinates;
	}
	
}
