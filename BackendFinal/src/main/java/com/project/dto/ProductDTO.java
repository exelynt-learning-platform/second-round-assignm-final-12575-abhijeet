package com.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {

	Integer productId;
	
	String name;
	String desc;
	 Integer price;
	 Integer stock;
	 String imgUrl;
	 
	 public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 
	 public ProductDTO(Integer productId, String name, String desc, Integer price, Integer stock, String imgUrl) {
		super();
		this.productId = productId;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.stock = stock;
		this.imgUrl = imgUrl;
	 }
	 public Integer getProductId() {
		 return productId;
	 }
	 public void setProductId(Integer productId) {
		 this.productId = productId;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getDesc() {
		 return desc;
	 }
	 public void setDesc(String desc) {
		 this.desc = desc;
	 }
	 public Integer getPrice() {
		 return price;
	 }
	 public void setPrice(Integer price) {
		 this.price = price;
	 }
	 public Integer getStock() {
		 return stock;
	 }
	 public void setStock(Integer stock) {
		 this.stock = stock;
	 }
	 public String getImgUrl() {
		 return imgUrl;
	 }
	 public void setImgUrl(String imgUrl) {
		 this.imgUrl = imgUrl;
	 }
	 
	 
	 
}
