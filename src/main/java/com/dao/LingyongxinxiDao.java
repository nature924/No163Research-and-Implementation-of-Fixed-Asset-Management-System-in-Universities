package com.dao;

import com.entity.LingyongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyongxinxiVO;
import com.entity.view.LingyongxinxiView;


/**
 * 领用信息
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface LingyongxinxiDao extends BaseMapper<LingyongxinxiEntity> {
	
	List<LingyongxinxiVO> selectListVO(@Param("ew") Wrapper<LingyongxinxiEntity> wrapper);
	
	LingyongxinxiVO selectVO(@Param("ew") Wrapper<LingyongxinxiEntity> wrapper);
	
	List<LingyongxinxiView> selectListView(@Param("ew") Wrapper<LingyongxinxiEntity> wrapper);

	List<LingyongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LingyongxinxiEntity> wrapper);
	
	LingyongxinxiView selectView(@Param("ew") Wrapper<LingyongxinxiEntity> wrapper);
	

}
