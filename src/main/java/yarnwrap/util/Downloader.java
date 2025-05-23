package yarnwrap.util;
public class Downloader { public net.minecraft.util.Downloader wrapperContained; public Downloader(net.minecraft.util.Downloader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.Downloader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.Downloader.LOGGER = value; }

// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public void directory(java.nio.file.Path value) { wrapperContained.directory = value; }
// public static java.nio.file.Path directory() { return net.minecraft.util.Downloader.directory; }
// public static void directory(java.nio.file.Path value, ) { net.minecraft.util.Downloader.directory = value; }

// public yarnwrap.util.logging.LogWriter logWriter() { return new yarnwrap.util.logging.LogWriter(wrapperContained.logWriter); }
// public void logWriter(yarnwrap.util.logging.LogWriter value) { wrapperContained.logWriter = value.wrapperContained; }
// public static yarnwrap.util.logging.LogWriter logWriter() { return new yarnwrap.util.logging.LogWriter(net.minecraft.util.Downloader.logWriter); }
// public static void logWriter(yarnwrap.util.logging.LogWriter value, ) { net.minecraft.util.Downloader.logWriter = value.wrapperContained; }

// public yarnwrap.util.thread.SimpleConsecutiveExecutor executor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.SimpleConsecutiveExecutor value) { wrapperContained.executor = value.wrapperContained; }
// public static yarnwrap.util.thread.SimpleConsecutiveExecutor executor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(net.minecraft.util.Downloader.executor); }
// public static void executor(yarnwrap.util.thread.SimpleConsecutiveExecutor value, ) { net.minecraft.util.Downloader.executor = value.wrapperContained; }

// public int MAX_RETAINED_CACHE_FILES() { return wrapperContained.MAX_RETAINED_CACHE_FILES; }
// public void MAX_RETAINED_CACHE_FILES(int value) { wrapperContained.MAX_RETAINED_CACHE_FILES = value; }
// public static int MAX_RETAINED_CACHE_FILES() { return net.minecraft.util.Downloader.MAX_RETAINED_CACHE_FILES; }
// public static void MAX_RETAINED_CACHE_FILES(int value, ) { net.minecraft.util.Downloader.MAX_RETAINED_CACHE_FILES = value; }

// public Downloader(java.nio.file.Path directory) { this.wrapperContained = new net.minecraft.util.Downloader(directory); }
// public void method_55485(Object id,Object entry) { wrapperContained.method_55485(id,entry); }
// public static void method_55485(Object id,Object entry, ) { net.minecraft.util.Downloader.method_55485(id,entry); }
// public java.util.concurrent.CompletableFuture downloadAsync(Object config,java.util.Map entries) { return wrapperContained.downloadAsync(config,entries); }
// public static java.util.concurrent.CompletableFuture downloadAsync(Object config,java.util.Map entries, ) { return net.minecraft.util.Downloader.downloadAsync(config,entries); }
// public com.mojang.datafixers.util.Either getFileInfo(java.nio.file.Path path) { return wrapperContained.getFileInfo(path); }
// public static com.mojang.datafixers.util.Either getFileInfo(java.nio.file.Path path, ) { return net.minecraft.util.Downloader.getFileInfo(path); }
// public Object download(Object config,java.util.Map entries) { return wrapperContained.download(config,entries); }
// public static Object download(Object config,java.util.Map entries, ) { return net.minecraft.util.Downloader.download(config,entries); }

}