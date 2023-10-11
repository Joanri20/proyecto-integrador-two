package com.example.democrud;

import com.example.democrud.model.Usuario;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import static org.junit.Assert.*;

public class UsuarioTest {
	
	@Test
	public void testGetUsuario(){
		Usuario usuario = new Usuario();
		usuario.setUsuario("Johny");
		assertEquals("Johny", usuario.getUsuario());
	}

	@Test
	public void testSetClave(){
		Usuario usuario = new Usuario();
		usuario.setClave("password");
		assertEquals("password", usuario.getClave());
	}

	@Test
	public void testSetRoleName(){
		Usuario usuario = new Usuario();
		usuario.setRoleName("administrador");
		assertEquals("administrador", usuario.getRoleName());
	}

	@Test
	public void generatePassword() {
		BCryptPasswordEncoder passGen = new BCryptPasswordEncoder();
		System.out.println(passGen.encode("admin"));
	}

}
