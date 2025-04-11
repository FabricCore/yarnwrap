package yarnwrap.client.network;
public class ClientAdvancementManager { public net.minecraft.client.network.ClientAdvancementManager wrapperContained; public ClientAdvancementManager(net.minecraft.client.network.ClientAdvancementManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancementProgresses() { return wrapperContained.advancementProgresses; }
// public void advancementProgresses(java.util.Map value) { wrapperContained.advancementProgresses = value; }
// public Object listener() { return wrapperContained.listener; }
// // public void listener(Object value) { wrapperContained.listener = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.advancement.AdvancementEntry selectedTab() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.selectedTab); }
// public void selectedTab(yarnwrap.advancement.AdvancementEntry value) { wrapperContained.selectedTab = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public void worldSession(yarnwrap.client.session.telemetry.WorldSession value) { wrapperContained.worldSession = value.wrapperContained; }
// public yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.manager); }
// public void manager(yarnwrap.advancement.AdvancementManager value) { wrapperContained.manager = value.wrapperContained; }
public ClientAdvancementManager(yarnwrap.client.MinecraftClient client,yarnwrap.client.session.telemetry.WorldSession worldSession) { this.wrapperContained = new net.minecraft.client.network.ClientAdvancementManager(client.wrapperContained,worldSession.wrapperContained); }
public void onAdvancements(yarnwrap.network.packet.s2c.play.AdvancementUpdateS2CPacket packet) { wrapperContained.onAdvancements(packet.wrapperContained); }
// public void setListener(Object listener) { wrapperContained.setListener(listener); }
public void selectTab(yarnwrap.advancement.AdvancementEntry tab,boolean local) { wrapperContained.selectTab(tab.wrapperContained,local); }
public yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.getManager()); }
public yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.get(id.wrapperContained)); }
// public void method_53816(Object advancement,yarnwrap.advancement.AdvancementEntry progress) { wrapperContained.method_53816(advancement,progress.wrapperContained); }

}