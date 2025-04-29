package yarnwrap.client;
public class QuickPlayLogger { public net.minecraft.client.QuickPlayLogger wrapperContained; public QuickPlayLogger(net.minecraft.client.QuickPlayLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.QuickPlayLogger NOOP() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.client.QuickPlayLogger value) { wrapperContained.NOOP = value.wrapperContained; }
// public static yarnwrap.client.QuickPlayLogger NOOP() { return new yarnwrap.client.QuickPlayLogger(net.minecraft.client.QuickPlayLogger.NOOP); }
// public static void NOOP(yarnwrap.client.QuickPlayLogger value, ) { net.minecraft.client.QuickPlayLogger.NOOP = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.QuickPlayLogger.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.QuickPlayLogger.LOGGER = value; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.client.QuickPlayLogger.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.client.QuickPlayLogger.GSON = value; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public static java.nio.file.Path path() { return net.minecraft.client.QuickPlayLogger.path; }
// public static void path(java.nio.file.Path value, ) { net.minecraft.client.QuickPlayLogger.path = value; }

// public Object world() { return wrapperContained.world; }
// // public void world(Object value) { wrapperContained.world = value; }
// // public static Object world() { return net.minecraft.client.QuickPlayLogger.world; }
// // public static void world(Object value, ) { net.minecraft.client.QuickPlayLogger.world = value; }

// public QuickPlayLogger(java.lang.String relativePath) { this.wrapperContained = new net.minecraft.client.QuickPlayLogger(relativePath); }
// public void method_51264(com.google.gson.JsonElement json) { wrapperContained.method_51264(json); }
// public static void method_51264(com.google.gson.JsonElement json, ) { net.minecraft.client.QuickPlayLogger.method_51264(json); }
public void save(yarnwrap.client.MinecraftClient client) { wrapperContained.save(client.wrapperContained); }
// public static void save(yarnwrap.client.MinecraftClient client, ) { net.minecraft.client.QuickPlayLogger.save(client.wrapperContained); }
// public void setWorld(Object worldType,java.lang.String id,java.lang.String name) { wrapperContained.setWorld(worldType,id,name); }
// public static void setWorld(Object worldType,java.lang.String id,java.lang.String name, ) { net.minecraft.client.QuickPlayLogger.setWorld(worldType,id,name); }
// public yarnwrap.client.QuickPlayLogger create(java.lang.String relativePath) { return new yarnwrap.client.QuickPlayLogger(wrapperContained.create(relativePath)); }
// public static yarnwrap.client.QuickPlayLogger create(java.lang.String relativePath, ) { return new yarnwrap.client.QuickPlayLogger(net.minecraft.client.QuickPlayLogger.create(relativePath)); }

}