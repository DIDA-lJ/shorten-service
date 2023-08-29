package com.qiyao.shortenservice.dao;

import com.qiyao.shortenservice.model.Test;
import org.springframework.data.repository.CrudRepository;

/**
 * @InterfaceName TestDao
 * @Description 测试 jpa 框架
 * @Version 1.0.0
 * @Date 2023/08/28
 * @Author LinQi
 */
public interface TestDao extends CrudRepository<Test, Long> {

}
