package com.pod.examples;

public class UserMapper {

    public UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setFullName(user.getFirstName() + " " + user.getLastName().toUpperCase());
        dto.setAge(user.getAge());
        return dto;
    }
}
