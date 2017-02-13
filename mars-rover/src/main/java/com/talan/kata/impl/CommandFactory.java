package com.talan.kata.impl;

import java.util.HashMap;

import com.talan.kata.Command;

public class CommandFactory {

	private HashMap<String, Command> commands = new HashMap<>();

	public void addCommand(String name, Command command) {
		this.commands.put(name, command);
	}

	public boolean executeCommand(String name) {
		if (this.commands.containsKey(name)) {
			return this.commands.get(name).apply();
		}
		return false;
	}

}
