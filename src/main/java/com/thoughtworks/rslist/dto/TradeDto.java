package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trade")
@Entity
public class TradeDto {
    @Id
    @GeneratedValue
    private Integer id;

    private int amount;
    private int rank;

    @OneToOne
    private RsEventDto rsEventDto;
}
