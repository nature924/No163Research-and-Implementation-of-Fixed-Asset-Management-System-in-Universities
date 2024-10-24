package com.dao;

import com.entity.JieyongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieyongxinxiVO;
import com.entity.view.JieyongxinxiView;


/**
 * 借用信息
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface JieyongxinxiDao extends BaseMapper<JieyongxinxiEntity> {
	
	List<JieyongxinxiVO> selectListVO(@Param("ew") Wrapper<JieyongxinxiEntity> wrapper);
	
	JieyongxinxiVO selectVO(@Param("ew") Wrapper<JieyongxinxiEntity> wrapper);
	
	List<JieyongxinxiView> selectListView(@Param("ew") Wrapper<JieyongxinxiEntity> wrapper);

	List<JieyongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JieyongxinxiEntity> wrapper);
	
	JieyongxinxiView selectView(@Param("ew") Wrapper<JieyongxinxiEntity> wrapper);
	

}
