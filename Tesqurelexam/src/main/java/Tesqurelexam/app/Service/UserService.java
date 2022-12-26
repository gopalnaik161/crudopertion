package Tesqurelexam.app.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import Tesqurelexam.app.Entity.User;

public interface UserService {
	
	public User addUser(@RequestBody User user);
	
	public User getoneUser(@PathVariable long userId) throws Exception;
	
	public List<User> getAllUser(@RequestBody User  user);
	
	public User updateUser(@PathVariable long userId ,@RequestBody User user);
	
	public void deleteUser(@PathVariable Long userId);
	

}
