package yarnwrap.client.realms.util;
public class UploadProgressTracker { public net.minecraft.client.realms.util.UploadProgressTracker wrapperContained; public UploadProgressTracker(net.minecraft.client.realms.util.UploadProgressTracker wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.realms.util.UploadProgress getUploadProgress() { return new yarnwrap.client.realms.util.UploadProgress(wrapperContained.getUploadProgress()); }
// public static yarnwrap.client.realms.util.UploadProgress getUploadProgress() { return new yarnwrap.client.realms.util.UploadProgress(net.minecraft.client.realms.util.UploadProgressTracker.getUploadProgress()); }
public void updateProgressDisplay() { wrapperContained.updateProgressDisplay(); }
// public static void updateProgressDisplay() { net.minecraft.client.realms.util.UploadProgressTracker.updateProgressDisplay(); }
// public yarnwrap.client.realms.util.UploadProgressTracker create() { return new yarnwrap.client.realms.util.UploadProgressTracker(wrapperContained.create()); }
public static yarnwrap.client.realms.util.UploadProgressTracker create() { return new yarnwrap.client.realms.util.UploadProgressTracker(net.minecraft.client.realms.util.UploadProgressTracker.create()); }

}