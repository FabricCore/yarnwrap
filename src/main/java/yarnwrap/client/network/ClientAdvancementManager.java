package yarnwrap.client.network;
public class ClientAdvancementManager { public net.minecraft.client.network.ClientAdvancementManager wrapperContained; public ClientAdvancementManager(net.minecraft.client.network.ClientAdvancementManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancementProgresses() { return wrapperContained.advancementProgresses; }
// public void advancementProgresses(java.util.Map value) { wrapperContained.advancementProgresses = value; }
// public static java.util.Map advancementProgresses() { return net.minecraft.client.network.ClientAdvancementManager.advancementProgresses; }
// public static void advancementProgresses(java.util.Map value, ) { net.minecraft.client.network.ClientAdvancementManager.advancementProgresses = value; }

// public Object listener() { return wrapperContained.listener; }
// // public void listener(Object value) { wrapperContained.listener = value; }
// // public static Object listener() { return net.minecraft.client.network.ClientAdvancementManager.listener; }
// // public static void listener(Object value, ) { net.minecraft.client.network.ClientAdvancementManager.listener = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.ClientAdvancementManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.ClientAdvancementManager.client = value.wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry selectedTab() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.selectedTab); }
// public void selectedTab(yarnwrap.advancement.AdvancementEntry value) { wrapperContained.selectedTab = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementEntry selectedTab() { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.client.network.ClientAdvancementManager.selectedTab); }
// public static void selectedTab(yarnwrap.advancement.AdvancementEntry value, ) { net.minecraft.client.network.ClientAdvancementManager.selectedTab = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ClientAdvancementManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ClientAdvancementManager.LOGGER = value; }

// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public void worldSession(yarnwrap.client.session.telemetry.WorldSession value) { wrapperContained.worldSession = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(net.minecraft.client.network.ClientAdvancementManager.worldSession); }
// public static void worldSession(yarnwrap.client.session.telemetry.WorldSession value, ) { net.minecraft.client.network.ClientAdvancementManager.worldSession = value.wrapperContained; }

// public yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.manager); }
// public void manager(yarnwrap.advancement.AdvancementManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(net.minecraft.client.network.ClientAdvancementManager.manager); }
// public static void manager(yarnwrap.advancement.AdvancementManager value, ) { net.minecraft.client.network.ClientAdvancementManager.manager = value.wrapperContained; }

public ClientAdvancementManager(yarnwrap.client.MinecraftClient client,yarnwrap.client.session.telemetry.WorldSession worldSession) { this.wrapperContained = new net.minecraft.client.network.ClientAdvancementManager(client.wrapperContained,worldSession.wrapperContained); }
public void onAdvancements(yarnwrap.network.packet.s2c.play.AdvancementUpdateS2CPacket packet) { wrapperContained.onAdvancements(packet.wrapperContained); }
// public static void onAdvancements(yarnwrap.network.packet.s2c.play.AdvancementUpdateS2CPacket packet, ) { net.minecraft.client.network.ClientAdvancementManager.onAdvancements(packet.wrapperContained); }
// public void setListener(Object listener) { wrapperContained.setListener(listener); }
// public static void setListener(Object listener, ) { net.minecraft.client.network.ClientAdvancementManager.setListener(listener); }
public void selectTab(yarnwrap.advancement.AdvancementEntry tab,boolean local) { wrapperContained.selectTab(tab.wrapperContained,local); }
// public static void selectTab(yarnwrap.advancement.AdvancementEntry tab,boolean local, ) { net.minecraft.client.network.ClientAdvancementManager.selectTab(tab.wrapperContained,local); }
public yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.getManager()); }
// public static yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(net.minecraft.client.network.ClientAdvancementManager.getManager()); }
public yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.get(id.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id, ) { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.client.network.ClientAdvancementManager.get(id.wrapperContained)); }
// public void method_53816(Object advancement,yarnwrap.advancement.AdvancementEntry progress) { wrapperContained.method_53816(advancement,progress.wrapperContained); }
// public static void method_53816(Object advancement,yarnwrap.advancement.AdvancementEntry progress, ) { net.minecraft.client.network.ClientAdvancementManager.method_53816(advancement,progress.wrapperContained); }

}