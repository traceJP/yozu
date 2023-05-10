## YoZu管理平台

### 1. 项目介绍

- 该项目基于 RuoYi-Cloud 项目进行二次开发，主要用于管理 YoZu 项目的用户、角色、权限、菜单等信息。
- RuoYi-Cloud： https://gitee.com/y_project/RuoYi-Cloud

### 2. 项目优势

- 信息门户平台管理定制方案：
  - 传统后台管理系统无法将后台管理人员与目标用户人员分离，导致后台管理系统的功能过于复杂，使用门槛过高，无法满足目标用户的使用需求。
  - YoZu 管理平台将后台管理系统与目标用户系统分离，后台管理系统只负责管理后台管理人员，目标用户系统只负责管理目标用户，但其鉴权机制是一致的。
  - 该项目通过 Member 模块 和 System 模块 进行分离；并且都通过 Auth 模块进行鉴权，实现多类型用户数据源鉴权管理。

- file 模块重构：
  - RuoYi-Cloud 项目 file 模块为目标文件数据库提供了一个门户接口二次包装，增加了一层额外的代理，导致文件上传、下载、删除等操作的性能较低。
  - YoZu 管理平台 将其重构至 thirdparty 模块，并且提供了多种文件上传形式，如签名直传、签名+分片上传、签名+断点续传、MD5秒传等。
  - 该项目通过 thirdparty 模块 重构了 file 模块，提供了更加灵活的文件上传、下载、删除等操作，性能更高。

- 整合 SMS\EMAIL 接口:
  - 为了满足目标用户的使用需求，该项目通过 thirdparty 模块 整合了 SMS\EMAIL 接口，实现了短信、邮件的发送功能。
  - EMAIL 接口支持 thymeleaf 模板邮件发送。

- Oauth2.0 授权登录:
  - 该项目通过 thirdparty 模块 整合了 微博 等第三方授权登录接口，实现了第三方授权登录功能。
  - 通过策略模式优化 Oauth2.0 接口，实现了多种第三方授权登录接口的整合。

