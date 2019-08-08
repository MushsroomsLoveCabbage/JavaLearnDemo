package com.zxy.learning.factory;

public class ProductPlaneFactory implements ProductFactory{

	@Override
	public Product getProduct() {
		return new ProductPlane();
	}

}
