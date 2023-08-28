package com.gamerpay.textgenerator.repository;

import com.gamerpay.textgenerator.data.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextEntryRepository extends JpaRepository<Text, Long> {
}
