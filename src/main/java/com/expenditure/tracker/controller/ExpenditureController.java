package com.expenditure.tracker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expenditure.tracker.model.Expenditure;
import com.expenditure.tracker.service.ExpenditureService;

@RestController
@RequestMapping("/api/expenditure")
public class ExpenditureController {
    private final ExpenditureService expenditureService;
    
    public ExpenditureController(ExpenditureService expenditureService) {
    	this.expenditureService = expenditureService;
    }

    @PostMapping
    public ResponseEntity addExpenditure(@RequestBody Expenditure expenditure) {
        expenditureService.addExpenditure(expenditure);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateExpenditure(@RequestBody Expenditure expenditure) {
        expenditureService.updateExpenditure(expenditure);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<List<Expenditure>> getAllExpenditures() {
        return ResponseEntity.ok(expenditureService.getAllExpenditures());
    }

    @GetMapping("/{name}")
    public ResponseEntity getExpenditureByName(@PathVariable String name) {
        return ResponseEntity.ok(expenditureService.getExpenditureByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteExpenditure(@PathVariable String id) {
        expenditureService.deleteExpenditure(id);
        return ResponseEntity.noContent().build();
    }
}