package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.itcast.ssm.mapper.DevGJMapper;
import cn.itcast.ssm.po.DevGJCustom;
import cn.itcast.ssm.po.DevGJQueryVo;
import cn.itcast.ssm.service.DevGJService;

@Controller
public class DevGJServiceImpl implements DevGJService {

	@Autowired
	private DevGJMapper devGJMapper;
	
	@Override
	public List<DevGJCustom> selectGJList(DevGJQueryVo devGJQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return devGJMapper.selectGJList(devGJQueryVo);  
	}

}
