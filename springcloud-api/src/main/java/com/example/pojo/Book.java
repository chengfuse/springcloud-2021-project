package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private  int  bid;
    private  String  bname;
    private  double  price;
    private Date  createTime;
    private  int  uid;
    private  String  data_source;
}
