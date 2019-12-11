/*
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: ProductServiceImpl.java
 * Author:   88395515
 * Date:     2019/12/11  15:20
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package com.dubbo.consumer.service.impl;

import org.apache.dubbo.config.annotation.Reference;
import com.dubbo.consumer.service.ProductService;
import com.dubbo.service.api.CostService;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    /**
     * 使用dubbo的注解 org.apache.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
