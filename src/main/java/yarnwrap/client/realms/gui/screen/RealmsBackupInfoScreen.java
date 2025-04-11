package yarnwrap.client.realms.gui.screen;
public class RealmsBackupInfoScreen { public net.minecraft.client.realms.gui.screen.RealmsBackupInfoScreen wrapperContained; public RealmsBackupInfoScreen(net.minecraft.client.realms.gui.screen.RealmsBackupInfoScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.realms.dto.Backup backup() { return new yarnwrap.client.realms.dto.Backup(wrapperContained.backup); }
// public void backup(yarnwrap.client.realms.dto.Backup value) { wrapperContained.backup = value.wrapperContained; }
// public Object backupInfoList() { return wrapperContained.backupInfoList; }
// // public void backupInfoList(Object value) { wrapperContained.backupInfoList = value; }
// public yarnwrap.text.Text UNKNOWN() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN); }
// public void UNKNOWN(yarnwrap.text.Text value) { wrapperContained.UNKNOWN = value.wrapperContained; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
public RealmsBackupInfoScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.realms.dto.Backup backup) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsBackupInfoScreen(parent.wrapperContained,backup.wrapperContained); }
// public yarnwrap.text.Text gameDifficultyMetadata(java.lang.String value) { return new yarnwrap.text.Text(wrapperContained.gameDifficultyMetadata(value)); }
// public yarnwrap.text.Text checkForSpecificMetadata(java.lang.String key,java.lang.String value) { return new yarnwrap.text.Text(wrapperContained.checkForSpecificMetadata(key,value)); }
// public yarnwrap.text.Text gameModeMetadata(java.lang.String value) { return new yarnwrap.text.Text(wrapperContained.gameModeMetadata(value)); }
// public void method_25105(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25105(button.wrapperContained); }
// public void method_53513(yarnwrap.client.realms.gui.screen.RealmsBackupInfoScreen child) { wrapperContained.method_53513(child.wrapperContained); }

}