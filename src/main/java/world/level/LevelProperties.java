package yarnwrap.world.level;
public class LevelProperties { public net.minecraft.world.level.LevelProperties wrapperContained; public LevelProperties(net.minecraft.world.level.LevelProperties wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound customBossEvents() { return new yarnwrap.nbt.NbtCompound(wrapperContained.customBossEvents); }
// public boolean difficultyLocked() { return wrapperContained.difficultyLocked; }
// public int version() { return wrapperContained.version; }
// public boolean thundering() { return wrapperContained.thundering; }
// public yarnwrap.nbt.NbtCompound playerData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.playerData); }
// public int thunderTime() { return wrapperContained.thunderTime; }
// public int clearWeatherTime() { return wrapperContained.clearWeatherTime; }
// public int wanderingTraderSpawnDelay() { return wrapperContained.wanderingTraderSpawnDelay; }
// public int wanderingTraderSpawnChance() { return wrapperContained.wanderingTraderSpawnChance; }
// public java.util.UUID wanderingTraderId() { return wrapperContained.wanderingTraderId; }
// public boolean initialized() { return wrapperContained.initialized; }
// public long time() { return wrapperContained.time; }
// public boolean raining() { return wrapperContained.raining; }
// public yarnwrap.world.timer.Timer scheduledEvents() { return new yarnwrap.world.timer.Timer(wrapperContained.scheduledEvents); }
// public int rainTime() { return wrapperContained.rainTime; }
// public long timeOfDay() { return wrapperContained.timeOfDay; }
// public java.util.Set serverBrands() { return wrapperContained.serverBrands; }
// public boolean modded() { return wrapperContained.modded; }
// public Object worldBorder() { return wrapperContained.worldBorder; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.level.LevelInfo levelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.levelInfo); }
// public Object dragonFight() { return wrapperContained.dragonFight; }
// public yarnwrap.world.gen.GeneratorOptions generatorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.generatorOptions); }
// public com.mojang.serialization.Lifecycle lifecycle() { return wrapperContained.lifecycle; }
// public float spawnAngle() { return wrapperContained.spawnAngle; }
// public java.lang.String WORLD_GEN_SETTINGS_KEY() { return wrapperContained.WORLD_GEN_SETTINGS_KEY; }
// public java.lang.String PLAYER_KEY() { return wrapperContained.PLAYER_KEY; }
// public Object specialProperty() { return wrapperContained.specialProperty; }
// public java.util.Set removedFeatures() { return wrapperContained.removedFeatures; }
public java.lang.String LEVEL_NAME_KEY() { return wrapperContained.LEVEL_NAME_KEY; }
// public yarnwrap.util.math.BlockPos spawnPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.spawnPos); }
// public void updateProperties(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.nbt.NbtCompound levelNbt,yarnwrap.nbt.NbtCompound playerNbt) { wrapperContained.updateProperties(registryManager.wrapperContained,levelNbt.wrapperContained,playerNbt.wrapperContained); }
// public yarnwrap.world.level.LevelProperties readProperties(com.mojang.serialization.Dynamic dynamic,yarnwrap.world.level.LevelInfo info,Object specialProperty,yarnwrap.world.gen.GeneratorOptions generatorOptions,com.mojang.serialization.Lifecycle lifecycle) { return new yarnwrap.world.level.LevelProperties(wrapperContained.readProperties(dynamic,info.wrapperContained,specialProperty,generatorOptions.wrapperContained,lifecycle)); }
// public yarnwrap.nbt.NbtList createStringList(java.util.Set strings) { return new yarnwrap.nbt.NbtList(wrapperContained.createStringList(strings)); }

}