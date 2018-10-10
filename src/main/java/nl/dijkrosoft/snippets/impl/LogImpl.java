package nl.dijkrosoft.snippets.impl;

import nl.dijkrosoft.snippets.Log;
import org.apache.log4j.Logger;

public class LogImpl implements Log {

    private static final Logger LOGGER = Logger.getLogger(LogImpl.class);


    public void log(String msg) {

        LOGGER.info(msg);
    }
}
