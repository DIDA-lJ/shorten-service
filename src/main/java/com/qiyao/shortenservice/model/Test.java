package com.qiyao.shortenservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Test
 * @Description 测试实体类
 * @Version 1.0.0
 * @Date 2023/08/28
 * @Author LinQi
 */
@Entity
@Table(name="t_test")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
}
