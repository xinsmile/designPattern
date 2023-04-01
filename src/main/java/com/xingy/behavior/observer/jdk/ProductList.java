package com.xingy.behavior.observer.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 使用jdk自带的观察者模式
 * @ClassName: ProductList 
 * @Description: 被观察者，即产品
 * @author: Xingy
 * @date: 2018年8月28日 上午11:28:17
 */
public class ProductList extends Observable {
	
	private List<String> productList = null;//产品列表
	
	private static ProductList instance; //类唯一实例 
	
	private ProductList(){}
	
	/**
	 * 取得唯一实例
	 * @return 产品列表唯一实例
	 */
	public static ProductList getInstance () {
		if (instance == null) {
			synchronized (ProductList.class) {
				if (instance == null) {
					instance = new ProductList();;
					instance.productList = new ArrayList<String>();
				}
			}
		}
		
		return instance;
	}
	
	/**
	 * 增加观察者（电商接口）
	 * @param observer
	 */
	public void addProductListObserver (Observer observer) {
		this.addObserver(observer);
	}		
	
	/**
	 * 新增产品
	 * @param newProduct
	 */
	public void addProduct (String newProduct) {
		productList.add(newProduct);
		System.out.println("产品列表新增了产品： " + newProduct);
		this.setChanged();//设置被观察对象发生了变化
		this.notifyObservers(newProduct);//通知观察者，并传递新产品
	}
}
