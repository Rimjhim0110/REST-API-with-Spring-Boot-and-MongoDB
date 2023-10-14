package com.expenditure.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.expenditure.tracker.model.Expenditure;
import com.expenditure.tracker.repository.ExpenditureRepository;

@Service
public class ExpenditureService {
    private final ExpenditureRepository expenditureRepository;
    
    public ExpenditureService(ExpenditureRepository expenditureRepository) {
    	this.expenditureRepository = expenditureRepository;
    }

    public void addExpenditure(Expenditure expenditure) {
        expenditureRepository.insert(expenditure);
    }

    public void updateExpenditure(Expenditure expenditure) {
        Expenditure savedExpense = expenditureRepository.findById(expenditure.getId())
        		.orElseThrow(() -> new RuntimeException(
        				String.format("Cannot Find Expenditure by ID %s", expenditure.getId())));
        
        savedExpense.setExpenditureName(expenditure.getExpenditureName());
        savedExpense.setExpenditureCategory(expenditure.getExpenditureCategory());
        savedExpense.setExpenditureAmount(expenditure.getExpenditureAmount());

        expenditureRepository.save(expenditure);
    }

    public Expenditure getExpenditureByName(String name) {
        return expenditureRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(
                		String.format("Cannot Find Expenditure by Name - %s", name)));
    }

    public List<Expenditure> getAllExpenditures() {
        return expenditureRepository.findAll();
    }

    public void deleteExpenditure(String id) {
        expenditureRepository.deleteById(id);
    }
}