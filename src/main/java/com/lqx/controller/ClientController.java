package com.lqx.controller;

import com.lqx.javabean.Client;
import com.lqx.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ssm
 * @description: 客户层
 * @author: Li Qixuan
 * @create: 2019-08-22 12:44
 */
@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping("/showClient.do")
    public String getClientById(Integer id,Model model){
        if (id==null)
            id=1;
        Client client = clientService.getClient(id);
        model.addAttribute("client",client);
        return "showClient";
    }

    @RequestMapping("/addClient.do")
    public String addClient(Client client){
        if (clientService.addClient(client)>0)
            return "addOk";
        return null;
    }
}
