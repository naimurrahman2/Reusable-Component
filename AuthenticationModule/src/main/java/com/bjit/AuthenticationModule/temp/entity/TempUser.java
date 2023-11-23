package com.bjit.AuthenticationModule.temp.entity;

import com.bjit.AuthenticationModule.temp.common.TempCommonResource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "temp_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TempUser extends TempCommonResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String email;
    String firstName;
    String lastName;
    String password;
//    LocalDateTime created_at;
//    LocalDateTime expired_time;
    @Column(name = "expired_at")
    LocalDateTime expiredTime;
    String token;


}
