package com.k2s.auth.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepo extends CrudRepository <UserDetail,Long>{

}