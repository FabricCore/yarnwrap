package yarnwrap.client.realms.task;
public class LongRunningTask { public net.minecraft.client.realms.task.LongRunningTask wrapperContained; public LongRunningTask(net.minecraft.client.realms.task.LongRunningTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.task.LongRunningTask.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.task.LongRunningTask.LOGGER = value; }

// public int MAX_RETRIES() { return wrapperContained.MAX_RETRIES; }
// public void MAX_RETRIES(int value) { wrapperContained.MAX_RETRIES = value; }
// public static int MAX_RETRIES() { return net.minecraft.client.realms.task.LongRunningTask.MAX_RETRIES; }
// public static void MAX_RETRIES(int value, ) { net.minecraft.client.realms.task.LongRunningTask.MAX_RETRIES = value; }

// public boolean aborted() { return wrapperContained.aborted; }
// public void aborted(boolean value) { wrapperContained.aborted = value; }
// public static boolean aborted() { return net.minecraft.client.realms.task.LongRunningTask.aborted; }
// public static void aborted(boolean value, ) { net.minecraft.client.realms.task.LongRunningTask.aborted = value; }

// public boolean aborted() { return wrapperContained.aborted(); }
// // public static boolean aborted() { return net.minecraft.client.realms.task.LongRunningTask.aborted(); }
// public void error(yarnwrap.text.Text message) { wrapperContained.error(message.wrapperContained); }
// public static void error(yarnwrap.text.Text message, ) { net.minecraft.client.realms.task.LongRunningTask.error(message.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.realms.task.LongRunningTask.tick(); }
public void init() { wrapperContained.init(); }
// public static void init() { net.minecraft.client.realms.task.LongRunningTask.init(); }
public void abortTask() { wrapperContained.abortTask(); }
// public static void abortTask() { net.minecraft.client.realms.task.LongRunningTask.abortTask(); }
// public void pause(long seconds) { wrapperContained.pause(seconds); }
// public static void pause(long seconds, ) { net.minecraft.client.realms.task.LongRunningTask.pause(seconds); }
// public void setScreen(yarnwrap.client.gui.screen.Screen screen) { wrapperContained.setScreen(screen.wrapperContained); }
// public static void setScreen(yarnwrap.client.gui.screen.Screen screen, ) { net.minecraft.client.realms.task.LongRunningTask.setScreen(screen.wrapperContained); }
public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
// public static yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.LongRunningTask.getTitle()); }
// public void error(yarnwrap.client.realms.exception.RealmsServiceException exception) { wrapperContained.error(exception.wrapperContained); }
// public static void error(yarnwrap.client.realms.exception.RealmsServiceException exception, ) { net.minecraft.client.realms.task.LongRunningTask.error(exception.wrapperContained); }
// public void error(java.lang.Exception exception) { wrapperContained.error(exception); }
// public static void error(java.lang.Exception exception, ) { net.minecraft.client.realms.task.LongRunningTask.error(exception); }

}