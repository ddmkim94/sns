package com.fastcampus.sns.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "이미 존재하는 회원입니다!"),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "가입 내역이 없습니다!"),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "패스워드가 일치하지 않습니다!"),
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "토큰이 유효하지 않습니다!"),
    POST_NOT_FOUND (HttpStatus.NOT_FOUND, "포스트를 찾을 수 없습니다!"),
    INVALID_PERMISSION(HttpStatus.UNAUTHORIZED, "권한이 없습니다!"),
    ALREADY_LIKED(HttpStatus.CONFLICT, "이미 좋아요를 누른 포스트입니다!"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_SERVER_ERROR"),
    ALARM_CONNECT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "connecting alarm occurs error!"),

    ;

    private final HttpStatus status;
    private final String message;

}
