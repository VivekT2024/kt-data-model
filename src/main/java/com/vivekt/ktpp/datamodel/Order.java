package com.vivekt.ktpp.datamodel;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    String orderId;
    String symbol;
    Integer Quantity;
    String Side;
}
