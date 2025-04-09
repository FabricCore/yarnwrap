package yarnwrap.client.gui.screen.ingame;
public class CreativeInventoryScreen { public net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen wrapperContained; public CreativeInventoryScreen(net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set searchResultTags() { return wrapperContained.searchResultTags; }
// public yarnwrap.text.Text DELETE_ITEM_SLOT_TEXT() { return new yarnwrap.text.Text(wrapperContained.DELETE_ITEM_SLOT_TEXT); }
// public java.util.List slots() { return wrapperContained.slots; }
// public boolean lastClickOutsideBounds() { return wrapperContained.lastClickOutsideBounds; }
// public boolean ignoreTypedCharacter() { return wrapperContained.ignoreTypedCharacter; }
// public yarnwrap.screen.slot.Slot deleteItemSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.deleteItemSlot); }
// public float scrollPosition() { return wrapperContained.scrollPosition; }
// public yarnwrap.client.gui.screen.ingame.CreativeInventoryListener listener() { return new yarnwrap.client.gui.screen.ingame.CreativeInventoryListener(wrapperContained.listener); }
// public boolean scrolling() { return wrapperContained.scrolling; }
// public yarnwrap.client.gui.widget.TextFieldWidget searchBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.searchBox); }
// public yarnwrap.inventory.SimpleInventory INVENTORY() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.INVENTORY); }
// public yarnwrap.item.ItemGroup selectedTab() { return new yarnwrap.item.ItemGroup(wrapperContained.selectedTab); }
// public int ROWS_COUNT() { return wrapperContained.ROWS_COUNT; }
// public int COLUMNS_COUNT() { return wrapperContained.COLUMNS_COUNT; }
// public int TAB_WIDTH() { return wrapperContained.TAB_WIDTH; }
// public int TAB_HEIGHT() { return wrapperContained.TAB_HEIGHT; }
// public int SCROLLBAR_WIDTH() { return wrapperContained.SCROLLBAR_WIDTH; }
// public int SCROLLBAR_HEIGHT() { return wrapperContained.SCROLLBAR_HEIGHT; }
// public int WHITE() { return wrapperContained.WHITE; }
// public boolean operatorTabEnabled() { return wrapperContained.operatorTabEnabled; }
// public net.minecraft.util.Identifier[] TAB_TOP_SELECTED_TEXTURES() { return wrapperContained.TAB_TOP_SELECTED_TEXTURES; }
// public net.minecraft.util.Identifier[] TAB_BOTTOM_UNSELECTED_TEXTURES() { return wrapperContained.TAB_BOTTOM_UNSELECTED_TEXTURES; }
// public net.minecraft.util.Identifier[] TAB_BOTTOM_SELECTED_TEXTURES() { return wrapperContained.TAB_BOTTOM_SELECTED_TEXTURES; }
// public yarnwrap.util.Identifier SCROLLER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_TEXTURE); }
// public yarnwrap.util.Identifier SCROLLER_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_DISABLED_TEXTURE); }
// public net.minecraft.util.Identifier[] TAB_TOP_UNSELECTED_TEXTURES() { return wrapperContained.TAB_TOP_UNSELECTED_TEXTURES; }
// public void searchForTags(java.lang.String id) { wrapperContained.searchForTags(id); }
public void onHotbarKeyPress(yarnwrap.client.MinecraftClient client,int index,boolean restore,boolean save) { wrapperContained.onHotbarKeyPress(client.wrapperContained,index,restore,save); }
// public boolean isClickInTab(yarnwrap.item.ItemGroup group,double mouseX,double mouseY) { return wrapperContained.isClickInTab(group.wrapperContained,mouseX,mouseY); }
// public void search() { wrapperContained.search(); }
// public boolean hasScrollbar() { return wrapperContained.hasScrollbar(); }
// public void setSelectedTab(yarnwrap.item.ItemGroup group) { wrapperContained.setSelectedTab(group.wrapperContained); }
// public boolean isClickInScrollbar(double mouseX,double mouseY) { return wrapperContained.isClickInScrollbar(mouseX,mouseY); }
// public void renderTabIcon(yarnwrap.client.gui.DrawContext context,yarnwrap.item.ItemGroup group) { wrapperContained.renderTabIcon(context.wrapperContained,group.wrapperContained); }
// public boolean isCreativeInventorySlot(yarnwrap.screen.slot.Slot slot) { return wrapperContained.isCreativeInventorySlot(slot.wrapperContained); }
// public boolean renderTabTooltipIfHovered(yarnwrap.client.gui.DrawContext context,yarnwrap.item.ItemGroup group,int mouseX,int mouseY) { return wrapperContained.renderTabTooltipIfHovered(context.wrapperContained,group.wrapperContained,mouseX,mouseY); }
// public boolean shouldShowOperatorTab(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.shouldShowOperatorTab(player.wrapperContained); }
// public void updateDisplayParameters(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean showOperatorTab,Object registryLookup) { wrapperContained.updateDisplayParameters(enabledFeatures.wrapperContained,showOperatorTab,registryLookup); }
// public void refreshSelectedTab(java.util.Collection displayStacks) { wrapperContained.refreshSelectedTab(displayStacks); }
// public int getTabX(yarnwrap.item.ItemGroup group) { return wrapperContained.getTabX(group.wrapperContained); }
// public int getTabY(yarnwrap.item.ItemGroup group) { return wrapperContained.getTabY(group.wrapperContained); }
public boolean isInventoryTabSelected() { return wrapperContained.isInventoryTabSelected(); }
// public boolean populateDisplay(yarnwrap.client.search.SearchManager searchManager,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean showOperatorTab,Object registryLookup) { return wrapperContained.populateDisplay(searchManager.wrapperContained,enabledFeatures.wrapperContained,showOperatorTab,registryLookup); }

}