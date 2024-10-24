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


import com.dao.ZichanweihuDao;
import com.entity.ZichanweihuEntity;
import com.service.ZichanweihuService;
import com.entity.vo.ZichanweihuVO;
import com.entity.view.ZichanweihuView;

@Service("zichanweihuService")
public class ZichanweihuServiceImpl extends ServiceImpl<ZichanweihuDao, ZichanweihuEntity> implements ZichanweihuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanweihuEntity> page = this.selectPage(
                new Query<ZichanweihuEntity>(params).getPage(),
                new EntityWrapper<ZichanweihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanweihuEntity> wrapper) {
		  Page<ZichanweihuView> page =new Query<ZichanweihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanweihuVO> selectListVO(Wrapper<ZichanweihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanweihuVO selectVO(Wrapper<ZichanweihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanweihuView> selectListView(Wrapper<ZichanweihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanweihuView selectView(Wrapper<ZichanweihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
