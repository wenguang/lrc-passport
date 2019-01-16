####servlet有三个连接点供不同的组件整合用

- listener获取在context-param来整合（listener通常了ServletContextListener接口的类，它还得可获得容器上下文，comtext-param参数通常也定义在该类中）
- filter的init-param来整合
- servlet的init-param来整合

####以下为例子

servlet整合spring
```
<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath:applicationContext.xml</param-value>
</context-param>

<listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
```


servlet整合shiro
```
<context-param>
    <param-name>shiroEnvironmentClass</param-name>
    <param-value>org.apache.shiro.web.env.IniWebEnvironment</param-value>
  </context-param>
  <context-param>
    <param-name>shiroConfigLocation</param-name>
    <param-value>classpath:shiro.ini</param-value>
  </context-param>

  <listener>
    <listener-class>org.apache.shiro.web.env.EnvironmentLoaderListener</listener-class>
  </listener>
```


jersey整合spring
```
<filter>
        <filter-name>jerseyServletContainer</filter-name>
        <filter-class>org.glassfish.jersey.servlet.ServletContainer</filter-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:spring.xml</param-value>
        </init-param>
        <init-param>
            <param-name>jersey.config.server.provider.packages</param-name>
            <param-value>jersey.spring</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>jerseyServletContainer</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
```


servlet整合springMVC
```
<servlet>
    <servlet-name>dispatcherServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath:spring-mvc.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
    <servlet-name>dispatcherServlet</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
```








