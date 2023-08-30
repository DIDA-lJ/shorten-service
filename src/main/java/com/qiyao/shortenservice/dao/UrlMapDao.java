package com.qiyao.shortenservice.dao;

import com.qiyao.shortenservice.model.UrlMap;
import org.springframework.data.repository.CrudRepository;

import java.time.Instant;
import java.util.List;

/**
 * @InterfaceName UrlMapDao
 * @Description UrlMap 数据访问层
 * @Version 1.0.0
 * @Date 2023/08/29
 * @Author LinQi
 */
public interface UrlMapDao extends CrudRepository<UrlMap, Long> {
    /**
     * 通过长链接主键 查找 UrlMap 实体类
     *
     * @param longUrl
     * @return
     */
    UrlMap findFirstByLongUrl(String longUrl);

    /**
     * 查找链接过期时间
     * @param instant
     * @return
     */
    List<UrlMap> findByExpireTimeBefore(Instant instant);
}
