package yarnwrap.client.realms.task;
public class CreatingSnapshotWorldTask { public net.minecraft.client.realms.task.CreatingSnapshotWorldTask wrapperContained; public CreatingSnapshotWorldTask(net.minecraft.client.realms.task.CreatingSnapshotWorldTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.task.CreatingSnapshotWorldTask.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.LOGGER = value; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.CreatingSnapshotWorldTask.TITLE_TEXT); }
// public static void TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.TITLE_TEXT = value.wrapperContained; }

// public long parentId() { return wrapperContained.parentId; }
// public void parentId(long value) { wrapperContained.parentId = value; }
// public static long parentId() { return net.minecraft.client.realms.task.CreatingSnapshotWorldTask.parentId; }
// public static void parentId(long value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.parentId = value; }

// public yarnwrap.client.realms.gui.screen.ResetWorldInfo resetWorldInfo() { return new yarnwrap.client.realms.gui.screen.ResetWorldInfo(wrapperContained.resetWorldInfo); }
// public void resetWorldInfo(yarnwrap.client.realms.gui.screen.ResetWorldInfo value) { wrapperContained.resetWorldInfo = value.wrapperContained; }
// public static yarnwrap.client.realms.gui.screen.ResetWorldInfo resetWorldInfo() { return new yarnwrap.client.realms.gui.screen.ResetWorldInfo(net.minecraft.client.realms.task.CreatingSnapshotWorldTask.resetWorldInfo); }
// public static void resetWorldInfo(yarnwrap.client.realms.gui.screen.ResetWorldInfo value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.resetWorldInfo = value.wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.realms.task.CreatingSnapshotWorldTask.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.name = value; }

// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public static java.lang.String motd() { return net.minecraft.client.realms.task.CreatingSnapshotWorldTask.motd; }
// public static void motd(java.lang.String value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.motd = value; }

// public yarnwrap.client.realms.gui.screen.RealmsMainScreen mainScreen() { return new yarnwrap.client.realms.gui.screen.RealmsMainScreen(wrapperContained.mainScreen); }
// public void mainScreen(yarnwrap.client.realms.gui.screen.RealmsMainScreen value) { wrapperContained.mainScreen = value.wrapperContained; }
// public static yarnwrap.client.realms.gui.screen.RealmsMainScreen mainScreen() { return new yarnwrap.client.realms.gui.screen.RealmsMainScreen(net.minecraft.client.realms.task.CreatingSnapshotWorldTask.mainScreen); }
// public static void mainScreen(yarnwrap.client.realms.gui.screen.RealmsMainScreen value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.mainScreen = value.wrapperContained; }

// public yarnwrap.client.realms.task.WorldCreationTask worldCreationTask() { return new yarnwrap.client.realms.task.WorldCreationTask(wrapperContained.worldCreationTask); }
// public void worldCreationTask(yarnwrap.client.realms.task.WorldCreationTask value) { wrapperContained.worldCreationTask = value.wrapperContained; }
// public static yarnwrap.client.realms.task.WorldCreationTask worldCreationTask() { return new yarnwrap.client.realms.task.WorldCreationTask(net.minecraft.client.realms.task.CreatingSnapshotWorldTask.worldCreationTask); }
// public static void worldCreationTask(yarnwrap.client.realms.task.WorldCreationTask value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.worldCreationTask = value.wrapperContained; }

// public yarnwrap.client.realms.task.ResettingNormalWorldTask resettingNormalWorldTask() { return new yarnwrap.client.realms.task.ResettingNormalWorldTask(wrapperContained.resettingNormalWorldTask); }
// public void resettingNormalWorldTask(yarnwrap.client.realms.task.ResettingNormalWorldTask value) { wrapperContained.resettingNormalWorldTask = value.wrapperContained; }
// public static yarnwrap.client.realms.task.ResettingNormalWorldTask resettingNormalWorldTask() { return new yarnwrap.client.realms.task.ResettingNormalWorldTask(net.minecraft.client.realms.task.CreatingSnapshotWorldTask.resettingNormalWorldTask); }
// public static void resettingNormalWorldTask(yarnwrap.client.realms.task.ResettingNormalWorldTask value, ) { net.minecraft.client.realms.task.CreatingSnapshotWorldTask.resettingNormalWorldTask = value.wrapperContained; }

public CreatingSnapshotWorldTask(yarnwrap.client.realms.gui.screen.RealmsMainScreen mainScreen,long parentId,yarnwrap.client.realms.gui.screen.ResetWorldInfo resetWorldInfo,java.lang.String name,java.lang.String motd) { this.wrapperContained = new net.minecraft.client.realms.task.CreatingSnapshotWorldTask(mainScreen.wrapperContained,parentId,resetWorldInfo.wrapperContained,name,motd); }

}