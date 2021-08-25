package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Usuario {
    @Id
    private Long idusuario;
    @ManyToOne
    private CategoriaUsuario idcategoriausuario;
    private String nomeusuario;
    @ManyToOne
    private Empresa idempresa;
    @ManyToOne
    private NivelAcesso idnivelacesso;
    @ManyToOne
    private  JornadaTrabalho idjornadatrabalho;
    private BigDecimal toleranciaatraso;
    private LocalDateTime horarioiniciojornada;
    private LocalDateTime horariofimjornada;
}
