package com.example.demo.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.LoginForm;
import com.example.demo.binding.SignUpForm;
import com.example.demo.binding.UnlockForm;
import com.example.demo.entity.UserDtlsEntity;
import com.example.demo.repo.UserDtlsRepo;
import com.example.demo.service.UserService;
import com.example.demo.util.EmailUtils;
import com.example.demo.util.PwdUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDtlsRepo userDtlsRepo;

	@Autowired
	private EmailUtils emailUtils;

	@Override
	public String login(LoginForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean signUp(SignUpForm form) {
		
		UserDtlsEntity user = userDtlsRepo.findByEmail(form.getEmail());
		if(user != null) {
			return false;
		}
		
		// copy data from binding object to entity object
		UserDtlsEntity entity = new UserDtlsEntity();
		BeanUtils.copyProperties(form, entity);

		// generate random password
		String tempPwd = PwdUtils.generateRandomPwd();

		// set account status as locked
		entity.setAccStatus("LOCKED");

		// insert the record
		userDtlsRepo.save(entity);

		// send email to unlock the account
		String to = form.getEmail();
		String subject = "Unlock your Account || Sumit It";
		StringBuffer body = new StringBuffer("");
		body.append("<h1> Use below temporary password to unlock your account </h1>");

		body.append("Temporary pwd : " + tempPwd);
		body.append("<br/>");
		body.append("<a href= \"http://localhost:8080/unlock?email= " + form.getEmail() +
					" \"> click here to unlock your account </a>");

		emailUtils.sendEmail(to, subject, body.toString());

		return true;
	}

	@Override
	public boolean unlockAccount(UnlockForm form) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
