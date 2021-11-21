package br.com.ewerbe.aplicacao_curso.dto;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserDTO{

    private Long id;
    private String nome;
    private String login;
    private String senha;


}
