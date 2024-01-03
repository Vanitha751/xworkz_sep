package com.xworkz.footballplayer.repository;

public interface FootballPlayerRepository {

	boolean onSave(String playerName);
	
	String[] read();
	
	boolean update(String oldName,String newName);
	
	boolean delete(String playerName);
	
}
