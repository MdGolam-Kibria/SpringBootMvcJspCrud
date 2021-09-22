package com.mvc.mvcJspCrud.model;

import com.mvc.mvcJspCrud.dto.BaseModel;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Expense extends BaseModel {
    private String itemName;
    private Double price;
    private String reason;
    private String description;
}
