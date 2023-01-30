package com.bitacademy.cocktailex.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bitacademy.cocktailex.domain.SignatureDomain;
import com.bitacademy.cocktailex.repository.SignatureRepository;

@Service
@Transactional
public class SignatureService {

	@Autowired
	SignatureRepository signatureRepository;
	
	// 나만의레시피 등록
	public void insertSignature(SignatureDomain domain) {
		domain.setDate("20230130");
		signatureRepository.insertSignature(domain);	
	}
	
	// 전체 조회
	public List<SignatureDomain> findAll() {
		return signatureRepository.findAll();
	}
}
