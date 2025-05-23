package yarnwrap.client.realms.task;
public class SwitchMinigameTask { public net.minecraft.client.realms.task.SwitchMinigameTask wrapperContained; public SwitchMinigameTask(net.minecraft.client.realms.task.SwitchMinigameTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public static long worldId() { return net.minecraft.client.realms.task.SwitchMinigameTask.worldId; }
// public static void worldId(long value, ) { net.minecraft.client.realms.task.SwitchMinigameTask.worldId = value; }

// public yarnwrap.client.realms.dto.WorldTemplate worldTemplate() { return new yarnwrap.client.realms.dto.WorldTemplate(wrapperContained.worldTemplate); }
// public void worldTemplate(yarnwrap.client.realms.dto.WorldTemplate value) { wrapperContained.worldTemplate = value.wrapperContained; }
// public static yarnwrap.client.realms.dto.WorldTemplate worldTemplate() { return new yarnwrap.client.realms.dto.WorldTemplate(net.minecraft.client.realms.task.SwitchMinigameTask.worldTemplate); }
// public static void worldTemplate(yarnwrap.client.realms.dto.WorldTemplate value, ) { net.minecraft.client.realms.task.SwitchMinigameTask.worldTemplate = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.task.SwitchMinigameTask.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.task.SwitchMinigameTask.LOGGER = value; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.SwitchMinigameTask.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.realms.task.SwitchMinigameTask.TITLE = value.wrapperContained; }

public SwitchMinigameTask(long worldId,yarnwrap.client.realms.dto.WorldTemplate worldTemplate,yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen lastScreen) { this.wrapperContained = new net.minecraft.client.realms.task.SwitchMinigameTask(worldId,worldTemplate.wrapperContained,lastScreen.wrapperContained); }

}