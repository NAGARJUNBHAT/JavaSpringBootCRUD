package com.example.crud.repository;

import com.example.crud.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member, String> {
}
