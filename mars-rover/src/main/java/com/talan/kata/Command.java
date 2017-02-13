package com.talan.kata;

@FunctionalInterface
public interface Command {
	public boolean apply();
}
