package com.example.restfull_api_demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Component
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private int  groupid;
    private String title;
    private int level;
}
