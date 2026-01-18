package org.review.springsetup.Repository;


import org.review.springsetup.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
