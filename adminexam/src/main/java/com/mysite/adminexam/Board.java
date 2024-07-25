package com.mysite.adminexam;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    
    private String content;
    
    private LocalDateTime datetime;

    @OneToMany(mappedBy="board", cascade=CascadeType.REMOVE) //cascade -> 테이블 삭제 시 하위도 삭제 , DB cascade option
    private List<Reply> replyList;
    
}

