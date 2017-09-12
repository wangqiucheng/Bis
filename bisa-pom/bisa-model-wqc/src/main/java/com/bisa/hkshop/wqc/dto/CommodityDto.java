package com.bisa.hkshop.wqc.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bisa.hkshop.model.Commodity;

public class CommodityDto {
	private Commodity commodity;
	private int commodityCount;
	private double price;
	private double commoditytotal;
	
	
	public Commodity getCommodity() {
		return commodity;
	}




	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}




	public int getCommodityCount() {
		return commodityCount;
	}




	public void setCommodityCount(int commodityCount) {
		this.commodityCount = commodityCount;
	}



	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public double getCommoditytotal() {
		return commoditytotal;
	}




	public void setCommoditytotal(double commoditytotal) {
		this.commoditytotal = commoditytotal;
	}




	public CommodityDto() {
		super();
		// TODO Auto-generated constructor stub
	}




	public CommodityDto(Commodity commodity, int commodityCount, double price, double commoditytotal) {
		super();
		this.commodity = commodity;
		this.commodityCount = commodityCount;
		this.price = price;
		this.commoditytotal = commoditytotal;
	}

	public static  List<CommodityDto> CountTotal(List<Commodity> list) {
		Map<String, CommodityDto> listDDto =new  HashMap<String,CommodityDto>();
		Commodity b=null;	
		int count=1;
		int i=1;
		for(Commodity c :list) {
			if(b==null) {
				CommodityDto dto=new CommodityDto();
				dto.setCommodity(c);
				dto.setPrice(c.getSelling_price());
				dto.setCommodityCount(count);
				dto.setCommoditytotal(c.getSelling_price()*1);
				listDDto.put(c.getShop_number(),dto);
				b=c;
			}else if(b.getShop_number()==c.getShop_number()){
				i=i+1;
				CommodityDto ddto=listDDto.get(c.getShop_number());
				ddto.setPrice(c.getSelling_price());
				ddto.setCommodityCount(i);
				ddto.setCommoditytotal(c.getSelling_price()*(i));
				listDDto.put(c.getShop_number(), ddto);
				b=c;
			}else {
				CommodityDto dto=new CommodityDto();
				dto.setCommodity(c);
				dto.setPrice(c.getSelling_price());
				dto.setCommodityCount(count);
				dto.setCommoditytotal(c.getSelling_price()*1);
				listDDto.put(c.getShop_number(),dto);
				b=c;
			}
		}
		return null;
	}
}