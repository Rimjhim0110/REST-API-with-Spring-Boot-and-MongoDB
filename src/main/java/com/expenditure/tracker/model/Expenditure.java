package com.expenditure.tracker.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("expenditure")
public class Expenditure {
    @Id
    private String id;
    @Field(name = "name")
    @Indexed(unique = true)
    private String expenditureName;
    @Field(name = "category")
    private ExpenditureCategory expenditureCategory;
    @Field(name = "amount")
    private BigDecimal expenditureAmount;
    
    public void setId(String id) {
    	this.id = id;
    }
    
    public String getId() {
    	return id;
    }
    
    public void setExpenditureName(String expenditureName) {
    	this.expenditureName = expenditureName;
    }
    
    public String getExpenditureName() {
    	return expenditureName;
    }
    
    public void setExpenditureCategory(ExpenditureCategory expenditureCategory) {
    	this.expenditureCategory = expenditureCategory;
    }
    
    public ExpenditureCategory getExpenditureCategory() {
    	return expenditureCategory;
    }
    
    public void setExpenditureAmount(BigDecimal expenditureAmount) {
    	this.expenditureAmount = expenditureAmount;
    }
    
    public BigDecimal getExpenditureAmount() {
    	return expenditureAmount;
    }
}