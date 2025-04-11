package yarnwrap.util;
public class Downloader { public net.minecraft.util.Downloader wrapperContained; public Downloader(net.minecraft.util.Downloader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public void directory(java.nio.file.Path value) { wrapperContained.directory = value; }
// public yarnwrap.util.logging.LogWriter logWriter() { return new yarnwrap.util.logging.LogWriter(wrapperContained.logWriter); }
// public void logWriter(yarnwrap.util.logging.LogWriter value) { wrapperContained.logWriter = value.wrapperContained; }
// public yarnwrap.util.thread.TaskExecutor executor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.executor = value.wrapperContained; }
// public int MAX_RETAINED_CACHE_FILES() { return wrapperContained.MAX_RETAINED_CACHE_FILES; }
// public void MAX_RETAINED_CACHE_FILES(int value) { wrapperContained.MAX_RETAINED_CACHE_FILES = value; }
// public java.util.concurrent.CompletableFuture downloadAsync(Object config,java.util.Map entries) { return wrapperContained.downloadAsync(config,entries); }
// public com.mojang.datafixers.util.Either getFileInfo(java.nio.file.Path path) { return wrapperContained.getFileInfo(path); }
// public Object download(Object config,java.util.Map entries) { return wrapperContained.download(config,entries); }

}