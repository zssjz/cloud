package com.jason.cloudgateway.config;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 与服务注册中心进行融合
 * @author zssjz
 */
@Configuration
public class RouteConfig {

    @Bean
    public RouteDefinitionLocator discoveryClientRouteDefinitionLocator(DiscoveryClient client, DiscoveryLocatorProperties properties) {
        return new DiscoveryClientRouteDefinitionLocator(client, properties);
    }
}
