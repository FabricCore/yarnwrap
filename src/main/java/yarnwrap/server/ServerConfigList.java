package yarnwrap.server;
public class ServerConfigList { public net.minecraft.server.ServerConfigList wrapperContained; public ServerConfigList(net.minecraft.server.ServerConfigList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File file() { return wrapperContained.file; }
// public void file(java.io.File value) { wrapperContained.file = value; }
// public static java.io.File file() { return net.minecraft.server.ServerConfigList.file; }
// public static void file(java.io.File value, ) { net.minecraft.server.ServerConfigList.file = value; }

// public java.util.Map map() { return wrapperContained.map; }
// public void map(java.util.Map value) { wrapperContained.map = value; }
// public static java.util.Map map() { return net.minecraft.server.ServerConfigList.map; }
// public static void map(java.util.Map value, ) { net.minecraft.server.ServerConfigList.map = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.ServerConfigList.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.ServerConfigList.LOGGER = value; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.server.ServerConfigList.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.server.ServerConfigList.GSON = value; }

// public ServerConfigList(java.io.File file) { this.wrapperContained = new net.minecraft.server.ServerConfigList(file); }
// public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.server.ServerConfigList.save(); }
// public void load() { wrapperContained.load(); }
// public static void load() { net.minecraft.server.ServerConfigList.load(); }
// public void removeInvalidEntries() { wrapperContained.removeInvalidEntries(); }
// public static void removeInvalidEntries() { net.minecraft.server.ServerConfigList.removeInvalidEntries(); }
public java.util.Collection values() { return wrapperContained.values(); }
// public static java.util.Collection values() { return net.minecraft.server.ServerConfigList.values(); }
public void add(yarnwrap.server.ServerConfigEntry entry) { wrapperContained.add(entry.wrapperContained); }
// public static void add(yarnwrap.server.ServerConfigEntry entry, ) { net.minecraft.server.ServerConfigList.add(entry.wrapperContained); }
// public java.lang.String toString(java.lang.Object profile) { return wrapperContained.toString(profile); }
// public static java.lang.String toString(java.lang.Object profile, ) { return net.minecraft.server.ServerConfigList.toString(profile); }
public void remove(java.lang.Object key) { wrapperContained.remove(key); }
// public static void remove(java.lang.Object key, ) { net.minecraft.server.ServerConfigList.remove(key); }
public java.lang.String[] getNames() { return wrapperContained.getNames(); }
// public static java.lang.String[] getNames() { return net.minecraft.server.ServerConfigList.getNames(); }
public void remove(yarnwrap.server.ServerConfigEntry entry) { wrapperContained.remove(entry.wrapperContained); }
// public static void remove(yarnwrap.server.ServerConfigEntry entry, ) { net.minecraft.server.ServerConfigList.remove(entry.wrapperContained); }
public yarnwrap.server.ServerConfigEntry get(java.lang.Object key) { return new yarnwrap.server.ServerConfigEntry(wrapperContained.get(key)); }
// public static yarnwrap.server.ServerConfigEntry get(java.lang.Object key, ) { return new yarnwrap.server.ServerConfigEntry(net.minecraft.server.ServerConfigList.get(key)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.server.ServerConfigList.isEmpty(); }
// public yarnwrap.server.ServerConfigEntry fromJson(com.google.gson.JsonObject json) { return new yarnwrap.server.ServerConfigEntry(wrapperContained.fromJson(json)); }
// public static yarnwrap.server.ServerConfigEntry fromJson(com.google.gson.JsonObject json, ) { return new yarnwrap.server.ServerConfigEntry(net.minecraft.server.ServerConfigList.fromJson(json)); }
public java.io.File getFile() { return wrapperContained.getFile(); }
// public static java.io.File getFile() { return net.minecraft.server.ServerConfigList.getFile(); }
// public boolean contains() { return wrapperContained.contains(); }
// public static boolean contains() { return net.minecraft.server.ServerConfigList.contains(); }
// public com.google.gson.JsonObject method_24897(yarnwrap.server.ServerConfigEntry entry) { return wrapperContained.method_24897(entry.wrapperContained); }
// public static com.google.gson.JsonObject method_24897(yarnwrap.server.ServerConfigEntry entry, ) { return net.minecraft.server.ServerConfigList.method_24897(entry.wrapperContained); }

}