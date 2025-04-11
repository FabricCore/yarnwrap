package yarnwrap.world.updater;
public class WorldUpdater { public net.minecraft.world.updater.WorldUpdater wrapperContained; public WorldUpdater(net.minecraft.world.updater.WorldUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern REGION_FILE_PATTERN() { return wrapperContained.REGION_FILE_PATTERN; }
// public void REGION_FILE_PATTERN(java.util.regex.Pattern value) { wrapperContained.REGION_FILE_PATTERN = value; }
// public boolean eraseCache() { return wrapperContained.eraseCache; }
// public void eraseCache(boolean value) { wrapperContained.eraseCache = value; }
// public Object session() { return wrapperContained.session; }
// // public void session(Object value) { wrapperContained.session = value; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(wrapperContained.dimensionOptionsRegistry); }
// public void dimensionOptionsRegistry(yarnwrap.registry.Registry value) { wrapperContained.dimensionOptionsRegistry = value.wrapperContained; }
// public java.util.Set worldKeys() { return wrapperContained.worldKeys; }
// public void worldKeys(java.util.Set value) { wrapperContained.worldKeys = value; }
// public java.lang.String NEW_PREFIX() { return wrapperContained.NEW_PREFIX; }
// public void NEW_PREFIX(java.lang.String value) { wrapperContained.NEW_PREFIX = value; }
// public yarnwrap.text.MutableText UPGRADING_POI_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_POI_TEXT); }
// public void UPGRADING_POI_TEXT(yarnwrap.text.MutableText value) { wrapperContained.UPGRADING_POI_TEXT = value.wrapperContained; }
// public yarnwrap.text.MutableText FINISHED_POI_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_POI_TEXT); }
// public void FINISHED_POI_TEXT(yarnwrap.text.MutableText value) { wrapperContained.FINISHED_POI_TEXT = value.wrapperContained; }
// public yarnwrap.text.MutableText UPGRADING_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_ENTITIES_TEXT); }
// public void UPGRADING_ENTITIES_TEXT(yarnwrap.text.MutableText value) { wrapperContained.UPGRADING_ENTITIES_TEXT = value.wrapperContained; }
// public yarnwrap.text.MutableText FINISHED_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_ENTITIES_TEXT); }
// public void FINISHED_ENTITIES_TEXT(yarnwrap.text.MutableText value) { wrapperContained.FINISHED_ENTITIES_TEXT = value.wrapperContained; }
// public yarnwrap.text.MutableText UPGRADING_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_CHUNKS_TEXT); }
// public void UPGRADING_CHUNKS_TEXT(yarnwrap.text.MutableText value) { wrapperContained.UPGRADING_CHUNKS_TEXT = value.wrapperContained; }
// public yarnwrap.text.MutableText FINISHED_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_CHUNKS_TEXT); }
// public void FINISHED_CHUNKS_TEXT(yarnwrap.text.MutableText value) { wrapperContained.FINISHED_CHUNKS_TEXT = value.wrapperContained; }
// public boolean recreateRegionFiles() { return wrapperContained.recreateRegionFiles; }
// public void recreateRegionFiles(boolean value) { wrapperContained.recreateRegionFiles = value; }
// public int totalRegionCount() { return wrapperContained.totalRegionCount; }
// public void totalRegionCount(int value) { wrapperContained.totalRegionCount = value; }
// public yarnwrap.world.PersistentStateManager persistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.persistentStateManager); }
// public void persistentStateManager(yarnwrap.world.PersistentStateManager value) { wrapperContained.persistentStateManager = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.ThreadFactory UPDATE_THREAD_FACTORY() { return wrapperContained.UPDATE_THREAD_FACTORY; }
// public void UPDATE_THREAD_FACTORY(java.util.concurrent.ThreadFactory value) { wrapperContained.UPDATE_THREAD_FACTORY = value; }
// public boolean done() { return wrapperContained.done; }
// public void done(boolean value) { wrapperContained.done = value; }
// public boolean keepUpgradingChunks() { return wrapperContained.keepUpgradingChunks; }
// public void keepUpgradingChunks(boolean value) { wrapperContained.keepUpgradingChunks = value; }
// public it.unimi.dsi.fastutil.objects.Reference2FloatMap dimensionProgress() { return wrapperContained.dimensionProgress; }
// public void dimensionProgress(it.unimi.dsi.fastutil.objects.Reference2FloatMap value) { wrapperContained.dimensionProgress = value; }
// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public int skippedChunkCount() { return wrapperContained.skippedChunkCount; }
// public void skippedChunkCount(int value) { wrapperContained.skippedChunkCount = value; }
// public yarnwrap.text.Text status() { return new yarnwrap.text.Text(wrapperContained.status); }
// public void status(yarnwrap.text.Text value) { wrapperContained.status = value.wrapperContained; }
// public int upgradedChunkCount() { return wrapperContained.upgradedChunkCount; }
// public void upgradedChunkCount(int value) { wrapperContained.upgradedChunkCount = value; }
// public java.lang.Thread updateThread() { return wrapperContained.updateThread; }
// public void updateThread(java.lang.Thread value) { wrapperContained.updateThread = value; }
// public int totalChunkCount() { return wrapperContained.totalChunkCount; }
// public void totalChunkCount(int value) { wrapperContained.totalChunkCount = value; }
public java.util.Set getWorlds() { return wrapperContained.getWorlds(); }
public float getProgress(yarnwrap.registry.RegistryKey world) { return wrapperContained.getProgress(world.wrapperContained); }
public yarnwrap.text.Text getStatus() { return new yarnwrap.text.Text(wrapperContained.getStatus()); }
public int getTotalChunkCount() { return wrapperContained.getTotalChunkCount(); }
public int getSkippedChunkCount() { return wrapperContained.getSkippedChunkCount(); }
public int getUpgradedChunkCount() { return wrapperContained.getUpgradedChunkCount(); }
public float getProgress() { return wrapperContained.getProgress(); }
public void cancel() { wrapperContained.cancel(); }
public boolean isDone() { return wrapperContained.isDone(); }
// public void updateWorld() { wrapperContained.updateWorld(); }
// public java.nio.file.Path getNewDirectoryPath(java.nio.file.Path current) { return wrapperContained.getNewDirectoryPath(current); }

}