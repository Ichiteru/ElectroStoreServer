package com.chern.serverapplication.electrostoreserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "sales")
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("date")
    private LocalDate date;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("product_model")
    private String productModel;
    @JsonProperty("sale_amount")
    private Integer saleAmount;
    @JsonProperty("total_cost")
    private Double totalCost;
    @JsonProperty("dealer_name")
    private String dealerName;
}
