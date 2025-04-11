package yarnwrap.server.dedicated;
public class ServerPropertiesLoader { public net.minecraft.server.dedicated.ServerPropertiesLoader wrapperContained; public ServerPropertiesLoader(net.minecraft.server.dedicated.ServerPropertiesLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public yarnwrap.server.dedicated.ServerPropertiesHandler propertiesHandler() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.propertiesHandler); }
// public void propertiesHandler(yarnwrap.server.dedicated.ServerPropertiesHandler value) { wrapperContained.propertiesHandler = value.wrapperContained; }
public ServerPropertiesLoader(java.nio.file.Path path) { this.wrapperContained = new net.minecraft.server.dedicated.ServerPropertiesLoader(path); }
public yarnwrap.server.dedicated.ServerPropertiesHandler getPropertiesHandler() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.getPropertiesHandler()); }
public yarnwrap.server.dedicated.ServerPropertiesLoader apply(java.util.function.UnaryOperator applier) { return new yarnwrap.server.dedicated.ServerPropertiesLoader(wrapperContained.apply(applier)); }
public void store() { wrapperContained.store(); }

}