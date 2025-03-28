package com.ll;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // JPA 엔티티 클래스임을 선언
@Table(name = "users")  // 실제 테이블명을 'users'로 지정
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    // 기본 생성자 & getter, setter 생략
}

// @Table 어노테이션은 JPA (Java Persistence API)에서 엔티티(Entity)와 데이터베이스의 테이블을 매핑할 때 사용해!
//👉 이 코드는 User라는 엔티티 클래스를 데이터베이스의 users 테이블과 연결하는 거야.
//만약 @Table(name = "users")을 생략하면, 기본적으로 테이블 이름은 User가 될 거야(클래스 이름과 동일).