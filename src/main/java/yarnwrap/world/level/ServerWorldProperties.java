package yarnwrap.world.level;
public class ServerWorldProperties { public net.minecraft.world.level.ServerWorldProperties wrapperContained; public ServerWorldProperties(net.minecraft.world.level.ServerWorldProperties wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.timer.Timer getScheduledEvents() { return new yarnwrap.world.timer.Timer(wrapperContained.getScheduledEvents()); }
public int getThunderTime() { return wrapperContained.getThunderTime(); }
public void setThundering(boolean thundering) { wrapperContained.setThundering(thundering); }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }
public int getClearWeatherTime() { return wrapperContained.getClearWeatherTime(); }
public void setRainTime(int rainTime) { wrapperContained.setRainTime(rainTime); }
public void setClearWeatherTime(int clearWeatherTime) { wrapperContained.setClearWeatherTime(clearWeatherTime); }
public void setThunderTime(int thunderTime) { wrapperContained.setThunderTime(thunderTime); }
public int getWanderingTraderSpawnDelay() { return wrapperContained.getWanderingTraderSpawnDelay(); }
public int getWanderingTraderSpawnChance() { return wrapperContained.getWanderingTraderSpawnChance(); }
public void setWanderingTraderId(java.util.UUID wanderingTraderId) { wrapperContained.setWanderingTraderId(wanderingTraderId); }
public void setWanderingTraderSpawnDelay(int wanderingTraderSpawnDelay) { wrapperContained.setWanderingTraderSpawnDelay(wanderingTraderSpawnDelay); }
public void setWanderingTraderSpawnChance(int wanderingTraderSpawnChance) { wrapperContained.setWanderingTraderSpawnChance(wanderingTraderSpawnChance); }
public int getRainTime() { return wrapperContained.getRainTime(); }
public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
public boolean areCommandsAllowed() { return wrapperContained.areCommandsAllowed(); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
public boolean isInitialized() { return wrapperContained.isInitialized(); }
public void setInitialized(boolean initialized) { wrapperContained.setInitialized(initialized); }
// public void setWorldBorder(Object worldBorder) { wrapperContained.setWorldBorder(worldBorder); }
public Object getWorldBorder() { return wrapperContained.getWorldBorder(); }
public void setTime(long time) { wrapperContained.setTime(time); }
public void setTimeOfDay(long timeOfDay) { wrapperContained.setTimeOfDay(timeOfDay); }
public java.util.UUID getWanderingTraderId() { return wrapperContained.getWanderingTraderId(); }

}