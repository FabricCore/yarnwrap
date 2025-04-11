package yarnwrap.client;
public class QuickPlayLogger { public net.minecraft.client.QuickPlayLogger wrapperContained; public QuickPlayLogger(net.minecraft.client.QuickPlayLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.QuickPlayLogger NOOP() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.client.QuickPlayLogger value) { wrapperContained.NOOP = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public Object world() { return wrapperContained.world; }
// // public void world(Object value) { wrapperContained.world = value; }
public void save(yarnwrap.client.MinecraftClient client) { wrapperContained.save(client.wrapperContained); }
// public void setWorld(Object worldType,java.lang.String id,java.lang.String name) { wrapperContained.setWorld(worldType,id,name); }
public yarnwrap.client.QuickPlayLogger create(java.lang.String relativePath) { return new yarnwrap.client.QuickPlayLogger(wrapperContained.create(relativePath)); }

}