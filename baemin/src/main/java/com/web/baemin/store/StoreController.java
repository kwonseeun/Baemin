package com.web.baemin.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.baemin.service.StoreService;

@Controller
public class StoreController {
 
	@Autowired
	private StoreService storeService;
	
	@GetMapping("/store/detail/{id}")
	public String storeDetail(@PathVariable long id, Model model) {
 
		StoreDetail storeDetail = storeService.storeDetail(id);
 
		model.addAttribute("store", storeDetail);
 
		return "store/detail";
	}
	
}
