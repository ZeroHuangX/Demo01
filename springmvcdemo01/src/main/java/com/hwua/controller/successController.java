package com.hwua.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class successController {
	@RequestMapping("/success.action")
	public ModelAndView demo01() {
		ModelAndView modelAndView = new ModelAndView();
		String name = "222222222222222222";
		modelAndView.addObject("name", name);
		List<String> list = new ArrayList<String>();
		list.add("测试数据1");
		list.add("测试数据2");
		list.add("测试数据3");
		list.add("测试数据4");
		list.add("测试数据5");
		modelAndView.addObject("list",list);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	
}
