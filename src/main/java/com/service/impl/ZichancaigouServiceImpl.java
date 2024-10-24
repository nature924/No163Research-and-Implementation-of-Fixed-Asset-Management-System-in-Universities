package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZichancaigouDao;
import com.entity.ZichancaigouEntity;
import com.service.ZichancaigouService;
import com.entity.vo.ZichancaigouVO;
import com.entity.view.ZichancaigouView;

@Service("zichancaigouService")
public class ZichancaigouServiceImpl extends ServiceImpl<ZichancaigouDao, ZichancaigouEntity> implements ZichancaigouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichancaigouEntity> page = this.selectPage(
                new Query<ZichancaigouEntity>(params).getPage(),
                new EntityWrapper<ZichancaigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichancaigouEntity> wrapper) {
		  Page<ZichancaigouView> page =new Query<ZichancaigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichancaigouVO> selectListVO(Wrapper<ZichancaigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichancaigouVO selectVO(Wrapper<ZichancaigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichancaigouView> selectListView(Wrapper<ZichancaigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichancaigouView selectView(Wrapper<ZichancaigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
