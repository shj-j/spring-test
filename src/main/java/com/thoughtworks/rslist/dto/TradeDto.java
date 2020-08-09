package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

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
