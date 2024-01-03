package com.xworkz.footballplayer.service;

import com.xworkz.footballplayer.repository.FootballPlayerRepository;

public class FootballPlayerServiceImplementation implements FootballPlayerService {

	private FootballPlayerRepository repo;

	public FootballPlayerServiceImplementation(FootballPlayerRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateOnsave(String playerName) {
		if (playerName == null || playerName.isEmpty() || playerName.isBlank() || playerName.length() > 30) {
			System.out.println("give correct name");
			return false;
		}
		boolean exists = isExist(playerName);
		if (exists != true) {
			boolean save = repo.onSave(playerName);
			if (save) {
				System.out.println("added successfully");
				return true;
			} else {
				System.out.println("not added successfully");
				return false;
			}
		} else {
			System.out.println("playerName is already exist");
			return false;
		}

	}

	@Override
	public boolean isExist(String playerName) {
		String[] exist = repo.read();
		if (playerName != null && exist != null) {
			for (String name : exist) {
				if (name != null) {
					if (name.equalsIgnoreCase(playerName)) {

						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldName, String newName) {
		if (oldName != null && newName != null) {
			boolean oldValueCheck = isExist(oldName);
			if (oldValueCheck) {
				boolean checkNewName = validateNewName(newName);
				if (checkNewName) {
					boolean updateResult = repo.update(oldName, newName);
					if (updateResult) {
						System.out.println("updated sucessfully");
					} else {
						System.out.println("not updated sucessfully");
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(String playerName) {
		if (playerName != null) {
			boolean delete = repo.delete(playerName);
			if (delete) {
				System.out.println("deleted sucessfully");
			} else {
				System.out.println("not deleted sucessfully");
			}
		} else {
			System.out.println("player name is null");
		}
		return false;
	}

	@Override
	public void read() {
		String[] read = repo.read();
		for (String name : read) {
			System.out.println(name);
		}
	}

	@Override
	public boolean validateNewName(String newName) {
		if (newName == null || newName.isEmpty() || newName.isBlank() || !(newName.length() > 2)) {
			System.out.println("new name is  empty or blank or length is greater than 2");
			return false;
		}
		return true;
	}

}
