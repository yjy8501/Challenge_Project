package com.skhu.challenge.controller;

import java.util.List;


import com.skhu.challenge.model.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skhu.challenge.entity.Challenge;
import com.skhu.challenge.repository.ChallengeRepository;

@RestController
public class ChallengeController {

    @Autowired  ChallengeRepository challengeRepository;

    // 챌린지 그룹 리스트 출력
    @GetMapping("root/api/select")
    public List<Challenge> Challenges() {

        return challengeRepository.findAll();
    }

    // 챌린지 그룹 생성
    @PostMapping("root/api/create/{name}/{outline}/{icon}/{color}")
    public Object Create_Challenge(@PathVariable("name") String name, @PathVariable("outline") String outline, @PathVariable("icon") String icon, @PathVariable("color") String color) {

        Challenge challenge = new Challenge();
        challenge.setName(name);
        challenge.setOutline(outline);
        challenge.setIcon(icon);
        challenge.setColor(color);

        challengeRepository.save(challenge);

        Success success = new Success();
        success.changeSuccess();

        return success;
    }



}
