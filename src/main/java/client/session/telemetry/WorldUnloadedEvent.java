package yarnwrap.client.session.telemetry;
public class WorldUnloadedEvent { public net.minecraft.client.session.telemetry.WorldUnloadedEvent wrapperContained; public WorldUnloadedEvent(net.minecraft.client.session.telemetry.WorldUnloadedEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional startTime() { return wrapperContained.startTime; }
// public long ticksSinceLoad() { return wrapperContained.ticksSinceLoad; }
// public long lastTick() { return wrapperContained.lastTick; }
// public int ABSENT_LAST_TICK() { return wrapperContained.ABSENT_LAST_TICK; }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
public void setTick(long tick) { wrapperContained.setTick(tick); }
// public int getSecondsSinceLoad(java.time.Instant startTime) { return wrapperContained.getSecondsSinceLoad(startTime); }
public void start() { wrapperContained.start(); }

}