package com.capgemini.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>{
	
	@SuppressWarnings("unchecked")
	public AccountEntity save(AccountEntity accountentity);
	
	public AccountEntity findById(long id);
	
	public List<AccountEntity> findAll();
	
	public void deleteById(long id);

	
}
