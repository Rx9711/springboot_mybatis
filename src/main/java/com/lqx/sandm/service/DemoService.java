package com.lqx.sandm.service;

import com.lqx.sandm.mapper.DemoMapper;
import com.lqx.sandm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<User> findAll(){
        return demoMapper.findAll();
    }
}
