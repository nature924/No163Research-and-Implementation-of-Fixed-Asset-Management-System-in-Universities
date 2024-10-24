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


import com.dao.GudingzichanDao;
import com.entity.GudingzichanEntity;
import com.service.GudingzichanService;
import com.entity.vo.GudingzichanVO;
import com.entity.view.GudingzichanView;

@Service("gudingzichanService")
public class GudingzichanServiceImpl extends ServiceImpl<GudingzichanDao, GudingzichanEntity> implements GudingzichanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GudingzichanEntity> page = this.selectPage(
                new Query<GudingzichanEntity>(params).getPage(),
                new EntityWrapper<GudingzichanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GudingzichanEntity> wrapper) {
		  Page<GudingzichanView> page =new Query<GudingzichanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GudingzichanVO> selectListVO(Wrapper<GudingzichanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GudingzichanVO selectVO(Wrapper<GudingzichanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GudingzichanView> selectListView(Wrapper<GudingzichanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GudingzichanView selectView(Wrapper<GudingzichanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
