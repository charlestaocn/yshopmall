/**
 * Copyright (C) 2018-2022
 * All rights reserved, Designed By www.yixiang.co

 */
package co.yixiang.modules.order.service;

import co.yixiang.common.service.BaseService;
import co.yixiang.modules.cart.vo.YxStoreCartQueryVo;
import co.yixiang.modules.order.domain.YxStoreOrderCartInfo;
import co.yixiang.modules.order.service.dto.YxStoreOrderCartInfoDto;
import co.yixiang.modules.order.service.dto.YxStoreOrderCartInfoQueryCriteria;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
* @author hupeng
* @date 2020-05-12
*/
public interface YxStoreOrderCartInfoService  extends BaseService<YxStoreOrderCartInfo>{

    /**
     * 添加购物车商品信息
     * @param oid 订单id
     * @param orderId 订单号
     * @param cartInfo 购物车信息
     */
    void saveCartInfo(Long oid, String orderId,List<YxStoreCartQueryVo> cartInfo);

    YxStoreOrderCartInfo findByUni(String unique);


    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(YxStoreOrderCartInfoQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<YxStoreOrderCartInfoDto>
    */
    List<YxStoreOrderCartInfo> queryAll(YxStoreOrderCartInfoQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<YxStoreOrderCartInfoDto> all, HttpServletResponse response) throws IOException;
}
