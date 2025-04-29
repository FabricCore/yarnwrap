package yarnwrap.client.realms.task;
public class RealmsPrepareConnectionTask { public net.minecraft.client.realms.task.RealmsPrepareConnectionTask wrapperContained; public RealmsPrepareConnectionTask(net.minecraft.client.realms.task.RealmsPrepareConnectionTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.dto.RealmsServer server() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.server); }
// public void server(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.client.realms.dto.RealmsServer server() { return new yarnwrap.client.realms.dto.RealmsServer(net.minecraft.client.realms.task.RealmsPrepareConnectionTask.server); }
// public static void server(yarnwrap.client.realms.dto.RealmsServer value, ) { net.minecraft.client.realms.task.RealmsPrepareConnectionTask.server = value.wrapperContained; }

// public yarnwrap.client.gui.screen.Screen lastScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.lastScreen); }
// public void lastScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.lastScreen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen lastScreen() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.realms.task.RealmsPrepareConnectionTask.lastScreen); }
// public static void lastScreen(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.realms.task.RealmsPrepareConnectionTask.lastScreen = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.task.RealmsPrepareConnectionTask.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.task.RealmsPrepareConnectionTask.LOGGER = value; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.RealmsPrepareConnectionTask.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.realms.task.RealmsPrepareConnectionTask.TITLE = value.wrapperContained; }

// public yarnwrap.text.Text APPLYING_PACK_TEXT() { return new yarnwrap.text.Text(wrapperContained.APPLYING_PACK_TEXT); }
// public void APPLYING_PACK_TEXT(yarnwrap.text.Text value) { wrapperContained.APPLYING_PACK_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text APPLYING_PACK_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.task.RealmsPrepareConnectionTask.APPLYING_PACK_TEXT); }
// public static void APPLYING_PACK_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.task.RealmsPrepareConnectionTask.APPLYING_PACK_TEXT = value.wrapperContained; }

public RealmsPrepareConnectionTask(yarnwrap.client.gui.screen.Screen lastScreen,yarnwrap.client.realms.dto.RealmsServer server) { this.wrapperContained = new net.minecraft.client.realms.task.RealmsPrepareConnectionTask(lastScreen.wrapperContained,server.wrapperContained); }
// public java.lang.Void method_25286(yarnwrap.client.realms.dto.RealmsServerAddress throwable) { return wrapperContained.method_25286(throwable.wrapperContained); }
// public static java.lang.Void method_25286(yarnwrap.client.realms.dto.RealmsServerAddress throwable, ) { return net.minecraft.client.realms.task.RealmsPrepareConnectionTask.method_25286(throwable.wrapperContained); }
public yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen createConnectingScreen(yarnwrap.client.realms.dto.RealmsServerAddress address) { return new yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen(wrapperContained.createConnectingScreen(address.wrapperContained)); }
// public static yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen createConnectingScreen(yarnwrap.client.realms.dto.RealmsServerAddress address, ) { return new yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen(net.minecraft.client.realms.task.RealmsPrepareConnectionTask.createConnectingScreen(address.wrapperContained)); }
// public yarnwrap.client.gui.screen.PopupScreen createResourcePackConfirmationScreen(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id,java.util.function.Function connectingScreenCreator) { return new yarnwrap.client.gui.screen.PopupScreen(wrapperContained.createResourcePackConfirmationScreen(address.wrapperContained,id,connectingScreenCreator)); }
// public static yarnwrap.client.gui.screen.PopupScreen createResourcePackConfirmationScreen(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id,java.util.function.Function connectingScreenCreator, ) { return new yarnwrap.client.gui.screen.PopupScreen(net.minecraft.client.realms.task.RealmsPrepareConnectionTask.createResourcePackConfirmationScreen(address.wrapperContained,id,connectingScreenCreator)); }
// public void method_32513(yarnwrap.client.realms.dto.RealmsServerAddress popup) { wrapperContained.method_32513(popup.wrapperContained); }
// public static void method_32513(yarnwrap.client.realms.dto.RealmsServerAddress popup, ) { net.minecraft.client.realms.task.RealmsPrepareConnectionTask.method_32513(popup.wrapperContained); }
// public java.util.concurrent.CompletableFuture downloadResourcePack(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id) { return wrapperContained.downloadResourcePack(address.wrapperContained,id); }
// public static java.util.concurrent.CompletableFuture downloadResourcePack(yarnwrap.client.realms.dto.RealmsServerAddress address,java.util.UUID id, ) { return net.minecraft.client.realms.task.RealmsPrepareConnectionTask.downloadResourcePack(address.wrapperContained,id); }
// public yarnwrap.client.realms.dto.RealmsServerAddress join() { return new yarnwrap.client.realms.dto.RealmsServerAddress(wrapperContained.join()); }
// public static yarnwrap.client.realms.dto.RealmsServerAddress join() { return new yarnwrap.client.realms.dto.RealmsServerAddress(net.minecraft.client.realms.task.RealmsPrepareConnectionTask.join()); }
// public java.util.UUID getResourcePackId(yarnwrap.client.realms.dto.RealmsServer server) { return wrapperContained.getResourcePackId(server.wrapperContained); }
// public static java.util.UUID getResourcePackId(yarnwrap.client.realms.dto.RealmsServer server, ) { return net.minecraft.client.realms.task.RealmsPrepareConnectionTask.getResourcePackId(server.wrapperContained); }

}