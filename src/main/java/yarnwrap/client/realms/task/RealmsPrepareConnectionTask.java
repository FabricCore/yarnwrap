package yarnwrap.client.realms.task;
public class RealmsPrepareConnectionTask { public net.minecraft.client.realms.task.RealmsPrepareConnectionTask wrapperContained; public RealmsPrepareConnectionTask(net.minecraft.client.realms.task.RealmsPrepareConnectionTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer server() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.server); }
// public void server(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.server = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen lastScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.lastScreen); }
// public void lastScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.lastScreen = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.text.Text APPLYING_PACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.APPLYING_PACK_TEXT); }
// public void APPLYING_PACK_TEXT(yarnwrap.text.Text value) { wrapperContained.APPLYING_PACK_TEXT = value.wrapperContained; }
public yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen createConnectingScreen(yarnwrap.client.realms.dto.RealmsServerAddress address) { return new yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen(wrapperContained.createConnectingScreen(address.wrapperContained)); }
// public yarnwrap.client.gui.screen.PopupScreen createResourcePackConfirmationScreen(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id,java.util.function.Function connectingScreenCreator) { return new yarnwrap.client.gui.screen.PopupScreen(wrapperContained.createResourcePackConfirmationScreen(address.wrapperContained,id,connectingScreenCreator)); }
// public java.util.concurrent.CompletableFuture downloadResourcePack(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id) { return wrapperContained.downloadResourcePack(address.wrapperContained,id); }
// public yarnwrap.client.realms.dto.RealmsServerAddress join() { return new yarnwrap.client.realms.dto.RealmsServerAddress(wrapperContained.join()); }
// public java.util.UUID getResourcePackId(yarnwrap.client.realms.dto.RealmsServer server) { return wrapperContained.getResourcePackId(server.wrapperContained); }

}