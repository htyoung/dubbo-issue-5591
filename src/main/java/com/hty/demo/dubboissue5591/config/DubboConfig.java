package com.hty.demo.dubboissue5591.config;

import org.apache.dubbo.common.utils.NetUtils;
import org.apache.dubbo.config.*;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = Constants.CORE_PACKAGE)
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(Constants.DubboConfig.APP_NAME);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(Constants.DubboConfig.REGISTRY_ADDRESS);
        registryConfig.setClient(Constants.DubboConfig.ZK_CLIENT);
        registryConfig.setGroup(Constants.DubboConfig.DUBBO_GROUP);
        registryConfig.setProtocol(Constants.DubboConfig.REGISTRY_PROTOCOL);
        registryConfig.setTimeout(10000); //10s超时
        registryConfig.setCheck(Boolean.FALSE);
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName(Constants.DubboConfig.PROTOCOL_NAME);
        protocol.setSerialization(Constants.DubboConfig.PROTOCOL_SERIALIZATION);
        protocol.setPort(NetUtils.getAvailablePort());
        return protocol;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setCheck(Boolean.FALSE);
        consumerConfig.setTimeout(10000);
        return consumerConfig;
    }

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setRetries(0);
        return providerConfig;
    }
}
