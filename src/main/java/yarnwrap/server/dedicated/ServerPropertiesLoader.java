package yarnwrap.server.dedicated;
public class ServerPropertiesLoader { public net.minecraft.server.dedicated.ServerPropertiesLoader wrapperContained; public ServerPropertiesLoader(net.minecraft.server.dedicated.ServerPropertiesLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public static java.nio.file.Path path() { return net.minecraft.server.dedicated.ServerPropertiesLoader.path; }
// public static void path(java.nio.file.Path value, ) { net.minecraft.server.dedicated.ServerPropertiesLoader.path = value; }

// public yarnwrap.server.dedicated.ServerPropertiesHandler propertiesHandler() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.propertiesHandler); }
// public void propertiesHandler(yarnwrap.server.dedicated.ServerPropertiesHandler value) { wrapperContained.propertiesHandler = value.wrapperContained; }
// public static yarnwrap.server.dedicated.ServerPropertiesHandler propertiesHandler() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(net.minecraft.server.dedicated.ServerPropertiesLoader.propertiesHandler); }
// public static void propertiesHandler(yarnwrap.server.dedicated.ServerPropertiesHandler value, ) { net.minecraft.server.dedicated.ServerPropertiesLoader.propertiesHandler = value.wrapperContained; }

public ServerPropertiesLoader(java.nio.file.Path path) { this.wrapperContained = new net.minecraft.server.dedicated.ServerPropertiesLoader(path); }
public yarnwrap.server.dedicated.ServerPropertiesHandler getPropertiesHandler() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.getPropertiesHandler()); }
// public static yarnwrap.server.dedicated.ServerPropertiesHandler getPropertiesHandler() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(net.minecraft.server.dedicated.ServerPropertiesLoader.getPropertiesHandler()); }
public yarnwrap.server.dedicated.ServerPropertiesLoader apply(java.util.function.UnaryOperator applier) { return new yarnwrap.server.dedicated.ServerPropertiesLoader(wrapperContained.apply(applier)); }
// public static yarnwrap.server.dedicated.ServerPropertiesLoader apply(java.util.function.UnaryOperator applier, ) { return new yarnwrap.server.dedicated.ServerPropertiesLoader(net.minecraft.server.dedicated.ServerPropertiesLoader.apply(applier)); }
public void store() { wrapperContained.store(); }
// public static void store() { net.minecraft.server.dedicated.ServerPropertiesLoader.store(); }

}