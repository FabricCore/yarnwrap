package yarnwrap.client.realms.task;
public class OpenServerTask { public net.minecraft.client.realms.task.OpenServerTask wrapperContained; public OpenServerTask(net.minecraft.client.realms.task.OpenServerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public static yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(net.minecraft.client.realms.task.OpenServerTask.serverData); }
// public static void serverData(yarnwrap.client.realms.dto.RealmsServer value, ) { net.minecraft.client.realms.task.OpenServerTask.serverData = value.wrapperContained; }

// public yarnwrap.client.gui.screen.Screen returnScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.returnScreen); }
// public void returnScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.returnScreen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen returnScreen() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.realms.task.OpenServerTask.returnScreen); }
// public static void returnScreen(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.realms.task.OpenServerTask.returnScreen = value.wrapperContained; }

// public boolean join() { return wrapperContained.join; }
// public void join(boolean value) { wrapperContained.join = value; }
// public static boolean join() { return net.minecraft.client.realms.task.OpenServerTask.join; }
// public static void join(boolean value, ) { net.minecraft.client.realms.task.OpenServerTask.join = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.realms.task.OpenServerTask.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.realms.task.OpenServerTask.client = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.task.OpenServerTask.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.task.OpenServerTask.LOGGER = value; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.OpenServerTask.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.realms.task.OpenServerTask.TITLE = value.wrapperContained; }

public OpenServerTask(yarnwrap.client.realms.dto.RealmsServer realmsServer,yarnwrap.client.gui.screen.Screen returnScreen,boolean join,yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.realms.task.OpenServerTask(realmsServer.wrapperContained,returnScreen.wrapperContained,join,client.wrapperContained); }

}