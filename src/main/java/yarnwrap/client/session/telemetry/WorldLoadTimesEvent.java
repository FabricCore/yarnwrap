package yarnwrap.client.session.telemetry;
public class WorldLoadTimesEvent { public net.minecraft.client.session.telemetry.WorldLoadTimesEvent wrapperContained; public WorldLoadTimesEvent(net.minecraft.client.session.telemetry.WorldLoadTimesEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean newWorld() { return wrapperContained.newWorld; }
// public void newWorld(boolean value) { wrapperContained.newWorld = value; }
// public java.time.Duration worldLoadTime() { return wrapperContained.worldLoadTime; }
// public void worldLoadTime(java.time.Duration value) { wrapperContained.worldLoadTime = value; }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }

}