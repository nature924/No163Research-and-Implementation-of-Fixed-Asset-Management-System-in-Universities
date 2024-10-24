package com.dao;

import com.entity.ZichanbaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanbaoxiuVO;
import com.entity.view.ZichanbaoxiuView;


/**
 * 资产报修
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanbaoxiuDao extends BaseMapper<ZichanbaoxiuEntity> {
	
	List<ZichanbaoxiuVO> selectListVO(@Param("ew") Wrapper<ZichanbaoxiuEntity> wrapper);
	
	ZichanbaoxiuVO selectVO(@Param("ew") Wrapper<ZichanbaoxiuEntity> wrapper);
	
	List<ZichanbaoxiuView> selectListView(@Param("ew") Wrapper<ZichanbaoxiuEntity> wrapper);

	List<ZichanbaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanbaoxiuEntity> wrapper);
	
	ZichanbaoxiuView selectView(@Param("ew") Wrapper<ZichanbaoxiuEntity> wrapper);
	

}
