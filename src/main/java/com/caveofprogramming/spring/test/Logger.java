package com.caveofprogramming.spring.test;

/*
 * Dummy implementation of logger.
 */

import javax.annotation.Resource;

public class Logger {

    @Resource
    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;


    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Resource
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
        if (consoleWriter != null) {
            consoleWriter.write(text);
        }
    }
}
