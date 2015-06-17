package caixaseguradora.service.model

import groovy.transform.ToString

import com.fasterxml.jackson.annotation.*

@ToString
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
class Cobertura {
	String nome
	String id
	String regra
}