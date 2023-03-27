package com.example.test_fx;

public class RegistrationConverter {
    public Registration toRegistration(RegistrationViewModel viewModel){
        return new Registration(
                viewModel.getName(),
                viewModel.getSurname(),
                viewModel.getAge());
    }
}
