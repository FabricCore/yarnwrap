package yarnwrap.client.realms;
public class FileDownload { public net.minecraft.client.realms.FileDownload wrapperContained; public FileDownload(net.minecraft.client.realms.FileDownload wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.FileDownload.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.FileDownload.LOGGER = value; }

// public boolean cancelled() { return wrapperContained.cancelled; }
// public void cancelled(boolean value) { wrapperContained.cancelled = value; }
// public static boolean cancelled() { return net.minecraft.client.realms.FileDownload.cancelled; }
// public static void cancelled(boolean value, ) { net.minecraft.client.realms.FileDownload.cancelled = value; }

// public boolean finished() { return wrapperContained.finished; }
// public void finished(boolean value) { wrapperContained.finished = value; }
// public static boolean finished() { return net.minecraft.client.realms.FileDownload.finished; }
// public static void finished(boolean value, ) { net.minecraft.client.realms.FileDownload.finished = value; }

// public boolean error() { return wrapperContained.error; }
// public void error(boolean value) { wrapperContained.error = value; }
// public static boolean error() { return net.minecraft.client.realms.FileDownload.error; }
// public static void error(boolean value, ) { net.minecraft.client.realms.FileDownload.error = value; }

// public boolean extracting() { return wrapperContained.extracting; }
// public void extracting(boolean value) { wrapperContained.extracting = value; }
// public static boolean extracting() { return net.minecraft.client.realms.FileDownload.extracting; }
// public static void extracting(boolean value, ) { net.minecraft.client.realms.FileDownload.extracting = value; }

// public java.io.File resourcePackPath() { return wrapperContained.resourcePackPath; }
// public void resourcePackPath(java.io.File value) { wrapperContained.resourcePackPath = value; }
// public static java.io.File resourcePackPath() { return net.minecraft.client.realms.FileDownload.resourcePackPath; }
// public static void resourcePackPath(java.io.File value, ) { net.minecraft.client.realms.FileDownload.resourcePackPath = value; }

// public java.lang.Thread currentThread() { return wrapperContained.currentThread; }
// public void currentThread(java.lang.Thread value) { wrapperContained.currentThread = value; }
// public static java.lang.Thread currentThread() { return net.minecraft.client.realms.FileDownload.currentThread; }
// public static void currentThread(java.lang.Thread value, ) { net.minecraft.client.realms.FileDownload.currentThread = value; }

// public org.apache.http.client.config.RequestConfig requestConfig() { return wrapperContained.requestConfig; }
// public void requestConfig(org.apache.http.client.config.RequestConfig value) { wrapperContained.requestConfig = value; }
// public static org.apache.http.client.config.RequestConfig requestConfig() { return net.minecraft.client.realms.FileDownload.requestConfig; }
// public static void requestConfig(org.apache.http.client.config.RequestConfig value, ) { net.minecraft.client.realms.FileDownload.requestConfig = value; }

// public java.lang.String[] INVALID_FILE_NAMES() { return wrapperContained.INVALID_FILE_NAMES; }
// public void INVALID_FILE_NAMES(java.lang.String[] value) { wrapperContained.INVALID_FILE_NAMES = value; }
// public static java.lang.String[] INVALID_FILE_NAMES() { return net.minecraft.client.realms.FileDownload.INVALID_FILE_NAMES; }
// public static void INVALID_FILE_NAMES(java.lang.String[] value, ) { net.minecraft.client.realms.FileDownload.INVALID_FILE_NAMES = value; }

// public java.io.File backupFile() { return wrapperContained.backupFile; }
// public void backupFile(java.io.File value) { wrapperContained.backupFile = value; }
// public static java.io.File backupFile() { return net.minecraft.client.realms.FileDownload.backupFile; }
// public static void backupFile(java.io.File value, ) { net.minecraft.client.realms.FileDownload.backupFile = value; }

// public org.apache.http.client.methods.HttpGet httpRequest() { return wrapperContained.httpRequest; }
// public void httpRequest(org.apache.http.client.methods.HttpGet value) { wrapperContained.httpRequest = value; }
// public static org.apache.http.client.methods.HttpGet httpRequest() { return net.minecraft.client.realms.FileDownload.httpRequest; }
// public static void httpRequest(org.apache.http.client.methods.HttpGet value, ) { net.minecraft.client.realms.FileDownload.httpRequest = value; }

public void cancel() { wrapperContained.cancel(); }
// public static void cancel() { net.minecraft.client.realms.FileDownload.cancel(); }
public long contentLength(java.lang.String downloadLink) { return wrapperContained.contentLength(downloadLink); }
// public static long contentLength(java.lang.String downloadLink, ) { return net.minecraft.client.realms.FileDownload.contentLength(downloadLink); }
// public void untarGzipArchive(java.lang.String name,java.io.File archive,yarnwrap.world.level.storage.LevelStorage storage) { wrapperContained.untarGzipArchive(name,archive,storage.wrapperContained); }
// public static void untarGzipArchive(java.lang.String name,java.io.File archive,yarnwrap.world.level.storage.LevelStorage storage, ) { net.minecraft.client.realms.FileDownload.untarGzipArchive(name,archive,storage.wrapperContained); }
public boolean isFinished() { return wrapperContained.isFinished(); }
// public static boolean isFinished() { return net.minecraft.client.realms.FileDownload.isFinished(); }
// public java.lang.String findAvailableFolderName(java.lang.String folder) { return wrapperContained.findAvailableFolderName(folder); }
// public static java.lang.String findAvailableFolderName(java.lang.String folder, ) { return net.minecraft.client.realms.FileDownload.findAvailableFolderName(folder); }
public boolean isError() { return wrapperContained.isError(); }
// public static boolean isError() { return net.minecraft.client.realms.FileDownload.isError(); }
public boolean isExtracting() { return wrapperContained.isExtracting(); }
// public static boolean isExtracting() { return net.minecraft.client.realms.FileDownload.isExtracting(); }
// public void downloadWorld(yarnwrap.client.realms.dto.WorldDownload download,java.lang.String message,Object status,yarnwrap.world.level.storage.LevelStorage storage) { wrapperContained.downloadWorld(download.wrapperContained,message,status,storage.wrapperContained); }
// public static void downloadWorld(yarnwrap.client.realms.dto.WorldDownload download,java.lang.String message,Object status,yarnwrap.world.level.storage.LevelStorage storage, ) { net.minecraft.client.realms.FileDownload.downloadWorld(download.wrapperContained,message,status,storage.wrapperContained); }

}