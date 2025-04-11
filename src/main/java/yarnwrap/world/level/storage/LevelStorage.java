package yarnwrap.world.level.storage;
public class LevelStorage { public net.minecraft.world.level.storage.LevelStorage wrapperContained; public LevelStorage(net.minecraft.world.level.storage.LevelStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.nio.file.Path savesDirectory() { return wrapperContained.savesDirectory; }
// public void savesDirectory(java.nio.file.Path value) { wrapperContained.savesDirectory = value; }
// public java.nio.file.Path backupsDirectory() { return wrapperContained.backupsDirectory; }
// public void backupsDirectory(java.nio.file.Path value) { wrapperContained.backupsDirectory = value; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public java.time.format.DateTimeFormatter TIME_FORMATTER() { return wrapperContained.TIME_FORMATTER; }
// public void TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.TIME_FORMATTER = value; }
// public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
// public void DATA_KEY(java.lang.String value) { wrapperContained.DATA_KEY = value; }
public java.lang.String ALLOWED_SYMLINKS_FILE_NAME() { return wrapperContained.ALLOWED_SYMLINKS_FILE_NAME; }
// public void ALLOWED_SYMLINKS_FILE_NAME(java.lang.String value) { wrapperContained.ALLOWED_SYMLINKS_FILE_NAME = value; }
// public java.nio.file.PathMatcher DEFAULT_ALLOWED_SYMLINK_MATCHER() { return wrapperContained.DEFAULT_ALLOWED_SYMLINK_MATCHER; }
// public void DEFAULT_ALLOWED_SYMLINK_MATCHER(java.nio.file.PathMatcher value) { wrapperContained.DEFAULT_ALLOWED_SYMLINK_MATCHER = value; }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public int MAX_LEVEL_DATA_SIZE() { return wrapperContained.MAX_LEVEL_DATA_SIZE; }
// public void MAX_LEVEL_DATA_SIZE(int value) { wrapperContained.MAX_LEVEL_DATA_SIZE = value; }
// public int RECOMMENDED_USABLE_SPACE_BYTES() { return wrapperContained.RECOMMENDED_USABLE_SPACE_BYTES; }
// public void RECOMMENDED_USABLE_SPACE_BYTES(int value) { wrapperContained.RECOMMENDED_USABLE_SPACE_BYTES = value; }
public LevelStorage(java.nio.file.Path savesDirectory,java.nio.file.Path backupsDirectory,yarnwrap.util.path.SymlinkFinder symlinkFinder,com.mojang.datafixers.DataFixer dataFixer) { this.wrapperContained = new net.minecraft.world.level.storage.LevelStorage(savesDirectory,backupsDirectory,symlinkFinder.wrapperContained,dataFixer); }
// public int getCurrentVersion() { return wrapperContained.getCurrentVersion(); }
public java.nio.file.Path getSavesDirectory() { return wrapperContained.getSavesDirectory(); }
public boolean levelExists(java.lang.String name) { return wrapperContained.levelExists(name); }
public Object getLevelList() { return wrapperContained.getLevelList(); }
public java.nio.file.Path getBackupsDirectory() { return wrapperContained.getBackupsDirectory(); }
public boolean isLevelNameValid(java.lang.String name) { return wrapperContained.isLevelNameValid(name); }
public yarnwrap.world.level.storage.LevelStorage create(java.nio.file.Path path) { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.create(path)); }
// public Object createSessionWithoutSymlinkCheck(java.lang.String directoryName) { return wrapperContained.createSessionWithoutSymlinkCheck(directoryName); }
public yarnwrap.resource.DataConfiguration parseDataPackSettings(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.resource.DataConfiguration(wrapperContained.parseDataPackSettings(dynamic)); }
public java.lang.String getFormatName() { return wrapperContained.getFormatName(); }
// public yarnwrap.nbt.NbtElement loadCompactLevelData(java.nio.file.Path path) { return new yarnwrap.nbt.NbtElement(wrapperContained.loadCompactLevelData(path)); }
// public java.util.concurrent.CompletableFuture loadSummaries(Object levels) { return wrapperContained.loadSummaries(levels); }
// public boolean method_43419(Object levelSave) { return wrapperContained.method_43419(levelSave); }
// public boolean method_43420(java.nio.file.Path path) { return wrapperContained.method_43420(path); }
// public java.util.List method_43495(java.util.List summaries) { return wrapperContained.method_43495(summaries); }
// public void method_45551(yarnwrap.util.Identifier id) { wrapperContained.method_45551(id.wrapperContained); }
// public yarnwrap.resource.featuretoggle.FeatureSet parseEnabledFeatures(com.mojang.serialization.Dynamic levelData) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.parseEnabledFeatures(levelData)); }
// public java.util.stream.Stream method_45553(com.mojang.serialization.Dynamic featureFlag) { return wrapperContained.method_45553(featureFlag); }
public yarnwrap.util.path.SymlinkFinder createSymlinkFinder(java.nio.file.Path allowedSymlinksFile) { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.createSymlinkFinder(allowedSymlinksFile)); }
// public Object createSession(java.lang.String directoryName) { return wrapperContained.createSession(directoryName); }
public yarnwrap.util.path.SymlinkFinder getSymlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.getSymlinkFinder()); }
public java.nio.file.Path resolve(java.lang.String name) { return wrapperContained.resolve(name); }
// public boolean method_52616(java.nio.file.Path path) { return wrapperContained.method_52616(path); }
public Object parseDataPacks(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.ResourcePackManager dataPackManager,boolean safeMode) { return wrapperContained.parseDataPacks(dynamic,dataPackManager.wrapperContained,safeMode); }
// public yarnwrap.world.level.storage.ParsedSaveProperties parseSaveProperties(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.DataConfiguration dataConfiguration,yarnwrap.registry.Registry dimensionsRegistry,Object registryManager) { return new yarnwrap.world.level.storage.ParsedSaveProperties(wrapperContained.parseSaveProperties(dynamic,dataConfiguration.wrapperContained,dimensionsRegistry.wrapperContained,registryManager)); }
// public yarnwrap.world.level.storage.LevelSummary parseSummary(com.mojang.serialization.Dynamic dynamic,Object save,boolean locked) { return new yarnwrap.world.level.storage.LevelSummary(wrapperContained.parseSummary(dynamic,save,locked)); }
// public long getLastModifiedTime(Object save) { return wrapperContained.getLastModifiedTime(save); }
// public yarnwrap.world.level.storage.LevelSummary readSummary(Object save,boolean locked) { return new yarnwrap.world.level.storage.LevelSummary(wrapperContained.readSummary(save,locked)); }
// public com.mojang.serialization.Dynamic readLevelProperties(java.nio.file.Path path,com.mojang.datafixers.DataFixer dataFixer) { return wrapperContained.readLevelProperties(path,dataFixer); }
// public yarnwrap.nbt.NbtCompound readLevelProperties(java.nio.file.Path path) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readLevelProperties(path)); }
// public java.time.Instant getLastModifiedTime(java.nio.file.Path path) { return wrapperContained.getLastModifiedTime(path); }

}