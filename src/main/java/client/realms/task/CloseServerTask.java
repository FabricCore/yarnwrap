package yarnwrap.client.realms.task;
public class CloseServerTask { public net.minecraft.client.realms.task.CloseServerTask wrapperContained; public CloseServerTask(net.minecraft.client.realms.task.CloseServerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen configureScreen() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.configureScreen); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }

}