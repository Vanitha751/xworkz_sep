package com.xworkz.footballplayer.service;

public interface FootballPlayerService {

	boolean validateOnsave(String playerName);
	
	void read();
	
	boolean isExist(String playerName);
	
	boolean update(String oldName,String newName);
	
	boolean delete(String playerName);
	
	boolean validateNewName(String newName);
	
}
