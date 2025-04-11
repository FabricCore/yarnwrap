package yarnwrap.client.realms;
public class FileDownload { public net.minecraft.client.realms.FileDownload wrapperContained; public FileDownload(net.minecraft.client.realms.FileDownload wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean cancelled() { return wrapperContained.cancelled; }
// public void cancelled(boolean value) { wrapperContained.cancelled = value; }
// public boolean finished() { return wrapperContained.finished; }
// public void finished(boolean value) { wrapperContained.finished = value; }
// public boolean error() { return wrapperContained.error; }
// public void error(boolean value) { wrapperContained.error = value; }
// public boolean extracting() { return wrapperContained.extracting; }
// public void extracting(boolean value) { wrapperContained.extracting = value; }
// public java.io.File resourcePackPath() { return wrapperContained.resourcePackPath; }
// public void resourcePackPath(java.io.File value) { wrapperContained.resourcePackPath = value; }
// public java.lang.Thread currentThread() { return wrapperContained.currentThread; }
// public void currentThread(java.lang.Thread value) { wrapperContained.currentThread = value; }
// public org.apache.http.client.config.RequestConfig requestConfig() { return wrapperContained.requestConfig; }
// public void requestConfig(org.apache.http.client.config.RequestConfig value) { wrapperContained.requestConfig = value; }
// public java.lang.String[] INVALID_FILE_NAMES() { return wrapperContained.INVALID_FILE_NAMES; }
// public void INVALID_FILE_NAMES(java.lang.String[] value) { wrapperContained.INVALID_FILE_NAMES = value; }
// public java.io.File backupFile() { return wrapperContained.backupFile; }
// public void backupFile(java.io.File value) { wrapperContained.backupFile = value; }
// public org.apache.http.client.methods.HttpGet httpRequest() { return wrapperContained.httpRequest; }
// public void httpRequest(org.apache.http.client.methods.HttpGet value) { wrapperContained.httpRequest = value; }
public void cancel() { wrapperContained.cancel(); }
public long contentLength(java.lang.String downloadLink) { return wrapperContained.contentLength(downloadLink); }
// public void untarGzipArchive(java.lang.String name,java.io.File archive,yarnwrap.world.level.storage.LevelStorage storage) { wrapperContained.untarGzipArchive(name,archive,storage.wrapperContained); }
public boolean isFinished() { return wrapperContained.isFinished(); }
public java.lang.String findAvailableFolderName(java.lang.String folder) { return wrapperContained.findAvailableFolderName(folder); }
public boolean isError() { return wrapperContained.isError(); }
public boolean isExtracting() { return wrapperContained.isExtracting(); }
// public void downloadWorld(yarnwrap.client.realms.dto.WorldDownload download,java.lang.String message,Object status,yarnwrap.world.level.storage.LevelStorage storage) { wrapperContained.downloadWorld(download.wrapperContained,message,status,storage.wrapperContained); }

}