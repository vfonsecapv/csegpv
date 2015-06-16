package br.com.teste.framework;
import groovy.transform.PackageScope

public interface RedisConfig {
	def setEntity(String key, Object entity);
	def getEntity(Class<?> entityType, String key);
}