package com.caveofprogramming.spring.test;

/*
 * Dummy implementation of logger.
 */

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {


	private ConsoleWriter consoleWriter;
	@Autowired
    private FileWriter fileWriter;

    @Autowired
    public Logger(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
}
