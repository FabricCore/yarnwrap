package yarnwrap.world;
public class SaveProperties { public net.minecraft.world.SaveProperties wrapperContained; public SaveProperties(net.minecraft.world.SaveProperties wrapperContained) { this.wrapperContained = wrapperContained; }

public int ANVIL_FORMAT_ID() { return wrapperContained.ANVIL_FORMAT_ID; }
// public void ANVIL_FORMAT_ID(int value) { wrapperContained.ANVIL_FORMAT_ID = value; }
public int MCREGION_FORMAT_ID() { return wrapperContained.MCREGION_FORMAT_ID; }
// public void MCREGION_FORMAT_ID(int value) { wrapperContained.MCREGION_FORMAT_ID = value; }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.populateCrashReport(section.wrapperContained); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
public yarnwrap.nbt.NbtCompound cloneWorldNbt(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.nbt.NbtCompound playerNbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.cloneWorldNbt(registryManager.wrapperContained,playerNbt.wrapperContained)); }
public int getVersion() { return wrapperContained.getVersion(); }
public void setDifficultyLocked(boolean difficultyLocked) { wrapperContained.setDifficultyLocked(difficultyLocked); }
public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
public boolean areCommandsAllowed() { return wrapperContained.areCommandsAllowed(); }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
public void setDifficulty(yarnwrap.world.Difficulty difficulty) { wrapperContained.setDifficulty(difficulty.wrapperContained); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
public void setCustomBossEvents(yarnwrap.nbt.NbtCompound customBossEvents) { wrapperContained.setCustomBossEvents(customBossEvents.wrapperContained); }
public yarnwrap.nbt.NbtCompound getPlayerData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getPlayerData()); }
public yarnwrap.nbt.NbtCompound getCustomBossEvents() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getCustomBossEvents()); }
public void addServerBrand(java.lang.String brand,boolean modded) { wrapperContained.addServerBrand(brand,modded); }
public boolean isModded() { return wrapperContained.isModded(); }
public java.util.Set getServerBrands() { return wrapperContained.getServerBrands(); }
public yarnwrap.world.level.LevelInfo getLevelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.getLevelInfo()); }
public java.lang.String getFormatName(int id) { return wrapperContained.getFormatName(id); }
public yarnwrap.world.level.ServerWorldProperties getMainWorldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.getMainWorldProperties()); }
public yarnwrap.world.gen.GeneratorOptions getGeneratorOptions() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.getGeneratorOptions()); }
public Object getDragonFight() { return wrapperContained.getDragonFight(); }
// public void setDragonFight(Object dragonFight) { wrapperContained.setDragonFight(dragonFight); }
public com.mojang.serialization.Lifecycle getLifecycle() { return wrapperContained.getLifecycle(); }
public yarnwrap.resource.DataConfiguration getDataConfiguration() { return new yarnwrap.resource.DataConfiguration(wrapperContained.getDataConfiguration()); }
public void updateLevelInfo(yarnwrap.resource.DataConfiguration dataConfiguration) { wrapperContained.updateLevelInfo(dataConfiguration.wrapperContained); }
public boolean isFlatWorld() { return wrapperContained.isFlatWorld(); }
public boolean isDebugWorld() { return wrapperContained.isDebugWorld(); }
public yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getEnabledFeatures()); }
public java.util.Set getRemovedFeatures() { return wrapperContained.getRemovedFeatures(); }

}