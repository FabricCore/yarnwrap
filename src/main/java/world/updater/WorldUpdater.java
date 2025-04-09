package yarnwrap.world.updater;
public class WorldUpdater { public net.minecraft.world.updater.WorldUpdater wrapperContained; public WorldUpdater(net.minecraft.world.updater.WorldUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern REGION_FILE_PATTERN() { return wrapperContained.REGION_FILE_PATTERN; }
// public boolean eraseCache() { return wrapperContained.eraseCache; }
// public Object session() { return wrapperContained.session; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public yarnwrap.registry.Registry dimensionOptionsRegistry() { return new yarnwrap.registry.Registry(wrapperContained.dimensionOptionsRegistry); }
// public java.util.Set worldKeys() { return wrapperContained.worldKeys; }
// public java.lang.String NEW_PREFIX() { return wrapperContained.NEW_PREFIX; }
// public yarnwrap.text.MutableText UPGRADING_POI_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_POI_TEXT); }
// public yarnwrap.text.MutableText FINISHED_POI_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_POI_TEXT); }
// public yarnwrap.text.MutableText UPGRADING_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_ENTITIES_TEXT); }
// public yarnwrap.text.MutableText FINISHED_ENTITIES_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_ENTITIES_TEXT); }
// public yarnwrap.text.MutableText UPGRADING_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.UPGRADING_CHUNKS_TEXT); }
// public yarnwrap.text.MutableText FINISHED_CHUNKS_TEXT() { return new yarnwrap.text.MutableText(wrapperContained.FINISHED_CHUNKS_TEXT); }
// public boolean recreateRegionFiles() { return wrapperContained.recreateRegionFiles; }
// public int totalRegionCount() { return wrapperContained.totalRegionCount; }
// public yarnwrap.world.PersistentStateManager persistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.persistentStateManager); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.concurrent.ThreadFactory UPDATE_THREAD_FACTORY() { return wrapperContained.UPDATE_THREAD_FACTORY; }
// public boolean done() { return wrapperContained.done; }
// public boolean keepUpgradingChunks() { return wrapperContained.keepUpgradingChunks; }
// public it.unimi.dsi.fastutil.objects.Reference2FloatMap dimensionProgress() { return wrapperContained.dimensionProgress; }
// public float progress() { return wrapperContained.progress; }
// public int skippedChunkCount() { return wrapperContained.skippedChunkCount; }
// public yarnwrap.text.Text status() { return new yarnwrap.text.Text(wrapperContained.status); }
// public int upgradedChunkCount() { return wrapperContained.upgradedChunkCount; }
// public java.lang.Thread updateThread() { return wrapperContained.updateThread; }
// public int totalChunkCount() { return wrapperContained.totalChunkCount; }
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