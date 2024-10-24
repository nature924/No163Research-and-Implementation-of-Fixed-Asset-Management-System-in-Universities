package com.dao;

import com.entity.ZichanpandianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanpandianVO;
import com.entity.view.ZichanpandianView;


/**
 * 资产盘点
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanpandianDao extends BaseMapper<ZichanpandianEntity> {
	
	List<ZichanpandianVO> selectListVO(@Param("ew") Wrapper<ZichanpandianEntity> wrapper);
	
	ZichanpandianVO selectVO(@Param("ew") Wrapper<ZichanpandianEntity> wrapper);
	
	List<ZichanpandianView> selectListView(@Param("ew") Wrapper<ZichanpandianEntity> wrapper);

	List<ZichanpandianView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanpandianEntity> wrapper);
	
	ZichanpandianView selectView(@Param("ew") Wrapper<ZichanpandianEntity> wrapper);
	

}
