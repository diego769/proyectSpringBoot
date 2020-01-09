package com.endpoint.model;

public class featureModel {
	private String Type;
	private propertiesModel properties;
	private geometryModel geometry;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public propertiesModel getProperties() {
		return properties;
	}
	public void setProperties(propertiesModel properties) {
		this.properties = properties;
	}
	public geometryModel getGeometry() {
		return geometry;
	}
	public void setGeometry(geometryModel geometry) {
		this.geometry = geometry;
	}
	
}
