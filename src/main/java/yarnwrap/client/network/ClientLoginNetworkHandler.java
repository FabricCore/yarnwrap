package yarnwrap.client.network;
public class ClientLoginNetworkHandler { public net.minecraft.client.network.ClientLoginNetworkHandler wrapperContained; public ClientLoginNetworkHandler(net.minecraft.client.network.ClientLoginNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parentScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parentScreen); }
// public void parentScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parentScreen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen parentScreen() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.network.ClientLoginNetworkHandler.parentScreen); }
// public static void parentScreen(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.parentScreen = value.wrapperContained; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.client.network.ClientLoginNetworkHandler.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.connection = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.ClientLoginNetworkHandler.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.client = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ClientLoginNetworkHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.LOGGER = value; }

// public java.util.function.Consumer statusConsumer() { return wrapperContained.statusConsumer; }
// public void statusConsumer(java.util.function.Consumer value) { wrapperContained.statusConsumer = value; }
// public static java.util.function.Consumer statusConsumer() { return net.minecraft.client.network.ClientLoginNetworkHandler.statusConsumer; }
// public static void statusConsumer(java.util.function.Consumer value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.statusConsumer = value; }

// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public void serverInfo(yarnwrap.client.network.ServerInfo value) { wrapperContained.serverInfo = value.wrapperContained; }
// public static yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(net.minecraft.client.network.ClientLoginNetworkHandler.serverInfo); }
// public static void serverInfo(yarnwrap.client.network.ServerInfo value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.serverInfo = value.wrapperContained; }

// public boolean newWorld() { return wrapperContained.newWorld; }
// public void newWorld(boolean value) { wrapperContained.newWorld = value; }
// public static boolean newWorld() { return net.minecraft.client.network.ClientLoginNetworkHandler.newWorld; }
// public static void newWorld(boolean value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.newWorld = value; }

// public java.time.Duration worldLoadTime() { return wrapperContained.worldLoadTime; }
// public void worldLoadTime(java.time.Duration value) { wrapperContained.worldLoadTime = value; }
// public static java.time.Duration worldLoadTime() { return net.minecraft.client.network.ClientLoginNetworkHandler.worldLoadTime; }
// public static void worldLoadTime(java.time.Duration value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.worldLoadTime = value; }

// public java.lang.String minigameName() { return wrapperContained.minigameName; }
// public void minigameName(java.lang.String value) { wrapperContained.minigameName = value; }
// public static java.lang.String minigameName() { return net.minecraft.client.network.ClientLoginNetworkHandler.minigameName; }
// public static void minigameName(java.lang.String value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.minigameName = value; }

// public java.util.concurrent.atomic.AtomicReference state() { return wrapperContained.state; }
// public void state(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.state = value; }
// public static java.util.concurrent.atomic.AtomicReference state() { return net.minecraft.client.network.ClientLoginNetworkHandler.state; }
// public static void state(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.state = value; }

// public java.util.Map serverCookies() { return wrapperContained.serverCookies; }
// public void serverCookies(java.util.Map value) { wrapperContained.serverCookies = value; }
// public static java.util.Map serverCookies() { return net.minecraft.client.network.ClientLoginNetworkHandler.serverCookies; }
// public static void serverCookies(java.util.Map value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.serverCookies = value; }

// public boolean hasCookies() { return wrapperContained.hasCookies; }
// public void hasCookies(boolean value) { wrapperContained.hasCookies = value; }
// public static boolean hasCookies() { return net.minecraft.client.network.ClientLoginNetworkHandler.hasCookies; }
// public static void hasCookies(boolean value, ) { net.minecraft.client.network.ClientLoginNetworkHandler.hasCookies = value; }

public ClientLoginNetworkHandler(yarnwrap.network.ClientConnection connection,yarnwrap.client.MinecraftClient client,yarnwrap.client.network.ServerInfo serverInfo,yarnwrap.client.gui.screen.Screen parentScreen,boolean newWorld,java.time.Duration worldLoadTime,java.util.function.Consumer statusConsumer,yarnwrap.client.network.CookieStorage cookieStorage) { this.wrapperContained = new net.minecraft.client.network.ClientLoginNetworkHandler(connection.wrapperContained,client.wrapperContained,serverInfo.wrapperContained,parentScreen.wrapperContained,newWorld,worldLoadTime,statusConsumer,cookieStorage.wrapperContained); }
// public com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return wrapperContained.getSessionService(); }
// public static com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return net.minecraft.client.network.ClientLoginNetworkHandler.getSessionService(); }
// public yarnwrap.text.Text joinServerSession(java.lang.String serverId) { return new yarnwrap.text.Text(wrapperContained.joinServerSession(serverId)); }
// public static yarnwrap.text.Text joinServerSession(java.lang.String serverId, ) { return new yarnwrap.text.Text(net.minecraft.client.network.ClientLoginNetworkHandler.joinServerSession(serverId)); }
// public void method_2894(java.lang.String serverId,yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket packet,javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher) { wrapperContained.method_2894(serverId,packet.wrapperContained,decryptionCipher,encryptionCipher); }
// public static void method_2894(java.lang.String serverId,yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket packet,javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher, ) { net.minecraft.client.network.ClientLoginNetworkHandler.method_2894(serverId,packet.wrapperContained,decryptionCipher,encryptionCipher); }
public void setMinigameName(java.lang.String minigameName) { wrapperContained.setMinigameName(minigameName); }
// public static void setMinigameName(java.lang.String minigameName, ) { net.minecraft.client.network.ClientLoginNetworkHandler.setMinigameName(minigameName); }
// public void switchTo(Object state) { wrapperContained.switchTo(state); }
// public static void switchTo(Object state, ) { net.minecraft.client.network.ClientLoginNetworkHandler.switchTo(state); }
// public Object method_53873(Object currentState) { return wrapperContained.method_53873(currentState); }
// public static Object method_53873(Object currentState, ) { return net.minecraft.client.network.ClientLoginNetworkHandler.method_53873(currentState); }
// public void setupEncryption(yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket keyPacket,javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher) { wrapperContained.setupEncryption(keyPacket.wrapperContained,decryptionCipher,encryptionCipher); }
// public static void setupEncryption(yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket keyPacket,javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher, ) { net.minecraft.client.network.ClientLoginNetworkHandler.setupEncryption(keyPacket.wrapperContained,decryptionCipher,encryptionCipher); }

}