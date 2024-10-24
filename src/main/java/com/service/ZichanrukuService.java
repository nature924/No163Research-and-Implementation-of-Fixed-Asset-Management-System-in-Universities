package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanrukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanrukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanrukuView;


/**
 * 资产入库
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanrukuService extends IService<ZichanrukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanrukuVO> selectListVO(Wrapper<ZichanrukuEntity> wrapper);
   	
   	ZichanrukuVO selectVO(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
   	
   	List<ZichanrukuView> selectListView(Wrapper<ZichanrukuEntity> wrapper);
   	
   	ZichanrukuView selectView(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanrukuEntity> wrapper);
   	

}

