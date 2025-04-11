package yarnwrap.client.realms.task;
public class SwitchMinigameTask { public net.minecraft.client.realms.task.SwitchMinigameTask wrapperContained; public SwitchMinigameTask(net.minecraft.client.realms.task.SwitchMinigameTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public yarnwrap.client.realms.dto.WorldTemplate worldTemplate() { return new yarnwrap.client.realms.dto.WorldTemplate(wrapperContained.worldTemplate); }
// public void worldTemplate(yarnwrap.client.realms.dto.WorldTemplate value) { wrapperContained.worldTemplate = value.wrapperContained; }
// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen lastScreen() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.lastScreen); }
// public void lastScreen(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value) { wrapperContained.lastScreen = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
public SwitchMinigameTask(long worldId,yarnwrap.client.realms.dto.WorldTemplate worldTemplate,yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen lastScreen) { this.wrapperContained = new net.minecraft.client.realms.task.SwitchMinigameTask(worldId,worldTemplate.wrapperContained,lastScreen.wrapperContained); }

}