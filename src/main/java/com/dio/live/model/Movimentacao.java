package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
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
public class Movimentacao {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public  class  MovimentacaoId implements Serializable{
            private long idmovimentacao;
            private long idusuario;
        }
        @Id
        @EmbeddedId
        private MovimentacaoId movimentacaoId;
        private LocalDateTime dataEntrada;
        private LocalDateTime dataSaida;
        private BigDecimal periodopermanencia;
        @ManyToOne
        private Ocorrencia idocorrencia;
        @ManyToOne
        private Calendario iddataespecial;
}
