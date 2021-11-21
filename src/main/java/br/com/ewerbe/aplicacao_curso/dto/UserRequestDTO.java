package br.com.ewerbe.aplicacao_curso.dto;

import lombok.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserRequestDTO {

    private String login;
    private String senha;


}
