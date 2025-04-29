package yarnwrap.world;
public class SaveProperties { public net.minecraft.world.SaveProperties wrapperContained; public SaveProperties(net.minecraft.world.SaveProperties wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ANVIL_FORMAT_ID() { return wrapperContained.ANVIL_FORMAT_ID; }
// public void ANVIL_FORMAT_ID(int value) { wrapperContained.ANVIL_FORMAT_ID = value; }
public static int ANVIL_FORMAT_ID() { return net.minecraft.world.SaveProperties.ANVIL_FORMAT_ID; }
// public static void ANVIL_FORMAT_ID(int value, ) { net.minecraft.world.SaveProperties.ANVIL_FORMAT_ID = value; }

// public int MCREGION_FORMAT_ID() { return wrapperContained.MCREGION_FORMAT_ID; }
// public void MCREGION_FORMAT_ID(int value) { wrapperContained.MCREGION_FORMAT_ID = value; }
public static int MCREGION_FORMAT_ID() { return net.minecraft.world.SaveProperties.MCREGION_FORMAT_ID; }
// public static void MCREGION_FORMAT_ID(int value, ) { net.minecraft.world.SaveProperties.MCREGION_FORMAT_ID = value; }

public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
// public static yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(net.minecraft.world.SaveProperties.getGameRules()); }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }
// public static java.lang.String getLevelName() { return net.minecraft.world.SaveProperties.getLevelName(); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.populateCrashReport(section.wrapperContained); }
// public static void populateCrashReport(yarnwrap.util.crash.CrashReportSection section, ) { net.minecraft.world.SaveProperties.populateCrashReport(section.wrapperContained); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
// public static boolean isHardcore() { return net.minecraft.world.SaveProperties.isHardcore(); }
public yarnwrap.nbt.NbtCompound cloneWorldNbt(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.nbt.NbtCompound playerNbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.cloneWorldNbt(registryManager.wrapperContained,playerNbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound cloneWorldNbt(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.nbt.NbtCompound playerNbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.SaveProperties.cloneWorldNbt(registryManager.wrapperContained,playerNbt.wrapperContained)); }
public int getVersion() { return wrapperContained.getVersion(); }
// public static int getVersion() { return net.minecraft.world.SaveProperties.getVersion(); }
public void setDifficultyLocked(boolean difficultyLocked) { wrapperContained.setDifficultyLocked(difficultyLocked); }
// public static void setDifficultyLocked(boolean difficultyLocked, ) { net.minecraft.world.SaveProperties.setDifficultyLocked(difficultyLocked); }
public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
// public static void setGameMode(yarnwrap.world.GameMode gameMode, ) { net.minecraft.world.SaveProperties.setGameMode(gameMode.wrapperContained); }
public boolean areCommandsAllowed() { return wrapperContained.areCommandsAllowed(); }
// public static boolean areCommandsAllowed() { return net.minecraft.world.SaveProperties.areCommandsAllowed(); }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
// public static boolean isDifficultyLocked() { return net.minecraft.world.SaveProperties.isDifficultyLocked(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
// public static yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(net.minecraft.world.SaveProperties.getDifficulty()); }
public void setDifficulty(yarnwrap.world.Difficulty difficulty) { wrapperContained.setDifficulty(difficulty.wrapperContained); }
// public static void setDifficulty(yarnwrap.world.Difficulty difficulty, ) { net.minecraft.world.SaveProperties.setDifficulty(difficulty.wrapperContained); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
// public static yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(net.minecraft.world.SaveProperties.getGameMode()); }
public void setCustomBossEvents(yarnwrap.nbt.NbtCompound customBossEvents) { wrapperContained.setCustomBossEvents(customBossEvents.wrapperContained); }
// public static void setCustomBossEvents(yarnwrap.nbt.NbtCompound customBossEvents, ) { net.minecraft.world.SaveProperties.setCustomBossEvents(customBossEvents.wrapperContained); }
public yarnwrap.nbt.NbtCompound getPlayerData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getPlayerData()); }
// public static yarnwrap.nbt.NbtCompound getPlayerData() { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.SaveProperties.getPlayerData()); }
public yarnwrap.nbt.NbtCompound getCustomBossEvents() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getCustomBossEvents()); }
// public static yarnwrap.nbt.NbtCompound getCustomBossEvents() { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.SaveProperties.getCustomBossEvents()); }
public void addServerBrand(java.lang.String brand,boolean modded) { wrapperContained.addServerBrand(brand,modded); }
// public static void addServerBrand(java.lang.String brand,boolean modded, ) { net.minecraft.world.SaveProperties.addServerBrand(brand,modded); }
public boolean isModded() { return wrapperContained.isModded(); }
// public static boolean isModded() { return net.minecraft.world.SaveProperties.isModded(); }
public java.util.Set getServerBrands() { return wrapperContained.getServerBrands(); }
// public static java.util.Set getServerBrands() { return net.minecraft.world.SaveProperties.getServerBrands(); }
public yarnwrap.world.level.LevelInfo getLevelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.getLevelInfo()); }
// public static yarnwrap.world.level.LevelInfo getLevelInfo() { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.SaveProperties.getLevelInfo()); }
public java.lang.String getFormatName(int id) { return wrapperContained.getFormatName(id); }
// public static java.lang.String getFormatName(int id, ) { return net.minecraft.world.SaveProperties.getFormatName(id); }
public yarnwrap.world.level.ServerWorldProperties getMainWorldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.getMainWorldProperties()); }
// public static yarnwrap.world.level.ServerWorldProperties getMainWorldProperties() { return new yarnwrap.world.level.ServerWorldProperties(net.minecraft.world.SaveProperties.getMainWorldProperties()); }
public yarnwrap.world.gen.GeneratorOptions getGeneratorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.getGeneratorOptions()); }
// public static yarnwrap.world.gen.GeneratorOptions getGeneratorOptions() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.SaveProperties.getGeneratorOptions()); }
public Object getDragonFight() { return wrapperContained.getDragonFight(); }
// public static Object getDragonFight() { return net.minecraft.world.SaveProperties.getDragonFight(); }
// public void setDragonFight(Object dragonFight) { wrapperContained.setDragonFight(dragonFight); }
// public static void setDragonFight(Object dragonFight, ) { net.minecraft.world.SaveProperties.setDragonFight(dragonFight); }
public com.mojang.serialization.Lifecycle getLifecycle() { return wrapperContained.getLifecycle(); }
// public static com.mojang.serialization.Lifecycle getLifecycle() { return net.minecraft.world.SaveProperties.getLifecycle(); }
public yarnwrap.resource.DataConfiguration getDataConfiguration() { return new yarnwrap.resource.DataConfiguration(wrapperContained.getDataConfiguration()); }
// public static yarnwrap.resource.DataConfiguration getDataConfiguration() { return new yarnwrap.resource.DataConfiguration(net.minecraft.world.SaveProperties.getDataConfiguration()); }
public void updateLevelInfo(yarnwrap.resource.DataConfiguration dataConfiguration) { wrapperContained.updateLevelInfo(dataConfiguration.wrapperContained); }
// public static void updateLevelInfo(yarnwrap.resource.DataConfiguration dataConfiguration, ) { net.minecraft.world.SaveProperties.updateLevelInfo(dataConfiguration.wrapperContained); }
public boolean isFlatWorld() { return wrapperContained.isFlatWorld(); }
// public static boolean isFlatWorld() { return net.minecraft.world.SaveProperties.isFlatWorld(); }
public boolean isDebugWorld() { return wrapperContained.isDebugWorld(); }
// public static boolean isDebugWorld() { return net.minecraft.world.SaveProperties.isDebugWorld(); }
public yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getEnabledFeatures()); }
// public static yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.world.SaveProperties.getEnabledFeatures()); }
public java.util.Set getRemovedFeatures() { return wrapperContained.getRemovedFeatures(); }
// public static java.util.Set getRemovedFeatures() { return net.minecraft.world.SaveProperties.getRemovedFeatures(); }

}