package com.caveofprogramming.spring.test;

/*
 * Dummy implementation of logger.
 */

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

    @Autowired
	private ConsoleWriter consoleWriter;
	@Autowired
    private FileWriter fileWriter;
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
}
