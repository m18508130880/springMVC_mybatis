package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.DevGJCustom;
import cn.itcast.ssm.service.impl.DevGJServiceImpl;

@Controller
public class DevGJController {
	
	@Autowired
	private DevGJServiceImpl devGJServiceImpl;
	
	@RequestMapping("Text.action")
	public ModelAndView select() throws Exception {
		
		List<DevGJCustom> devGJList = devGJServiceImpl.selectGJList(null);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("devGJList", devGJList);
		modelAndView.setViewName("index");
		
		System.out.println(devGJList);
		
		return modelAndView;
	}

}
