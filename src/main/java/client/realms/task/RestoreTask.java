package yarnwrap.client.realms.task;
public class RestoreTask { public net.minecraft.client.realms.task.RestoreTask wrapperContained; public RestoreTask(net.minecraft.client.realms.task.RestoreTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.Backup backup() { return new yarnwrap.client.realms.dto.Backup(wrapperContained.backup); }
// public long worldId() { return wrapperContained.worldId; }
// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen lastScreen() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.lastScreen); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }

}