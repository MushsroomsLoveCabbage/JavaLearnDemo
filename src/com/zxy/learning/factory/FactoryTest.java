package com.zxy.learning.factory;

public class FactoryTest {
	public static void main(String[] args){
		prodcutService(new ProductCarFactory());
	}
	static void prodcutService(ProductFactory factory){
		Product pro = factory.getProduct();
		pro.getCar();
	}
}
