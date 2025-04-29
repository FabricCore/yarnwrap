package yarnwrap.client.gui.screen.multiplayer;
public class SocialInteractionsPlayerListWidget { public net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget wrapperContained; public SocialInteractionsPlayerListWidget(net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen parent() { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen parent() { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen(net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.parent); }
// public static void parent(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen value, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.parent = value.wrapperContained; }

// public java.util.List players() { return wrapperContained.players; }
// public void players(java.util.List value) { wrapperContained.players = value; }
// public static java.util.List players() { return net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.players; }
// public static void players(java.util.List value, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.players = value; }

// public java.lang.String currentSearch() { return wrapperContained.currentSearch; }
// public void currentSearch(java.lang.String value) { wrapperContained.currentSearch = value; }
// public static java.lang.String currentSearch() { return net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.currentSearch; }
// public static void currentSearch(java.lang.String value, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.currentSearch = value; }

public SocialInteractionsPlayerListWidget(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen parent,yarnwrap.client.MinecraftClient client,int width,int height,int y,int itemHeight) { this.wrapperContained = new net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget(parent.wrapperContained,client.wrapperContained,width,height,y,itemHeight); }
// public boolean method_31342(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player) { return wrapperContained.method_31342(player.wrapperContained); }
// public static boolean method_31342(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player, ) { return net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.method_31342(player.wrapperContained); }
// public void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player,Object tab) { wrapperContained.setPlayerOnline(player.wrapperContained,tab); }
// public static void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player,Object tab, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.setPlayerOnline(player.wrapperContained,tab); }
public void setCurrentSearch(java.lang.String currentSearch) { wrapperContained.setCurrentSearch(currentSearch); }
// public static void setCurrentSearch(java.lang.String currentSearch, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.setCurrentSearch(currentSearch); }
public void setPlayerOffline(java.util.UUID uuid) { wrapperContained.setPlayerOffline(uuid); }
// public static void setPlayerOffline(java.util.UUID uuid, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.setPlayerOffline(uuid); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.isEmpty(); }
// public void filterPlayers() { wrapperContained.filterPlayers(); }
// public static void filterPlayers() { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.filterPlayers(); }
public void update(java.util.Collection uuids,double scrollAmount,boolean includeOffline) { wrapperContained.update(uuids,scrollAmount,includeOffline); }
// public static void update(java.util.Collection uuids,double scrollAmount,boolean includeOffline, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.update(uuids,scrollAmount,includeOffline); }
// public void refresh(java.util.Collection players,double scrollAmount) { wrapperContained.refresh(players,scrollAmount); }
// public static void refresh(java.util.Collection players,double scrollAmount, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.refresh(players,scrollAmount); }
// public void setPlayers(java.util.Collection playerUuids,java.util.Map entriesByUuids) { wrapperContained.setPlayers(playerUuids,entriesByUuids); }
// public static void setPlayers(java.util.Collection playerUuids,java.util.Map entriesByUuids, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.setPlayers(playerUuids,entriesByUuids); }
// public yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry method_44758(com.mojang.authlib.GameProfile uuid) { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry(wrapperContained.method_44758(uuid)); }
// public static yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry method_44758(com.mojang.authlib.GameProfile uuid, ) { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry(net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.method_44758(uuid)); }
// public void markOfflineMembers(java.util.Map entries,boolean includeOffline) { wrapperContained.markOfflineMembers(entries,includeOffline); }
// public static void markOfflineMembers(java.util.Map entries,boolean includeOffline, ) { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.markOfflineMembers(entries,includeOffline); }
// public java.lang.Integer method_44760(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player) { return wrapperContained.method_44760(player.wrapperContained); }
// public static java.lang.Integer method_44760(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player, ) { return net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.method_44760(player.wrapperContained); }
// public java.lang.Integer method_44761(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player) { return wrapperContained.method_44761(player.wrapperContained); }
// public static java.lang.Integer method_44761(yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry player, ) { return net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.method_44761(player.wrapperContained); }
// public void sortPlayers() { wrapperContained.sortPlayers(); }
// public static void sortPlayers() { net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.sortPlayers(); }
// public java.util.Collection collectReportableProfiles(yarnwrap.client.session.report.log.ChatLog log) { return wrapperContained.collectReportableProfiles(log.wrapperContained); }
// public static java.util.Collection collectReportableProfiles(yarnwrap.client.session.report.log.ChatLog log, ) { return net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget.collectReportableProfiles(log.wrapperContained); }

}