package yarnwrap.world.updater;
public class WorldUpdater { public net.minecraft.world.updater.WorldUpdater wrapperContained; public WorldUpdater(net.minecraft.world.updater.WorldUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern REGION_FILE_PATTERN() { return wrapperContained.REGION_FILE_PATTERN; }
// public void REGION_FILE_PATTERN(java.util.regex.Pattern value) { wrapperContained.REGION_FILE_PATTERN = value; }
// public static java.util.regex.Pattern REGION_FILE_PATTERN() { return net.minecraft.world.updater.WorldUpdater.REGION_FILE_PATTERN; }
// public static void REGION_FILE_PATTERN(java.util.regex.Pattern value, ) { net.minecraft.world.updater.WorldUpdater.REGION_FILE_PATTERN = value; }

// public boolean eraseCache() { return wrapperContained.eraseCache; }
// public void eraseCache(boolean value) { wrapperContained.eraseCache = value; }
// public static boolean eraseCache() { return net.minecraft.world.updater.WorldUpdater.eraseCache; }
// public static void eraseCache(boolean value, ) { net.minecraft.world.updater.WorldUpdater.eraseCache = value; }

// public Object session() { return wrapperContained.session; }
// // public void session(Object value) { wrapperContained.session = value; }
// // public static Object session() { return net.minecraft.world.updater.WorldUpdater.session; }
// // public static void session(Object value, ) { net.minecraft.world.updater.WorldUpdater.session = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.world.updater.WorldUpdater.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.world.updater.WorldUpdater.dataFixer = value; }

// public yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(wrapperContained.dimensionOptionsRegistry); }
// public void dimensionOptionsRegistry(yarnwrap.registry.Registry value) { wrapperContained.dimensionOptionsRegistry = value.wrapperContained; }
// public static yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(net.minecraft.world.updater.WorldUpdater.dimensionOptionsRegistry); }
// public static void dimensionOptionsRegistry(yarnwrap.registry.Registry value, ) { net.minecraft.world.updater.WorldUpdater.dimensionOptionsRegistry = value.wrapperContained; }

// public java.util.Set worldKeys() { return wrapperContained.worldKeys; }
// public void worldKeys(java.util.Set value) { wrapperContained.worldKeys = value; }
// public static java.util.Set worldKeys() { return net.minecraft.world.updater.WorldUpdater.worldKeys; }
// public static void worldKeys(java.util.Set value, ) { net.minecraft.world.updater.WorldUpdater.worldKeys = value; }

// public java.lang.String NEW_PREFIX() { return wrapperContained.NEW_PREFIX; }
// public void NEW_PREFIX(java.lang.String value) { wrapperContained.NEW_PREFIX = value; }
// public static java.lang.String NEW_PREFIX() { return net.minecraft.world.updater.WorldUpdater.NEW_PREFIX; }
// public static void NEW_PREFIX(java.lang.String value, ) { net.minecraft.world.updater.WorldUpdater.NEW_PREFIX = value; }

// public yarnwrap.text.MutableText UPGRADING_POI_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_POI_TEXT); }
// public void UPGRADING_POI_TEXT(yarnwrap.text.MutableText value) { wrapperContained.UPGRADING_POI_TEXT = value.wrapperContained; }
// public static yarnwrap.text.MutableText UPGRADING_POI_TEXT() { return new yarnwrap.text.MutableText(net.minecraft.world.updater.WorldUpdater.UPGRADING_POI_TEXT); }
// public static void UPGRADING_POI_TEXT(yarnwrap.text.MutableText value, ) { net.minecraft.world.updater.WorldUpdater.UPGRADING_POI_TEXT = value.wrapperContained; }

// public yarnwrap.text.MutableText FINISHED_POI_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_POI_TEXT); }
// public void FINISHED_POI_TEXT(yarnwrap.text.MutableText value) { wrapperContained.FINISHED_POI_TEXT = value.wrapperContained; }
// public static yarnwrap.text.MutableText FINISHED_POI_TEXT() { return new yarnwrap.text.MutableText(net.minecraft.world.updater.WorldUpdater.FINISHED_POI_TEXT); }
// public static void FINISHED_POI_TEXT(yarnwrap.text.MutableText value, ) { net.minecraft.world.updater.WorldUpdater.FINISHED_POI_TEXT = value.wrapperContained; }

// public yarnwrap.text.MutableText UPGRADING_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_ENTITIES_TEXT); }
// public void UPGRADING_ENTITIES_TEXT(yarnwrap.text.MutableText value) { wrapperContained.UPGRADING_ENTITIES_TEXT = value.wrapperContained; }
// public static yarnwrap.text.MutableText UPGRADING_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(net.minecraft.world.updater.WorldUpdater.UPGRADING_ENTITIES_TEXT); }
// public static void UPGRADING_ENTITIES_TEXT(yarnwrap.text.MutableText value, ) { net.minecraft.world.updater.WorldUpdater.UPGRADING_ENTITIES_TEXT = value.wrapperContained; }

// public yarnwrap.text.MutableText FINISHED_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_ENTITIES_TEXT); }
// public void FINISHED_ENTITIES_TEXT(yarnwrap.text.MutableText value) { wrapperContained.FINISHED_ENTITIES_TEXT = value.wrapperContained; }
// public static yarnwrap.text.MutableText FINISHED_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(net.minecraft.world.updater.WorldUpdater.FINISHED_ENTITIES_TEXT); }
// public static void FINISHED_ENTITIES_TEXT(yarnwrap.text.MutableText value, ) { net.minecraft.world.updater.WorldUpdater.FINISHED_ENTITIES_TEXT = value.wrapperContained; }

// public yarnwrap.text.MutableText UPGRADING_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_CHUNKS_TEXT); }
// public void UPGRADING_CHUNKS_TEXT(yarnwrap.text.MutableText value) { wrapperContained.UPGRADING_CHUNKS_TEXT = value.wrapperContained; }
// public static yarnwrap.text.MutableText UPGRADING_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(net.minecraft.world.updater.WorldUpdater.UPGRADING_CHUNKS_TEXT); }
// public static void UPGRADING_CHUNKS_TEXT(yarnwrap.text.MutableText value, ) { net.minecraft.world.updater.WorldUpdater.UPGRADING_CHUNKS_TEXT = value.wrapperContained; }

// public yarnwrap.text.MutableText FINISHED_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_CHUNKS_TEXT); }
// public void FINISHED_CHUNKS_TEXT(yarnwrap.text.MutableText value) { wrapperContained.FINISHED_CHUNKS_TEXT = value.wrapperContained; }
// public static yarnwrap.text.MutableText FINISHED_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(net.minecraft.world.updater.WorldUpdater.FINISHED_CHUNKS_TEXT); }
// public static void FINISHED_CHUNKS_TEXT(yarnwrap.text.MutableText value, ) { net.minecraft.world.updater.WorldUpdater.FINISHED_CHUNKS_TEXT = value.wrapperContained; }

// public boolean recreateRegionFiles() { return wrapperContained.recreateRegionFiles; }
// public void recreateRegionFiles(boolean value) { wrapperContained.recreateRegionFiles = value; }
// public static boolean recreateRegionFiles() { return net.minecraft.world.updater.WorldUpdater.recreateRegionFiles; }
// public static void recreateRegionFiles(boolean value, ) { net.minecraft.world.updater.WorldUpdater.recreateRegionFiles = value; }

// public int totalRegionCount() { return wrapperContained.totalRegionCount; }
// public void totalRegionCount(int value) { wrapperContained.totalRegionCount = value; }
// public static int totalRegionCount() { return net.minecraft.world.updater.WorldUpdater.totalRegionCount; }
// public static void totalRegionCount(int value, ) { net.minecraft.world.updater.WorldUpdater.totalRegionCount = value; }

// public yarnwrap.world.PersistentStateManager persistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.persistentStateManager); }
// public void persistentStateManager(yarnwrap.world.PersistentStateManager value) { wrapperContained.persistentStateManager = value.wrapperContained; }
// public static yarnwrap.world.PersistentStateManager persistentStateManager() { return new yarnwrap.world.PersistentStateManager(net.minecraft.world.updater.WorldUpdater.persistentStateManager); }
// public static void persistentStateManager(yarnwrap.world.PersistentStateManager value, ) { net.minecraft.world.updater.WorldUpdater.persistentStateManager = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.updater.WorldUpdater.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.updater.WorldUpdater.LOGGER = value; }

// public java.util.concurrent.ThreadFactory UPDATE_THREAD_FACTORY() { return wrapperContained.UPDATE_THREAD_FACTORY; }
// public void UPDATE_THREAD_FACTORY(java.util.concurrent.ThreadFactory value) { wrapperContained.UPDATE_THREAD_FACTORY = value; }
// public static java.util.concurrent.ThreadFactory UPDATE_THREAD_FACTORY() { return net.minecraft.world.updater.WorldUpdater.UPDATE_THREAD_FACTORY; }
// public static void UPDATE_THREAD_FACTORY(java.util.concurrent.ThreadFactory value, ) { net.minecraft.world.updater.WorldUpdater.UPDATE_THREAD_FACTORY = value; }

// public boolean done() { return wrapperContained.done; }
// public void done(boolean value) { wrapperContained.done = value; }
// public static boolean done() { return net.minecraft.world.updater.WorldUpdater.done; }
// public static void done(boolean value, ) { net.minecraft.world.updater.WorldUpdater.done = value; }

// public boolean keepUpgradingChunks() { return wrapperContained.keepUpgradingChunks; }
// public void keepUpgradingChunks(boolean value) { wrapperContained.keepUpgradingChunks = value; }
// public static boolean keepUpgradingChunks() { return net.minecraft.world.updater.WorldUpdater.keepUpgradingChunks; }
// public static void keepUpgradingChunks(boolean value, ) { net.minecraft.world.updater.WorldUpdater.keepUpgradingChunks = value; }

// public it.unimi.dsi.fastutil.objects.Reference2FloatMap dimensionProgress() { return wrapperContained.dimensionProgress; }
// public void dimensionProgress(it.unimi.dsi.fastutil.objects.Reference2FloatMap value) { wrapperContained.dimensionProgress = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2FloatMap dimensionProgress() { return net.minecraft.world.updater.WorldUpdater.dimensionProgress; }
// public static void dimensionProgress(it.unimi.dsi.fastutil.objects.Reference2FloatMap value, ) { net.minecraft.world.updater.WorldUpdater.dimensionProgress = value; }

// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public static float progress() { return net.minecraft.world.updater.WorldUpdater.progress; }
// public static void progress(float value, ) { net.minecraft.world.updater.WorldUpdater.progress = value; }

// public int skippedChunkCount() { return wrapperContained.skippedChunkCount; }
// public void skippedChunkCount(int value) { wrapperContained.skippedChunkCount = value; }
// public static int skippedChunkCount() { return net.minecraft.world.updater.WorldUpdater.skippedChunkCount; }
// public static void skippedChunkCount(int value, ) { net.minecraft.world.updater.WorldUpdater.skippedChunkCount = value; }

// public yarnwrap.text.Text status() { return new yarnwrap.text.Text(wrapperContained.status); }
// public void status(yarnwrap.text.Text value) { wrapperContained.status = value.wrapperContained; }
// public static yarnwrap.text.Text status() { return new yarnwrap.text.Text(net.minecraft.world.updater.WorldUpdater.status); }
// public static void status(yarnwrap.text.Text value, ) { net.minecraft.world.updater.WorldUpdater.status = value.wrapperContained; }

// public int upgradedChunkCount() { return wrapperContained.upgradedChunkCount; }
// public void upgradedChunkCount(int value) { wrapperContained.upgradedChunkCount = value; }
// public static int upgradedChunkCount() { return net.minecraft.world.updater.WorldUpdater.upgradedChunkCount; }
// public static void upgradedChunkCount(int value, ) { net.minecraft.world.updater.WorldUpdater.upgradedChunkCount = value; }

// public java.lang.Thread updateThread() { return wrapperContained.updateThread; }
// public void updateThread(java.lang.Thread value) { wrapperContained.updateThread = value; }
// public static java.lang.Thread updateThread() { return net.minecraft.world.updater.WorldUpdater.updateThread; }
// public static void updateThread(java.lang.Thread value, ) { net.minecraft.world.updater.WorldUpdater.updateThread = value; }

// public int totalChunkCount() { return wrapperContained.totalChunkCount; }
// public void totalChunkCount(int value) { wrapperContained.totalChunkCount = value; }
// public static int totalChunkCount() { return net.minecraft.world.updater.WorldUpdater.totalChunkCount; }
// public static void totalChunkCount(int value, ) { net.minecraft.world.updater.WorldUpdater.totalChunkCount = value; }

// public WorldUpdater(Object session,com.mojang.datafixers.DataFixer dataFixer,yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,boolean eraseCache,boolean recreateRegionFiles) { this.wrapperContained = new net.minecraft.world.updater.WorldUpdater(session,dataFixer,dynamicRegistryManager.wrapperContained,eraseCache,recreateRegionFiles); }
public java.util.Set getWorlds() { return wrapperContained.getWorlds(); }
// public static java.util.Set getWorlds() { return net.minecraft.world.updater.WorldUpdater.getWorlds(); }
public float getProgress(yarnwrap.registry.RegistryKey world) { return wrapperContained.getProgress(world.wrapperContained); }
// public static float getProgress(yarnwrap.registry.RegistryKey world, ) { return net.minecraft.world.updater.WorldUpdater.getProgress(world.wrapperContained); }
public yarnwrap.text.Text getStatus() { return new yarnwrap.text.Text(wrapperContained.getStatus()); }
// public static yarnwrap.text.Text getStatus() { return new yarnwrap.text.Text(net.minecraft.world.updater.WorldUpdater.getStatus()); }
public int getTotalChunkCount() { return wrapperContained.getTotalChunkCount(); }
// public static int getTotalChunkCount() { return net.minecraft.world.updater.WorldUpdater.getTotalChunkCount(); }
// public void method_5398(java.lang.Thread thread,java.lang.Throwable throwable) { wrapperContained.method_5398(thread,throwable); }
// public static void method_5398(java.lang.Thread thread,java.lang.Throwable throwable, ) { net.minecraft.world.updater.WorldUpdater.method_5398(thread,throwable); }
public int getSkippedChunkCount() { return wrapperContained.getSkippedChunkCount(); }
// public static int getSkippedChunkCount() { return net.minecraft.world.updater.WorldUpdater.getSkippedChunkCount(); }
public int getUpgradedChunkCount() { return wrapperContained.getUpgradedChunkCount(); }
// public static int getUpgradedChunkCount() { return net.minecraft.world.updater.WorldUpdater.getUpgradedChunkCount(); }
public float getProgress() { return wrapperContained.getProgress(); }
// public static float getProgress() { return net.minecraft.world.updater.WorldUpdater.getProgress(); }
public void cancel() { wrapperContained.cancel(); }
// public static void cancel() { net.minecraft.world.updater.WorldUpdater.cancel(); }
public boolean isDone() { return wrapperContained.isDone(); }
// public static boolean isDone() { return net.minecraft.world.updater.WorldUpdater.isDone(); }
// public void updateWorld() { wrapperContained.updateWorld(); }
// public static void updateWorld() { net.minecraft.world.updater.WorldUpdater.updateWorld(); }
// public java.nio.file.Path getNewDirectoryPath(java.nio.file.Path current) { return wrapperContained.getNewDirectoryPath(current); }
// public static java.nio.file.Path getNewDirectoryPath(java.nio.file.Path current, ) { return net.minecraft.world.updater.WorldUpdater.getNewDirectoryPath(current); }

}