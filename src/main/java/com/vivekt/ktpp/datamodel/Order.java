package com.vivekt.ktpp.datamodel;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Order {

    String orderId;
    String symbol;
    Integer Quantity;
    String Side;
}
