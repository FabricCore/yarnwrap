package yarnwrap.client.realms.exception.upload;
public class TooBigRealmsUploadException { public net.minecraft.client.realms.exception.upload.TooBigRealmsUploadException wrapperContained; public TooBigRealmsUploadException(net.minecraft.client.realms.exception.upload.TooBigRealmsUploadException wrapperContained) { this.wrapperContained = wrapperContained; }

// public long maxSizeInBytes() { return wrapperContained.maxSizeInBytes; }
// public void maxSizeInBytes(long value) { wrapperContained.maxSizeInBytes = value; }
// public static long maxSizeInBytes() { return net.minecraft.client.realms.exception.upload.TooBigRealmsUploadException.maxSizeInBytes; }
// public static void maxSizeInBytes(long value, ) { net.minecraft.client.realms.exception.upload.TooBigRealmsUploadException.maxSizeInBytes = value; }

public TooBigRealmsUploadException(long maxSizeInBytes) { this.wrapperContained = new net.minecraft.client.realms.exception.upload.TooBigRealmsUploadException(maxSizeInBytes); }

}