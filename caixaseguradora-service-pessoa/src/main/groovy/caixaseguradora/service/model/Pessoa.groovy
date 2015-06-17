package caixaseguradora.service.model

import groovy.transform.ToString

import com.fasterxml.jackson.annotation.*

@ToString
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
class Pessoa {

	String nome
	String id
	Endereco endereco;

}
