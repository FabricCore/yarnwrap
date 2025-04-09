package yarnwrap.client.realms.task;
public class LongRunningTask { public net.minecraft.client.realms.task.LongRunningTask wrapperContained; public LongRunningTask(net.minecraft.client.realms.task.LongRunningTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int MAX_RETRIES() { return wrapperContained.MAX_RETRIES; }
// public boolean aborted() { return wrapperContained.aborted; }
// public boolean aborted() { return wrapperContained.aborted(); }
// public void error(yarnwrap.text.Text message) { wrapperContained.error(message.wrapperContained); }
public void tick() { wrapperContained.tick(); }
public void init() { wrapperContained.init(); }
public void abortTask() { wrapperContained.abortTask(); }
// public void pause(long seconds) { wrapperContained.pause(seconds); }
public void setScreen(yarnwrap.client.gui.screen.Screen screen) { wrapperContained.setScreen(screen.wrapperContained); }
public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
// public void error(yarnwrap.client.realms.exception.RealmsServiceException exception) { wrapperContained.error(exception.wrapperContained); }
// public void error(java.lang.Exception exception) { wrapperContained.error(exception); }

}