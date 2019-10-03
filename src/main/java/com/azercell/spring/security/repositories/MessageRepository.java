package com.azercell.spring.security.repositories;

import com.azercell.spring.security.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {


}