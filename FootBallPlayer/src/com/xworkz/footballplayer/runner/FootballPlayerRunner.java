package com.xworkz.footballplayer.runner;

import com.xworkz.footballplayer.repository.FootballPlayerRepository;
import com.xworkz.footballplayer.repository.FootballPlayerRepositoryImplementation;
import com.xworkz.footballplayer.service.FootballPlayerService;
import com.xworkz.footballplayer.service.FootballPlayerServiceImplementation;

public class FootballPlayerRunner {

	public static void main(String[] args) {
		FootballPlayerRepository repo=new FootballPlayerRepositoryImplementation();
		FootballPlayerService service=new FootballPlayerServiceImplementation(repo);
		
		service.validateOnsave("Kevin");
		service.validateOnsave("Ronaldo");
		service.validateOnsave("lionel messi");
		service.validateOnsave("neymer");
		service.validateOnsave("robert");
		service.read();
		System.out.println("========================");
		service.update("Kevin","Neymaraaaa");
		service.read();
		System.out.println("========================");
		service.delete("Ronaldo");
		service.read();
		System.out.println("========================");
		service.validateNewName("");
		//service.read();
		
	}
}
