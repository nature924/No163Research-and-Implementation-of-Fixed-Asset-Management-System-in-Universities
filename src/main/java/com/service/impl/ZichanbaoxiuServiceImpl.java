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


import com.dao.ZichanbaoxiuDao;
import com.entity.ZichanbaoxiuEntity;
import com.service.ZichanbaoxiuService;
import com.entity.vo.ZichanbaoxiuVO;
import com.entity.view.ZichanbaoxiuView;

@Service("zichanbaoxiuService")
public class ZichanbaoxiuServiceImpl extends ServiceImpl<ZichanbaoxiuDao, ZichanbaoxiuEntity> implements ZichanbaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanbaoxiuEntity> page = this.selectPage(
                new Query<ZichanbaoxiuEntity>(params).getPage(),
                new EntityWrapper<ZichanbaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanbaoxiuEntity> wrapper) {
		  Page<ZichanbaoxiuView> page =new Query<ZichanbaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanbaoxiuVO> selectListVO(Wrapper<ZichanbaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanbaoxiuVO selectVO(Wrapper<ZichanbaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanbaoxiuView> selectListView(Wrapper<ZichanbaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanbaoxiuView selectView(Wrapper<ZichanbaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
