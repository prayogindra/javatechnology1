package com.xsis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.model.Barang;
import com.xsis.service.BarangService;

@Controller
public class BarangController {
	
	@Autowired
	private BarangService brngsr;

	@RequestMapping("/barang")
	public String barang() {
		return ("barang/barang");
	}
	@RequestMapping("/listbarang")
	public String listbarang(Model mdl) {
		
		List<Barang> Barangs = brngsr.listall();
		
		mdl.addAttribute("keybarang", Barangs);
		return("barang/listbarang");
	}
	@RequestMapping("/newbarang")
	public String newbarang(Model mdl) {
		Barang barang = new Barang();
		mdl.addAttribute("barang", barang);
		return("barang/newbarang");
	}
	@ResponseBody
	@RequestMapping(value = "/savebarang", method = RequestMethod.POST)
	public Map<String, String> savebarang(Barang barang) {
		Map<String,String> map= new HashMap<>();
		map.put("Status","Berhasil");
		return map;
	}
		
}
