package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {


    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public  class BancoHorasId implements Serializable{
        private long idbancoboras;
        private long idmovimentacao;
        private long idusuario;


    }
    @EmbeddedId
    private BancoHorasId idbancohorasd;
    private LocalDateTime datatrabalhada;
    private BigDecimal quanthorastrabalhadas;
    private BigDecimal saldohorastrabalhadas;

}
