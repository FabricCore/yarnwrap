package yarnwrap.server;
public class ServerConfigEntry { public net.minecraft.server.ServerConfigEntry wrapperContained; public ServerConfigEntry(net.minecraft.server.ServerConfigEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object key() { return wrapperContained.key; }
// public void key(java.lang.Object value) { wrapperContained.key = value; }
// public java.lang.Object getKey() { return wrapperContained.getKey(); }
// public boolean isInvalid() { return wrapperContained.isInvalid(); }
// public void write(com.google.gson.JsonObject json) { wrapperContained.write(json); }

}