/*
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司
 * FileName: ProductController.java
 * Author:   88395515
 * Date:     2019/12/11  15:21
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package com.dubbo.consumer.action;

import com.dubbo.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉<br>
 * 〈功能详细描述〉
 *
 * @author 88395515
 * @date: Created in 15:21 2019/12/11
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 添加完 返回总共消费
     * @param
     * @return
     */
    @RequestMapping("/add")
    public String getCost(int a){
        return "该产品总共消费 ："+productService.getCost(a);
    }
}
