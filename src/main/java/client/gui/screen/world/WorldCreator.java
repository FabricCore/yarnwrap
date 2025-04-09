package yarnwrap.client.gui.screen.world;
public class WorldCreator { public net.minecraft.client.gui.screen.world.WorldCreator wrapperContained; public WorldCreator(net.minecraft.client.gui.screen.world.WorldCreator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public java.lang.String worldName() { return wrapperContained.worldName; }
// public Object gameMode() { return wrapperContained.gameMode; }
// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public java.lang.Boolean cheatsEnabled() { return wrapperContained.cheatsEnabled; }
// public java.lang.String seed() { return wrapperContained.seed; }
// public boolean generateStructures() { return wrapperContained.generateStructures; }
// public boolean bonusChestEnabled() { return wrapperContained.bonusChestEnabled; }
// public yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder() { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.generatorOptionsHolder); }
// public Object worldType() { return wrapperContained.worldType; }
// public java.util.List normalWorldTypes() { return wrapperContained.normalWorldTypes; }
// public java.util.List extendedWorldTypes() { return wrapperContained.extendedWorldTypes; }
// public yarnwrap.world.GameRules gameRules() { return new yarnwrap.world.GameRules(wrapperContained.gameRules); }
// public yarnwrap.text.Text NEW_WORLD_NAME() { return new yarnwrap.text.Text(wrapperContained.NEW_WORLD_NAME); }
// public java.nio.file.Path savesDirectory() { return wrapperContained.savesDirectory; }
// public java.lang.String worldDirectoryName() { return wrapperContained.worldDirectoryName; }
public void update() { wrapperContained.update(); }
public void setDifficulty(yarnwrap.world.Difficulty difficulty) { wrapperContained.setDifficulty(difficulty.wrapperContained); }
public void setGameRules(yarnwrap.world.GameRules gameRules) { wrapperContained.setGameRules(gameRules.wrapperContained); }
// public boolean updateDataConfiguration(yarnwrap.resource.DataConfiguration dataConfiguration) { return wrapperContained.updateDataConfiguration(dataConfiguration.wrapperContained); }
// public void applyModifier(Object modifier) { wrapperContained.applyModifier(modifier); }
public void setGeneratorOptionsHolder(yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder) { wrapperContained.setGeneratorOptionsHolder(generatorOptionsHolder.wrapperContained); }
// public java.util.Optional getWorldPreset(yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder,java.util.Optional key) { return wrapperContained.getWorldPreset(generatorOptionsHolder.wrapperContained,key); }
// public void setGameMode(Object gameMode) { wrapperContained.setGameMode(gameMode); }
// public void setWorldType(Object worldType) { wrapperContained.setWorldType(worldType); }
// public java.util.Optional getWorldPresetList(yarnwrap.registry.Registry registry,yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getWorldPresetList(registry.wrapperContained,tag.wrapperContained); }
public void setWorldName(java.lang.String worldName) { wrapperContained.setWorldName(worldName); }
public void addListener(java.util.function.Consumer listener) { wrapperContained.addListener(listener); }
public void setCheatsEnabled(boolean cheatsEnabled) { wrapperContained.setCheatsEnabled(cheatsEnabled); }
public java.lang.String getWorldName() { return wrapperContained.getWorldName(); }
public void setSeed(java.lang.String seed) { wrapperContained.setSeed(seed); }
public void setGenerateStructures(boolean generateStructures) { wrapperContained.setGenerateStructures(generateStructures); }
public void setBonusChestEnabled(boolean bonusChestEnabled) { wrapperContained.setBonusChestEnabled(bonusChestEnabled); }
public Object getGameMode() { return wrapperContained.getGameMode(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
public boolean areCheatsEnabled() { return wrapperContained.areCheatsEnabled(); }
public java.lang.String getSeed() { return wrapperContained.getSeed(); }
public boolean shouldGenerateStructures() { return wrapperContained.shouldGenerateStructures(); }
public boolean isBonusChestEnabled() { return wrapperContained.isBonusChestEnabled(); }
public yarnwrap.client.world.GeneratorOptionsHolder getGeneratorOptionsHolder() { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.getGeneratorOptionsHolder()); }
public boolean isDebug() { return wrapperContained.isDebug(); }
public Object getWorldType() { return wrapperContained.getWorldType(); }
public yarnwrap.client.gui.screen.world.LevelScreenProvider getLevelScreenProvider() { return new yarnwrap.client.gui.screen.world.LevelScreenProvider(wrapperContained.getLevelScreenProvider()); }
public java.util.List getNormalWorldTypes() { return wrapperContained.getNormalWorldTypes(); }
public java.util.List getExtendedWorldTypes() { return wrapperContained.getExtendedWorldTypes(); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
// public void updateWorldTypeLists() { wrapperContained.updateWorldTypeLists(); }
public java.lang.String getWorldDirectoryName() { return wrapperContained.getWorldDirectoryName(); }
// public java.lang.String toDirectoryName(java.lang.String worldName) { return wrapperContained.toDirectoryName(worldName); }

}