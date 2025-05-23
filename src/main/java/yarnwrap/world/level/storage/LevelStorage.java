package yarnwrap.world.level.storage;
public class LevelStorage { public net.minecraft.world.level.storage.LevelStorage wrapperContained; public LevelStorage(net.minecraft.world.level.storage.LevelStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.format.DateTimeFormatter TIME_FORMATTER() { return wrapperContained.TIME_FORMATTER; }
// public void TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.TIME_FORMATTER = value; }
// public static java.time.format.DateTimeFormatter TIME_FORMATTER() { return net.minecraft.world.level.storage.LevelStorage.TIME_FORMATTER; }
// public static void TIME_FORMATTER(java.time.format.DateTimeFormatter value, ) { net.minecraft.world.level.storage.LevelStorage.TIME_FORMATTER = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.level.storage.LevelStorage.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.level.storage.LevelStorage.LOGGER = value; }

// public java.nio.file.Path savesDirectory() { return wrapperContained.savesDirectory; }
// public void savesDirectory(java.nio.file.Path value) { wrapperContained.savesDirectory = value; }
// public static java.nio.file.Path savesDirectory() { return net.minecraft.world.level.storage.LevelStorage.savesDirectory; }
// public static void savesDirectory(java.nio.file.Path value, ) { net.minecraft.world.level.storage.LevelStorage.savesDirectory = value; }

// public java.nio.file.Path backupsDirectory() { return wrapperContained.backupsDirectory; }
// public void backupsDirectory(java.nio.file.Path value) { wrapperContained.backupsDirectory = value; }
// public static java.nio.file.Path backupsDirectory() { return net.minecraft.world.level.storage.LevelStorage.backupsDirectory; }
// public static void backupsDirectory(java.nio.file.Path value, ) { net.minecraft.world.level.storage.LevelStorage.backupsDirectory = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.world.level.storage.LevelStorage.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.world.level.storage.LevelStorage.dataFixer = value; }

// public java.lang.String DATA_KEY() { return wrapperContained.DATA_KEY; }
// public void DATA_KEY(java.lang.String value) { wrapperContained.DATA_KEY = value; }
public static java.lang.String DATA_KEY() { return net.minecraft.world.level.storage.LevelStorage.DATA_KEY; }
// public static void DATA_KEY(java.lang.String value, ) { net.minecraft.world.level.storage.LevelStorage.DATA_KEY = value; }

// public java.lang.String ALLOWED_SYMLINKS_FILE_NAME() { return wrapperContained.ALLOWED_SYMLINKS_FILE_NAME; }
// public void ALLOWED_SYMLINKS_FILE_NAME(java.lang.String value) { wrapperContained.ALLOWED_SYMLINKS_FILE_NAME = value; }
public static java.lang.String ALLOWED_SYMLINKS_FILE_NAME() { return net.minecraft.world.level.storage.LevelStorage.ALLOWED_SYMLINKS_FILE_NAME; }
// public static void ALLOWED_SYMLINKS_FILE_NAME(java.lang.String value, ) { net.minecraft.world.level.storage.LevelStorage.ALLOWED_SYMLINKS_FILE_NAME = value; }

// public java.nio.file.PathMatcher DEFAULT_ALLOWED_SYMLINK_MATCHER() { return wrapperContained.DEFAULT_ALLOWED_SYMLINK_MATCHER; }
// public void DEFAULT_ALLOWED_SYMLINK_MATCHER(java.nio.file.PathMatcher value) { wrapperContained.DEFAULT_ALLOWED_SYMLINK_MATCHER = value; }
// public static java.nio.file.PathMatcher DEFAULT_ALLOWED_SYMLINK_MATCHER() { return net.minecraft.world.level.storage.LevelStorage.DEFAULT_ALLOWED_SYMLINK_MATCHER; }
// public static void DEFAULT_ALLOWED_SYMLINK_MATCHER(java.nio.file.PathMatcher value, ) { net.minecraft.world.level.storage.LevelStorage.DEFAULT_ALLOWED_SYMLINK_MATCHER = value; }

// public yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.symlinkFinder); }
// public void symlinkFinder(yarnwrap.util.path.SymlinkFinder value) { wrapperContained.symlinkFinder = value.wrapperContained; }
// public static yarnwrap.util.path.SymlinkFinder symlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(net.minecraft.world.level.storage.LevelStorage.symlinkFinder); }
// public static void symlinkFinder(yarnwrap.util.path.SymlinkFinder value, ) { net.minecraft.world.level.storage.LevelStorage.symlinkFinder = value.wrapperContained; }

// public int MAX_LEVEL_DATA_SIZE() { return wrapperContained.MAX_LEVEL_DATA_SIZE; }
// public void MAX_LEVEL_DATA_SIZE(int value) { wrapperContained.MAX_LEVEL_DATA_SIZE = value; }
// public static int MAX_LEVEL_DATA_SIZE() { return net.minecraft.world.level.storage.LevelStorage.MAX_LEVEL_DATA_SIZE; }
// public static void MAX_LEVEL_DATA_SIZE(int value, ) { net.minecraft.world.level.storage.LevelStorage.MAX_LEVEL_DATA_SIZE = value; }

// public int RECOMMENDED_USABLE_SPACE_BYTES() { return wrapperContained.RECOMMENDED_USABLE_SPACE_BYTES; }
// public void RECOMMENDED_USABLE_SPACE_BYTES(int value) { wrapperContained.RECOMMENDED_USABLE_SPACE_BYTES = value; }
// public static int RECOMMENDED_USABLE_SPACE_BYTES() { return net.minecraft.world.level.storage.LevelStorage.RECOMMENDED_USABLE_SPACE_BYTES; }
// public static void RECOMMENDED_USABLE_SPACE_BYTES(int value, ) { net.minecraft.world.level.storage.LevelStorage.RECOMMENDED_USABLE_SPACE_BYTES = value; }

public LevelStorage(java.nio.file.Path savesDirectory,java.nio.file.Path backupsDirectory,yarnwrap.util.path.SymlinkFinder symlinkFinder,com.mojang.datafixers.DataFixer dataFixer) { this.wrapperContained = new net.minecraft.world.level.storage.LevelStorage(savesDirectory,backupsDirectory,symlinkFinder.wrapperContained,dataFixer); }
public boolean levelExists(java.lang.String name) { return wrapperContained.levelExists(name); }
// public static boolean levelExists(java.lang.String name, ) { return net.minecraft.world.level.storage.LevelStorage.levelExists(name); }
public Object getLevelList() { return wrapperContained.getLevelList(); }
// public static Object getLevelList() { return net.minecraft.world.level.storage.LevelStorage.getLevelList(); }
public java.nio.file.Path getBackupsDirectory() { return wrapperContained.getBackupsDirectory(); }
// public static java.nio.file.Path getBackupsDirectory() { return net.minecraft.world.level.storage.LevelStorage.getBackupsDirectory(); }
public boolean isLevelNameValid(java.lang.String name) { return wrapperContained.isLevelNameValid(name); }
// public static boolean isLevelNameValid(java.lang.String name, ) { return net.minecraft.world.level.storage.LevelStorage.isLevelNameValid(name); }
// public int getCurrentVersion() { return wrapperContained.getCurrentVersion(); }
// public static int getCurrentVersion() { return net.minecraft.world.level.storage.LevelStorage.getCurrentVersion(); }
public java.nio.file.Path getSavesDirectory() { return wrapperContained.getSavesDirectory(); }
// public static java.nio.file.Path getSavesDirectory() { return net.minecraft.world.level.storage.LevelStorage.getSavesDirectory(); }
// public yarnwrap.world.level.storage.LevelStorage create(java.nio.file.Path path) { return new yarnwrap.world.level.storage.LevelStorage(wrapperContained.create(path)); }
// public static yarnwrap.world.level.storage.LevelStorage create(java.nio.file.Path path, ) { return new yarnwrap.world.level.storage.LevelStorage(net.minecraft.world.level.storage.LevelStorage.create(path)); }
// public Object createSessionWithoutSymlinkCheck(java.lang.String directoryName) { return wrapperContained.createSessionWithoutSymlinkCheck(directoryName); }
// public static Object createSessionWithoutSymlinkCheck(java.lang.String directoryName, ) { return net.minecraft.world.level.storage.LevelStorage.createSessionWithoutSymlinkCheck(directoryName); }
// public yarnwrap.resource.DataConfiguration parseDataPackSettings(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.resource.DataConfiguration(wrapperContained.parseDataPackSettings(dynamic)); }
// public static yarnwrap.resource.DataConfiguration parseDataPackSettings(com.mojang.serialization.Dynamic dynamic, ) { return new yarnwrap.resource.DataConfiguration(net.minecraft.world.level.storage.LevelStorage.parseDataPackSettings(dynamic)); }
public java.lang.String getFormatName() { return wrapperContained.getFormatName(); }
// public static java.lang.String getFormatName() { return net.minecraft.world.level.storage.LevelStorage.getFormatName(); }
// public yarnwrap.nbt.NbtElement loadCompactLevelData(java.nio.file.Path path) { return new yarnwrap.nbt.NbtElement(wrapperContained.loadCompactLevelData(path)); }
// public static yarnwrap.nbt.NbtElement loadCompactLevelData(java.nio.file.Path path, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.world.level.storage.LevelStorage.loadCompactLevelData(path)); }
// public java.util.concurrent.CompletableFuture loadSummaries(Object levels) { return wrapperContained.loadSummaries(levels); }
// public static java.util.concurrent.CompletableFuture loadSummaries(Object levels, ) { return net.minecraft.world.level.storage.LevelStorage.loadSummaries(levels); }
// public boolean method_43419(Object levelSave) { return wrapperContained.method_43419(levelSave); }
// public static boolean method_43419(Object levelSave, ) { return net.minecraft.world.level.storage.LevelStorage.method_43419(levelSave); }
// public boolean method_43420(java.nio.file.Path path) { return wrapperContained.method_43420(path); }
// public static boolean method_43420(java.nio.file.Path path, ) { return net.minecraft.world.level.storage.LevelStorage.method_43420(path); }
// public java.util.List method_43495(java.util.List summaries) { return wrapperContained.method_43495(summaries); }
// public static java.util.List method_43495(java.util.List summaries, ) { return net.minecraft.world.level.storage.LevelStorage.method_43495(summaries); }
// public void method_45551(yarnwrap.util.Identifier id) { wrapperContained.method_45551(id.wrapperContained); }
// public static void method_45551(yarnwrap.util.Identifier id, ) { net.minecraft.world.level.storage.LevelStorage.method_45551(id.wrapperContained); }
// public yarnwrap.resource.featuretoggle.FeatureSet parseEnabledFeatures(com.mojang.serialization.Dynamic levelData) { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.parseEnabledFeatures(levelData)); }
// public static yarnwrap.resource.featuretoggle.FeatureSet parseEnabledFeatures(com.mojang.serialization.Dynamic levelData, ) { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.world.level.storage.LevelStorage.parseEnabledFeatures(levelData)); }
// public java.util.stream.Stream method_45553(com.mojang.serialization.Dynamic featureFlag) { return wrapperContained.method_45553(featureFlag); }
// public static java.util.stream.Stream method_45553(com.mojang.serialization.Dynamic featureFlag, ) { return net.minecraft.world.level.storage.LevelStorage.method_45553(featureFlag); }
// public yarnwrap.util.path.SymlinkFinder createSymlinkFinder(java.nio.file.Path allowedSymlinksFile) { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.createSymlinkFinder(allowedSymlinksFile)); }
// public static yarnwrap.util.path.SymlinkFinder createSymlinkFinder(java.nio.file.Path allowedSymlinksFile, ) { return new yarnwrap.util.path.SymlinkFinder(net.minecraft.world.level.storage.LevelStorage.createSymlinkFinder(allowedSymlinksFile)); }
// public Object createSession(java.lang.String directoryName) { return wrapperContained.createSession(directoryName); }
// public static Object createSession(java.lang.String directoryName, ) { return net.minecraft.world.level.storage.LevelStorage.createSession(directoryName); }
public yarnwrap.util.path.SymlinkFinder getSymlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(wrapperContained.getSymlinkFinder()); }
// public static yarnwrap.util.path.SymlinkFinder getSymlinkFinder() { return new yarnwrap.util.path.SymlinkFinder(net.minecraft.world.level.storage.LevelStorage.getSymlinkFinder()); }
public java.nio.file.Path resolve(java.lang.String name) { return wrapperContained.resolve(name); }
// public static java.nio.file.Path resolve(java.lang.String name, ) { return net.minecraft.world.level.storage.LevelStorage.resolve(name); }
// public boolean method_52616(java.nio.file.Path path) { return wrapperContained.method_52616(path); }
// public static boolean method_52616(java.nio.file.Path path, ) { return net.minecraft.world.level.storage.LevelStorage.method_52616(path); }
// public Object parseDataPacks(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.ResourcePackManager dataPackManager,boolean safeMode) { return wrapperContained.parseDataPacks(dynamic,dataPackManager.wrapperContained,safeMode); }
// public static Object parseDataPacks(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.ResourcePackManager dataPackManager,boolean safeMode, ) { return net.minecraft.world.level.storage.LevelStorage.parseDataPacks(dynamic,dataPackManager.wrapperContained,safeMode); }
// public yarnwrap.world.level.storage.ParsedSaveProperties parseSaveProperties(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.DataConfiguration dataConfiguration,yarnwrap.registry.Registry dimensionsRegistry,Object registries) { return new yarnwrap.world.level.storage.ParsedSaveProperties(wrapperContained.parseSaveProperties(dynamic,dataConfiguration.wrapperContained,dimensionsRegistry.wrapperContained,registries)); }
// public static yarnwrap.world.level.storage.ParsedSaveProperties parseSaveProperties(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.DataConfiguration dataConfiguration,yarnwrap.registry.Registry dimensionsRegistry,Object registries, ) { return new yarnwrap.world.level.storage.ParsedSaveProperties(net.minecraft.world.level.storage.LevelStorage.parseSaveProperties(dynamic,dataConfiguration.wrapperContained,dimensionsRegistry.wrapperContained,registries)); }
// public yarnwrap.world.level.storage.LevelSummary parseSummary(com.mojang.serialization.Dynamic dynamic,Object save,boolean locked) { return new yarnwrap.world.level.storage.LevelSummary(wrapperContained.parseSummary(dynamic,save,locked)); }
// public static yarnwrap.world.level.storage.LevelSummary parseSummary(com.mojang.serialization.Dynamic dynamic,Object save,boolean locked, ) { return new yarnwrap.world.level.storage.LevelSummary(net.minecraft.world.level.storage.LevelStorage.parseSummary(dynamic,save,locked)); }
// public long getLastModifiedTime(Object save) { return wrapperContained.getLastModifiedTime(save); }
// public static long getLastModifiedTime(Object save, ) { return net.minecraft.world.level.storage.LevelStorage.getLastModifiedTime(save); }
// public yarnwrap.world.level.storage.LevelSummary readSummary(Object save,boolean locked) { return new yarnwrap.world.level.storage.LevelSummary(wrapperContained.readSummary(save,locked)); }
// public static yarnwrap.world.level.storage.LevelSummary readSummary(Object save,boolean locked, ) { return new yarnwrap.world.level.storage.LevelSummary(net.minecraft.world.level.storage.LevelStorage.readSummary(save,locked)); }
// public com.mojang.serialization.Dynamic readLevelProperties(java.nio.file.Path path,com.mojang.datafixers.DataFixer dataFixer) { return wrapperContained.readLevelProperties(path,dataFixer); }
// public static com.mojang.serialization.Dynamic readLevelProperties(java.nio.file.Path path,com.mojang.datafixers.DataFixer dataFixer, ) { return net.minecraft.world.level.storage.LevelStorage.readLevelProperties(path,dataFixer); }
// public yarnwrap.nbt.NbtCompound readLevelProperties(java.nio.file.Path path) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readLevelProperties(path)); }
// public static yarnwrap.nbt.NbtCompound readLevelProperties(java.nio.file.Path path, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.level.storage.LevelStorage.readLevelProperties(path)); }
// public java.time.Instant getLastModifiedTime(java.nio.file.Path path) { return wrapperContained.getLastModifiedTime(path); }
// public static java.time.Instant getLastModifiedTime(java.nio.file.Path path, ) { return net.minecraft.world.level.storage.LevelStorage.getLastModifiedTime(path); }

}