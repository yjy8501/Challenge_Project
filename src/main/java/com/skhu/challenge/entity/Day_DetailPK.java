package com.skhu.challenge.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Day_DetailPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name="user_id", nullable=false)
    int user_id;

    @Column(name="challenge_id", nullable=false)
    int challenge_id;

    public Day_DetailPK(){}

    public Day_DetailPK(int user_id, int challenge_id) {
        super();
        this.user_id = user_id;
        this.challenge_id = challenge_id;
    }
}
