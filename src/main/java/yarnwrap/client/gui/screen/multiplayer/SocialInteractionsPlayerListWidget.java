package yarnwrap.client.gui.screen.multiplayer;
public class SocialInteractionsPlayerListWidget { public net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget wrapperContained; public SocialInteractionsPlayerListWidget(net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen parent() { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen value) { wrapperContained.parent = value.wrapperContained; }
// public java.util.List players() { return wrapperContained.players; }
// public void players(java.util.List value) { wrapperContained.players = value; }
// public java.lang.String currentSearch() { return wrapperContained.currentSearch; }
// public void currentSearch(java.lang.String value) { wrapperContained.currentSearch = value; }
public SocialInteractionsPlayerListWidget(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen parent,yarnwrap.client.MinecraftClient client,int width,int height,int y,int itemHeight) { this.wrapperContained = new net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget(parent.wrapperContained,client.wrapperContained,width,height,y,itemHeight); }
// public boolean method_31342(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player) { return wrapperContained.method_31342(player.wrapperContained); }
// public void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player,Object tab) { wrapperContained.setPlayerOnline(player.wrapperContained,tab); }
public void setCurrentSearch(java.lang.String currentSearch) { wrapperContained.setCurrentSearch(currentSearch); }
public void setPlayerOffline(java.util.UUID uuid) { wrapperContained.setPlayerOffline(uuid); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public void filterPlayers() { wrapperContained.filterPlayers(); }
public void update(java.util.Collection uuids,double scrollAmount,boolean includeOffline) { wrapperContained.update(uuids,scrollAmount,includeOffline); }
// public void refresh(java.util.Collection players,double scrollAmount) { wrapperContained.refresh(players,scrollAmount); }
// public void setPlayers(java.util.Collection playerUuids,java.util.Map entriesByUuids) { wrapperContained.setPlayers(playerUuids,entriesByUuids); }
// public yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry method_44758(com.mojang.authlib.GameProfile uuid) { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry(wrapperContained.method_44758(uuid)); }
// public void markOfflineMembers(java.util.Map entries,boolean includeOffline) { wrapperContained.markOfflineMembers(entries,includeOffline); }
// public java.lang.Integer method_44760(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player) { return wrapperContained.method_44760(player.wrapperContained); }
// public java.lang.Integer method_44761(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player) { return wrapperContained.method_44761(player.wrapperContained); }
// public void sortPlayers() { wrapperContained.sortPlayers(); }
// public java.util.Collection collectReportableProfiles(yarnwrap.client.session.report.log.ChatLog log) { return wrapperContained.collectReportableProfiles(log.wrapperContained); }

}