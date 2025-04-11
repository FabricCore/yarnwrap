package yarnwrap.client.realms.task;
public class RestoreTask { public net.minecraft.client.realms.task.RestoreTask wrapperContained; public RestoreTask(net.minecraft.client.realms.task.RestoreTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.Backup backup() { return new yarnwrap.client.realms.dto.Backup(wrapperContained.backup); }
// public void backup(yarnwrap.client.realms.dto.Backup value) { wrapperContained.backup = value.wrapperContained; }
// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen lastScreen() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.lastScreen); }
// public void lastScreen(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value) { wrapperContained.lastScreen = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
public RestoreTask(yarnwrap.client.realms.dto.Backup backup,long worldId,yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen lastScreen) { this.wrapperContained = new net.minecraft.client.realms.task.RestoreTask(backup.wrapperContained,worldId,lastScreen.wrapperContained); }

}