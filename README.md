# SpringBoot 短链接系统
## 什么是短链接系统
> 短链接系统是一种将长网址转化为短网址的服务，旨在缩短 URL 并且提供友好的链接形式，长网址可能包含大量字符，不方便分享、输入或记忆，而短链接则可以将长网址映射到短字符串，使得链接更加简洁和方便使用。
> 本项目是一个完全的纯后端项目，其一般是在微服务项目中作为一个单独存在的模块，所以需要的可以根据自己业务需求进行重构
![image](https://github.com/DIDA-lJ/shorten-service/assets/97254796/e9ec2372-e8d0-4b9f-b6ed-c253d3640f13)

## 短链接系统的优势
<ol>
  <li><b>便捷分享</b>：短链接更短，更加易于分享，适用于社交媒体、短信、邮件等场景，提供更加美观的外观</li>
  <li><b>提高用户体验</b>：**短链接可以简化用户输入，减少用户访问链接时的操作，提升用户体验</li>
  <li><b>推广以及营销</b>：短链接可以用于推广和营销活动，跟踪广告点击以及转化率，帮助优化营销策略</li>
</ol>


## 使用技术栈
编程语言：Java
使用技术：Spring Boot 3.1.0 + JPA + MySQL + Guava + Junit 5 + Lombok + Druid 数据库连接池
描述：项目采用纯后端的方式实现，没有前端


## 项目目录
![image](https://github.com/DIDA-lJ/shorten-service/assets/97254796/04aea73d-d1d9-472e-862d-04db33f8a8d3)

其源码全都存储在 src 目录下面,目录结构叙述如下：<br/>
<ul>
       <li>common 自定义了结果封装类 </li>
       <li>controller 主要存放了测试接口以及 UrlMap 接口 </li> 
       <li>dao  数据访问层 </li> 
       <li>demo Guava 样例测试层 </li>
       <li>exceptions 自定义异常类 </li>
       <li>job 定时任务处理层 </li> 
       <li>model 模型层，主要存储了短链接的模型类以及测试样例模型类 </li> 
       <li>service 服务实现层 </li> 
       <li>utils</li>  主要存放着 Base62 加密工具类
  </ul>

具体构建过程可以查看项目的 MarkDown 文档，这里不做过多的赘述
