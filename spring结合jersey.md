
####但是注意一点，Jersey和Spring集成，更多的应该叫做Jersey来集成Spring，或者叫Jersey来启动Spring框架，使用的是HK2-Spring Bridge（HK2-Spring桥）依赖完成的。一般不会把Jersey和SpringMVC混合起来使用

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

