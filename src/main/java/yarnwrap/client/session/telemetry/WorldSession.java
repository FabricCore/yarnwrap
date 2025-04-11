package yarnwrap.client.session.telemetry;
public class WorldSession { public net.minecraft.client.session.telemetry.WorldSession wrapperContained; public WorldSession(net.minecraft.client.session.telemetry.WorldSession wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID sessionId() { return wrapperContained.sessionId; }
// public void sessionId(java.util.UUID value) { wrapperContained.sessionId = value; }
// public yarnwrap.client.session.telemetry.TelemetrySender sender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.sender); }
// public void sender(yarnwrap.client.session.telemetry.TelemetrySender value) { wrapperContained.sender = value.wrapperContained; }
// public yarnwrap.client.session.telemetry.WorldLoadedEvent worldLoadedEvent() { return new yarnwrap.client.session.telemetry.WorldLoadedEvent(wrapperContained.worldLoadedEvent); }
// public void worldLoadedEvent(yarnwrap.client.session.telemetry.WorldLoadedEvent value) { wrapperContained.worldLoadedEvent = value.wrapperContained; }
// public yarnwrap.client.session.telemetry.WorldUnloadedEvent worldUnloadedEvent() { return new yarnwrap.client.session.telemetry.WorldUnloadedEvent(wrapperContained.worldUnloadedEvent); }
// public void worldUnloadedEvent(yarnwrap.client.session.telemetry.WorldUnloadedEvent value) { wrapperContained.worldUnloadedEvent = value.wrapperContained; }
// public yarnwrap.client.session.telemetry.PerformanceMetricsEvent performanceMetricsEvent() { return new yarnwrap.client.session.telemetry.PerformanceMetricsEvent(wrapperContained.performanceMetricsEvent); }
// public void performanceMetricsEvent(yarnwrap.client.session.telemetry.PerformanceMetricsEvent value) { wrapperContained.performanceMetricsEvent = value.wrapperContained; }
// public yarnwrap.client.session.telemetry.WorldLoadTimesEvent worldLoadTimesEvent() { return new yarnwrap.client.session.telemetry.WorldLoadTimesEvent(wrapperContained.worldLoadTimesEvent); }
// public void worldLoadTimesEvent(yarnwrap.client.session.telemetry.WorldLoadTimesEvent value) { wrapperContained.worldLoadTimesEvent = value.wrapperContained; }
public WorldSession(yarnwrap.client.session.telemetry.TelemetrySender sender,boolean newWorld,java.time.Duration worldLoadTime,java.lang.String minigameName) { this.wrapperContained = new net.minecraft.client.session.telemetry.WorldSession(sender.wrapperContained,newWorld,worldLoadTime,minigameName); }
public void tick() { wrapperContained.tick(); }
public void setTick(long tick) { wrapperContained.setTick(tick); }
public void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore) { wrapperContained.setGameMode(gameMode.wrapperContained,hardcore); }
// public void method_47773(Object builder) { wrapperContained.method_47773(builder); }
public void setBrand(java.lang.String brand) { wrapperContained.setBrand(brand); }
public void onLoad() { wrapperContained.onLoad(); }
public void onUnload() { wrapperContained.onUnload(); }
// public void method_51801(yarnwrap.util.Identifier properties) { wrapperContained.method_51801(properties.wrapperContained); }
public void onAdvancementMade(yarnwrap.world.World world,yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.onAdvancementMade(world.wrapperContained,advancement.wrapperContained); }

}