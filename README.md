# ONLY FOR EXAMPLE

## To Reproduce

```
./mvnw spring-boot:run
```

## Results

```
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.elasticsearch.client.Client]: Factory method 'elasticsearchClient' threw exception; nested exception is java.lang.NoClassDefFoundError: org/apache/logging/log4j/Logger
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:189)
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:588)
	... 24 more
Caused by: java.lang.NoClassDefFoundError: org/apache/logging/log4j/Logger
	at org.elasticsearch.common.logging.Loggers.getLogger(Loggers.java:105)
	at org.elasticsearch.common.logging.Loggers.getLogger(Loggers.java:72)
	at org.elasticsearch.common.component.AbstractComponent.<init>(AbstractComponent.java:37)
	at org.elasticsearch.plugins.PluginsService.<init>(PluginsService.java:98)
	at org.elasticsearch.client.transport.TransportClient.newPluginService(TransportClient.java:94)
	at org.elasticsearch.client.transport.TransportClient.buildTemplate(TransportClient.java:119)
	at org.elasticsearch.client.transport.TransportClient.<init>(TransportClient.java:247)
	at org.elasticsearch.transport.client.PreBuiltTransportClient.<init>(PreBuiltTransportClient.java:125)
	at org.elasticsearch.transport.client.PreBuiltTransportClient.<init>(PreBuiltTransportClient.java:111)
	at org.elasticsearch.transport.client.PreBuiltTransportClient.<init>(PreBuiltTransportClient.java:101)
	at com.example.Log4jDepApplication.elasticsearchClient(Log4jDepApplication.java:18)
	at com.example.Log4jDepApplication$$EnhancerBySpringCGLIB$$c6faa2db.CGLIB$elasticsearchClient$0(<generated>)
	at com.example.Log4jDepApplication$$EnhancerBySpringCGLIB$$c6faa2db$$FastClassBySpringCGLIB$$8b45530c.invoke(<generated>)
	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)
	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:356)
	at com.example.Log4jDepApplication$$EnhancerBySpringCGLIB$$c6faa2db.elasticsearchClient(<generated>)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:162)
	... 25 more
Caused by: java.lang.ClassNotFoundException: org.apache.logging.log4j.Logger
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	... 46 more
```