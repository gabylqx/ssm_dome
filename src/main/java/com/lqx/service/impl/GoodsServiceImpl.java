package com.lqx.service.impl;

import com.lqx.dao.GoodsMapper;
import com.lqx.javabean.Goods;
import com.lqx.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ssm
 * @description:
 * @author: Li Qixuan
 * @create: 2019-08-22 10:29
 */

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods getGoodsById(int gds_id) {
        return goodsMapper.getGoods(gds_id);
    }

    public GoodsServiceImpl(){System.out.println("GoodsServiceImpl 构造");}
}
