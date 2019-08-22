package com.lqx.service.impl;

import com.lqx.dao.ClientMapper;
import com.lqx.javabean.Client;
import com.lqx.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ssm
 * @description: 实现
 * @author: Li Qixuan
 * @create: 2019-08-22 11:20
 */
@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public Client getClient(int cltId) {
        return clientMapper.getClient(cltId);
    }

    @Override
    public int addClient(Client client) {
        return clientMapper.addClient(client);
    }

    public ClientServiceImpl(){System.out.println("CLinentServiceImpl 构造");}
}
