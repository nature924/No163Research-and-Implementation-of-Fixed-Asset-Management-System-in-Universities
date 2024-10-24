package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieyongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieyongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieyongxinxiView;


/**
 * 借用信息
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface JieyongxinxiService extends IService<JieyongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieyongxinxiVO> selectListVO(Wrapper<JieyongxinxiEntity> wrapper);
   	
   	JieyongxinxiVO selectVO(@Param("ew") Wrapper<JieyongxinxiEntity> wrapper);
   	
   	List<JieyongxinxiView> selectListView(Wrapper<JieyongxinxiEntity> wrapper);
   	
   	JieyongxinxiView selectView(@Param("ew") Wrapper<JieyongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieyongxinxiEntity> wrapper);
   	

}

