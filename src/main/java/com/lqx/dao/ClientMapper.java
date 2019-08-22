package com.lqx.dao;

import com.lqx.javabean.Client;
import com.lqx.javabean.Goods;

/**
 * @program: ssm
 * @description:
 * @author: Li Qixuan
 * @create: 2019-08-22 10:33
 */

public interface ClientMapper {

    Client getClient(int clientId);
    int addClient(Client client);
}
