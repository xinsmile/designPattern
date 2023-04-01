package com.xingy.behavior.observer.jdk;

public class TestObserver {
	
	public static void main(String[] args) {
		testObserver();
	}

	private static void testObserver() {
		ProductList observable = ProductList.getInstance();
		JingDongObserver jdObserver = new JingDongObserver();
		TaoBaoObserver taobaoObserver = new TaoBaoObserver();
		observable.addObserver(jdObserver);
		observable.addObserver(taobaoObserver);
		observable.addProduct("新增商品1");
		observable.addProduct("新增商品2");

	}
}
