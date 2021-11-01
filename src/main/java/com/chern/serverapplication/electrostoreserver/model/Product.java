package com.chern.serverapplication.electrostoreserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("unit_cost")
    private Double unitCost;
    @JsonProperty("model")
    private String model;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("supplier")
    private Supplier supplier;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty("productName")
    private ProductName productName;

}
