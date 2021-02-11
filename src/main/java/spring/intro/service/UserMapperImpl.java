package spring.intro.service;

import org.springframework.stereotype.Service;
import spring.intro.dto.UserResponseDto;
import spring.intro.model.User;

@Service
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
}
