package com.example.demo.service;

import com.example.demo.binding.LoginForm;
import com.example.demo.binding.SignUpForm;
import com.example.demo.binding.UnlockForm;

public interface UserService {

	public String login(LoginForm form);

	public boolean signUp(SignUpForm form);

	public boolean unlockAccount(UnlockForm form);

	public String forgotPwd(String email);

}
