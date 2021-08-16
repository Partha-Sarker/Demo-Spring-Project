package com.example.demo.helper.validators.implementation;

import com.example.demo.database.repository.AnimeRepository;
import com.example.demo.helper.validators.annotation.ValidAnimeId;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AnimeIdValidityChecker implements ConstraintValidator<ValidAnimeId, Long> {
    @Autowired
    AnimeRepository repository;

    @Override
    public void initialize(ValidAnimeId validStudentId) {

    }

    @Override
    public boolean isValid(Long id, ConstraintValidatorContext constraintValidatorContext) {
        return repository.findById(id).isPresent();
    }
}
