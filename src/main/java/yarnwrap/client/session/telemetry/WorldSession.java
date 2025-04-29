package yarnwrap.client.session.telemetry;
public class WorldSession { public net.minecraft.client.session.telemetry.WorldSession wrapperContained; public WorldSession(net.minecraft.client.session.telemetry.WorldSession wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID sessionId() { return wrapperContained.sessionId; }
// public void sessionId(java.util.UUID value) { wrapperContained.sessionId = value; }
// public static java.util.UUID sessionId() { return net.minecraft.client.session.telemetry.WorldSession.sessionId; }
// public static void sessionId(java.util.UUID value, ) { net.minecraft.client.session.telemetry.WorldSession.sessionId = value; }

// public yarnwrap.client.session.telemetry.TelemetrySender sender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.sender); }
// public void sender(yarnwrap.client.session.telemetry.TelemetrySender value) { wrapperContained.sender = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.TelemetrySender sender() { return new yarnwrap.client.session.telemetry.TelemetrySender(net.minecraft.client.session.telemetry.WorldSession.sender); }
// public static void sender(yarnwrap.client.session.telemetry.TelemetrySender value, ) { net.minecraft.client.session.telemetry.WorldSession.sender = value.wrapperContained; }

// public yarnwrap.client.session.telemetry.WorldLoadedEvent worldLoadedEvent() { return new yarnwrap.client.session.telemetry.WorldLoadedEvent(wrapperContained.worldLoadedEvent); }
// public void worldLoadedEvent(yarnwrap.client.session.telemetry.WorldLoadedEvent value) { wrapperContained.worldLoadedEvent = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.WorldLoadedEvent worldLoadedEvent() { return new yarnwrap.client.session.telemetry.WorldLoadedEvent(net.minecraft.client.session.telemetry.WorldSession.worldLoadedEvent); }
// public static void worldLoadedEvent(yarnwrap.client.session.telemetry.WorldLoadedEvent value, ) { net.minecraft.client.session.telemetry.WorldSession.worldLoadedEvent = value.wrapperContained; }

// public yarnwrap.client.session.telemetry.WorldUnloadedEvent worldUnloadedEvent() { return new yarnwrap.client.session.telemetry.WorldUnloadedEvent(wrapperContained.worldUnloadedEvent); }
// public void worldUnloadedEvent(yarnwrap.client.session.telemetry.WorldUnloadedEvent value) { wrapperContained.worldUnloadedEvent = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.WorldUnloadedEvent worldUnloadedEvent() { return new yarnwrap.client.session.telemetry.WorldUnloadedEvent(net.minecraft.client.session.telemetry.WorldSession.worldUnloadedEvent); }
// public static void worldUnloadedEvent(yarnwrap.client.session.telemetry.WorldUnloadedEvent value, ) { net.minecraft.client.session.telemetry.WorldSession.worldUnloadedEvent = value.wrapperContained; }

// public yarnwrap.client.session.telemetry.PerformanceMetricsEvent performanceMetricsEvent() { return new yarnwrap.client.session.telemetry.PerformanceMetricsEvent(wrapperContained.performanceMetricsEvent); }
// public void performanceMetricsEvent(yarnwrap.client.session.telemetry.PerformanceMetricsEvent value) { wrapperContained.performanceMetricsEvent = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.PerformanceMetricsEvent performanceMetricsEvent() { return new yarnwrap.client.session.telemetry.PerformanceMetricsEvent(net.minecraft.client.session.telemetry.WorldSession.performanceMetricsEvent); }
// public static void performanceMetricsEvent(yarnwrap.client.session.telemetry.PerformanceMetricsEvent value, ) { net.minecraft.client.session.telemetry.WorldSession.performanceMetricsEvent = value.wrapperContained; }

// public yarnwrap.client.session.telemetry.WorldLoadTimesEvent worldLoadTimesEvent() { return new yarnwrap.client.session.telemetry.WorldLoadTimesEvent(wrapperContained.worldLoadTimesEvent); }
// public void worldLoadTimesEvent(yarnwrap.client.session.telemetry.WorldLoadTimesEvent value) { wrapperContained.worldLoadTimesEvent = value.wrapperContained; }
// public static yarnwrap.client.session.telemetry.WorldLoadTimesEvent worldLoadTimesEvent() { return new yarnwrap.client.session.telemetry.WorldLoadTimesEvent(net.minecraft.client.session.telemetry.WorldSession.worldLoadTimesEvent); }
// public static void worldLoadTimesEvent(yarnwrap.client.session.telemetry.WorldLoadTimesEvent value, ) { net.minecraft.client.session.telemetry.WorldSession.worldLoadTimesEvent = value.wrapperContained; }

public WorldSession(yarnwrap.client.session.telemetry.TelemetrySender sender,boolean newWorld,java.time.Duration worldLoadTime,java.lang.String minigameName) { this.wrapperContained = new net.minecraft.client.session.telemetry.WorldSession(sender.wrapperContained,newWorld,worldLoadTime,minigameName); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.session.telemetry.WorldSession.tick(); }
public void setTick(long tick) { wrapperContained.setTick(tick); }
// public static void setTick(long tick, ) { net.minecraft.client.session.telemetry.WorldSession.setTick(tick); }
public void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore) { wrapperContained.setGameMode(gameMode.wrapperContained,hardcore); }
// public static void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore, ) { net.minecraft.client.session.telemetry.WorldSession.setGameMode(gameMode.wrapperContained,hardcore); }
// public void method_47773(Object builder) { wrapperContained.method_47773(builder); }
// public static void method_47773(Object builder, ) { net.minecraft.client.session.telemetry.WorldSession.method_47773(builder); }
public void setBrand(java.lang.String brand) { wrapperContained.setBrand(brand); }
// public static void setBrand(java.lang.String brand, ) { net.minecraft.client.session.telemetry.WorldSession.setBrand(brand); }
public void onLoad() { wrapperContained.onLoad(); }
// public static void onLoad() { net.minecraft.client.session.telemetry.WorldSession.onLoad(); }
public void onUnload() { wrapperContained.onUnload(); }
// public static void onUnload() { net.minecraft.client.session.telemetry.WorldSession.onUnload(); }
// public void method_51801(yarnwrap.util.Identifier properties) { wrapperContained.method_51801(properties.wrapperContained); }
// public static void method_51801(yarnwrap.util.Identifier properties, ) { net.minecraft.client.session.telemetry.WorldSession.method_51801(properties.wrapperContained); }
public void onAdvancementMade(yarnwrap.world.World world,yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.onAdvancementMade(world.wrapperContained,advancement.wrapperContained); }
// public static void onAdvancementMade(yarnwrap.world.World world,yarnwrap.advancement.AdvancementEntry advancement, ) { net.minecraft.client.session.telemetry.WorldSession.onAdvancementMade(world.wrapperContained,advancement.wrapperContained); }

}