package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanbaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanbaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanbaoxiuView;


/**
 * 资产报修
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanbaoxiuService extends IService<ZichanbaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanbaoxiuVO> selectListVO(Wrapper<ZichanbaoxiuEntity> wrapper);
   	
   	ZichanbaoxiuVO selectVO(@Param("ew") Wrapper<ZichanbaoxiuEntity> wrapper);
   	
   	List<ZichanbaoxiuView> selectListView(Wrapper<ZichanbaoxiuEntity> wrapper);
   	
   	ZichanbaoxiuView selectView(@Param("ew") Wrapper<ZichanbaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanbaoxiuEntity> wrapper);
   	

}

