package yarnwrap.client.realms;
public class FileUpload { public net.minecraft.client.realms.FileUpload wrapperContained; public FileUpload(net.minecraft.client.realms.FileUpload wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.io.File file() { return wrapperContained.file; }
// public long worldId() { return wrapperContained.worldId; }
// public int slotId() { return wrapperContained.slotId; }
// public yarnwrap.client.realms.dto.UploadInfo uploadInfo() { return new yarnwrap.client.realms.dto.UploadInfo(wrapperContained.uploadInfo); }
// public java.lang.String sessionId() { return wrapperContained.sessionId; }
// public java.lang.String username() { return wrapperContained.username; }
// public java.lang.String clientVersion() { return wrapperContained.clientVersion; }
// public yarnwrap.client.realms.UploadStatus uploadStatus() { return new yarnwrap.client.realms.UploadStatus(wrapperContained.uploadStatus); }
// public java.util.concurrent.atomic.AtomicBoolean cancelled() { return wrapperContained.cancelled; }
// public java.util.concurrent.CompletableFuture uploadTask() { return wrapperContained.uploadTask; }
// public org.apache.http.client.config.RequestConfig requestConfig() { return wrapperContained.requestConfig; }
// public int MAX_ATTEMPTS() { return wrapperContained.MAX_ATTEMPTS; }
// public java.lang.String UPLOAD_ENDPOINT() { return wrapperContained.UPLOAD_ENDPOINT; }
// public java.lang.String worldVersion() { return wrapperContained.worldVersion; }
public void cancel() { wrapperContained.cancel(); }
// public yarnwrap.client.realms.gui.screen.UploadResult requestUpload(int currentAttempt) { return new yarnwrap.client.realms.gui.screen.UploadResult(wrapperContained.requestUpload(currentAttempt)); }
// public boolean shouldRetry(long retryDelaySeconds,int currentAttempt) { return wrapperContained.shouldRetry(retryDelaySeconds,currentAttempt); }
public void upload(java.util.function.Consumer callback) { wrapperContained.upload(callback); }
// public long getRetryDelaySeconds(org.apache.http.HttpResponse response) { return wrapperContained.getRetryDelaySeconds(response); }
// public void handleResponse(org.apache.http.HttpResponse response,Object uploadResultBuilder) { wrapperContained.handleResponse(response,uploadResultBuilder); }
// public void setupRequest(org.apache.http.client.methods.HttpPost request) { wrapperContained.setupRequest(request); }
// public void cleanup(org.apache.http.client.methods.HttpPost request,org.apache.http.impl.client.CloseableHttpClient client) { wrapperContained.cleanup(request,client); }
public boolean isFinished() { return wrapperContained.isFinished(); }
// public yarnwrap.client.realms.gui.screen.UploadResult retryUploadAfter(long retryDelaySeconds,int currentAttempt) { return new yarnwrap.client.realms.gui.screen.UploadResult(wrapperContained.retryUploadAfter(retryDelaySeconds,currentAttempt)); }

}