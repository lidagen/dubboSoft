/*
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: CostServiceImpl.java
 * Author:   88395515
 * Date:     2019/12/11  15:29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package com.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import com.dubbo.service.api.CostService;

@Service
public class CostServiceImpl implements CostService {
    /**
     * 假设之前总花费了100
     */
    private final Integer totalCost = 1000;

    /**
     * 之前总和 加上 最近一笔
     * @param cost
     * @return
     */
    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}
