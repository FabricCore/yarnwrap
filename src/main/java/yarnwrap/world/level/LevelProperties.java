package yarnwrap.world.level;
public class LevelProperties { public net.minecraft.world.level.LevelProperties wrapperContained; public LevelProperties(net.minecraft.world.level.LevelProperties wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound customBossEvents() { return new yarnwrap.nbt.NbtCompound(wrapperContained.customBossEvents); }
// public void customBossEvents(yarnwrap.nbt.NbtCompound value) { wrapperContained.customBossEvents = value.wrapperContained; }
// public boolean difficultyLocked() { return wrapperContained.difficultyLocked; }
// public void difficultyLocked(boolean value) { wrapperContained.difficultyLocked = value; }
// public int version() { return wrapperContained.version; }
// public void version(int value) { wrapperContained.version = value; }
// public boolean thundering() { return wrapperContained.thundering; }
// public void thundering(boolean value) { wrapperContained.thundering = value; }
// public yarnwrap.nbt.NbtCompound playerData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.playerData); }
// public void playerData(yarnwrap.nbt.NbtCompound value) { wrapperContained.playerData = value.wrapperContained; }
// public int thunderTime() { return wrapperContained.thunderTime; }
// public void thunderTime(int value) { wrapperContained.thunderTime = value; }
// public int clearWeatherTime() { return wrapperContained.clearWeatherTime; }
// public void clearWeatherTime(int value) { wrapperContained.clearWeatherTime = value; }
// public int wanderingTraderSpawnDelay() { return wrapperContained.wanderingTraderSpawnDelay; }
// public void wanderingTraderSpawnDelay(int value) { wrapperContained.wanderingTraderSpawnDelay = value; }
// public int wanderingTraderSpawnChance() { return wrapperContained.wanderingTraderSpawnChance; }
// public void wanderingTraderSpawnChance(int value) { wrapperContained.wanderingTraderSpawnChance = value; }
// public java.util.UUID wanderingTraderId() { return wrapperContained.wanderingTraderId; }
// public void wanderingTraderId(java.util.UUID value) { wrapperContained.wanderingTraderId = value; }
// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
// public long time() { return wrapperContained.time; }
// public void time(long value) { wrapperContained.time = value; }
// public boolean raining() { return wrapperContained.raining; }
// public void raining(boolean value) { wrapperContained.raining = value; }
// public yarnwrap.world.timer.Timer scheduledEvents() { return new yarnwrap.world.timer.Timer(wrapperContained.scheduledEvents); }
// public void scheduledEvents(yarnwrap.world.timer.Timer value) { wrapperContained.scheduledEvents = value.wrapperContained; }
// public int rainTime() { return wrapperContained.rainTime; }
// public void rainTime(int value) { wrapperContained.rainTime = value; }
// public long timeOfDay() { return wrapperContained.timeOfDay; }
// public void timeOfDay(long value) { wrapperContained.timeOfDay = value; }
// public java.util.Set serverBrands() { return wrapperContained.serverBrands; }
// public void serverBrands(java.util.Set value) { wrapperContained.serverBrands = value; }
// public boolean modded() { return wrapperContained.modded; }
// public void modded(boolean value) { wrapperContained.modded = value; }
// public Object worldBorder() { return wrapperContained.worldBorder; }
// // public void worldBorder(Object value) { wrapperContained.worldBorder = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.level.LevelInfo levelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.levelInfo); }
// public void levelInfo(yarnwrap.world.level.LevelInfo value) { wrapperContained.levelInfo = value.wrapperContained; }
// public Object dragonFight() { return wrapperContained.dragonFight; }
// // public void dragonFight(Object value) { wrapperContained.dragonFight = value; }
// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public void generatorOptions(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.generatorOptions = value.wrapperContained; }
// public com.mojang.serialization.Lifecycle lifecycle() { return wrapperContained.lifecycle; }
// public void lifecycle(com.mojang.serialization.Lifecycle value) { wrapperContained.lifecycle = value; }
// public float spawnAngle() { return wrapperContained.spawnAngle; }
// public void spawnAngle(float value) { wrapperContained.spawnAngle = value; }
// public java.lang.String WORLD_GEN_SETTINGS_KEY() { return wrapperContained.WORLD_GEN_SETTINGS_KEY; }
// public void WORLD_GEN_SETTINGS_KEY(java.lang.String value) { wrapperContained.WORLD_GEN_SETTINGS_KEY = value; }
// public java.lang.String PLAYER_KEY() { return wrapperContained.PLAYER_KEY; }
// public void PLAYER_KEY(java.lang.String value) { wrapperContained.PLAYER_KEY = value; }
// public Object specialProperty() { return wrapperContained.specialProperty; }
// // public void specialProperty(Object value) { wrapperContained.specialProperty = value; }
// public java.util.Set removedFeatures() { return wrapperContained.removedFeatures; }
// public void removedFeatures(java.util.Set value) { wrapperContained.removedFeatures = value; }
public java.lang.String LEVEL_NAME_KEY() { return wrapperContained.LEVEL_NAME_KEY; }
// public void LEVEL_NAME_KEY(java.lang.String value) { wrapperContained.LEVEL_NAME_KEY = value; }
// public yarnwrap.util.math.BlockPos spawnPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.spawnPos); }
// public void spawnPos(yarnwrap.util.math.BlockPos value) { wrapperContained.spawnPos = value.wrapperContained; }
// public void updateProperties(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.nbt.NbtCompound levelNbt,yarnwrap.nbt.NbtCompound playerNbt) { wrapperContained.updateProperties(registryManager.wrapperContained,levelNbt.wrapperContained,playerNbt.wrapperContained); }
// public yarnwrap.world.level.LevelProperties readProperties(com.mojang.serialization.Dynamic dynamic,yarnwrap.world.level.LevelInfo info,Object specialProperty,yarnwrap.world.gen.GeneratorOptions generatorOptions,com.mojang.serialization.Lifecycle lifecycle) { return new yarnwrap.world.level.LevelProperties(wrapperContained.readProperties(dynamic,info.wrapperContained,specialProperty,generatorOptions.wrapperContained,lifecycle)); }
// public yarnwrap.nbt.NbtList createStringList(java.util.Set strings) { return new yarnwrap.nbt.NbtList(wrapperContained.createStringList(strings)); }

}