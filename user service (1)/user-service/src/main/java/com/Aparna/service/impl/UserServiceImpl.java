package com.Aparna.service.impl;

import com.Aparna.exception.UserException;
import com.Aparna.model.User;
import com.Aparna.repository.UserRepository;
import com.Aparna.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) throws UserException {
        Optional<User> otp = userRepository.findById(id);
        if(otp.isPresent()){
            return otp.get();
        }
        throw new UserException("----User Not Created----");
    }

    @Override
    public List<User> getUser(){
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id,User user) throws UserException {
        Optional<User> otp = userRepository.findById(id);
        if(otp.isEmpty()){
            throw new UserException("---No User is Created By This Id"+id+"---");
        }
        User existingUser = otp.get();
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        existingUser.setRole(user.getRole());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long id) throws UserException {
        Optional<User> otp = userRepository.findById(id);
        if(otp.isEmpty()){
            throw new UserException("---No User is Created By This ID"+id+"---");
        }
        userRepository.deleteById(otp.get().getId());
    }
}
