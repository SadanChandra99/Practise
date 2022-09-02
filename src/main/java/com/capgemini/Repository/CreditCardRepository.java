package com.capgemini.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Entity.CreditCardEntity;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardEntity, Long>{
	
	@SuppressWarnings("unchecked")
	public CreditCardEntity save(CreditCardEntity creditcardentity);

	public CreditCardEntity findById(long id);
	
	public List<CreditCardEntity> findAll();
	
	public void deleteById(long id);
}
