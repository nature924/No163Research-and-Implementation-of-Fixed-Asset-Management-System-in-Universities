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


import com.dao.CaigouDao;
import com.entity.CaigouEntity;
import com.service.CaigouService;
import com.entity.vo.CaigouVO;
import com.entity.view.CaigouView;

@Service("caigouService")
public class CaigouServiceImpl extends ServiceImpl<CaigouDao, CaigouEntity> implements CaigouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigouEntity> page = this.selectPage(
                new Query<CaigouEntity>(params).getPage(),
                new EntityWrapper<CaigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigouEntity> wrapper) {
		  Page<CaigouView> page =new Query<CaigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigouVO> selectListVO(Wrapper<CaigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigouVO selectVO(Wrapper<CaigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigouView> selectListView(Wrapper<CaigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigouView selectView(Wrapper<CaigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
