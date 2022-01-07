package com.skhu.challenge.model;

import lombok.Data;

@Data
public class SignUp {
    Boolean success = false;

    public void changeSuccess() {
        this.success = true;
    }
}
