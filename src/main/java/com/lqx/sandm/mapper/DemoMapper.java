package com.lqx.sandm.mapper;

import com.lqx.sandm.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Mapper和启动类上的@MapperScan("com.lqx.sandm.mapper")作用一样
 * @Mapper：使用@Mapper时需要每个类都加@Mapper
 * @MapperScan：而使用@MapperScan就可以扫描一个包下面的所有类
 */
@Mapper
public interface DemoMapper {

    List<User> findAll();
}
