package yarnwrap.client;
public class ClientBootstrap { public net.minecraft.client.ClientBootstrap wrapperContained; public ClientBootstrap(net.minecraft.client.ClientBootstrap wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
// public static boolean initialized() { return net.minecraft.client.ClientBootstrap.initialized; }
// public static void initialized(boolean value, ) { net.minecraft.client.ClientBootstrap.initialized = value; }

// public void initialize() { wrapperContained.initialize(); }
public static void initialize() { net.minecraft.client.ClientBootstrap.initialize(); }

}