package yarnwrap.server.rcon;
public class RconBase { public net.minecraft.server.rcon.RconBase wrapperContained; public RconBase(net.minecraft.server.rcon.RconBase wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public java.lang.String description() { return wrapperContained.description; }
// public void description(java.lang.String value) { wrapperContained.description = value; }
// public java.util.concurrent.atomic.AtomicInteger THREAD_COUNTER() { return wrapperContained.THREAD_COUNTER; }
// public void THREAD_COUNTER(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.THREAD_COUNTER = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
public boolean start() { return wrapperContained.start(); }
public boolean isRunning() { return wrapperContained.isRunning(); }
public void stop() { wrapperContained.stop(); }

}