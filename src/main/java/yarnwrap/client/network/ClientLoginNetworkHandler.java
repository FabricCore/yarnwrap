package yarnwrap.client.network;
public class ClientLoginNetworkHandler { public net.minecraft.client.network.ClientLoginNetworkHandler wrapperContained; public ClientLoginNetworkHandler(net.minecraft.client.network.ClientLoginNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parentScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parentScreen); }
// public void parentScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parentScreen = value.wrapperContained; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.function.Consumer statusConsumer() { return wrapperContained.statusConsumer; }
// public void statusConsumer(java.util.function.Consumer value) { wrapperContained.statusConsumer = value; }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public void serverInfo(yarnwrap.client.network.ServerInfo value) { wrapperContained.serverInfo = value.wrapperContained; }
// public boolean newWorld() { return wrapperContained.newWorld; }
// public void newWorld(boolean value) { wrapperContained.newWorld = value; }
// public java.time.Duration worldLoadTime() { return wrapperContained.worldLoadTime; }
// public void worldLoadTime(java.time.Duration value) { wrapperContained.worldLoadTime = value; }
// public java.lang.String minigameName() { return wrapperContained.minigameName; }
// public void minigameName(java.lang.String value) { wrapperContained.minigameName = value; }
// public java.util.concurrent.atomic.AtomicReference state() { return wrapperContained.state; }
// public void state(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.state = value; }
// public java.util.Map serverCookies() { return wrapperContained.serverCookies; }
// public void serverCookies(java.util.Map value) { wrapperContained.serverCookies = value; }
// public boolean hasCookies() { return wrapperContained.hasCookies; }
// public void hasCookies(boolean value) { wrapperContained.hasCookies = value; }
// public com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return wrapperContained.getSessionService(); }
// public yarnwrap.text.Text joinServerSession(java.lang.String serverId) { return new yarnwrap.text.Text(wrapperContained.joinServerSession(serverId)); }
public void setMinigameName(java.lang.String minigameName) { wrapperContained.setMinigameName(minigameName); }
// public void switchTo(Object state) { wrapperContained.switchTo(state); }
// public void setupEncryption(yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket keyPacket,javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher) { wrapperContained.setupEncryption(keyPacket.wrapperContained,decryptionCipher,encryptionCipher); }

}