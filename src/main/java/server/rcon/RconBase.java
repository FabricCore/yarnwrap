package yarnwrap.server.rcon;
public class RconBase { public net.minecraft.server.rcon.RconBase wrapperContained; public RconBase(net.minecraft.server.rcon.RconBase wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public java.lang.String description() { return wrapperContained.description; }
// public java.util.concurrent.atomic.AtomicInteger THREAD_COUNTER() { return wrapperContained.THREAD_COUNTER; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean running() { return wrapperContained.running; }
public boolean start() { return wrapperContained.start(); }
public boolean isRunning() { return wrapperContained.isRunning(); }
public void stop() { wrapperContained.stop(); }

}