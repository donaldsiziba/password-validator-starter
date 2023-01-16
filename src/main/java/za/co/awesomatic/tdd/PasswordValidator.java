package za.co.awesomatic.tdd;

import za.co.awesomatic.tdd.dto.PasswordValidationRequest;
import za.co.awesomatic.tdd.dto.PasswordValidationResponse;

import java.util.ArrayList;
import java.util.function.Function;

public class PasswordValidator implements Function<PasswordValidationRequest, PasswordValidationResponse> {
    @Override
    public PasswordValidationResponse apply(PasswordValidationRequest passwordValidationRequest) {
        return new PasswordValidationResponse(true, new ArrayList<>());
    }
}
