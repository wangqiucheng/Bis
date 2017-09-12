package com.bisa.hkshop.wqc.dto;

import java.util.List;

import com.bisa.hkshop.model.Cart;


public class CarShopDto {
	
	private Cart cart;
	
	private List<CommodityDto> listCommodityDto;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<CommodityDto> getListCommodityDto() {
		return listCommodityDto;
	}

	public void setListCommodityDto(List<CommodityDto> listCommodityDto) {
		this.listCommodityDto = listCommodityDto;
	}
	
	

}