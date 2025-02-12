package com.alejandracm;

import java.util.regex.Pattern;

public class EmailValidator {

   
    private static final String EMAIL_REGEX = "^(?![.-])[A-Za-z0-9._%+-]+(?:[A-Za-z0-9-._%]+)*@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    public boolean isValid(String email) {
      
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        return pattern.matcher(email).matches();
    }

}


