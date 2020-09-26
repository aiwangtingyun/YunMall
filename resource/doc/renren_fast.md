## Renren-Fast

---

本项目使用 `renren-fast` 模块作为后台管理系统，与前台 `renren-fast-vue` 共同组成一套完整的前后端分离管理项目。

由于我们使用的是 MySQL 作为持久化数据库，所以我们需要运行 renren-fast/db/mysql.sql 数据库脚本文件，里面包含了所有后台管理需要用到的数据表，我们把这些表创建在 `yunmall_admin` 数据库中。其效果和直接运行 resource/sql/yunmall_admin.sql 脚本文件是一样的。

Renren-Fast 提供的管理功能包括以下模块：

* 菜单管理
* 系统用户管理
* 系统用户 Token 管理
* 系统验证码管理
* 角色管理
* 用户与角色对应关系管理
* 角色与菜单对应管理管理
* 系统配置信息管理
* 系统日志管理
* 文件上传管理
* 定时任务管理
* 定时任务日志管理
* 普通用户管理

Renren-Fast 在 `renren-fast/src/main/java/io/renren/common` 目录下还提供了各种工具类，其中包含了 `renren-generator` 项目生成的代码锁需要的工具依赖。

启动 `renren-fast`之前我们需要修改 application.yml 配置文件，并根据使用的环境 dev、prod、test 修改对应 yaml 文件。

比如，在 dev 环境下我们需要修改 application.yml 文件中的数据库地址、用户名和密码等配置信息。项目中我们 renren-fast 后台管理系统使用的是 yunmall_admin 数据库，所以我们需要正确填写该数据库名称。