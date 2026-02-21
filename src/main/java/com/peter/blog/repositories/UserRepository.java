package com.peter.blog.repositories;

import com.peter.blog.domain.entities.User;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<User , UUID> {

}
