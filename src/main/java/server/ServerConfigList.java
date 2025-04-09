package yarnwrap.server;
public class ServerConfigList { public net.minecraft.server.ServerConfigList wrapperContained; public ServerConfigList(net.minecraft.server.ServerConfigList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File file() { return wrapperContained.file; }
// public java.util.Map map() { return wrapperContained.map; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void save() { wrapperContained.save(); }
// public void load() { wrapperContained.load(); }
// public void removeInvalidEntries() { wrapperContained.removeInvalidEntries(); }
public java.util.Collection values() { return wrapperContained.values(); }
public void add(yarnwrap.server.ServerConfigEntry entry) { wrapperContained.add(entry.wrapperContained); }
// public java.lang.String toString(java.lang.Object profile) { return wrapperContained.toString(profile); }
public void remove(java.lang.Object key) { wrapperContained.remove(key); }
public java.lang.String[] getNames() { return wrapperContained.getNames(); }
public void remove(yarnwrap.server.ServerConfigEntry entry) { wrapperContained.remove(entry.wrapperContained); }
public yarnwrap.server.ServerConfigEntry get(java.lang.Object key) { return new yarnwrap.server.ServerConfigEntry(wrapperContained.get(key)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public yarnwrap.server.ServerConfigEntry fromJson(com.google.gson.JsonObject json) { return new yarnwrap.server.ServerConfigEntry(wrapperContained.fromJson(json)); }
public java.io.File getFile() { return wrapperContained.getFile(); }
// public boolean contains() { return wrapperContained.contains(); }

}