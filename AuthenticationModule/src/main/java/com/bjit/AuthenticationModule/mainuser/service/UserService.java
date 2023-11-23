package com.bjit.AuthenticationModule.mainuser.service;

import com.bjit.AuthenticationModule.mainuser.entity.UserEntity;
import com.bjit.AuthenticationModule.mainuser.repository.UserRepository;
import com.bjit.AuthenticationModule.temp.dto.RegistrationRequest;
import com.bjit.AuthenticationModule.temp.email.EmailSender;
import com.bjit.AuthenticationModule.temp.email.EmailValidator;
import com.bjit.AuthenticationModule.temp.entity.TempUser;
import com.bjit.AuthenticationModule.temp.repository.TempUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private final String USER_NOT_FOUND_MSG="user with %s notFound";
    private final TempUserRepository tempUserRepository;
    private final UserRepository userRepository;
    private EmailSender emailSender;
//    public  String signUp(RegistrationRequest request){
//
//        UserEntity userEntity=UserEntity.builder()
//                .firstName(request.getFirstName())
//                .lastName(request.getLastName())
//                .email(request.getEmail())
//                .password(encoded)
//                .expiredTime(LocalDateTime.now().plusMinutes(15))
//                .token(token)
//                .build();
//        tempUserRepository.save(tempUser);
//        String link= "http://localhost:8080/api/v1/registration/confirm?token="+token;
//        emailSender.send(request.getEmail(),buildEmail(request.getFirstName(),link));
//        return "Email Sent to your account. Please Verify";
//
//
//    }
}
