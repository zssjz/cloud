# cloud

- 该示例仅为技术验证工程，还存在许多待(b)完(u)善(g)的地方，针对未加入的功能会在后续版本中逐一实现。
- 该示例工程使用`Spring Cloud Finchley.SR1`及`JDK8`。
- 该示例仅展示搭建过程，相关教程及文档可浏览[官方网站](https://projects.spring.io/spring-cloud/)或相关社区。

---

## eureka

该示例使用`Netflix Eureka`为注册中心，暂未实现高可用分布式注册中心。

**注**：由于`Netflix Eureka 2.0`开源终止, 可使用[`Spring Cloud Consul`](https://cloud.spring.io/spring-cloud-consul/)等注册服务。

---

## gateway

由于没有看到官方有整合`Netflix Zuul 2`的意愿以及现有整合的`Netflix Zuul 1`为阻塞式服务，不支持`WebSocket`等，故该示例采用`Spring Cloud Gateway`作为路由网关。
相关文档可浏览[官方网站](https://cloud.spring.io/spring-cloud-gateway/)。

---

## config

由于分布式应用数量众多，若每个应用都需要手动修改配置文件费时费力，可能还会有遗漏或错误，所以采用配置中心来统一管理配置。
本示例配置仓库为_https://github.com/zssjz/cloud-config_

---
