package com.issuestation.Dto.UserDto.Nickname;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NicknameResponseDto {
    private boolean nicknameDuplicate;
}
