package yarnwrap.server;
public class ServerConfigEntry { public net.minecraft.server.ServerConfigEntry wrapperContained; public ServerConfigEntry(net.minecraft.server.ServerConfigEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object key() { return wrapperContained.key; }
// public void key(java.lang.Object value) { wrapperContained.key = value; }
// // public static java.lang.Object key() { return net.minecraft.server.ServerConfigEntry.key; }
// public static void key(java.lang.Object value, ) { net.minecraft.server.ServerConfigEntry.key = value; }

// public ServerConfigEntry(java.lang.Object key) { this.wrapperContained = new net.minecraft.server.ServerConfigEntry(key); }
// public java.lang.Object getKey() { return wrapperContained.getKey(); }
// public static java.lang.Object getKey() { return net.minecraft.server.ServerConfigEntry.getKey(); }
// public boolean isInvalid() { return wrapperContained.isInvalid(); }
// public static boolean isInvalid() { return net.minecraft.server.ServerConfigEntry.isInvalid(); }
// public void write(com.google.gson.JsonObject json) { wrapperContained.write(json); }
// public static void write(com.google.gson.JsonObject json, ) { net.minecraft.server.ServerConfigEntry.write(json); }

}