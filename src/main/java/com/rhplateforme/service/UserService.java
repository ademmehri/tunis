package com.rhplateforme.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rhplateforme.Repos.UserRepository;
import com.rhplateforme.entities.Role;
import com.rhplateforme.entities.Employee;
import com.rhplateforme.entities.File;


public interface UserService  {
	String addfile(MultipartFile f,Long id,String type) throws IOException ;
	String updatefile(MultipartFile f,Long id,String type) throws IOException ;
	Employee saveUser(Employee user);

	void updatePassword(String email, String newPassword) ;
	Role addRole(Role role);

	Employee addRoleToUser(String username, String rolename);

	List<Employee> findAllUsers();
	
	Employee findUserByEmail(String email);
	
	boolean hasUserWithEmail(String email);
	
	Employee updateuser(Employee e);
	Employee updatepack(Employee employee);
	String contact(String email,String descr,String nom);

	 // public List<Employee> rechercherEmployeursGold();
	  public List<Employee> rechercherEmployeurshotel();
	  // public List<Employee> rechercherEmployeursSuperieur();
	 //  public List<Employee> rechercherEmployeursRestaurer();
	 //  public List<Employee> rechercherEmployeursServir();
	   public List<Employee> rechercherEmployeursrestaurant();
	 //  public List<Employee> rechercherEmployeursSuperieur_restaurant();
	 //  public List<Employee> rechercherEmployeursRestaurer_restaurant() ;
	 //  List<Employee> rechercherEmployeursServir_restaurant() ;
	    public ResponseEntity<Object> getnbspecaliter();
	    public List<Employee> getemployes() ;
	    public Employee getuser(Long id);
	    
}
