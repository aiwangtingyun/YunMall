## Yunmall-Common

---

Yunmall-Common 微服务模块作为其它微服务模块的公共模块，里面包含了其它微服务模块的公共依赖、Bean、工具类等。

公共依赖包括：

* mybatis-plus 依赖：

  ```xml
  <dependency>
      <groupId>com.baomidou</groupId>
      <artifactId>mybatis-plus-boot-starter</artifactId>
      <version>3.2.0</version>
  </dependency>
  ```

* lombok 依赖：用于简化类的代码，它会自动帮我们生成构造函数、各种 setter() 和 getter()、toString() 等

  ```xml
  <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.8</version>
  </dependency>
  ```

* http 请求工具类：apache 提供的用于 Java 的 http 请求的工具类

  ```xml
  <dependency>
      <groupId>org.apache.httpcomponents</groupId>
      <artifactId>httpcore</artifactId>
      <version>4.4.12</version>
  </dependency>
  ```

* lang 工具类：apache 提供的用于操作 Java lang 包的各种工具类

  ```xml
  <dependency>
      <groupId>commons-lang</groupId>
      <artifactId>commons-lang</artifactId>
      <version>2.6</version>
  </dependency>
  ```

* mysql 驱动包：包的版本可以使用最新版的包，因为他们都兼容 MySQL 5.6、5.7、8.0 版本

  ```xml
  <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.17</version>
  </dependency>
  ```

* servlet 原生的 api 包：由于 Tomcat 已自带了 servlet，所以包的声明周期设为 provided，用于调试即可

  ```xml
  <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>2.5</version>
      <scope>provided</scope>
  </dependency>
  ```

* fastjson：用于处理 `json` 的工具包

  ```xml
  <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>fastjson</artifactId>
      <version>1.2.15</version>
  </dependency>
  ```

* validation 校验工具包：

  ```xml
  <dependency>
      <groupId>javax.validation</groupId>
      <artifactId>validation-api</artifactId>
      <version>2.0.1.Final</version>
  </dependency>
  ```

  



公共组件包括：

* **utils**：公共的工具类，包括 http 请求工具类、分页工具类、封装数据返回类等等
* **xss**：公共的过滤器，包括 HTML 过滤类、SQL 过滤类
* **vo**：公共的查询 bean 类

