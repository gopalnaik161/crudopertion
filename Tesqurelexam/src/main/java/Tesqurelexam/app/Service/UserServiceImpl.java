package Tesqurelexam.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Tesqurelexam.app.Entity.User;
import Tesqurelexam.app.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User addUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User getoneUser(long userId) throws Exception {
		
//		return userRepo.findById(userId).orElse(null);
		return userRepo.findById(userId).orElseThrow(() -> new Exception("User Not Found"));
	}

	@Override
	public List<User> getAllUser(User user) {
		
		return userRepo.findAll();
	}

	@Override
	public User updateUser(long userId, User user) {
		User existingUser = userRepo.findById(userId).orElse(null);
		
		if(existingUser!=null) {
			existingUser.setUserId(user.getUserId());
			existingUser.setUserName(user.getUserName());
			existingUser.setAddress(user.getAddress());
			existingUser.setContactNumber(user.getContactNumber());
			existingUser.setAdminId(user.getAdminId());
			existingUser.setCreatedBy(user.getCreatedBy());
			existingUser.setDate(user.getDate());	
		}
		
		return userRepo.save(existingUser);
	}

	@Override
	public void deleteUser(Long userId) {
		User user =userRepo.getOne(userId);
		
		userRepo.delete(user);
	}

	


	

	

}
