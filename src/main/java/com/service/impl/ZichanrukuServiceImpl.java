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


import com.dao.ZichanrukuDao;
import com.entity.ZichanrukuEntity;
import com.service.ZichanrukuService;
import com.entity.vo.ZichanrukuVO;
import com.entity.view.ZichanrukuView;

@Service("zichanrukuService")
public class ZichanrukuServiceImpl extends ServiceImpl<ZichanrukuDao, ZichanrukuEntity> implements ZichanrukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanrukuEntity> page = this.selectPage(
                new Query<ZichanrukuEntity>(params).getPage(),
                new EntityWrapper<ZichanrukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanrukuEntity> wrapper) {
		  Page<ZichanrukuView> page =new Query<ZichanrukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanrukuVO> selectListVO(Wrapper<ZichanrukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanrukuVO selectVO(Wrapper<ZichanrukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanrukuView> selectListView(Wrapper<ZichanrukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanrukuView selectView(Wrapper<ZichanrukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
