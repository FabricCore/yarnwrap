package yarnwrap.client.realms;
public class UploadStatus { public net.minecraft.client.realms.UploadStatus wrapperContained; public UploadStatus(net.minecraft.client.realms.UploadStatus wrapperContained) { this.wrapperContained = wrapperContained; }

public long bytesWritten() { return wrapperContained.bytesWritten; }
public long totalBytes() { return wrapperContained.totalBytes; }

}