package com.xworkz.footballplayer.repository;

public class FootballPlayerRepositoryImplementation implements FootballPlayerRepository{

	private String[] name=new String[5];
	private int index=0;
	
	public String[] getName() {
		return name;
	}
	@Override
	public boolean onSave(String playerName) {
      if(playerName==null||index>=name.length) {
    	  System.out.println("array is not null");
      }else {
    	  if(index<name.length) {
    		  name[index]=playerName;
    		  index++;
    		  return true;
    	  }
      }
		return false;
	}

	@Override
	public String[] read() {
		return name;
	}

	@Override
	public boolean update(String oldName, String newName) {
	for(int i=0;i<name.length;i++) {
		if(name[i].equalsIgnoreCase(oldName)) {
			name[i]=newName;
			return true;
		}
	}
		return false;
	}

	@Override
	public boolean delete(String playerName) {
	for(int i=0;i<name.length;i++) {
		if(name[i].equalsIgnoreCase(playerName) ) {
			name[i]=null;
			return true;
		}
	}
		return false;
	}

}
