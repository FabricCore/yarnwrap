package yarnwrap.client.network;
public class SocialInteractionsManager { public net.minecraft.client.network.SocialInteractionsManager wrapperContained; public SocialInteractionsManager(net.minecraft.client.network.SocialInteractionsManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Set hiddenPlayers() { return wrapperContained.hiddenPlayers; }
// public void hiddenPlayers(java.util.Set value) { wrapperContained.hiddenPlayers = value; }
// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public java.util.Map playerNameByUuid() { return wrapperContained.playerNameByUuid; }
// public void playerNameByUuid(java.util.Map value) { wrapperContained.playerNameByUuid = value; }
// public boolean blockListLoaded() { return wrapperContained.blockListLoaded; }
// public void blockListLoaded(boolean value) { wrapperContained.blockListLoaded = value; }
// public java.util.concurrent.CompletableFuture blockListLoader() { return wrapperContained.blockListLoader; }
// public void blockListLoader(java.util.concurrent.CompletableFuture value) { wrapperContained.blockListLoader = value; }
public SocialInteractionsManager(yarnwrap.client.MinecraftClient client,com.mojang.authlib.minecraft.UserApiService userApiService) { this.wrapperContained = new net.minecraft.client.network.SocialInteractionsManager(client.wrapperContained,userApiService); }
public java.util.Set getHiddenPlayers() { return wrapperContained.getHiddenPlayers(); }
public void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player) { wrapperContained.setPlayerOnline(player.wrapperContained); }
public void hidePlayer(java.util.UUID uuid) { wrapperContained.hidePlayer(uuid); }
public void showPlayer(java.util.UUID uuid) { wrapperContained.showPlayer(uuid); }
public boolean isPlayerHidden(java.util.UUID uuid) { return wrapperContained.isPlayerHidden(uuid); }
public void setPlayerOffline(java.util.UUID uuid) { wrapperContained.setPlayerOffline(uuid); }
public boolean isPlayerMuted(java.util.UUID uuid) { return wrapperContained.isPlayerMuted(uuid); }
public boolean isPlayerBlocked(java.util.UUID uuid) { return wrapperContained.isPlayerBlocked(uuid); }
public java.util.UUID getUuid(java.lang.String playerName) { return wrapperContained.getUuid(playerName); }
public void loadBlockList() { wrapperContained.loadBlockList(); }
public void unloadBlockList() { wrapperContained.unloadBlockList(); }

}