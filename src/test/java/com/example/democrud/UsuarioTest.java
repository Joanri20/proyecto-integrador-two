package com.example.democrud;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import static org.junit.Assert.*;

public class UsuarioTest {
	

	@Test
	public void testGetUsuario(){
		Usuario usuario = new Usuario();
		usuario.setUsuario("Juan");
		assertEquals("Juan", usuario.getUsuario());
	}
	

	@Test
	public void generatePassword() {
		BCryptPasswordEncoder passGen = new BCryptPasswordEncoder();
		System.out.println(passGen.encode("admin"));
	}



}
