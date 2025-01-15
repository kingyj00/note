package com.ll;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter // 자동 넘겨
@Setter // 자동 받아 All final일때는 받을게없으니 노필요
@RequiredArgsConstructor // 생성자를 자동으로 해줌
// 컨스트럭쳐 안해도됨
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column(nullable = false, unique = true)
    private final String email;
    // 아이디 대신 이메일을 고유ID값으로 지정해서 이메일로 로그인하려면 이렇게하면되나요?

    @Column(nullable = false)
    private  String password;

    private final LocalDateTime createdAt; //선언만 해놓고 추후에 생성자로 주입
    // 생성자 장점 : 값이 변하지 않고 필요할곳에만 불러와서 사용가능

}