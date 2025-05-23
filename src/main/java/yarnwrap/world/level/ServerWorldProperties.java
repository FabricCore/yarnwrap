package yarnwrap.world.level;
public class ServerWorldProperties { public net.minecraft.world.level.ServerWorldProperties wrapperContained; public ServerWorldProperties(net.minecraft.world.level.ServerWorldProperties wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.timer.Timer getScheduledEvents() { return new yarnwrap.world.timer.Timer(wrapperContained.getScheduledEvents()); }
// public static yarnwrap.world.timer.Timer getScheduledEvents() { return new yarnwrap.world.timer.Timer(net.minecraft.world.level.ServerWorldProperties.getScheduledEvents()); }
public int getThunderTime() { return wrapperContained.getThunderTime(); }
// public static int getThunderTime() { return net.minecraft.world.level.ServerWorldProperties.getThunderTime(); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
// public static yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(net.minecraft.world.level.ServerWorldProperties.getGameRules()); }
public void setThundering(boolean thundering) { wrapperContained.setThundering(thundering); }
// public static void setThundering(boolean thundering, ) { net.minecraft.world.level.ServerWorldProperties.setThundering(thundering); }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }
// public static java.lang.String getLevelName() { return net.minecraft.world.level.ServerWorldProperties.getLevelName(); }
public int getClearWeatherTime() { return wrapperContained.getClearWeatherTime(); }
// public static int getClearWeatherTime() { return net.minecraft.world.level.ServerWorldProperties.getClearWeatherTime(); }
public void setRainTime(int rainTime) { wrapperContained.setRainTime(rainTime); }
// public static void setRainTime(int rainTime, ) { net.minecraft.world.level.ServerWorldProperties.setRainTime(rainTime); }
public void setClearWeatherTime(int clearWeatherTime) { wrapperContained.setClearWeatherTime(clearWeatherTime); }
// public static void setClearWeatherTime(int clearWeatherTime, ) { net.minecraft.world.level.ServerWorldProperties.setClearWeatherTime(clearWeatherTime); }
public void setThunderTime(int thunderTime) { wrapperContained.setThunderTime(thunderTime); }
// public static void setThunderTime(int thunderTime, ) { net.minecraft.world.level.ServerWorldProperties.setThunderTime(thunderTime); }
public int getRainTime() { return wrapperContained.getRainTime(); }
// public static int getRainTime() { return net.minecraft.world.level.ServerWorldProperties.getRainTime(); }
public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
// public static void setGameMode(yarnwrap.world.GameMode gameMode, ) { net.minecraft.world.level.ServerWorldProperties.setGameMode(gameMode.wrapperContained); }
public boolean areCommandsAllowed() { return wrapperContained.areCommandsAllowed(); }
// public static boolean areCommandsAllowed() { return net.minecraft.world.level.ServerWorldProperties.areCommandsAllowed(); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
// public static yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(net.minecraft.world.level.ServerWorldProperties.getGameMode()); }
public boolean isInitialized() { return wrapperContained.isInitialized(); }
// public static boolean isInitialized() { return net.minecraft.world.level.ServerWorldProperties.isInitialized(); }
public void setInitialized(boolean initialized) { wrapperContained.setInitialized(initialized); }
// public static void setInitialized(boolean initialized, ) { net.minecraft.world.level.ServerWorldProperties.setInitialized(initialized); }
public int getWanderingTraderSpawnDelay() { return wrapperContained.getWanderingTraderSpawnDelay(); }
// public static int getWanderingTraderSpawnDelay() { return net.minecraft.world.level.ServerWorldProperties.getWanderingTraderSpawnDelay(); }
public int getWanderingTraderSpawnChance() { return wrapperContained.getWanderingTraderSpawnChance(); }
// public static int getWanderingTraderSpawnChance() { return net.minecraft.world.level.ServerWorldProperties.getWanderingTraderSpawnChance(); }
public void setWanderingTraderId(java.util.UUID wanderingTraderId) { wrapperContained.setWanderingTraderId(wanderingTraderId); }
// public static void setWanderingTraderId(java.util.UUID wanderingTraderId, ) { net.minecraft.world.level.ServerWorldProperties.setWanderingTraderId(wanderingTraderId); }
public void setWanderingTraderSpawnDelay(int wanderingTraderSpawnDelay) { wrapperContained.setWanderingTraderSpawnDelay(wanderingTraderSpawnDelay); }
// public static void setWanderingTraderSpawnDelay(int wanderingTraderSpawnDelay, ) { net.minecraft.world.level.ServerWorldProperties.setWanderingTraderSpawnDelay(wanderingTraderSpawnDelay); }
public void setWanderingTraderSpawnChance(int wanderingTraderSpawnChance) { wrapperContained.setWanderingTraderSpawnChance(wanderingTraderSpawnChance); }
// public static void setWanderingTraderSpawnChance(int wanderingTraderSpawnChance, ) { net.minecraft.world.level.ServerWorldProperties.setWanderingTraderSpawnChance(wanderingTraderSpawnChance); }
// public void setWorldBorder(Object worldBorder) { wrapperContained.setWorldBorder(worldBorder); }
// public static void setWorldBorder(Object worldBorder, ) { net.minecraft.world.level.ServerWorldProperties.setWorldBorder(worldBorder); }
public Object getWorldBorder() { return wrapperContained.getWorldBorder(); }
// public static Object getWorldBorder() { return net.minecraft.world.level.ServerWorldProperties.getWorldBorder(); }
public void setTime(long time) { wrapperContained.setTime(time); }
// public static void setTime(long time, ) { net.minecraft.world.level.ServerWorldProperties.setTime(time); }
public void setTimeOfDay(long timeOfDay) { wrapperContained.setTimeOfDay(timeOfDay); }
// public static void setTimeOfDay(long timeOfDay, ) { net.minecraft.world.level.ServerWorldProperties.setTimeOfDay(timeOfDay); }
public java.util.UUID getWanderingTraderId() { return wrapperContained.getWanderingTraderId(); }
// public static java.util.UUID getWanderingTraderId() { return net.minecraft.world.level.ServerWorldProperties.getWanderingTraderId(); }

}