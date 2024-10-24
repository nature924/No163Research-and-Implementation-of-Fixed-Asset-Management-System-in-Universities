package com.dao;

import com.entity.ZichancaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichancaigouVO;
import com.entity.view.ZichancaigouView;


/**
 * 资产采购
 * 
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichancaigouDao extends BaseMapper<ZichancaigouEntity> {
	
	List<ZichancaigouVO> selectListVO(@Param("ew") Wrapper<ZichancaigouEntity> wrapper);
	
	ZichancaigouVO selectVO(@Param("ew") Wrapper<ZichancaigouEntity> wrapper);
	
	List<ZichancaigouView> selectListView(@Param("ew") Wrapper<ZichancaigouEntity> wrapper);

	List<ZichancaigouView> selectListView(Pagination page,@Param("ew") Wrapper<ZichancaigouEntity> wrapper);
	
	ZichancaigouView selectView(@Param("ew") Wrapper<ZichancaigouEntity> wrapper);
	

}
