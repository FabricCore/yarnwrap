package yarnwrap.server;
public class ServerAdvancementLoader { public net.minecraft.server.ServerAdvancementLoader wrapperContained; public ServerAdvancementLoader(net.minecraft.server.ServerAdvancementLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancements() { return wrapperContained.advancements; }
// public void advancements(java.util.Map value) { wrapperContained.advancements = value; }
// public static java.util.Map advancements() { return net.minecraft.server.ServerAdvancementLoader.advancements; }
// public static void advancements(java.util.Map value, ) { net.minecraft.server.ServerAdvancementLoader.advancements = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.ServerAdvancementLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.ServerAdvancementLoader.LOGGER = value; }

// public yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.manager); }
// public void manager(yarnwrap.advancement.AdvancementManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(net.minecraft.server.ServerAdvancementLoader.manager); }
// public static void manager(yarnwrap.advancement.AdvancementManager value, ) { net.minecraft.server.ServerAdvancementLoader.manager = value.wrapperContained; }

// public Object registries() { return wrapperContained.registries; }
// // public void registries(Object value) { wrapperContained.registries = value; }
// // public static Object registries() { return net.minecraft.server.ServerAdvancementLoader.registries; }
// // public static void registries(Object value, ) { net.minecraft.server.ServerAdvancementLoader.registries = value; }

// public ServerAdvancementLoader(Object registries) { this.wrapperContained = new net.minecraft.server.ServerAdvancementLoader(registries); }
public java.util.Collection getAdvancements() { return wrapperContained.getAdvancements(); }
// public static java.util.Collection getAdvancements() { return net.minecraft.server.ServerAdvancementLoader.getAdvancements(); }
public yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.get(id.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id, ) { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.server.ServerAdvancementLoader.get(id.wrapperContained)); }
// public void method_20723(Object id,yarnwrap.util.Identifier advancement) { wrapperContained.method_20723(id,advancement.wrapperContained); }
// public static void method_20723(Object id,yarnwrap.util.Identifier advancement, ) { net.minecraft.server.ServerAdvancementLoader.method_20723(id,advancement.wrapperContained); }
public yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.getManager()); }
// public static yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(net.minecraft.server.ServerAdvancementLoader.getManager()); }
// public void validate(yarnwrap.util.Identifier id,yarnwrap.advancement.Advancement advancement) { wrapperContained.validate(id.wrapperContained,advancement.wrapperContained); }
// public static void validate(yarnwrap.util.Identifier id,yarnwrap.advancement.Advancement advancement, ) { net.minecraft.server.ServerAdvancementLoader.validate(id.wrapperContained,advancement.wrapperContained); }

}