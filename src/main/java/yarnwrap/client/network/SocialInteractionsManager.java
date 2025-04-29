package yarnwrap.client.network;
public class SocialInteractionsManager { public net.minecraft.client.network.SocialInteractionsManager wrapperContained; public SocialInteractionsManager(net.minecraft.client.network.SocialInteractionsManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.SocialInteractionsManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.SocialInteractionsManager.client = value.wrapperContained; }

// public java.util.Set hiddenPlayers() { return wrapperContained.hiddenPlayers; }
// public void hiddenPlayers(java.util.Set value) { wrapperContained.hiddenPlayers = value; }
// public static java.util.Set hiddenPlayers() { return net.minecraft.client.network.SocialInteractionsManager.hiddenPlayers; }
// public static void hiddenPlayers(java.util.Set value, ) { net.minecraft.client.network.SocialInteractionsManager.hiddenPlayers = value; }

// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public static com.mojang.authlib.minecraft.UserApiService userApiService() { return net.minecraft.client.network.SocialInteractionsManager.userApiService; }
// public static void userApiService(com.mojang.authlib.minecraft.UserApiService value, ) { net.minecraft.client.network.SocialInteractionsManager.userApiService = value; }

// public java.util.Map playerNameByUuid() { return wrapperContained.playerNameByUuid; }
// public void playerNameByUuid(java.util.Map value) { wrapperContained.playerNameByUuid = value; }
// public static java.util.Map playerNameByUuid() { return net.minecraft.client.network.SocialInteractionsManager.playerNameByUuid; }
// public static void playerNameByUuid(java.util.Map value, ) { net.minecraft.client.network.SocialInteractionsManager.playerNameByUuid = value; }

// public boolean blockListLoaded() { return wrapperContained.blockListLoaded; }
// public void blockListLoaded(boolean value) { wrapperContained.blockListLoaded = value; }
// public static boolean blockListLoaded() { return net.minecraft.client.network.SocialInteractionsManager.blockListLoaded; }
// public static void blockListLoaded(boolean value, ) { net.minecraft.client.network.SocialInteractionsManager.blockListLoaded = value; }

// public java.util.concurrent.CompletableFuture blockListLoader() { return wrapperContained.blockListLoader; }
// public void blockListLoader(java.util.concurrent.CompletableFuture value) { wrapperContained.blockListLoader = value; }
// public static java.util.concurrent.CompletableFuture blockListLoader() { return net.minecraft.client.network.SocialInteractionsManager.blockListLoader; }
// public static void blockListLoader(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.network.SocialInteractionsManager.blockListLoader = value; }

public SocialInteractionsManager(yarnwrap.client.MinecraftClient client,com.mojang.authlib.minecraft.UserApiService userApiService) { this.wrapperContained = new net.minecraft.client.network.SocialInteractionsManager(client.wrapperContained,userApiService); }
public java.util.Set getHiddenPlayers() { return wrapperContained.getHiddenPlayers(); }
// public static java.util.Set getHiddenPlayers() { return net.minecraft.client.network.SocialInteractionsManager.getHiddenPlayers(); }
public void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player) { wrapperContained.setPlayerOnline(player.wrapperContained); }
// public static void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player, ) { net.minecraft.client.network.SocialInteractionsManager.setPlayerOnline(player.wrapperContained); }
public void hidePlayer(java.util.UUID uuid) { wrapperContained.hidePlayer(uuid); }
// public static void hidePlayer(java.util.UUID uuid, ) { net.minecraft.client.network.SocialInteractionsManager.hidePlayer(uuid); }
public void showPlayer(java.util.UUID uuid) { wrapperContained.showPlayer(uuid); }
// public static void showPlayer(java.util.UUID uuid, ) { net.minecraft.client.network.SocialInteractionsManager.showPlayer(uuid); }
public boolean isPlayerHidden(java.util.UUID uuid) { return wrapperContained.isPlayerHidden(uuid); }
// public static boolean isPlayerHidden(java.util.UUID uuid, ) { return net.minecraft.client.network.SocialInteractionsManager.isPlayerHidden(uuid); }
public void setPlayerOffline(java.util.UUID uuid) { wrapperContained.setPlayerOffline(uuid); }
// public static void setPlayerOffline(java.util.UUID uuid, ) { net.minecraft.client.network.SocialInteractionsManager.setPlayerOffline(uuid); }
public boolean isPlayerMuted(java.util.UUID uuid) { return wrapperContained.isPlayerMuted(uuid); }
// public static boolean isPlayerMuted(java.util.UUID uuid, ) { return net.minecraft.client.network.SocialInteractionsManager.isPlayerMuted(uuid); }
public boolean isPlayerBlocked(java.util.UUID uuid) { return wrapperContained.isPlayerBlocked(uuid); }
// public static boolean isPlayerBlocked(java.util.UUID uuid, ) { return net.minecraft.client.network.SocialInteractionsManager.isPlayerBlocked(uuid); }
public java.util.UUID getUuid(java.lang.String playerName) { return wrapperContained.getUuid(playerName); }
// public static java.util.UUID getUuid(java.lang.String playerName, ) { return net.minecraft.client.network.SocialInteractionsManager.getUuid(playerName); }
public void loadBlockList() { wrapperContained.loadBlockList(); }
// public static void loadBlockList() { net.minecraft.client.network.SocialInteractionsManager.loadBlockList(); }
public void unloadBlockList() { wrapperContained.unloadBlockList(); }
// public static void unloadBlockList() { net.minecraft.client.network.SocialInteractionsManager.unloadBlockList(); }

}