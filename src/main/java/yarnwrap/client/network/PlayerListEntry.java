package yarnwrap.client.network;
public class PlayerListEntry { public net.minecraft.client.network.PlayerListEntry wrapperContained; public PlayerListEntry(net.minecraft.client.network.PlayerListEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public int latency() { return wrapperContained.latency; }
// public void latency(int value) { wrapperContained.latency = value; }
// public static int latency() { return net.minecraft.client.network.PlayerListEntry.latency; }
// public static void latency(int value, ) { net.minecraft.client.network.PlayerListEntry.latency = value; }

// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public static com.mojang.authlib.GameProfile profile() { return net.minecraft.client.network.PlayerListEntry.profile; }
// public static void profile(com.mojang.authlib.GameProfile value, ) { net.minecraft.client.network.PlayerListEntry.profile = value; }

// public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
// public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public static yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(net.minecraft.client.network.PlayerListEntry.displayName); }
// public static void displayName(yarnwrap.text.Text value, ) { net.minecraft.client.network.PlayerListEntry.displayName = value.wrapperContained; }

// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(net.minecraft.client.network.PlayerListEntry.gameMode); }
// public static void gameMode(yarnwrap.world.GameMode value, ) { net.minecraft.client.network.PlayerListEntry.gameMode = value.wrapperContained; }

// public yarnwrap.network.message.MessageVerifier messageVerifier() { return new yarnwrap.network.message.MessageVerifier(wrapperContained.messageVerifier); }
// public void messageVerifier(yarnwrap.network.message.MessageVerifier value) { wrapperContained.messageVerifier = value.wrapperContained; }
// public static yarnwrap.network.message.MessageVerifier messageVerifier() { return new yarnwrap.network.message.MessageVerifier(net.minecraft.client.network.PlayerListEntry.messageVerifier); }
// public static void messageVerifier(yarnwrap.network.message.MessageVerifier value, ) { net.minecraft.client.network.PlayerListEntry.messageVerifier = value.wrapperContained; }

// public yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.session); }
// public void session(yarnwrap.network.encryption.PublicPlayerSession value) { wrapperContained.session = value.wrapperContained; }
// public static yarnwrap.network.encryption.PublicPlayerSession session() { return new yarnwrap.network.encryption.PublicPlayerSession(net.minecraft.client.network.PlayerListEntry.session); }
// public static void session(yarnwrap.network.encryption.PublicPlayerSession value, ) { net.minecraft.client.network.PlayerListEntry.session = value.wrapperContained; }

// public java.util.function.Supplier texturesSupplier() { return wrapperContained.texturesSupplier; }
// public void texturesSupplier(java.util.function.Supplier value) { wrapperContained.texturesSupplier = value; }
// public static java.util.function.Supplier texturesSupplier() { return net.minecraft.client.network.PlayerListEntry.texturesSupplier; }
// public static void texturesSupplier(java.util.function.Supplier value, ) { net.minecraft.client.network.PlayerListEntry.texturesSupplier = value; }

// public int listOrder() { return wrapperContained.listOrder; }
// public void listOrder(int value) { wrapperContained.listOrder = value; }
// public static int listOrder() { return net.minecraft.client.network.PlayerListEntry.listOrder; }
// public static void listOrder(int value, ) { net.minecraft.client.network.PlayerListEntry.listOrder = value; }

// public boolean showHat() { return wrapperContained.showHat; }
// public void showHat(boolean value) { wrapperContained.showHat = value; }
// public static boolean showHat() { return net.minecraft.client.network.PlayerListEntry.showHat; }
// public static void showHat(boolean value, ) { net.minecraft.client.network.PlayerListEntry.showHat = value; }

public PlayerListEntry(com.mojang.authlib.GameProfile profile,boolean secureChatEnforced) { this.wrapperContained = new net.minecraft.client.network.PlayerListEntry(profile,secureChatEnforced); }
public yarnwrap.scoreboard.Team getScoreboardTeam() { return new yarnwrap.scoreboard.Team(wrapperContained.getScoreboardTeam()); }
// public static yarnwrap.scoreboard.Team getScoreboardTeam() { return new yarnwrap.scoreboard.Team(net.minecraft.client.network.PlayerListEntry.getScoreboardTeam()); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
// public static yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(net.minecraft.client.network.PlayerListEntry.getGameMode()); }
public int getLatency() { return wrapperContained.getLatency(); }
// public static int getLatency() { return net.minecraft.client.network.PlayerListEntry.getLatency(); }
public void setDisplayName(yarnwrap.text.Text displayName) { wrapperContained.setDisplayName(displayName.wrapperContained); }
// public static void setDisplayName(yarnwrap.text.Text displayName, ) { net.minecraft.client.network.PlayerListEntry.setDisplayName(displayName.wrapperContained); }
// public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
// public static void setGameMode(yarnwrap.world.GameMode gameMode, ) { net.minecraft.client.network.PlayerListEntry.setGameMode(gameMode.wrapperContained); }
public com.mojang.authlib.GameProfile getProfile() { return wrapperContained.getProfile(); }
// public static com.mojang.authlib.GameProfile getProfile() { return net.minecraft.client.network.PlayerListEntry.getProfile(); }
// public void setLatency(int latency) { wrapperContained.setLatency(latency); }
// public static void setLatency(int latency, ) { net.minecraft.client.network.PlayerListEntry.setLatency(latency); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.client.network.PlayerListEntry.getDisplayName()); }
public yarnwrap.network.message.MessageVerifier getMessageVerifier() { return new yarnwrap.network.message.MessageVerifier(wrapperContained.getMessageVerifier()); }
// public static yarnwrap.network.message.MessageVerifier getMessageVerifier() { return new yarnwrap.network.message.MessageVerifier(net.minecraft.client.network.PlayerListEntry.getMessageVerifier()); }
// public void setSession(yarnwrap.network.encryption.PublicPlayerSession session) { wrapperContained.setSession(session.wrapperContained); }
// public static void setSession(yarnwrap.network.encryption.PublicPlayerSession session, ) { net.minecraft.client.network.PlayerListEntry.setSession(session.wrapperContained); }
public yarnwrap.network.encryption.PublicPlayerSession getSession() { return new yarnwrap.network.encryption.PublicPlayerSession(wrapperContained.getSession()); }
// public static yarnwrap.network.encryption.PublicPlayerSession getSession() { return new yarnwrap.network.encryption.PublicPlayerSession(net.minecraft.client.network.PlayerListEntry.getSession()); }
public boolean hasPublicKey() { return wrapperContained.hasPublicKey(); }
// public static boolean hasPublicKey() { return net.minecraft.client.network.PlayerListEntry.hasPublicKey(); }
// public void resetSession(boolean secureChatEnforced) { wrapperContained.resetSession(secureChatEnforced); }
// public static void resetSession(boolean secureChatEnforced, ) { net.minecraft.client.network.PlayerListEntry.resetSession(secureChatEnforced); }
// public yarnwrap.network.message.MessageVerifier getInitialVerifier(boolean secureChatEnforced) { return new yarnwrap.network.message.MessageVerifier(wrapperContained.getInitialVerifier(secureChatEnforced)); }
// public static yarnwrap.network.message.MessageVerifier getInitialVerifier(boolean secureChatEnforced, ) { return new yarnwrap.network.message.MessageVerifier(net.minecraft.client.network.PlayerListEntry.getInitialVerifier(secureChatEnforced)); }
// public java.util.function.Supplier texturesSupplier(com.mojang.authlib.GameProfile profile) { return wrapperContained.texturesSupplier(profile); }
// public static java.util.function.Supplier texturesSupplier(com.mojang.authlib.GameProfile profile, ) { return net.minecraft.client.network.PlayerListEntry.texturesSupplier(profile); }
public yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(wrapperContained.getSkinTextures()); }
// public static yarnwrap.client.util.SkinTextures getSkinTextures() { return new yarnwrap.client.util.SkinTextures(net.minecraft.client.network.PlayerListEntry.getSkinTextures()); }
public void setListOrder(int listOrder) { wrapperContained.setListOrder(listOrder); }
// public static void setListOrder(int listOrder, ) { net.minecraft.client.network.PlayerListEntry.setListOrder(listOrder); }
public int getListOrder() { return wrapperContained.getListOrder(); }
// public static int getListOrder() { return net.minecraft.client.network.PlayerListEntry.getListOrder(); }
public void setShowHat(boolean showHat) { wrapperContained.setShowHat(showHat); }
// public static void setShowHat(boolean showHat, ) { net.minecraft.client.network.PlayerListEntry.setShowHat(showHat); }
public boolean shouldShowHat() { return wrapperContained.shouldShowHat(); }
// public static boolean shouldShowHat() { return net.minecraft.client.network.PlayerListEntry.shouldShowHat(); }

}