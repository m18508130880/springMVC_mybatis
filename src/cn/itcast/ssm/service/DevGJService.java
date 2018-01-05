package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.DevGJCustom;
import cn.itcast.ssm.po.DevGJQueryVo;

public interface DevGJService {

	public List<DevGJCustom> selectGJList(DevGJQueryVo devGJQueryVo) throws Exception;
}
