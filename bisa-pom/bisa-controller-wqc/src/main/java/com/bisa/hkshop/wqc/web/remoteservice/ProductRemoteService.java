package com.bisa.hkshop.wqc.web.remoteservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.remoteservice.RProductService;
import com.bisa.hkshop.wqc.service.ICommodityService;

public class ProductRemoteService implements RProductService{
	
	@Autowired
	private ICommodityService iCommodityService;

	@Override
	public Commodity getcommodity(String product_number) {
		return iCommodityService.getcommodity(product_number);
	}

	@Override
	public List<Commodity> getcommodity() {
		return iCommodityService.getcommodity();
	}

	@Override
	public int addCommodity(Commodity comm) {
		return iCommodityService.addCommodity(comm);
	}

	@Override
	public int updateCommodity(Commodity comm) {
		return iCommodityService.updateCommodity(comm);
	}

	@Override
	public int delCommdity(String shop_number) {
		return iCommodityService.delCommdity(shop_number);
	}

	@Override
	public List<Commodity> selthreeCon(String shop_Number) {
		return iCommodityService.selthreeCon(shop_Number);
	}

	@Override
	public List<Commodity> getTypecommodity(String type) {
		return iCommodityService.getTypecommodity(type);
	}

}
