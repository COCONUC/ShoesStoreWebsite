package com.shoestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shoestore.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//	public List<User> get();
	
	public User findUserById(@Param("id") int id);
}
