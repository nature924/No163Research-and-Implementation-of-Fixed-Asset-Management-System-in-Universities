package com.dao;

import com.entity.ZichanrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanrukuVO;
import com.entity.view.ZichanrukuView;


/**
 * 资产入库
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanrukuDao extends BaseMapper<ZichanrukuEntity> {
	
	List<ZichanrukuVO> selectListVO(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	ZichanrukuVO selectVO(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	List<ZichanrukuView> selectListView(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);

	List<ZichanrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	ZichanrukuView selectView(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	

}
