package yarnwrap.client.realms.task;
public class SwitchSlotTask { public net.minecraft.client.realms.task.SwitchSlotTask wrapperContained; public SwitchSlotTask(net.minecraft.client.realms.task.SwitchSlotTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public static long worldId() { return net.minecraft.client.realms.task.SwitchSlotTask.worldId; }
// public static void worldId(long value, ) { net.minecraft.client.realms.task.SwitchSlotTask.worldId = value; }

// public int slot() { return wrapperContained.slot; }
// public void slot(int value) { wrapperContained.slot = value; }
// public static int slot() { return net.minecraft.client.realms.task.SwitchSlotTask.slot; }
// public static void slot(int value, ) { net.minecraft.client.realms.task.SwitchSlotTask.slot = value; }

// public java.lang.Runnable callback() { return wrapperContained.callback; }
// public void callback(java.lang.Runnable value) { wrapperContained.callback = value; }
// public static java.lang.Runnable callback() { return net.minecraft.client.realms.task.SwitchSlotTask.callback; }
// public static void callback(java.lang.Runnable value, ) { net.minecraft.client.realms.task.SwitchSlotTask.callback = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.task.SwitchSlotTask.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.task.SwitchSlotTask.LOGGER = value; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.SwitchSlotTask.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.realms.task.SwitchSlotTask.TITLE = value.wrapperContained; }

public SwitchSlotTask(long worldId,int slot,java.lang.Runnable callback) { this.wrapperContained = new net.minecraft.client.realms.task.SwitchSlotTask(worldId,slot,callback); }

}