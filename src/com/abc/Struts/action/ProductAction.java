package com.abc.Struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private int productId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId=productId;
	}
	
	//�༭��Ʒ
	public String edit() {
		System.out.println("�༭��Ʒ"+productId);
		return "edit";
	}
	//ɾ����Ʒ
	public String del() {
		System.out.println("ɾ����Ʒ"+productId);
		return "del";
	}
}
