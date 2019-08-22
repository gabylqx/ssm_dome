package com.lqx.dao;

import com.lqx.javabean.Goods;

/**
 * @program: ssm
 * @description: GoodsMapper
 * @author: Li Qixuan
 * @create: 2019-08-22 10:33
 */

public interface GoodsMapper {

    Goods getGoods(int gds_id);

}
