package yarnwrap.client.session.telemetry;
public class WorldLoadTimesEvent { public net.minecraft.client.session.telemetry.WorldLoadTimesEvent wrapperContained; public WorldLoadTimesEvent(net.minecraft.client.session.telemetry.WorldLoadTimesEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean newWorld() { return wrapperContained.newWorld; }
// public void newWorld(boolean value) { wrapperContained.newWorld = value; }
// public static boolean newWorld() { return net.minecraft.client.session.telemetry.WorldLoadTimesEvent.newWorld; }
// public static void newWorld(boolean value, ) { net.minecraft.client.session.telemetry.WorldLoadTimesEvent.newWorld = value; }

// public java.time.Duration worldLoadTime() { return wrapperContained.worldLoadTime; }
// public void worldLoadTime(java.time.Duration value) { wrapperContained.worldLoadTime = value; }
// public static java.time.Duration worldLoadTime() { return net.minecraft.client.session.telemetry.WorldLoadTimesEvent.worldLoadTime; }
// public static void worldLoadTime(java.time.Duration value, ) { net.minecraft.client.session.telemetry.WorldLoadTimesEvent.worldLoadTime = value; }

public WorldLoadTimesEvent(boolean newWorld,java.time.Duration worldLoadTime) { this.wrapperContained = new net.minecraft.client.session.telemetry.WorldLoadTimesEvent(newWorld,worldLoadTime); }
// public void method_47796(Object builder) { wrapperContained.method_47796(builder); }
// public static void method_47796(Object builder, ) { net.minecraft.client.session.telemetry.WorldLoadTimesEvent.method_47796(builder); }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
// public static void send(yarnwrap.client.session.telemetry.TelemetrySender sender, ) { net.minecraft.client.session.telemetry.WorldLoadTimesEvent.send(sender.wrapperContained); }

}