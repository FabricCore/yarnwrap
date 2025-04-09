package yarnwrap.client.gui.screen.multiplayer;
public class SocialInteractionsScreen { public net.minecraft.client.gui.screen.multiplayer.SocialInteractionsScreen wrapperContained; public SocialInteractionsScreen(net.minecraft.client.gui.screen.multiplayer.SocialInteractionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int playerCount() { return wrapperContained.playerCount; }
// public yarnwrap.text.Text ALL_TAB_TITLE() { return new yarnwrap.text.Text(wrapperContained.ALL_TAB_TITLE); }
// public yarnwrap.text.Text HIDDEN_TAB_TITLE() { return new yarnwrap.text.Text(wrapperContained.HIDDEN_TAB_TITLE); }
// public yarnwrap.text.Text SELECTED_ALL_TAB_TITLE() { return new yarnwrap.text.Text(wrapperContained.SELECTED_ALL_TAB_TITLE); }
// public yarnwrap.text.Text SELECTED_HIDDEN_TAB_TITLE() { return new yarnwrap.text.Text(wrapperContained.SELECTED_HIDDEN_TAB_TITLE); }
// public yarnwrap.text.Text SEARCH_TEXT() { return new yarnwrap.text.Text(wrapperContained.SEARCH_TEXT); }
// public yarnwrap.text.Text EMPTY_HIDDEN_TEXT() { return new yarnwrap.text.Text(wrapperContained.EMPTY_HIDDEN_TEXT); }
// public yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget playerList() { return new yarnwrap.client.gui.screen.multiplayer.SocialInteractionsPlayerListWidget(wrapperContained.playerList); }
// public yarnwrap.client.gui.widget.TextFieldWidget searchBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.searchBox); }
// public java.lang.String currentSearch() { return wrapperContained.currentSearch; }
// public Object currentTab() { return wrapperContained.currentTab; }
// public yarnwrap.client.gui.widget.ButtonWidget allTabButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.allTabButton); }
// public yarnwrap.client.gui.widget.ButtonWidget hiddenTabButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.hiddenTabButton); }
// public yarnwrap.text.Text serverLabel() { return new yarnwrap.text.Text(wrapperContained.serverLabel); }
// public yarnwrap.client.gui.widget.ButtonWidget blockedTabButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.blockedTabButton); }
// public yarnwrap.client.gui.widget.ButtonWidget blockingButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.blockingButton); }
// public yarnwrap.text.Text BLOCKED_TAB_TITLE() { return new yarnwrap.text.Text(wrapperContained.BLOCKED_TAB_TITLE); }
// public yarnwrap.text.Text SELECTED_BLOCKED_TAB_TITLE() { return new yarnwrap.text.Text(wrapperContained.SELECTED_BLOCKED_TAB_TITLE); }
// public yarnwrap.text.Text EMPTY_SEARCH_TEXT() { return new yarnwrap.text.Text(wrapperContained.EMPTY_SEARCH_TEXT); }
// public yarnwrap.text.Text EMPTY_BLOCKED_TEXT() { return new yarnwrap.text.Text(wrapperContained.EMPTY_BLOCKED_TEXT); }
// public yarnwrap.text.Text BLOCKING_TEXT() { return new yarnwrap.text.Text(wrapperContained.BLOCKING_TEXT); }
// public yarnwrap.util.Identifier BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier SEARCH_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SEARCH_ICON_TEXTURE); }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void updateServerLabel(yarnwrap.client.MinecraftClient client) { wrapperContained.updateServerLabel(client.wrapperContained); }
// public void setCurrentTab(Object currentTab) { wrapperContained.setCurrentTab(currentTab); }
public void setPlayerOnline(yarnwrap.client.network.PlayerListEntry player) { wrapperContained.setPlayerOnline(player.wrapperContained); }
public void setPlayerOffline(java.util.UUID uuid) { wrapperContained.setPlayerOffline(uuid); }
// public void onSearchChange(java.lang.String currentSearch) { wrapperContained.onSearchChange(currentSearch); }
// public int getScreenHeight() { return wrapperContained.getScreenHeight(); }
// public int getPlayerListBottom() { return wrapperContained.getPlayerListBottom(); }
// public int getSearchBoxX() { return wrapperContained.getSearchBoxX(); }

}