package yarnwrap.client.session.telemetry;
public class WorldLoadedEvent { public net.minecraft.client.session.telemetry.WorldLoadedEvent wrapperContained; public WorldLoadedEvent(net.minecraft.client.session.telemetry.WorldLoadedEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sent() { return wrapperContained.sent; }
// public Object gameMode() { return wrapperContained.gameMode; }
// public java.lang.String brand() { return wrapperContained.brand; }
// public java.lang.String minigameName() { return wrapperContained.minigameName; }
public void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore) { wrapperContained.setGameMode(gameMode.wrapperContained,hardcore); }
// public void putServerType(Object builder) { wrapperContained.putServerType(builder); }
public void setBrand(java.lang.String brand) { wrapperContained.setBrand(brand); }
// public Object getServerType() { return wrapperContained.getServerType(); }
public boolean send(yarnwrap.client.session.telemetry.TelemetrySender sender) { return wrapperContained.send(sender.wrapperContained); }

}