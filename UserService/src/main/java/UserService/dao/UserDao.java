package UserService.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import UserService.model.Users;

public interface UserDao extends CrudRepository<Users, BigInteger>{
}