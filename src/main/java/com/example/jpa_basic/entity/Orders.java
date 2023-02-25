package com.example.jpa_basic.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "food_id") //정보를 묶어 줌
    private Food food; //음식 정보를 가져옴

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public Orders(Food food, Member member) { //커멘트+n 누르면 단축키 사용 가능
        this.food = food;
        this.member = member;
    }
}
