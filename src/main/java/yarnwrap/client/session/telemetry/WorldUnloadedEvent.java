package yarnwrap.client.session.telemetry;
public class WorldUnloadedEvent { public net.minecraft.client.session.telemetry.WorldUnloadedEvent wrapperContained; public WorldUnloadedEvent(net.minecraft.client.session.telemetry.WorldUnloadedEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional startTime() { return wrapperContained.startTime; }
// public void startTime(java.util.Optional value) { wrapperContained.startTime = value; }
// public static java.util.Optional startTime() { return net.minecraft.client.session.telemetry.WorldUnloadedEvent.startTime; }
// public static void startTime(java.util.Optional value, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.startTime = value; }

// public long ticksSinceLoad() { return wrapperContained.ticksSinceLoad; }
// public void ticksSinceLoad(long value) { wrapperContained.ticksSinceLoad = value; }
// public static long ticksSinceLoad() { return net.minecraft.client.session.telemetry.WorldUnloadedEvent.ticksSinceLoad; }
// public static void ticksSinceLoad(long value, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.ticksSinceLoad = value; }

// public long lastTick() { return wrapperContained.lastTick; }
// public void lastTick(long value) { wrapperContained.lastTick = value; }
// public static long lastTick() { return net.minecraft.client.session.telemetry.WorldUnloadedEvent.lastTick; }
// public static void lastTick(long value, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.lastTick = value; }

// public int ABSENT_LAST_TICK() { return wrapperContained.ABSENT_LAST_TICK; }
// public void ABSENT_LAST_TICK(int value) { wrapperContained.ABSENT_LAST_TICK = value; }
// public static int ABSENT_LAST_TICK() { return net.minecraft.client.session.telemetry.WorldUnloadedEvent.ABSENT_LAST_TICK; }
// public static void ABSENT_LAST_TICK(int value, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.ABSENT_LAST_TICK = value; }

public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
// public static void send(yarnwrap.client.session.telemetry.TelemetrySender sender, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.send(sender.wrapperContained); }
public void setTick(long tick) { wrapperContained.setTick(tick); }
// public static void setTick(long tick, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.setTick(tick); }
// public void method_47799(yarnwrap.client.session.telemetry.TelemetrySender startTime) { wrapperContained.method_47799(startTime.wrapperContained); }
// public static void method_47799(yarnwrap.client.session.telemetry.TelemetrySender startTime, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.method_47799(startTime.wrapperContained); }
// public int getSecondsSinceLoad(java.time.Instant startTime) { return wrapperContained.getSecondsSinceLoad(startTime); }
// public static int getSecondsSinceLoad(java.time.Instant startTime, ) { return net.minecraft.client.session.telemetry.WorldUnloadedEvent.getSecondsSinceLoad(startTime); }
// public void method_47801(java.time.Instant builder) { wrapperContained.method_47801(builder); }
// public static void method_47801(java.time.Instant builder, ) { net.minecraft.client.session.telemetry.WorldUnloadedEvent.method_47801(builder); }
public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.client.session.telemetry.WorldUnloadedEvent.start(); }

}