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


import com.dao.ZichanbaofeiDao;
import com.entity.ZichanbaofeiEntity;
import com.service.ZichanbaofeiService;
import com.entity.vo.ZichanbaofeiVO;
import com.entity.view.ZichanbaofeiView;

@Service("zichanbaofeiService")
public class ZichanbaofeiServiceImpl extends ServiceImpl<ZichanbaofeiDao, ZichanbaofeiEntity> implements ZichanbaofeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanbaofeiEntity> page = this.selectPage(
                new Query<ZichanbaofeiEntity>(params).getPage(),
                new EntityWrapper<ZichanbaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanbaofeiEntity> wrapper) {
		  Page<ZichanbaofeiView> page =new Query<ZichanbaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanbaofeiVO> selectListVO(Wrapper<ZichanbaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanbaofeiVO selectVO(Wrapper<ZichanbaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanbaofeiView> selectListView(Wrapper<ZichanbaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanbaofeiView selectView(Wrapper<ZichanbaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
