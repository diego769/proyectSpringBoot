package com.endpoint.model;

public class colleccionModel {
	private String type;
	private metaDataModel metadata;
	private featureModel feature;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public metaDataModel getMetadata() {
		return metadata;
	}
	public void setMetadata(metaDataModel metadata) {
		this.metadata = metadata;
	}
	public featureModel getFeature() {
		return feature;
	}
	public void setFeature(featureModel feature) {
		this.feature = feature;
	}
	
}
