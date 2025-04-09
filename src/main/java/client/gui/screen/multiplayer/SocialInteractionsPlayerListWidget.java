package yarnwrap.client.gui.screen.multiplayer;
public class SocialInteractionsPlayerListWidget { public net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget wrapperContained; public SocialInteractionsPlayerListWidget(net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen parent() { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsScreen(wrapperContained.parent); }
// public java.util.List players() { return wrapperContained.players; }
// public java.lang.String currentSearch() { return wrapperContained.currentSearch; }
// public void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player,Object tab) { wrapperContained.setPlayerOnline(player.wrapperContained,tab); }
public void setCurrentSearch(java.lang.String currentSearch) { wrapperContained.setCurrentSearch(currentSearch); }
public void setPlayerOffline(java.util.UUID uuid) { wrapperContained.setPlayerOffline(uuid); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public void filterPlayers() { wrapperContained.filterPlayers(); }
public void update(java.util.Collection uuids,double scrollAmount,boolean includeOffline) { wrapperContained.update(uuids,scrollAmount,includeOffline); }
// public void refresh(java.util.Collection players,double scrollAmount) { wrapperContained.refresh(players,scrollAmount); }
// public void setPlayers(java.util.Collection playerUuids,java.util.Map entriesByUuids) { wrapperContained.setPlayers(playerUuids,entriesByUuids); }
// public void markOfflineMembers(java.util.Map entries,boolean includeOffline) { wrapperContained.markOfflineMembers(entries,includeOffline); }
// public void sortPlayers() { wrapperContained.sortPlayers(); }
// public java.util.Collection collectReportableProfiles(yarnwrap.client.session.report.log.ChatLog log) { return wrapperContained.collectReportableProfiles(log.wrapperContained); }

}