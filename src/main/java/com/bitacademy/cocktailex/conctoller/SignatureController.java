package com.bitacademy.cocktailex.conctoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bitacademy.cocktailex.domain.SignatureDomain;
import com.bitacademy.cocktailex.sevice.SignatureService;

@Controller
public class SignatureController {

	@Autowired
	private SignatureService signatureService;
	
	@GetMapping("/signature")
	public String signatureForm() {
		return "signature";
	}
	
	@PostMapping("/signature")
	public String signatureForm(SignatureDomain domain) {
		signatureService.insertSignature(domain);
		
		return "redirect:/signature";
	}
	
	@GetMapping("/signaturelist")
	public String signatureList(Model model) {
		List<SignatureDomain> signatures = signatureService.findAll();
		model.addAttribute("signatures", signatures);
		
		return "signaturelist";
	}
}
