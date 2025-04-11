package yarnwrap.client.session.telemetry;
public class WorldUnloadedEvent { public net.minecraft.client.session.telemetry.WorldUnloadedEvent wrapperContained; public WorldUnloadedEvent(net.minecraft.client.session.telemetry.WorldUnloadedEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional startTime() { return wrapperContained.startTime; }
// public void startTime(java.util.Optional value) { wrapperContained.startTime = value; }
// public long ticksSinceLoad() { return wrapperContained.ticksSinceLoad; }
// public void ticksSinceLoad(long value) { wrapperContained.ticksSinceLoad = value; }
// public long lastTick() { return wrapperContained.lastTick; }
// public void lastTick(long value) { wrapperContained.lastTick = value; }
// public int ABSENT_LAST_TICK() { return wrapperContained.ABSENT_LAST_TICK; }
// public void ABSENT_LAST_TICK(int value) { wrapperContained.ABSENT_LAST_TICK = value; }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
public void setTick(long tick) { wrapperContained.setTick(tick); }
// public void method_47799(yarnwrap.client.session.telemetry.TelemetrySender startTime) { wrapperContained.method_47799(startTime.wrapperContained); }
// public int getSecondsSinceLoad(java.time.Instant startTime) { return wrapperContained.getSecondsSinceLoad(startTime); }
// public void method_47801(java.time.Instant builder) { wrapperContained.method_47801(builder); }
public void start() { wrapperContained.start(); }

}