package yarnwrap.server.network;
public class DemoServerPlayerInteractionManager { public net.minecraft.server.network.DemoServerPlayerInteractionManager wrapperContained; public DemoServerPlayerInteractionManager(net.minecraft.server.network.DemoServerPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tick() { return wrapperContained.tick; }
// public int reminderTicks() { return wrapperContained.reminderTicks; }
// public boolean demoEnded() { return wrapperContained.demoEnded; }
// public boolean sentHelp() { return wrapperContained.sentHelp; }
public int DEMO_DAYS() { return wrapperContained.DEMO_DAYS; }
public int DEMO_TIME() { return wrapperContained.DEMO_TIME; }
// public void sendDemoReminder() { wrapperContained.sendDemoReminder(); }

}