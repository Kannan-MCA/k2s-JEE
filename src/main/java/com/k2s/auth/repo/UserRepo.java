package com.k2s.auth.repo;

import org.springframework.stereotype.Repository;

import com.k2s.auth.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepo extends CrudRepository <UserEntity,Long>{

}