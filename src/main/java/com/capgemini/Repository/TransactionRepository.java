package com.capgemini.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Entity.TransactionEntity;
@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long>{

	@SuppressWarnings("unchecked")
	public TransactionEntity save(TransactionEntity transactionentity);
	
	public TransactionEntity findById(long id);

	public List<TransactionEntity> findAll();
	
	public void deleteById(long id);
}
