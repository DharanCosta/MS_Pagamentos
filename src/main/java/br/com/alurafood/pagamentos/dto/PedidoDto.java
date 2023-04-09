package br.com.alurafood.pagamentos.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {

    private Long id;
    private LocalDateTime dataHora;
    private String status;
    private List<ItemDoPedidoDto> itens = new ArrayList<>();

}

