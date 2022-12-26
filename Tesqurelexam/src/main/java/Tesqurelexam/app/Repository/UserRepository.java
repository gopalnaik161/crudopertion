package Tesqurelexam.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Tesqurelexam.app.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
