package com.caveofprogramming.spring.test;

/*
 * Dummy implementation of logger.
 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

public class Logger {

    @Inject
    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;


    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Inject
    @Named(value = "squirrel")
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
		fileWriter.write(text);
	}

    @PostConstruct
    public void init() {
        System.out.println("Init method.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method.");
    }

	public void writeConsole(String text) {
        if (consoleWriter != null) {
            consoleWriter.write(text);
        }
    }
}
