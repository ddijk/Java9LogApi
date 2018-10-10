package nl.dijkrosoft.snippets.impl;

import nl.dijkrosoft.snippets.Log;

public class Runner {

    public static void main(String[] args) {
        Log logger = new LogImpl();

        logger.log("hallo wereld");
    }

}
