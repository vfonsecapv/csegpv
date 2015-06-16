package br.com.teste.framework;
import groovy.transform.PackageScope

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class RedisConfigImpl implements RedisConfig {
	
	RedisTemplate template; 

	public RedisConfigImpl() {
	}

	@Bean
	public RedisTemplate createTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate tmpl = new RedisTemplate<String, Object>();
		tmpl.setConnectionFactory(connectionFactory);
		template = tmpl;
		return tmpl;
	}


	public void setEntityType(Class<?> entityType){
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new JacksonJsonRedisSerializer<>(entityType));
	}

	def setEntity(String key, Object entity) {
		setEntityType(entity.getClass());
		template.opsForValue().set(key, entity);
	}


	def getEntity(Class<?> entityType, String key) {
		setEntityType(entityType);
		template.opsForValue().get(key);
	}

	public RedisTemplate getTemplate()  {
		return template;
	}

}