package yarnwrap.client.gui.screen.world;
public class WorldCreator { public net.minecraft.client.gui.screen.world.WorldCreator wrapperContained; public WorldCreator(net.minecraft.client.gui.screen.world.WorldCreator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public java.lang.String worldName() { return wrapperContained.worldName; }
// public void worldName(java.lang.String value) { wrapperContained.worldName = value; }
// public Object gameMode() { return wrapperContained.gameMode; }
// // public void gameMode(Object value) { wrapperContained.gameMode = value; }
// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.world.Difficulty value) { wrapperContained.difficulty = value.wrapperContained; }
// public java.lang.Boolean cheatsEnabled() { return wrapperContained.cheatsEnabled; }
// public void cheatsEnabled(java.lang.Boolean value) { wrapperContained.cheatsEnabled = value; }
// public java.lang.String seed() { return wrapperContained.seed; }
// public void seed(java.lang.String value) { wrapperContained.seed = value; }
// public boolean generateStructures() { return wrapperContained.generateStructures; }
// public void generateStructures(boolean value) { wrapperContained.generateStructures = value; }
// public boolean bonusChestEnabled() { return wrapperContained.bonusChestEnabled; }
// public void bonusChestEnabled(boolean value) { wrapperContained.bonusChestEnabled = value; }
// public yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder() { return new yarnwrap.client.world.GeneratorOptionsHolder(wrapperContained.generatorOptionsHolder); }
// public void generatorOptionsHolder(yarnwrap.client.world.GeneratorOptionsHolder value) { wrapperContained.generatorOptionsHolder = value.wrapperContained; }
// public Object worldType() { return wrapperContained.worldType; }
// // public void worldType(Object value) { wrapperContained.worldType = value; }
// public java.util.List normalWorldTypes() { return wrapperContained.normalWorldTypes; }
// public void normalWorldTypes(java.util.List value) { wrapperContained.normalWorldTypes = value; }
// public java.util.List extendedWorldTypes() { return wrapperContained.extendedWorldTypes; }
// public void extendedWorldTypes(java.util.List value) { wrapperContained.extendedWorldTypes = value; }
// public yarnwrap.world.GameRules gameRules() { return new yarnwrap.world.GameRules(wrapperContained.gameRules); }
// public void gameRules(yarnwrap.world.GameRules value) { wrapperContained.gameRules = value.wrapperContained; }
// public yarnwrap.text.Text NEW_WORLD_NAME() { return new yarnwrap.text.Text(wrapperContained.NEW_WORLD_NAME); }
// public void NEW_WORLD_NAME(yarnwrap.text.Text value) { wrapperContained.NEW_WORLD_NAME = value.wrapperContained; }
// public java.nio.file.Path savesDirectory() { return wrapperContained.savesDirectory; }
// public void savesDirectory(java.nio.file.Path value) { wrapperContained.savesDirectory = value; }
// public java.lang.String worldDirectoryName() { return wrapperContained.worldDirectoryName; }
// public void worldDirectoryName(java.lang.String value) { wrapperContained.worldDirectoryName = value; }
public WorldCreator(java.nio.file.Path savesDirectory,yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder,java.util.Optional defaultWorldType,java.util.OptionalLong seed) { this.wrapperContained = new net.minecraft.client.gui.screen.world.WorldCreator(savesDirectory,generatorOptionsHolder.wrapperContained,defaultWorldType,seed); }
public void update() { wrapperContained.update(); }
public void setDifficulty(yarnwrap.world.Difficulty difficulty) { wrapperContained.setDifficulty(difficulty.wrapperContained); }
public void setGameRules(yarnwrap.world.GameRules gameRules) { wrapperContained.setGameRules(gameRules.wrapperContained); }
// public boolean updateDataConfiguration(yarnwrap.resource.DataConfiguration dataConfiguration) { return wrapperContained.updateDataConfiguration(dataConfiguration.wrapperContained); }
// public yarnwrap.world.gen.GeneratorOptions method_48699(yarnwrap.world.gen.GeneratorOptions options) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.method_48699(options.wrapperContained)); }
// public void applyModifier(Object modifier) { wrapperContained.applyModifier(modifier); }
public void setGeneratorOptionsHolder(yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder) { wrapperContained.setGeneratorOptionsHolder(generatorOptionsHolder.wrapperContained); }
// public java.util.Optional method_48702(yarnwrap.client.world.GeneratorOptionsHolder key2) { return wrapperContained.method_48702(key2.wrapperContained); }
// public java.util.Optional getWorldPreset(yarnwrap.client.world.GeneratorOptionsHolder generatorOptionsHolder,java.util.Optional key) { return wrapperContained.getWorldPreset(generatorOptionsHolder.wrapperContained,key); }
// public void setGameMode(Object gameMode) { wrapperContained.setGameMode(gameMode); }
// public void setWorldType(Object worldType) { wrapperContained.setWorldType(worldType); }
// public yarnwrap.world.dimension.DimensionOptionsRegistryHolder method_48706(yarnwrap.registry.entry.RegistryEntry registryManager,Object registryHolder) { return new yarnwrap.world.dimension.DimensionOptionsRegistryHolder(wrapperContained.method_48706(registryManager.wrapperContained,registryHolder)); }
// public java.util.List method_48707(Object entryList) { return wrapperContained.method_48707(entryList); }
// public java.util.Optional getWorldPresetList(yarnwrap.registry.Registry registry,yarnwrap.registry.tag.TagKey tag) { return wrapperContained.getWorldPresetList(registry.wrapperContained,tag.wrapperContained); }
public void setWorldName(java.lang.String worldName) { wrapperContained.setWorldName(worldName); }
// public boolean method_48711(java.util.List worldTypeList) { return wrapperContained.method_48711(worldTypeList); }
public void addListener(java.util.function.Consumer listener) { wrapperContained.addListener(listener); }
public void setCheatsEnabled(boolean cheatsEnabled) { wrapperContained.setCheatsEnabled(cheatsEnabled); }
// public yarnwrap.world.gen.GeneratorOptions method_48714(boolean options) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.method_48714(options)); }
public java.lang.String getWorldName() { return wrapperContained.getWorldName(); }
public void setSeed(java.lang.String seed) { wrapperContained.setSeed(seed); }
public void setGenerateStructures(boolean generateStructures) { wrapperContained.setGenerateStructures(generateStructures); }
// public yarnwrap.world.gen.GeneratorOptions method_48718(boolean options) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.method_48718(options)); }
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