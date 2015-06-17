package caixaseguradora.service.model

import groovy.transform.ToString

import com.fasterxml.jackson.annotation.*

@ToString
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
class Endereco {

	String logradouro
	String cep
	String cidade
}
