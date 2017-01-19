package com.example;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.InetAddress;

@SpringBootApplication
public class Log4jDepApplication {

	@Bean
    public Client elasticsearchClient() {
	    return new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getLoopbackAddress(), 9300));
    }

	public static void main(String[] args) {
		SpringApplication.run(Log4jDepApplication.class, args);
	}
}
