package com.fastcampus.sns.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlarmArgs {
    // 알람을 발생시킨 유저의 id
    private Integer fromUserId;
    // 알람이 발생한 타겟 (포스트 or 댓글)
    private Integer targetId;
}
