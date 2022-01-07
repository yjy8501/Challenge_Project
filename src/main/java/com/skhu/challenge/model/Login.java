package com.skhu.challenge.model;

import lombok.Data;

@Data
public class Login {
    int user_id;
    Boolean success = false;

    public void changeSuccess() {
        this.success = true;
    }
}
