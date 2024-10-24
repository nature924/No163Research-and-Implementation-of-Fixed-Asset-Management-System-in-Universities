package com.dao;

import com.entity.ZichandiaoboEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichandiaoboVO;
import com.entity.view.ZichandiaoboView;


/**
 * 资产调拨
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichandiaoboDao extends BaseMapper<ZichandiaoboEntity> {
	
	List<ZichandiaoboVO> selectListVO(@Param("ew") Wrapper<ZichandiaoboEntity> wrapper);
	
	ZichandiaoboVO selectVO(@Param("ew") Wrapper<ZichandiaoboEntity> wrapper);
	
	List<ZichandiaoboView> selectListView(@Param("ew") Wrapper<ZichandiaoboEntity> wrapper);

	List<ZichandiaoboView> selectListView(Pagination page,@Param("ew") Wrapper<ZichandiaoboEntity> wrapper);
	
	ZichandiaoboView selectView(@Param("ew") Wrapper<ZichandiaoboEntity> wrapper);
	

}
