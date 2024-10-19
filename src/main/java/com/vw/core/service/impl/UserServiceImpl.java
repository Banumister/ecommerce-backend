package com.vw.core.service.impl;

import com.vw.core.dto.UserDto;
import com.vw.core.dto.UserProfileDto;
import com.vw.core.entity.User;
import com.vw.core.constants.StringMassage;
import com.vw.core.handling.exception.RecordNotFoundException;
import com.vw.core.repository.UserRepo;
import com.vw.core.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepo userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public User saveUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        user.setFullName(user.getFirstName() + " " + userDto.getLastName());
        return userRepository.save(user);
    }

    @Override
    public UserDto fetchUser(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format(StringMassage.USER_NOT_FOUND+" with ID: "+ id)));
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public UserProfileDto fetchUserProfile(String userId) {
        User user;
        if(userId != null && !userId.isEmpty()){
            user = userRepository.findByUserId(userId);
        }else throw new RecordNotFoundException(String.format(StringMassage.USER_NOT_FOUND+" with userId: "+ userId));
        return modelMapper.map(user, UserProfileDto.class);
    }
}
