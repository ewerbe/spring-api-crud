package br.com.ewerbe.aplicacao_curso.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "users")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private String login;
    @Column
    private String senha;


}
