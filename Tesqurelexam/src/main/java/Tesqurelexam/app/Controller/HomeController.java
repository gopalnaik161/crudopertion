package Tesqurelexam.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Tesqurelexam.app.Entity.User;
import Tesqurelexam.app.Service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService userservice;
	
	
	@PostMapping("/createUser")
	public User addUser(@RequestBody User user) {
		
	return this.userservice.addUser(user);
			
	}
	
	@GetMapping("/getuserbyId/{userId}")
	public User getoneUser(@PathVariable long userId) throws Exception {
		
		return userservice.getoneUser(userId);
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUser(@RequestBody User  user){
		return userservice.getAllUser(user);	
	}
	
	@PutMapping("/updateUser/{userId}")
	public User updateUser(@PathVariable long userId ,@RequestBody User user) {
		 return userservice.updateUser(userId, user);
	}
	

	@DeleteMapping("/deleteUser/{userId}")
	public void deleteUser(@PathVariable Long userId) {
	 this.userservice.deleteUser(userId);
	 	
	}
}