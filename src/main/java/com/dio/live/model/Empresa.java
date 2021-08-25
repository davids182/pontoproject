package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    private Long idempresa;
    private String descricaoempresa;
    private String cnpj;
    private String enderecoempresa;
    private String bairroempresa;
    private String cidadeempresa;
    private String estadoempresa;
    private String telefoneempresa;
}
