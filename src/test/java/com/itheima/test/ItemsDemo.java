package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.mapper.ItemsMapper;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsDemo {



    @Test
    public void findById(){
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        //ItemsMapper itemsMapper = app.getBean(ItemsMapper.class);

        //Items byId = itemsMapper.findById(1);


        ItemsService itemsService = app.getBean(ItemsService.class);
        Items byId = itemsService.findById(1);
        System.out.println(byId.getName());
    }
}
