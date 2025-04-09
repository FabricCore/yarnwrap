package yarnwrap.client.realms;
public class FileDownload { public net.minecraft.client.realms.FileDownload wrapperContained; public FileDownload(net.minecraft.client.realms.FileDownload wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean cancelled() { return wrapperContained.cancelled; }
// public boolean finished() { return wrapperContained.finished; }
// public boolean error() { return wrapperContained.error; }
// public boolean extracting() { return wrapperContained.extracting; }
// public java.io.File resourcePackPath() { return wrapperContained.resourcePackPath; }
// public java.lang.Thread currentThread() { return wrapperContained.currentThread; }
// public org.apache.http.client.config.RequestConfig requestConfig() { return wrapperContained.requestConfig; }
// public java.lang.String[] INVALID_FILE_NAMES() { return wrapperContained.INVALID_FILE_NAMES; }
// public java.io.File backupFile() { return wrapperContained.backupFile; }
// public org.apache.http.client.methods.HttpGet httpRequest() { return wrapperContained.httpRequest; }
public void cancel() { wrapperContained.cancel(); }
public long contentLength(java.lang.String downloadLink) { return wrapperContained.contentLength(downloadLink); }
// public void untarGzipArchive(java.lang.String name,java.io.File archive,yarnwrap.world.level.storage.LevelStorage storage) { wrapperContained.untarGzipArchive(name,archive,storage.wrapperContained); }
public boolean isFinished() { return wrapperContained.isFinished(); }
public java.lang.String findAvailableFolderName(java.lang.String folder) { return wrapperContained.findAvailableFolderName(folder); }
public boolean isError() { return wrapperContained.isError(); }
public boolean isExtracting() { return wrapperContained.isExtracting(); }
// public void downloadWorld(yarnwrap.client.realms.dto.WorldDownload download,java.lang.String message,Object status,yarnwrap.world.level.storage.LevelStorage storage) { wrapperContained.downloadWorld(download.wrapperContained,message,status,storage.wrapperContained); }

}