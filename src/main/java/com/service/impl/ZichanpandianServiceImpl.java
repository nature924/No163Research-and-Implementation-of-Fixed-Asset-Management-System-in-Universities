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


import com.dao.ZichanpandianDao;
import com.entity.ZichanpandianEntity;
import com.service.ZichanpandianService;
import com.entity.vo.ZichanpandianVO;
import com.entity.view.ZichanpandianView;

@Service("zichanpandianService")
public class ZichanpandianServiceImpl extends ServiceImpl<ZichanpandianDao, ZichanpandianEntity> implements ZichanpandianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanpandianEntity> page = this.selectPage(
                new Query<ZichanpandianEntity>(params).getPage(),
                new EntityWrapper<ZichanpandianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanpandianEntity> wrapper) {
		  Page<ZichanpandianView> page =new Query<ZichanpandianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanpandianVO> selectListVO(Wrapper<ZichanpandianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanpandianVO selectVO(Wrapper<ZichanpandianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanpandianView> selectListView(Wrapper<ZichanpandianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanpandianView selectView(Wrapper<ZichanpandianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
