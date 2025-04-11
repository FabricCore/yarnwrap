package yarnwrap.client.realms;
public class FileUpload { public net.minecraft.client.realms.FileUpload wrapperContained; public FileUpload(net.minecraft.client.realms.FileUpload wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.io.File file() { return wrapperContained.file; }
// public void file(java.io.File value) { wrapperContained.file = value; }
// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public int slotId() { return wrapperContained.slotId; }
// public void slotId(int value) { wrapperContained.slotId = value; }
// public yarnwrap.client.realms.dto.UploadInfo uploadInfo() { return new yarnwrap.client.realms.dto.UploadInfo(wrapperContained.uploadInfo); }
// public void uploadInfo(yarnwrap.client.realms.dto.UploadInfo value) { wrapperContained.uploadInfo = value.wrapperContained; }
// public java.lang.String sessionId() { return wrapperContained.sessionId; }
// public void sessionId(java.lang.String value) { wrapperContained.sessionId = value; }
// public java.lang.String username() { return wrapperContained.username; }
// public void username(java.lang.String value) { wrapperContained.username = value; }
// public java.lang.String clientVersion() { return wrapperContained.clientVersion; }
// public void clientVersion(java.lang.String value) { wrapperContained.clientVersion = value; }
// public yarnwrap.client.realms.UploadStatus uploadStatus() { return new yarnwrap.client.realms.UploadStatus(wrapperContained.uploadStatus); }
// public void uploadStatus(yarnwrap.client.realms.UploadStatus value) { wrapperContained.uploadStatus = value.wrapperContained; }
// public java.util.concurrent.atomic.AtomicBoolean cancelled() { return wrapperContained.cancelled; }
// public void cancelled(java.util.concurrent.atomic.AtomicBoolean value) { wrapperContained.cancelled = value; }
// public java.util.concurrent.CompletableFuture uploadTask() { return wrapperContained.uploadTask; }
// public void uploadTask(java.util.concurrent.CompletableFuture value) { wrapperContained.uploadTask = value; }
// public org.apache.http.client.config.RequestConfig requestConfig() { return wrapperContained.requestConfig; }
// public void requestConfig(org.apache.http.client.config.RequestConfig value) { wrapperContained.requestConfig = value; }
// public int MAX_ATTEMPTS() { return wrapperContained.MAX_ATTEMPTS; }
// public void MAX_ATTEMPTS(int value) { wrapperContained.MAX_ATTEMPTS = value; }
// public java.lang.String UPLOAD_ENDPOINT() { return wrapperContained.UPLOAD_ENDPOINT; }
// public void UPLOAD_ENDPOINT(java.lang.String value) { wrapperContained.UPLOAD_ENDPOINT = value; }
// public java.lang.String worldVersion() { return wrapperContained.worldVersion; }
// public void worldVersion(java.lang.String value) { wrapperContained.worldVersion = value; }
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