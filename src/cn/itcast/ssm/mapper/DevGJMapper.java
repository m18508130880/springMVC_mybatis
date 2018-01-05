package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.DevGJCustom;
import cn.itcast.ssm.po.DevGJQueryVo;

public interface DevGJMapper {
	
	public List<DevGJCustom> selectGJList(DevGJQueryVo devGJQueryVo) throws Exception;

}
