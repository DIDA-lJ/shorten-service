package com.qiyao.shortenservice.dao;

import com.qiyao.shortenservice.model.UrlMap;
import org.springframework.data.repository.CrudRepository;

/**
 * @InterfaceName UrlMapDao
 * @Description UrlMap 数据访问层
 * @Version 1.0.0
 * @Date 2023/08/29
 * @Author LinQi
 */
public interface UrlMapDao extends CrudRepository<UrlMap, Long> {

    UrlMap findFirstByLongUrl(String longUrl);
}
