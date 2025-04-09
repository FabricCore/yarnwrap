package yarnwrap.client.network;
public class ClientLoginNetworkHandler { public net.minecraft.client.network.ClientLoginNetworkHandler wrapperContained; public ClientLoginNetworkHandler(net.minecraft.client.network.ClientLoginNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parentScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parentScreen); }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.function.Consumer statusConsumer() { return wrapperContained.statusConsumer; }
// public yarnwrap.client.network.ServerInfo serverInfo() { return new yarnwrap.client.network.ServerInfo(wrapperContained.serverInfo); }
// public boolean newWorld() { return wrapperContained.newWorld; }
// public java.time.Duration worldLoadTime() { return wrapperContained.worldLoadTime; }
// public java.lang.String minigameName() { return wrapperContained.minigameName; }
// public java.util.concurrent.atomic.AtomicReference state() { return wrapperContained.state; }
// public java.util.Map serverCookies() { return wrapperContained.serverCookies; }
// public boolean hasCookies() { return wrapperContained.hasCookies; }
// public com.mojang.authlib.minecraft.MinecraftSessionService getSessionService() { return wrapperContained.getSessionService(); }
// public yarnwrap.text.Text joinServerSession(java.lang.String serverId) { return new yarnwrap.text.Text(wrapperContained.joinServerSession(serverId)); }
public void setMinigameName(java.lang.String minigameName) { wrapperContained.setMinigameName(minigameName); }
// public void switchTo(Object state) { wrapperContained.switchTo(state); }
// public void setupEncryption(yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket keyPacket,javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher) { wrapperContained.setupEncryption(keyPacket.wrapperContained,decryptionCipher,encryptionCipher); }

}