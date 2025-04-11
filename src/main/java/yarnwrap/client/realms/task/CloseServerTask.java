package yarnwrap.client.realms.task;
public class CloseServerTask { public net.minecraft.client.realms.task.CloseServerTask wrapperContained; public CloseServerTask(net.minecraft.client.realms.task.CloseServerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen configureScreen() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.configureScreen); }
// public void configureScreen(yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen value) { wrapperContained.configureScreen = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
public CloseServerTask(yarnwrap.client.realms.dto.RealmsServer realmsServer,yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen configureWorldScreen) { this.wrapperContained = new net.minecraft.client.realms.task.CloseServerTask(realmsServer.wrapperContained,configureWorldScreen.wrapperContained); }

}