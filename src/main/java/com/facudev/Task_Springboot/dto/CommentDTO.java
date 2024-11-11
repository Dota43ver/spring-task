package com.facudev.Task_Springboot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CommentDTO {

    private Long id;

    private String content;

    private Date CreatedAt;

    private Long taskId;

    private Long userId;

    private String postedBy;

}
