package com.example.fung_backend.domain.feed.domain;

import com.example.fung_backend.domain.user.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String image_url;

    @Builder
    public Feed(String title, String content, String image_url) {
        this.title = title;
        this.content = content;
        this.image_url = image_url;
    }
}
