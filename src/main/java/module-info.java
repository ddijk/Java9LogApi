module log.api {

    exports nl.dijkrosoft.snippets;

    requires java.logging;

    provides nl.dijkrosoft.snippets.Log with nl.dijkrosoft.snippets.impl.LogImpl;
}