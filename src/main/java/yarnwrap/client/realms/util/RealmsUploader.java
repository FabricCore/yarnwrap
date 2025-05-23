package yarnwrap.client.realms.util;
public class RealmsUploader { public net.minecraft.client.realms.util.RealmsUploader wrapperContained; public RealmsUploader(net.minecraft.client.realms.util.RealmsUploader wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_ATTEMPTS() { return wrapperContained.MAX_ATTEMPTS; }
// public void MAX_ATTEMPTS(int value) { wrapperContained.MAX_ATTEMPTS = value; }
public static int MAX_ATTEMPTS() { return net.minecraft.client.realms.util.RealmsUploader.MAX_ATTEMPTS; }
// public static void MAX_ATTEMPTS(int value, ) { net.minecraft.client.realms.util.RealmsUploader.MAX_ATTEMPTS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.util.RealmsUploader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.util.RealmsUploader.LOGGER = value; }

// public yarnwrap.client.realms.RealmsClient client() { return new yarnwrap.client.realms.RealmsClient(wrapperContained.client); }
// public void client(yarnwrap.client.realms.RealmsClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.realms.RealmsClient client() { return new yarnwrap.client.realms.RealmsClient(net.minecraft.client.realms.util.RealmsUploader.client); }
// public static void client(yarnwrap.client.realms.RealmsClient value, ) { net.minecraft.client.realms.util.RealmsUploader.client = value.wrapperContained; }

// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public void directory(java.nio.file.Path value) { wrapperContained.directory = value; }
// public static java.nio.file.Path directory() { return net.minecraft.client.realms.util.RealmsUploader.directory; }
// public static void directory(java.nio.file.Path value, ) { net.minecraft.client.realms.util.RealmsUploader.directory = value; }

// public yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(wrapperContained.session); }
// public void session(yarnwrap.client.session.Session value) { wrapperContained.session = value.wrapperContained; }
// public static yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(net.minecraft.client.realms.util.RealmsUploader.session); }
// public static void session(yarnwrap.client.session.Session value, ) { net.minecraft.client.realms.util.RealmsUploader.session = value.wrapperContained; }

// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public static long worldId() { return net.minecraft.client.realms.util.RealmsUploader.worldId; }
// public static void worldId(long value, ) { net.minecraft.client.realms.util.RealmsUploader.worldId = value; }

// public yarnwrap.client.realms.util.UploadProgressTracker progressTracker() { return new yarnwrap.client.realms.util.UploadProgressTracker(wrapperContained.progressTracker); }
// public void progressTracker(yarnwrap.client.realms.util.UploadProgressTracker value) { wrapperContained.progressTracker = value.wrapperContained; }
// public static yarnwrap.client.realms.util.UploadProgressTracker progressTracker() { return new yarnwrap.client.realms.util.UploadProgressTracker(net.minecraft.client.realms.util.RealmsUploader.progressTracker); }
// public static void progressTracker(yarnwrap.client.realms.util.UploadProgressTracker value, ) { net.minecraft.client.realms.util.RealmsUploader.progressTracker = value.wrapperContained; }

// public boolean cancelled() { return wrapperContained.cancelled; }
// public void cancelled(boolean value) { wrapperContained.cancelled = value; }
// public static boolean cancelled() { return net.minecraft.client.realms.util.RealmsUploader.cancelled; }
// public static void cancelled(boolean value, ) { net.minecraft.client.realms.util.RealmsUploader.cancelled = value; }

// public yarnwrap.client.realms.FileUpload upload() { return new yarnwrap.client.realms.FileUpload(wrapperContained.upload); }
// public void upload(yarnwrap.client.realms.FileUpload value) { wrapperContained.upload = value.wrapperContained; }
// public static yarnwrap.client.realms.FileUpload upload() { return new yarnwrap.client.realms.FileUpload(net.minecraft.client.realms.util.RealmsUploader.upload); }
// public static void upload(yarnwrap.client.realms.FileUpload value, ) { net.minecraft.client.realms.util.RealmsUploader.upload = value.wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsSlot options() { return new yarnwrap.client.realms.dto.RealmsSlot(wrapperContained.options); }
// public void options(yarnwrap.client.realms.dto.RealmsSlot value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.client.realms.dto.RealmsSlot options() { return new yarnwrap.client.realms.dto.RealmsSlot(net.minecraft.client.realms.util.RealmsUploader.options); }
// public static void options(yarnwrap.client.realms.dto.RealmsSlot value, ) { net.minecraft.client.realms.util.RealmsUploader.options = value.wrapperContained; }

// public RealmsUploader(java.nio.file.Path directory,yarnwrap.client.realms.dto.RealmsSlot options,yarnwrap.client.session.Session session,long worldId,yarnwrap.client.realms.util.UploadProgressTracker progressTracker) { this.wrapperContained = new net.minecraft.client.realms.util.RealmsUploader(directory,options.wrapperContained,session.wrapperContained,worldId,progressTracker.wrapperContained); }
// public java.util.concurrent.CompletableFuture upload() { return wrapperContained.upload(); }
// // public static java.util.concurrent.CompletableFuture upload() { return net.minecraft.client.realms.util.RealmsUploader.upload(); }
public void cancel() { wrapperContained.cancel(); }
// public static void cancel() { net.minecraft.client.realms.util.RealmsUploader.cancel(); }
// public yarnwrap.client.realms.dto.UploadInfo uploadSync() { return new yarnwrap.client.realms.dto.UploadInfo(wrapperContained.uploadSync()); }
// public static yarnwrap.client.realms.dto.UploadInfo uploadSync() { return new yarnwrap.client.realms.dto.UploadInfo(net.minecraft.client.realms.util.RealmsUploader.uploadSync()); }

}