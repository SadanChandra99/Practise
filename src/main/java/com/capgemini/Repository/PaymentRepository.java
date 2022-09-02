package com.capgemini.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Entity.PaymentEntity;
@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>{
	
	@SuppressWarnings("unchecked")
	public PaymentEntity save(PaymentEntity paymententity);
	
	public PaymentEntity findById(long id);
	
	public List<PaymentEntity> findAll();
	
	public void deleteById(long id);

}
