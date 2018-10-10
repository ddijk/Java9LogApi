package nl.dijkrosoft.snippets.impl;

import nl.dijkrosoft.snippets.Log;

import java.util.logging.Logger;

public class LogImpl implements Log {

    private static final Logger LOGGER = Logger.getLogger("mylogger");


    public void log(String msg) {

        LOGGER.info(msg);
    }
}
