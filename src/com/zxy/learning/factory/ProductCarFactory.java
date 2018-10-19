package com.zxy.learning.factory;

public class ProductCarFactory implements ProductFactory{

	@Override
	public Product getProduct() {
		return new ProductCar();
	}

}
