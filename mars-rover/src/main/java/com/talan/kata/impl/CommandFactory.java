package com.talan.kata.impl;

import java.util.HashMap;

import com.talan.kata.Command;

public class CommandFactory {

	/** The commands. */
	private HashMap<String, Command> commands = new HashMap<>();

	/**
	 * Adds new command.
	 *
	 * @param name
	 *            the name of command
	 * @param command
	 *            the action to make
	 */
	public void addCommand(String name, Command command) {
		this.commands.put(name, command);
	}

	/**
	 * Execute command.
	 *
	 * @param name
	 *            the name of command
	 * @return true, if successful
	 */
	public boolean executeCommand(String name) {
		if (this.commands.containsKey(name)) {
			return this.commands.get(name).apply();
		}
		return false;
	}

}
