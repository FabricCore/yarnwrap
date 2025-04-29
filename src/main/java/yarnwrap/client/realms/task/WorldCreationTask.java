package yarnwrap.client.realms.task;
public class WorldCreationTask { public net.minecraft.client.realms.task.WorldCreationTask wrapperContained; public WorldCreationTask(net.minecraft.client.realms.task.WorldCreationTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.realms.task.WorldCreationTask.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.realms.task.WorldCreationTask.name = value; }

// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public static java.lang.String motd() { return net.minecraft.client.realms.task.WorldCreationTask.motd; }
// public static void motd(java.lang.String value, ) { net.minecraft.client.realms.task.WorldCreationTask.motd = value; }

// public long worldId() { return wrapperContained.worldId; }
// public void worldId(long value) { wrapperContained.worldId = value; }
// public static long worldId() { return net.minecraft.client.realms.task.WorldCreationTask.worldId; }
// public static void worldId(long value, ) { net.minecraft.client.realms.task.WorldCreationTask.worldId = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.task.WorldCreationTask.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.task.WorldCreationTask.LOGGER = value; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.WorldCreationTask.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.realms.task.WorldCreationTask.TITLE = value.wrapperContained; }

public WorldCreationTask(long worldId,java.lang.String name,java.lang.String motd) { this.wrapperContained = new net.minecraft.client.realms.task.WorldCreationTask(worldId,name,motd); }

}