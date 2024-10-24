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


import com.dao.JieyongxinxiDao;
import com.entity.JieyongxinxiEntity;
import com.service.JieyongxinxiService;
import com.entity.vo.JieyongxinxiVO;
import com.entity.view.JieyongxinxiView;

@Service("jieyongxinxiService")
public class JieyongxinxiServiceImpl extends ServiceImpl<JieyongxinxiDao, JieyongxinxiEntity> implements JieyongxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieyongxinxiEntity> page = this.selectPage(
                new Query<JieyongxinxiEntity>(params).getPage(),
                new EntityWrapper<JieyongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieyongxinxiEntity> wrapper) {
		  Page<JieyongxinxiView> page =new Query<JieyongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JieyongxinxiVO> selectListVO(Wrapper<JieyongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieyongxinxiVO selectVO(Wrapper<JieyongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieyongxinxiView> selectListView(Wrapper<JieyongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieyongxinxiView selectView(Wrapper<JieyongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
