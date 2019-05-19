package com.zehao.service.chain.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * 服务链路追踪
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ServiceChainTraceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceChainTraceApplication.class, args);
	}
}
