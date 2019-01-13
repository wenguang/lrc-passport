用vue写一个最简单的登录页，部署到nginx上，login.html、vue-2.4.0.js、jquery-3.3.1拷贝到nginx的html/passport目录下，即使不改nginx的配置也可以访问到的，http://localhost/passport/login.html。但我还是加了个location配置

```
#配置step-passport的location

location ^~ /passport/ {

    root   html/passport;

    index  login.html login.htm;

}
```



用http://localhost/passport访问不成功？

更多nginx配置说明见：[nginx配置location总结及rewrite规则写法](https://segmentfault.com/a/1190000002797606) 


按[openssl为nginx自签发证书](https://github.com/wenguang/lrc-https/tree/master/openssl%E4%B8%BAnginx%E8%87%AA%E7%AD%BE%E5%8F%91%E8%AF%81%E4%B9%A6) 配置https访问


