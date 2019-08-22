package com.lqx.service;

import com.lqx.javabean.Client;

/**
 * @program: ssm
 * @description: 客户业务层
 * @author: Li Qixuan
 * @create: 2019-08-22 11:17
 */
public interface ClientService {
    public Client getClient(int cltId);
    public int addClient(Client client);
}
