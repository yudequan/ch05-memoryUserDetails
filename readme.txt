ch05-memoryUserDetails: 使用InMemoryUserDetailsManager管理内存中的用户信息

实现步骤：
1.新建maven项目
2.加入依赖
    springboot:2.0.6
    spring-boot-starter-security
    spring-boot-starter-web
3.创建应用的配置类
    创建密码的处理类对象
    使用InMemoryUserDetailsManager创建用户
4.创建类继承WebSecurityConfigurerAdapter创建用户
    自定义安全配置
5.测试