package com.bjit.AuthenticationModule.temp.email;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements EmailSender{
    private static Logger LOGGER= LoggerFactory.getLogger(EmailService.class);
    private JavaMailSender mailSender;
    private String fromEmail;
    @Autowired
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Value("${spring.mail.username}")
    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }
    @Override
    @Async
    public void send(String to, String email) {
        try {
            MimeMessage mimeMessage=mailSender.createMimeMessage();
            MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,"utf-8");
            helper.setText(email,true);
            helper.setTo(to);
            helper.setSubject("confirm your email");
            helper.setFrom(fromEmail);
            mailSender.send(mimeMessage);

        }catch (MessagingException e){
            LOGGER.error("failed to send email "+e);
            throw new IllegalStateException("failed to send email ");
        }

    }
}
