package com.bitacademy.cocktailex.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.bitacademy.cocktailex.domain.SignatureDomain;

@Repository
public class SignatureRepository {

	private final EntityManager em;

	public SignatureRepository(EntityManager em) {
		super();
		this.em = em;
	}

	// 나만의레시피 등록
	public SignatureDomain insertSignature(SignatureDomain domain) {
		em.persist(domain);
		
		return domain;
	}
	
	// 전체 조회
	public List<SignatureDomain> findAll() {
		List<SignatureDomain> result = em.createQuery("select s from signature s", SignatureDomain.class)
				.getResultList();
		
		return result;
	}
}
