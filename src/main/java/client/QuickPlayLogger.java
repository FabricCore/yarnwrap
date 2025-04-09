package yarnwrap.client;
public class QuickPlayLogger { public net.minecraft.client.QuickPlayLogger wrapperContained; public QuickPlayLogger(net.minecraft.client.QuickPlayLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.QuickPlayLogger NOOP() { return new yarnwrap.client.QuickPlayLogger(wrapperContained.NOOP); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public java.nio.file.Path path() { return wrapperContained.path; }
// public Object world() { return wrapperContained.world; }
public void save(yarnwrap.client.MinecraftClient client) { wrapperContained.save(client.wrapperContained); }
// public void setWorld(Object worldType,java.lang.String id,java.lang.String name) { wrapperContained.setWorld(worldType,id,name); }
public yarnwrap.client.QuickPlayLogger create(java.lang.String relativePath) { return new yarnwrap.client.QuickPlayLogger(wrapperContained.create(relativePath)); }

}