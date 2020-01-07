package com.hty.demo.dubboissue5591.config;

import org.springframework.stereotype.Component;

@Component
public class Constants {
    public final static String CORE_PACKAGE = "com.hty.demo.dubboissue5591";

    /**
     * dubbo常量
     */
    public static final class DubboConfig {
        public static final String REGISTRY_ADDRESS = "10.1.100.34:2181,10.1.100.35:2181,10.1.100.36:2181";
        public static final String DUBBO_GROUP = "dubbo-bigdata";
        public static final String REGISTRY_PROTOCOL = "zookeeper";
        public static final String ZK_CLIENT = "curator";

        public static final String PROTOCOL_NAME = "dubbo";
        public static final String PROTOCOL_SERIALIZATION = "hessian2";
        public static final String APP_NAME = "demo";
    }
}
