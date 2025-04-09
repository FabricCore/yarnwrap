package yarnwrap.world.level.storage;
public class LevelStorage { public net.minecraft.world.level.storage.LevelStorage wrapperContained; public LevelStorage(net.minecraft.world.level.storage.LevelStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.nio.file.Path savesDirectory() { return wrapperContained.savesDirectory; }
// public java.nio.file.Path backupsDirectory() { return wrapperContained.backupsDirectory; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public java.time.format.DateTimeFormatter TIME_FORMATTER() { return wrapperContained.TIME_FORMATTER; }
// public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
public java.lang.String ALLOWED_SYMLINKS_FILE_NAME() { return wrapperContained.ALLOWED_SYMLINKS_FILE_NAME; }
// public java.nio.file.PathMatcher DEFAULT_ALLOWED_SYMLINK_MATCHER() { return wrapperContained.DEFAULT_ALLOWED_SYMLINK_MATCHER; }
// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public int MAX_LEVEL_DATA_SIZE() { return wrapperContained.MAX_LEVEL_DATA_SIZE; }
// public int RECOMMENDED_USABLE_SPACE_BYTES() { return wrapperContained.RECOMMENDED_USABLE_SPACE_BYTES; }
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
// public yarnwrap.resource.featuretoggle.FeatureSet parseEnabledFeatures(com.mojang.serialization.Dynamic levelData) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.parseEnabledFeatures(levelData)); }
public yarnwrap.util.path.SymlinkFinder createSymlinkFinder(java.nio.file.Path allowedSymlinksFile) { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.createSymlinkFinder(allowedSymlinksFile)); }
// public Object createSession(java.lang.String directoryName) { return wrapperContained.createSession(directoryName); }
public yarnwrap.util.path.SymlinkFinder getSymlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.getSymlinkFinder()); }
public java.nio.file.Path resolve(java.lang.String name) { return wrapperContained.resolve(name); }
public Object parseDataPacks(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.ResourcePackManager dataPackManager,boolean safeMode) { return wrapperContained.parseDataPacks(dynamic,dataPackManager.wrapperContained,safeMode); }
// public yarnwrap.world.level.storage.ParsedSaveProperties parseSaveProperties(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.DataConfiguration dataConfiguration,yarnwrap.registry.Registry dimensionsRegistry,Object registryManager) { return new yarnwrap.world.level.storage.ParsedSaveProperties(wrapperContained.parseSaveProperties(dynamic,dataConfiguration.wrapperContained,dimensionsRegistry.wrapperContained,registryManager)); }
// public yarnwrap.world.level.storage.LevelSummary parseSummary(com.mojang.serialization.Dynamic dynamic,Object save,boolean locked) { return new yarnwrap.world.level.storage.LevelSummary(wrapperContained.parseSummary(dynamic,save,locked)); }
// public long getLastModifiedTime(Object save) { return wrapperContained.getLastModifiedTime(save); }
// public yarnwrap.world.level.storage.LevelSummary readSummary(Object save,boolean locked) { return new yarnwrap.world.level.storage.LevelSummary(wrapperContained.readSummary(save,locked)); }
// public com.mojang.serialization.Dynamic readLevelProperties(java.nio.file.Path path,com.mojang.datafixers.DataFixer dataFixer) { return wrapperContained.readLevelProperties(path,dataFixer); }
// public yarnwrap.nbt.NbtCompound readLevelProperties(java.nio.file.Path path) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readLevelProperties(path)); }
// public java.time.Instant getLastModifiedTime(java.nio.file.Path path) { return wrapperContained.getLastModifiedTime(path); }

}