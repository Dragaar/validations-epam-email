package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {

        if(email == null || email.equals("")) return false;

        Pattern emailPatt = Pattern.compile("^([a-zA-z]+)" +
                "_" +
                "([a-zA-z]+)" +
                "([\\d]*)" +
                "@epam.com" +
                "$"
        );

        //"^([a-zA-z]+)_([a-zA-z]+)([\\d]*)@epam.com$"

        Matcher m = emailPatt.matcher(email);

        if(m.matches()) return true;

        return false;

    }
}





