package yarnwrap.server;
public class ServerAdvancementLoader { public net.minecraft.server.ServerAdvancementLoader wrapperContained; public ServerAdvancementLoader(net.minecraft.server.ServerAdvancementLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancements() { return wrapperContained.advancements; }
// public void advancements(java.util.Map value) { wrapperContained.advancements = value; }
// public static java.util.Map advancements() { return net.minecraft.server.ServerAdvancementLoader.advancements; }
// public static void advancements(java.util.Map value, ) { net.minecraft.server.ServerAdvancementLoader.advancements = value; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.server.ServerAdvancementLoader.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.server.ServerAdvancementLoader.GSON = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.ServerAdvancementLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.ServerAdvancementLoader.LOGGER = value; }

// public yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.manager); }
// public void manager(yarnwrap.advancement.AdvancementManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(net.minecraft.server.ServerAdvancementLoader.manager); }
// public static void manager(yarnwrap.advancement.AdvancementManager value, ) { net.minecraft.server.ServerAdvancementLoader.manager = value.wrapperContained; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.server.ServerAdvancementLoader.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.server.ServerAdvancementLoader.registryLookup = value; }

// public ServerAdvancementLoader(Object registryLookup) { this.wrapperContained = new net.minecraft.server.ServerAdvancementLoader(registryLookup); }
public java.util.Collection getAdvancements() { return wrapperContained.getAdvancements(); }
// public static java.util.Collection getAdvancements() { return net.minecraft.server.ServerAdvancementLoader.getAdvancements(); }
public yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.get(id.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id, ) { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.server.ServerAdvancementLoader.get(id.wrapperContained)); }
// public void method_20723(yarnwrap.registry.RegistryOps id,Object json) { wrapperContained.method_20723(id.wrapperContained,json); }
// public static void method_20723(yarnwrap.registry.RegistryOps id,Object json, ) { net.minecraft.server.ServerAdvancementLoader.method_20723(id.wrapperContained,json); }
public yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.getManager()); }
// public static yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(net.minecraft.server.ServerAdvancementLoader.getManager()); }
// public void validate(yarnwrap.util.Identifier id,yarnwrap.advancement.Advancement advancement) { wrapperContained.validate(id.wrapperContained,advancement.wrapperContained); }
// public static void validate(yarnwrap.util.Identifier id,yarnwrap.advancement.Advancement advancement, ) { net.minecraft.server.ServerAdvancementLoader.validate(id.wrapperContained,advancement.wrapperContained); }

}