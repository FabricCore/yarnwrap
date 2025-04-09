package yarnwrap.client.realms.task;
public class OpenServerTask { public net.minecraft.client.realms.task.OpenServerTask wrapperContained; public OpenServerTask(net.minecraft.client.realms.task.OpenServerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public yarnwrap.client.gui.screen.Screen returnScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.returnScreen); }
// public boolean join() { return wrapperContained.join; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }

}