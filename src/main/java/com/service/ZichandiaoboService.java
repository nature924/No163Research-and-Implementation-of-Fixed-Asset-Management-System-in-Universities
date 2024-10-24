package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichandiaoboEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichandiaoboVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichandiaoboView;


/**
 * 资产调拨
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichandiaoboService extends IService<ZichandiaoboEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichandiaoboVO> selectListVO(Wrapper<ZichandiaoboEntity> wrapper);
   	
   	ZichandiaoboVO selectVO(@Param("ew") Wrapper<ZichandiaoboEntity> wrapper);
   	
   	List<ZichandiaoboView> selectListView(Wrapper<ZichandiaoboEntity> wrapper);
   	
   	ZichandiaoboView selectView(@Param("ew") Wrapper<ZichandiaoboEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichandiaoboEntity> wrapper);
   	

}

