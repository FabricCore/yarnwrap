package yarnwrap.client.realms.gui.screen;
public class RealmsBackupScreen { public net.minecraft.client.realms.gui.screen.RealmsBackupScreen wrapperContained; public RealmsBackupScreen(net.minecraft.client.realms.gui.screen.RealmsBackupScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value) { wrapperContained.parent = value.wrapperContained; }
// public java.util.List backups() { return wrapperContained.backups; }
// public void backups(java.util.List value) { wrapperContained.backups = value; }
// public int slotId() { return wrapperContained.slotId; }
// public void slotId(int value) { wrapperContained.slotId = value; }
// public yarnwrap.client.gui.widget.ButtonWidget downloadButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.downloadButton); }
// public void downloadButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.downloadButton = value.wrapperContained; }
// public boolean noBackups() { return wrapperContained.noBackups; }
// public void noBackups(boolean value) { wrapperContained.noBackups = value; }
// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public yarnwrap.text.Text RESTORE_TEXT() { return new yarnwrap.text.Text(wrapperContained.RESTORE_TEXT); }
// public void RESTORE_TEXT(yarnwrap.text.Text value) { wrapperContained.RESTORE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text CHANGES_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.CHANGES_TOOLTIP); }
// public void CHANGES_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.CHANGES_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text BACKUPS_TEXT() { return new yarnwrap.text.Text(wrapperContained.BACKUPS_TEXT); }
// public void BACKUPS_TEXT(yarnwrap.text.Text value) { wrapperContained.BACKUPS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text NO_BACKUPS_TEXT() { return new yarnwrap.text.Text(wrapperContained.NO_BACKUPS_TEXT); }
// public void NO_BACKUPS_TEXT(yarnwrap.text.Text value) { wrapperContained.NO_BACKUPS_TEXT = value.wrapperContained; }
// public java.lang.String UPLOADED() { return wrapperContained.UPLOADED; }
// public void UPLOADED(java.lang.String value) { wrapperContained.UPLOADED = value; }
// public Object selectionList() { return wrapperContained.selectionList; }
// // public void selectionList(Object value) { wrapperContained.selectionList = value; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public yarnwrap.text.Text DOWNLOAD_TEXT() { return new yarnwrap.text.Text(wrapperContained.DOWNLOAD_TEXT); }
// public void DOWNLOAD_TEXT(yarnwrap.text.Text value) { wrapperContained.DOWNLOAD_TEXT = value.wrapperContained; }
public RealmsBackupScreen(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen parent,yarnwrap.client.realms.dto.RealmsServer serverData,int slotId) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsBackupScreen(parent.wrapperContained,serverData.wrapperContained,slotId); }
// public void downloadClicked() { wrapperContained.downloadClicked(); }
// public void method_25110(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25110(button.wrapperContained); }
// public void method_25113(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25113(button.wrapperContained); }
// public void startBackupFetcher() { wrapperContained.startBackupFetcher(); }

}