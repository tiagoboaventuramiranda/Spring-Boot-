package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.forum.modelo.StatusTopico;

public class DetalhesDoTopicoDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico status;
	private List<RespostaDto> respostas;

}
