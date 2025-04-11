package yarnwrap.client.realms.gui.screen;
public class RealmsUploadScreen { public net.minecraft.client.realms.gui.screen.RealmsUploadScreen wrapperContained; public RealmsUploadScreen(net.minecraft.client.realms.gui.screen.RealmsUploadScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.realms.gui.screen.RealmsCreateWorldScreen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.world.level.storage.LevelSummary selectedLevel() { return new yarnwrap.world.level.storage.LevelSummary(wrapperContained.selectedLevel); }
// public void selectedLevel(yarnwrap.world.level.storage.LevelSummary value) { wrapperContained.selectedLevel = value.wrapperContained; }
// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public int slotId() { return wrapperContained.slotId; }
// public void slotId(int value) { wrapperContained.slotId = value; }
// public yarnwrap.client.realms.UploadStatus uploadStatus() { return new yarnwrap.client.realms.UploadStatus(wrapperContained.uploadStatus); }
// public void uploadStatus(yarnwrap.client.realms.UploadStatus value) { wrapperContained.uploadStatus = value.wrapperContained; }
// public com.google.common.util.concurrent.RateLimiter narrationRateLimiter() { return wrapperContained.narrationRateLimiter; }
// public void narrationRateLimiter(com.google.common.util.concurrent.RateLimiter value) { wrapperContained.narrationRateLimiter = value; }
// public yarnwrap.text.Text status() { return new yarnwrap.text.Text(wrapperContained.status); }
// public void status(yarnwrap.text.Text value) { wrapperContained.status = value.wrapperContained; }
// public java.lang.String progress() { return wrapperContained.progress; }
// public void progress(java.lang.String value) { wrapperContained.progress = value; }
// public boolean cancelled() { return wrapperContained.cancelled; }
// public void cancelled(boolean value) { wrapperContained.cancelled = value; }
// public boolean uploadFinished() { return wrapperContained.uploadFinished; }
// public void uploadFinished(boolean value) { wrapperContained.uploadFinished = value; }
// public boolean showDots() { return wrapperContained.showDots; }
// public void showDots(boolean value) { wrapperContained.showDots = value; }
// public boolean uploadStarted() { return wrapperContained.uploadStarted; }
// public void uploadStarted(boolean value) { wrapperContained.uploadStarted = value; }
// public yarnwrap.client.gui.widget.ButtonWidget backButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.backButton); }
// public void backButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.backButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget cancelButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.cancelButton); }
// public void cancelButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.cancelButton = value.wrapperContained; }
// public int animTick() { return wrapperContained.animTick; }
// public void animTick(int value) { wrapperContained.animTick = value; }
// public java.lang.String[] DOTS() { return wrapperContained.DOTS; }
// public void DOTS(java.lang.String[] value) { wrapperContained.DOTS = value; }
// public java.lang.Long previousWrittenBytes() { return wrapperContained.previousWrittenBytes; }
// public void previousWrittenBytes(java.lang.Long value) { wrapperContained.previousWrittenBytes = value; }
// public java.lang.Long previousTimeSnapshot() { return wrapperContained.previousTimeSnapshot; }
// public void previousTimeSnapshot(java.lang.Long value) { wrapperContained.previousTimeSnapshot = value; }
// public long bytesPerSecond() { return wrapperContained.bytesPerSecond; }
// public void bytesPerSecond(long value) { wrapperContained.bytesPerSecond = value; }
// public java.util.concurrent.locks.ReentrantLock UPLOAD_LOCK() { return wrapperContained.UPLOAD_LOCK; }
// public void UPLOAD_LOCK(java.util.concurrent.locks.ReentrantLock value) { wrapperContained.UPLOAD_LOCK = value; }
// public net.minecraft.text.Text[] statusTexts() { return wrapperContained.statusTexts; }
// public void statusTexts(net.minecraft.text.Text[] value) { wrapperContained.statusTexts = value; }
// public yarnwrap.text.Text VERIFYING_TEXT() { return new yarnwrap.text.Text(wrapperContained.VERIFYING_TEXT); }
// public void VERIFYING_TEXT(yarnwrap.text.Text value) { wrapperContained.VERIFYING_TEXT = value.wrapperContained; }
// public yarnwrap.client.realms.task.WorldCreationTask creationTask() { return new yarnwrap.client.realms.task.WorldCreationTask(wrapperContained.creationTask); }
// public void creationTask(yarnwrap.client.realms.task.WorldCreationTask value) { wrapperContained.creationTask = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public boolean verify(java.io.File archive) { return wrapperContained.verify(archive); }
// public void addFileToTarGz(org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tOut,java.lang.String path,java.lang.String base,boolean root) { wrapperContained.addFileToTarGz(tOut,path,base,root); }
// public java.io.File tarGzipArchive(java.io.File pathToDirectoryFile) { return wrapperContained.tarGzipArchive(pathToDirectoryFile); }
// public void onBack() { wrapperContained.onBack(); }
// public void drawUploadSpeed0(yarnwrap.client.gui.DrawContext context,long bytesPerSecond) { wrapperContained.drawUploadSpeed0(context.wrapperContained,bytesPerSecond); }
// public void onCancel() { wrapperContained.onCancel(); }
// public void drawProgressBar(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawProgressBar(context.wrapperContained); }
// public void drawUploadSpeed(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawUploadSpeed(context.wrapperContained); }
// public void upload() { wrapperContained.upload(); }
// public void uploadCancelled() { wrapperContained.uploadCancelled(); }
// public void setStatusTexts(net.minecraft.text.Text[] statusTexts) { wrapperContained.setStatusTexts(statusTexts); }
// public yarnwrap.text.Text getNarration() { return new yarnwrap.text.Text(wrapperContained.getNarration()); }

}