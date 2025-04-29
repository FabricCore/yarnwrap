package yarnwrap.server.network;
public class DemoServerPlayerInteractionManager { public net.minecraft.server.network.DemoServerPlayerInteractionManager wrapperContained; public DemoServerPlayerInteractionManager(net.minecraft.server.network.DemoServerPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tick() { return wrapperContained.tick; }
// public void tick(int value) { wrapperContained.tick = value; }
// public static int tick() { return net.minecraft.server.network.DemoServerPlayerInteractionManager.tick; }
// public static void tick(int value, ) { net.minecraft.server.network.DemoServerPlayerInteractionManager.tick = value; }

// public int reminderTicks() { return wrapperContained.reminderTicks; }
// public void reminderTicks(int value) { wrapperContained.reminderTicks = value; }
// public static int reminderTicks() { return net.minecraft.server.network.DemoServerPlayerInteractionManager.reminderTicks; }
// public static void reminderTicks(int value, ) { net.minecraft.server.network.DemoServerPlayerInteractionManager.reminderTicks = value; }

// public boolean demoEnded() { return wrapperContained.demoEnded; }
// public void demoEnded(boolean value) { wrapperContained.demoEnded = value; }
// public static boolean demoEnded() { return net.minecraft.server.network.DemoServerPlayerInteractionManager.demoEnded; }
// public static void demoEnded(boolean value, ) { net.minecraft.server.network.DemoServerPlayerInteractionManager.demoEnded = value; }

// public boolean sentHelp() { return wrapperContained.sentHelp; }
// public void sentHelp(boolean value) { wrapperContained.sentHelp = value; }
// public static boolean sentHelp() { return net.minecraft.server.network.DemoServerPlayerInteractionManager.sentHelp; }
// public static void sentHelp(boolean value, ) { net.minecraft.server.network.DemoServerPlayerInteractionManager.sentHelp = value; }

// public int DEMO_DAYS() { return wrapperContained.DEMO_DAYS; }
// public void DEMO_DAYS(int value) { wrapperContained.DEMO_DAYS = value; }
public static int DEMO_DAYS() { return net.minecraft.server.network.DemoServerPlayerInteractionManager.DEMO_DAYS; }
// public static void DEMO_DAYS(int value, ) { net.minecraft.server.network.DemoServerPlayerInteractionManager.DEMO_DAYS = value; }

// public int DEMO_TIME() { return wrapperContained.DEMO_TIME; }
// public void DEMO_TIME(int value) { wrapperContained.DEMO_TIME = value; }
public static int DEMO_TIME() { return net.minecraft.server.network.DemoServerPlayerInteractionManager.DEMO_TIME; }
// public static void DEMO_TIME(int value, ) { net.minecraft.server.network.DemoServerPlayerInteractionManager.DEMO_TIME = value; }

// public void sendDemoReminder() { wrapperContained.sendDemoReminder(); }
// public static void sendDemoReminder() { net.minecraft.server.network.DemoServerPlayerInteractionManager.sendDemoReminder(); }

}