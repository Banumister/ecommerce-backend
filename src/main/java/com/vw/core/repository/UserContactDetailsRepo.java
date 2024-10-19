package com.vw.core.repository;

import com.vw.core.entity.UserContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserContactDetailsRepo extends JpaRepository<UserContactDetails,Integer> {
}
