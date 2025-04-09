package yarnwrap.util;
public class Downloader { public net.minecraft.util.Downloader wrapperContained; public Downloader(net.minecraft.util.Downloader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public yarnwrap.util.logging.LogWriter logWriter() { return new yarnwrap.util.logging.LogWriter(wrapperContained.logWriter); }
// public yarnwrap.util.thread.TaskExecutor executor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.executor); }
// public int MAX_RETAINED_CACHE_FILES() { return wrapperContained.MAX_RETAINED_CACHE_FILES; }
// public java.util.concurrent.CompletableFuture downloadAsync(Object config,java.util.Map entries) { return wrapperContained.downloadAsync(config,entries); }
// public com.mojang.datafixers.util.Either getFileInfo(java.nio.file.Path path) { return wrapperContained.getFileInfo(path); }
// public Object download(Object config,java.util.Map entries) { return wrapperContained.download(config,entries); }

}