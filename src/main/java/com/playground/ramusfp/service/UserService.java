package com.playground.ramusfp.service;

import com.playground.ramusfp.entity.User;
import com.playground.ramusfp.entity.VerificationToken;
import com.playground.ramusfp.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String doGreeting();

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);

    Optional<User> getUserByPasswordResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);
}
