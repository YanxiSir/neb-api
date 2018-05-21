# neb-api
星云链(Nebulas) java版工具包。[nebulas-wiki](https://github.com/nebulasio/wiki/blob/master/rpc.md)

### 使用方法

目前只支持基于Spring项目使用，工具包技术点：Spring、lombok、okhttp

使用方法分两步：

- 1、配置neb节点地址。（主网/测试网/私有节点）
- 2、在启动类配置注解@EnableNebHttp

示例(application.yml)：

```yml
neb:
#### 私有节点
#    host: http://localhost:8685
#### 主网
#    host: http://mainnet.nebulas.io
#### 测试网
    host: http://testnet.nebulas.io
```

```java
@Slf4j
@PropertySource({
        "classpath:application.yml"
})
@SpringBootApplication
@EnableNebHttp
public class TestNebUserApi {

    @Autowired
    private INebApiUserService userService;

    @Test
    public void nebState() {
        userService.nebState().toBlocking().first().getResult();
    }
    ...
}
```





