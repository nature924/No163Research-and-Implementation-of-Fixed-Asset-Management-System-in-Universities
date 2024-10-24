package com.dao;

import com.entity.CaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigouVO;
import com.entity.view.CaigouView;


/**
 * 采购
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface CaigouDao extends BaseMapper<CaigouEntity> {
	
	List<CaigouVO> selectListVO(@Param("ew") Wrapper<CaigouEntity> wrapper);
	
	CaigouVO selectVO(@Param("ew") Wrapper<CaigouEntity> wrapper);
	
	List<CaigouView> selectListView(@Param("ew") Wrapper<CaigouEntity> wrapper);

	List<CaigouView> selectListView(Pagination page,@Param("ew") Wrapper<CaigouEntity> wrapper);
	
	CaigouView selectView(@Param("ew") Wrapper<CaigouEntity> wrapper);
	

}
