## Renren-Fast-Vue

---

Renren-Fast-Vue 作为与 Renren-Fast 对应的后台管理系统的前端项目，这两个项目共同组成了一套完整的前后端分离的后台管理系统，提供了一种快速开发的解决方案。

首先，要使用 Renren-Fast-Vue，我们需要从 gitee 官网中搜索并下载该项目，下载完后我们需要删除项目中的 `.git` 和 `package-lock.json` 文件，然后修改 `package.json` 的内容如下：

```bash
"chromedriver": "85.0.1",
"node-sass": "4.14.1",
```

截止2020年9月17日,这是两个依赖的最新版本。

然后配置环境，Renren-Fast-Vue 需要依赖 node、npm、Python：

* Python 2.7：需要下载安装 Python2.7 版本到 `C:\Python27\` 路径下
* Node：下载安装最新版就可以了，我的版本是 v12.18.3
* Npm：Node 中附带安装的，我的版本是 v6.14.6

然后在项目下运行 `npm install` 命令，如果下载安装比较缓慢，我们可以使用淘宝镜像：

```bash
npm --registry https://registry.npm.taobao.org install cluster
```

下载过程中，如果报错，一般都是 node-sass4.9.0 安装失败或者有些依赖下载不了，我们可以采取以下步骤解决：

```bash
# 清理缓存
npm rebuild node-sass
npm uninstall node-sass

# 淘宝镜像下载
npm i node-sass --sass_binary_site=https://npm.taobao.org/mirrors/node-sass/
```

然后再执行 `npm install` 安装下载，如果出现报错 `<% if (process.env.NODE_ENV === ‘production’) { %> <% }else { %> <% } %>` 则使用以下方法处理：

```bash
# 卸载
npm uninstall --save node-sass
# 安装
npm install --save node-sass --unsafe-perm=true --allow-root
```

如果没问题的话就可以执行 `npm run dev` 命令启动项目了，启动之前，我们需要启动 renren-fast 后台模块，否则无法进行登录操作。