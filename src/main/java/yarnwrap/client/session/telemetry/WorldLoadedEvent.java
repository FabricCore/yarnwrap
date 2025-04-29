package yarnwrap.client.session.telemetry;
public class WorldLoadedEvent { public net.minecraft.client.session.telemetry.WorldLoadedEvent wrapperContained; public WorldLoadedEvent(net.minecraft.client.session.telemetry.WorldLoadedEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sent() { return wrapperContained.sent; }
// public void sent(boolean value) { wrapperContained.sent = value; }
// public static boolean sent() { return net.minecraft.client.session.telemetry.WorldLoadedEvent.sent; }
// public static void sent(boolean value, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.sent = value; }

// public Object gameMode() { return wrapperContained.gameMode; }
// // public void gameMode(Object value) { wrapperContained.gameMode = value; }
// // public static Object gameMode() { return net.minecraft.client.session.telemetry.WorldLoadedEvent.gameMode; }
// // public static void gameMode(Object value, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.gameMode = value; }

// public java.lang.String brand() { return wrapperContained.brand; }
// public void brand(java.lang.String value) { wrapperContained.brand = value; }
// public static java.lang.String brand() { return net.minecraft.client.session.telemetry.WorldLoadedEvent.brand; }
// public static void brand(java.lang.String value, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.brand = value; }

// public java.lang.String minigameName() { return wrapperContained.minigameName; }
// public void minigameName(java.lang.String value) { wrapperContained.minigameName = value; }
// public static java.lang.String minigameName() { return net.minecraft.client.session.telemetry.WorldLoadedEvent.minigameName; }
// public static void minigameName(java.lang.String value, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.minigameName = value; }

public WorldLoadedEvent(java.lang.String minigameName) { this.wrapperContained = new net.minecraft.client.session.telemetry.WorldLoadedEvent(minigameName); }
public void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore) { wrapperContained.setGameMode(gameMode.wrapperContained,hardcore); }
// public static void setGameMode(yarnwrap.world.GameMode gameMode,boolean hardcore, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.setGameMode(gameMode.wrapperContained,hardcore); }
// public void putServerType(Object builder) { wrapperContained.putServerType(builder); }
// public static void putServerType(Object builder, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.putServerType(builder); }
public void setBrand(java.lang.String brand) { wrapperContained.setBrand(brand); }
// public static void setBrand(java.lang.String brand, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.setBrand(brand); }
// public Object getServerType() { return wrapperContained.getServerType(); }
// public static Object getServerType() { return net.minecraft.client.session.telemetry.WorldLoadedEvent.getServerType(); }
// public void method_47795(Object adder) { wrapperContained.method_47795(adder); }
// public static void method_47795(Object adder, ) { net.minecraft.client.session.telemetry.WorldLoadedEvent.method_47795(adder); }
public boolean send(yarnwrap.client.session.telemetry.TelemetrySender sender) { return wrapperContained.send(sender.wrapperContained); }
// public static boolean send(yarnwrap.client.session.telemetry.TelemetrySender sender, ) { return net.minecraft.client.session.telemetry.WorldLoadedEvent.send(sender.wrapperContained); }

}