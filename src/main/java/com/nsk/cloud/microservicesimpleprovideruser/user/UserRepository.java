package com.nsk.cloud.microservicesimpleprovideruser.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author nsk
 * 2018/6/25 20:11
 */
@Repository
interface UserRepository extends JpaRepository<User,Long> {

}
