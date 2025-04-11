package yarnwrap.client.realms.task;
public class OpenServerTask { public net.minecraft.client.realms.task.OpenServerTask wrapperContained; public OpenServerTask(net.minecraft.client.realms.task.OpenServerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen returnScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.returnScreen); }
// public void returnScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.returnScreen = value.wrapperContained; }
// public boolean join() { return wrapperContained.join; }
// public void join(boolean value) { wrapperContained.join = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }

}