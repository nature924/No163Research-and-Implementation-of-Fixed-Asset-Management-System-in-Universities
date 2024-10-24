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


import com.dao.ZichandiaoboDao;
import com.entity.ZichandiaoboEntity;
import com.service.ZichandiaoboService;
import com.entity.vo.ZichandiaoboVO;
import com.entity.view.ZichandiaoboView;

@Service("zichandiaoboService")
public class ZichandiaoboServiceImpl extends ServiceImpl<ZichandiaoboDao, ZichandiaoboEntity> implements ZichandiaoboService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichandiaoboEntity> page = this.selectPage(
                new Query<ZichandiaoboEntity>(params).getPage(),
                new EntityWrapper<ZichandiaoboEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichandiaoboEntity> wrapper) {
		  Page<ZichandiaoboView> page =new Query<ZichandiaoboView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichandiaoboVO> selectListVO(Wrapper<ZichandiaoboEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichandiaoboVO selectVO(Wrapper<ZichandiaoboEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichandiaoboView> selectListView(Wrapper<ZichandiaoboEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichandiaoboView selectView(Wrapper<ZichandiaoboEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
