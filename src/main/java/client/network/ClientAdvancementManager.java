package yarnwrap.client.network;
public class ClientAdvancementManager { public net.minecraft.client.network.ClientAdvancementManager wrapperContained; public ClientAdvancementManager(net.minecraft.client.network.ClientAdvancementManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancementProgresses() { return wrapperContained.advancementProgresses; }
// public Object listener() { return wrapperContained.listener; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.advancement.AdvancementEntry selectedTab() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.selectedTab); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.session.telemetry.WorldSession worldSession() { return new yarnwrap.client.session.telemetry.WorldSession(wrapperContained.worldSession); }
// public yarnwrap.advancement.AdvancementManager manager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.manager); }
public void onAdvancements(yarnwrap.network.packet.s2c.play.AdvancementUpdateS2CPacket packet) { wrapperContained.onAdvancements(packet.wrapperContained); }
// public void setListener(Object listener) { wrapperContained.setListener(listener); }
public void selectTab(yarnwrap.advancement.AdvancementEntry tab,boolean local) { wrapperContained.selectTab(tab.wrapperContained,local); }
public yarnwrap.advancement.AdvancementManager getManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.getManager()); }
public yarnwrap.advancement.AdvancementEntry get(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.get(id.wrapperContained)); }

}