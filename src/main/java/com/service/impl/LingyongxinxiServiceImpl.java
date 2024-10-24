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


import com.dao.LingyongxinxiDao;
import com.entity.LingyongxinxiEntity;
import com.service.LingyongxinxiService;
import com.entity.vo.LingyongxinxiVO;
import com.entity.view.LingyongxinxiView;

@Service("lingyongxinxiService")
public class LingyongxinxiServiceImpl extends ServiceImpl<LingyongxinxiDao, LingyongxinxiEntity> implements LingyongxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyongxinxiEntity> page = this.selectPage(
                new Query<LingyongxinxiEntity>(params).getPage(),
                new EntityWrapper<LingyongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyongxinxiEntity> wrapper) {
		  Page<LingyongxinxiView> page =new Query<LingyongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyongxinxiVO> selectListVO(Wrapper<LingyongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyongxinxiVO selectVO(Wrapper<LingyongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyongxinxiView> selectListView(Wrapper<LingyongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyongxinxiView selectView(Wrapper<LingyongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
