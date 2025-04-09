package yarnwrap.server;
public class ServerAdvancementLoader { public net.minecraft.server.ServerAdvancementLoader wrapperContained; public ServerAdvancementLoader(net.minecraft.server.ServerAdvancementLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancements() { return wrapperContained.advancements; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.manager); }
// public Object registryLookup() { return wrapperContained.registryLookup; }
public java.util.Collection getAdvancements() { return wrapperContained.getAdvancements(); }
public yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.get(id.wrapperContained)); }
public yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.getManager()); }
// public void validate(yarnwrap.util.Identifier id,yarnwrap.advancement.Advancement advancement) { wrapperContained.validate(id.wrapperContained,advancement.wrapperContained); }

}