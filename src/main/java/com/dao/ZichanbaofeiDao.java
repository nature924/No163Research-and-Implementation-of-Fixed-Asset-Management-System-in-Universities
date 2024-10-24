package com.dao;

import com.entity.ZichanbaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanbaofeiVO;
import com.entity.view.ZichanbaofeiView;


/**
 * 资产报废
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanbaofeiDao extends BaseMapper<ZichanbaofeiEntity> {
	
	List<ZichanbaofeiVO> selectListVO(@Param("ew") Wrapper<ZichanbaofeiEntity> wrapper);
	
	ZichanbaofeiVO selectVO(@Param("ew") Wrapper<ZichanbaofeiEntity> wrapper);
	
	List<ZichanbaofeiView> selectListView(@Param("ew") Wrapper<ZichanbaofeiEntity> wrapper);

	List<ZichanbaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanbaofeiEntity> wrapper);
	
	ZichanbaofeiView selectView(@Param("ew") Wrapper<ZichanbaofeiEntity> wrapper);
	

}
