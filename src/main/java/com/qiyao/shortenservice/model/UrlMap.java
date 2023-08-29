package com.qiyao.shortenservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

/**
 * @ClassName UrlMap
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/29
 * @Author LinQi
 */
@Entity
@Table(name = "t_url_map", indexes = {@Index(columnList = "longUrl",unique = true),
@Index(columnList = "expireTime",unique = false)})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UrlMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String longUrl;

    private Instant expireTime;

    @CreationTimestamp
    private Instant creationTime;

}
