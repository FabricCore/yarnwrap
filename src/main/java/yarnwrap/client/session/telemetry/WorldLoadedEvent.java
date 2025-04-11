package yarnwrap.client.session.telemetry;
public class WorldLoadedEvent { public net.minecraft.client.session.telemetry.WorldLoadedEvent wrapperContained; public WorldLoadedEvent(net.minecraft.client.session.telemetry.WorldLoadedEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sent() { return wrapperContained.sent; }
// public void sent(boolean value) { wrapperContained.sent = value; }
// public Object gameMode() { return wrapperContained.gameMode; }
// // public void gameMode(Object value) { wrapperContained.gameMode = value; }
// public java.lang.String brand() { return wrapperContained.brand; }
// public void brand(java.lang.String value) { wrapperContained.brand = value; }
// public java.lang.String minigameName() { return wrapperContained.minigameName; }
// public void minigameName(java.lang.String value) { wrapperContained.minigameName = value; }
public WorldLoadedEvent(java.lang.String minigameName) { this.wrapperContained = new net.minecraft.client.session.telemetry.WorldLoadedEvent(minigameName); }
public void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore) { wrapperContained.setGameMode(gameMode.wrapperContained,hardcore); }
// public void putServerType(Object builder) { wrapperContained.putServerType(builder); }
public void setBrand(java.lang.String brand) { wrapperContained.setBrand(brand); }
// public Object getServerType() { return wrapperContained.getServerType(); }
// public void method_47795(Object adder) { wrapperContained.method_47795(adder); }
public boolean send(yarnwrap.client.session.telemetry.TelemetrySender sender) { return wrapperContained.send(sender.wrapperContained); }

}