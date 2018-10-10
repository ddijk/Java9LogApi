module log.api {

    exports nl.dijkrosoft.snippets;

    requires log4j;

    provides nl.dijkrosoft.snippets.Log with nl.dijkrosoft.snippets.impl.LogImpl;
}