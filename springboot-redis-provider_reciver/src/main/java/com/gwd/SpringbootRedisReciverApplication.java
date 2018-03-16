package com.gwd;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

import com.gwd.config.Receiver;

@SpringBootApplication
public class SpringbootRedisReciverApplication {

	@Bean
	Receiver receiver(CountDownLatch latch) {
	return new Receiver(latch);
	}
	 
	//必要的redis消息队列连接工厂
	@Bean
	CountDownLatch latch() {
	return new CountDownLatch(1);
	}
	 
	//redis模板
	@Bean
	StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
	return new StringRedisTemplate(connectionFactory);
	}
	 
	//注入消息监听器容器
	@Bean
	RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,MessageListenerAdapter listenerAdapter) {
	RedisMessageListenerContainer container = new RedisMessageListenerContainer();
	container.setConnectionFactory(connectionFactory);
	container.addMessageListener(listenerAdapter, new PatternTopic("msg"));
	return container;
	}
	 
	//注入消息监听器容器
	@Bean
	MessageListenerAdapter listenerAdapter(Receiver receiver) {
	return new MessageListenerAdapter(receiver, "receiveMessage");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRedisReciverApplication.class, args);
	}
}
