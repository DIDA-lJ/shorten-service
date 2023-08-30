package com.qiyao.shortenservice.job;

import com.qiyao.shortenservice.dao.UrlMapDao;
import com.qiyao.shortenservice.model.UrlMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * @ClassName ClearJob
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/08/30
 */
@Component
@Slf4j
public class ClearJob {
    @Autowired
    private UrlMapDao urlMapDao;

    /**
     * 单机版的定时任务,设置清除时间为 60 s
     */
    @Scheduled(fixedRate = 60 * 1000)
    public void clear() {
        log.info("clear job");
        List<UrlMap> list = urlMapDao.findByExpireTimeBefore(Instant.now().plus(30, ChronoUnit.DAYS));
        for (UrlMap urlMap : list) {
            log.info("delete url map {}", urlMap);
            urlMapDao.deleteById(urlMap.getId());
        }
    }


}
