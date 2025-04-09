package yarnwrap.client.session.telemetry;
public class WorldSession { public net.minecraft.client.session.telemetry.WorldSession wrapperContained; public WorldSession(net.minecraft.client.session.telemetry.WorldSession wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID sessionId() { return wrapperContained.sessionId; }
// public yarnwrap.client.session.telemetry.TelemetrySender sender() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.sender); }
// public yarnwrap.client.session.telemetry.WorldLoadedEvent worldLoadedEvent() { return new yarnwrap.client.session.telemetry.WorldLoadedEvent(wrapperContained.worldLoadedEvent); }
// public yarnwrap.client.session.telemetry.WorldUnloadedEvent worldUnloadedEvent() { return new yarnwrap.client.session.telemetry.WorldUnloadedEvent(wrapperContained.worldUnloadedEvent); }
// public yarnwrap.client.session.telemetry.PerformanceMetricsEvent performanceMetricsEvent() { return new yarnwrap.client.session.telemetry.PerformanceMetricsEvent(wrapperContained.performanceMetricsEvent); }
// public yarnwrap.client.session.telemetry.WorldLoadTimesEvent worldLoadTimesEvent() { return new yarnwrap.client.session.telemetry.WorldLoadTimesEvent(wrapperContained.worldLoadTimesEvent); }
public void tick() { wrapperContained.tick(); }
public void setTick(long tick) { wrapperContained.setTick(tick); }
public void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore) { wrapperContained.setGameMode(gameMode.wrapperContained,hardcore); }
public void setBrand(java.lang.String brand) { wrapperContained.setBrand(brand); }
public void onLoad() { wrapperContained.onLoad(); }
public void onUnload() { wrapperContained.onUnload(); }
public void onAdvancementMade(yarnwrap.world.World world,yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.onAdvancementMade(world.wrapperContained,advancement.wrapperContained); }

}