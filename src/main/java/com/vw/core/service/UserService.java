package com.vw.core.service;

import com.vw.core.dto.UserDto;
import com.vw.core.entity.User;

public interface UserService {

    User saveUser(UserDto userDto);
}
