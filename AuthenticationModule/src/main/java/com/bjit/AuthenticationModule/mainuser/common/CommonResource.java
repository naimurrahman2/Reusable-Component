package com.bjit.AuthenticationModule.mainuser.common;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class CommonResource {
    @CreatedDate
    @Column(name = "created_at",updatable = false)
    LocalDateTime createdAt;//
    @LastModifiedDate
    @Column(name = "updated_at")
    LocalDateTime updatedAt;
    @CreatedBy
    @Column(name = "created_by", length = 50)
    String createdBy;//
    @LastModifiedBy
    @Column(name = "updated_by", length = 50)
    String updatedBy;
    @CreatedDate
    @Column(name = "confirmation_at")
    LocalDateTime confirmationAt;//
    @CreatedDate
    @Column(name = "registered_at")
    LocalDateTime registeredAt;//

    @Column(name = "delete_flag")
    public boolean deleteFlag = false;
    @Column(name = "active_flag")
    public boolean activeFlag = true;

//    @Autowired
//    public void setCreatedBy(String firstName) {
//        this.createdBy = firstName + "@CreatedBy";
//    }
}
