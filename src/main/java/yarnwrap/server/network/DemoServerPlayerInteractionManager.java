package yarnwrap.server.network;
public class DemoServerPlayerInteractionManager { public net.minecraft.server.network.DemoServerPlayerInteractionManager wrapperContained; public DemoServerPlayerInteractionManager(net.minecraft.server.network.DemoServerPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tick() { return wrapperContained.tick; }
// public void tick(int value) { wrapperContained.tick = value; }
// public int reminderTicks() { return wrapperContained.reminderTicks; }
// public void reminderTicks(int value) { wrapperContained.reminderTicks = value; }
// public boolean demoEnded() { return wrapperContained.demoEnded; }
// public void demoEnded(boolean value) { wrapperContained.demoEnded = value; }
// public boolean sentHelp() { return wrapperContained.sentHelp; }
// public void sentHelp(boolean value) { wrapperContained.sentHelp = value; }
public int DEMO_DAYS() { return wrapperContained.DEMO_DAYS; }
// public void DEMO_DAYS(int value) { wrapperContained.DEMO_DAYS = value; }
public int DEMO_TIME() { return wrapperContained.DEMO_TIME; }
// public void DEMO_TIME(int value) { wrapperContained.DEMO_TIME = value; }
// public void sendDemoReminder() { wrapperContained.sendDemoReminder(); }

}