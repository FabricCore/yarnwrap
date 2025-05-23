package yarnwrap.client.realms.util;
public class UploadProgress { public net.minecraft.client.realms.util.UploadProgress wrapperContained; public UploadProgress(net.minecraft.client.realms.util.UploadProgress wrapperContained) { this.wrapperContained = wrapperContained; }

// public long bytesWritten() { return wrapperContained.bytesWritten; }
// public void bytesWritten(long value) { wrapperContained.bytesWritten = value; }
// public static long bytesWritten() { return net.minecraft.client.realms.util.UploadProgress.bytesWritten; }
// public static void bytesWritten(long value, ) { net.minecraft.client.realms.util.UploadProgress.bytesWritten = value; }

// public long totalBytes() { return wrapperContained.totalBytes; }
// public void totalBytes(long value) { wrapperContained.totalBytes = value; }
// public static long totalBytes() { return net.minecraft.client.realms.util.UploadProgress.totalBytes; }
// public static void totalBytes(long value, ) { net.minecraft.client.realms.util.UploadProgress.totalBytes = value; }

// public long startTimeMs() { return wrapperContained.startTimeMs; }
// public void startTimeMs(long value) { wrapperContained.startTimeMs = value; }
// public static long startTimeMs() { return net.minecraft.client.realms.util.UploadProgress.startTimeMs; }
// public static void startTimeMs(long value, ) { net.minecraft.client.realms.util.UploadProgress.startTimeMs = value; }

// public long lastBytesWritten() { return wrapperContained.lastBytesWritten; }
// public void lastBytesWritten(long value) { wrapperContained.lastBytesWritten = value; }
// public static long lastBytesWritten() { return net.minecraft.client.realms.util.UploadProgress.lastBytesWritten; }
// public static void lastBytesWritten(long value, ) { net.minecraft.client.realms.util.UploadProgress.lastBytesWritten = value; }

// public long bytesPerSecond() { return wrapperContained.bytesPerSecond; }
// public void bytesPerSecond(long value) { wrapperContained.bytesPerSecond = value; }
// public static long bytesPerSecond() { return net.minecraft.client.realms.util.UploadProgress.bytesPerSecond; }
// public static void bytesPerSecond(long value, ) { net.minecraft.client.realms.util.UploadProgress.bytesPerSecond = value; }

public long getTotalBytes() { return wrapperContained.getTotalBytes(); }
// public static long getTotalBytes() { return net.minecraft.client.realms.util.UploadProgress.getTotalBytes(); }
public void setTotalBytes(long totalBytes) { wrapperContained.setTotalBytes(totalBytes); }
// public static void setTotalBytes(long totalBytes, ) { net.minecraft.client.realms.util.UploadProgress.setTotalBytes(totalBytes); }
public long getBytesWritten() { return wrapperContained.getBytesWritten(); }
// public static long getBytesWritten() { return net.minecraft.client.realms.util.UploadProgress.getBytesWritten(); }
public void addBytesWritten(long bytesWritten) { wrapperContained.addBytesWritten(bytesWritten); }
// public static void addBytesWritten(long bytesWritten, ) { net.minecraft.client.realms.util.UploadProgress.addBytesWritten(bytesWritten); }
public boolean hasWrittenBytes() { return wrapperContained.hasWrittenBytes(); }
// public static boolean hasWrittenBytes() { return net.minecraft.client.realms.util.UploadProgress.hasWrittenBytes(); }
public boolean hasWrittenAllBytes() { return wrapperContained.hasWrittenAllBytes(); }
// public static boolean hasWrittenAllBytes() { return net.minecraft.client.realms.util.UploadProgress.hasWrittenAllBytes(); }
public double getFractionBytesWritten() { return wrapperContained.getFractionBytesWritten(); }
// public static double getFractionBytesWritten() { return net.minecraft.client.realms.util.UploadProgress.getFractionBytesWritten(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.realms.util.UploadProgress.tick(); }
public long getBytesPerSecond() { return wrapperContained.getBytesPerSecond(); }
// public static long getBytesPerSecond() { return net.minecraft.client.realms.util.UploadProgress.getBytesPerSecond(); }

}