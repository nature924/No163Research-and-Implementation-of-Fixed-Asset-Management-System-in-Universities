package com.dao;

import com.entity.ZichanweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanweihuVO;
import com.entity.view.ZichanweihuView;


/**
 * 资产维护
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanweihuDao extends BaseMapper<ZichanweihuEntity> {
	
	List<ZichanweihuVO> selectListVO(@Param("ew") Wrapper<ZichanweihuEntity> wrapper);
	
	ZichanweihuVO selectVO(@Param("ew") Wrapper<ZichanweihuEntity> wrapper);
	
	List<ZichanweihuView> selectListView(@Param("ew") Wrapper<ZichanweihuEntity> wrapper);

	List<ZichanweihuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanweihuEntity> wrapper);
	
	ZichanweihuView selectView(@Param("ew") Wrapper<ZichanweihuEntity> wrapper);
	

}
