package yarnwrap.client.realms.task;
public class DownloadTask { public net.minecraft.client.realms.task.DownloadTask wrapperContained; public DownloadTask(net.minecraft.client.realms.task.DownloadTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
// public yarnwrap.client.gui.screen.Screen lastScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.lastScreen); }
// public void lastScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.lastScreen = value.wrapperContained; }
// public java.lang.String downloadName() { return wrapperContained.downloadName; }
// public void downloadName(java.lang.String value) { wrapperContained.downloadName = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
public DownloadTask(long worldId,int slot,java.lang.String downloadName,yarnwrap.client.gui.screen.Screen lastScreen) { this.wrapperContained = new net.minecraft.client.realms.task.DownloadTask(worldId,slot,downloadName,lastScreen.wrapperContained); }

}