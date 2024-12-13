package com.iemr.tm.repo.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.tm.data.login.Users;

@Repository
public interface UserLoginRepo extends CrudRepository<Users, Long> {

	Users findByUserID(Long userID);

}
