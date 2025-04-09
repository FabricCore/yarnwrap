package yarnwrap.client.realms.task;
public class RealmsPrepareConnectionTask { public net.minecraft.client.realms.task.RealmsPrepareConnectionTask wrapperContained; public RealmsPrepareConnectionTask(net.minecraft.client.realms.task.RealmsPrepareConnectionTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer server() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.server); }
// public yarnwrap.client.gui.screen.Screen lastScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.lastScreen); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public yarnwrap.text.Text APPLYING_PACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.APPLYING_PACK_TEXT); }
public yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen createConnectingScreen(yarnwrap.client.realms.dto.RealmsServerAddress address) { return new yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen(wrapperContained.createConnectingScreen(address.wrapperContained)); }
// public yarnwrap.client.gui.screen.PopupScreen createResourcePackConfirmationScreen(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id,java.util.function.Function connectingScreenCreator) { return new yarnwrap.client.gui.screen.PopupScreen(wrapperContained.createResourcePackConfirmationScreen(address.wrapperContained,id,connectingScreenCreator)); }
// public java.util.concurrent.CompletableFuture downloadResourcePack(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id) { return wrapperContained.downloadResourcePack(address.wrapperContained,id); }
// public yarnwrap.client.realms.dto.RealmsServerAddress join() { return new yarnwrap.client.realms.dto.RealmsServerAddress(wrapperContained.join()); }
// public java.util.UUID getResourcePackId(yarnwrap.client.realms.dto.RealmsServer server) { return wrapperContained.getResourcePackId(server.wrapperContained); }

}