## Renren-Generator

---

Renren-Generator 是人人开源提供的基于 Mybatis-Plus 的代码逆向生成工具，可以根据我们数据表来自动生成项目所需的 Controller、Service、Dao 等代码。

生成之前我们先修改项目的 application.yml 配置文件，在里面修改我们的数据地址，包括数据库名，用户名和密码：

```yaml
# mysql
spring:
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    #MySQL配置
    driverClassName: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://192.168.56.10:3306/yunmall_pms?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai
    username: root
    password: root
```

然后在找到 generator.properties 代码生成配置文件，在里面修改我们的包名、模块名、作者、邮箱、表前缀等等：

```properties
#代码生成器，配置信息
mainPath=com.wang
#包名
package=com.wang.yunmall
moduleName=product
#作者
author=王廷云
#Email
email=wty1793172997@163.com
#表前缀(类名不会包含表前缀)
tablePrefix=pms_
```

由于 Renren-Generator 是基于 Shiro 的权限认证，但我们项目使用的是 Spring Security 来作为权限认证，所以我们需要修改相应的 Controller 生成规则。

在 resources/template/ 下找到 Controller.java.vm 文明，这个文件就是定义 Controller 层代码生成规则的文件，然后注释掉所有包含 `@RequiresPermissions` 注解的行，并且注释它的依赖包 `import org.apache.shiro.authz.annotation.RequiresPermissions`。

修改完之后，就可以运行 Renren-Generator 项目，启动成功之后，可以通过浏览器访问 `localhost:80`来进入人人代码生成器页面。

人人代码生成器页面中列出了数据中的所有表，我们可以选择要生成的数据表，也可以全选中然脏点击生成代码，然后就会下载一个生成好的代码压缩包，解压然后放到工程项目中即可。

