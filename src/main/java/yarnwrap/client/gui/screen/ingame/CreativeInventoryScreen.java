package yarnwrap.client.gui.screen.ingame;
public class CreativeInventoryScreen { public net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen wrapperContained; public CreativeInventoryScreen(net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set searchResultTags() { return wrapperContained.searchResultTags; }
// public void searchResultTags(java.util.Set value) { wrapperContained.searchResultTags = value; }
// public yarnwrap.text.Text DELETE_ITEM_SLOT_TEXT() { return new yarnwrap.text.Text(wrapperContained.DELETE_ITEM_SLOT_TEXT); }
// public void DELETE_ITEM_SLOT_TEXT(yarnwrap.text.Text value) { wrapperContained.DELETE_ITEM_SLOT_TEXT = value.wrapperContained; }
// public java.util.List slots() { return wrapperContained.slots; }
// public void slots(java.util.List value) { wrapperContained.slots = value; }
// public boolean lastClickOutsideBounds() { return wrapperContained.lastClickOutsideBounds; }
// public void lastClickOutsideBounds(boolean value) { wrapperContained.lastClickOutsideBounds = value; }
// public boolean ignoreTypedCharacter() { return wrapperContained.ignoreTypedCharacter; }
// public void ignoreTypedCharacter(boolean value) { wrapperContained.ignoreTypedCharacter = value; }
// public yarnwrap.screen.slot.Slot deleteItemSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.deleteItemSlot); }
// public void deleteItemSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.deleteItemSlot = value.wrapperContained; }
// public float scrollPosition() { return wrapperContained.scrollPosition; }
// public void scrollPosition(float value) { wrapperContained.scrollPosition = value; }
// public yarnwrap.client.gui.screen.ingame.CreativeInventoryListener listener() { return new yarnwrap.client.gui.screen.ingame.CreativeInventoryListener(wrapperContained.listener); }
// public void listener(yarnwrap.client.gui.screen.ingame.CreativeInventoryListener value) { wrapperContained.listener = value.wrapperContained; }
// public boolean scrolling() { return wrapperContained.scrolling; }
// public void scrolling(boolean value) { wrapperContained.scrolling = value; }
// public yarnwrap.client.gui.widget.TextFieldWidget searchBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.searchBox); }
// public void searchBox(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.searchBox = value.wrapperContained; }
// public yarnwrap.inventory.SimpleInventory INVENTORY() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.INVENTORY); }
// public void INVENTORY(yarnwrap.inventory.SimpleInventory value) { wrapperContained.INVENTORY = value.wrapperContained; }
// public yarnwrap.item.ItemGroup selectedTab() { return new yarnwrap.item.ItemGroup(wrapperContained.selectedTab); }
// public void selectedTab(yarnwrap.item.ItemGroup value) { wrapperContained.selectedTab = value.wrapperContained; }
// public int ROWS_COUNT() { return wrapperContained.ROWS_COUNT; }
// public void ROWS_COUNT(int value) { wrapperContained.ROWS_COUNT = value; }
// public int COLUMNS_COUNT() { return wrapperContained.COLUMNS_COUNT; }
// public void COLUMNS_COUNT(int value) { wrapperContained.COLUMNS_COUNT = value; }
// public int TAB_WIDTH() { return wrapperContained.TAB_WIDTH; }
// public void TAB_WIDTH(int value) { wrapperContained.TAB_WIDTH = value; }
// public int TAB_HEIGHT() { return wrapperContained.TAB_HEIGHT; }
// public void TAB_HEIGHT(int value) { wrapperContained.TAB_HEIGHT = value; }
// public int SCROLLBAR_WIDTH() { return wrapperContained.SCROLLBAR_WIDTH; }
// public void SCROLLBAR_WIDTH(int value) { wrapperContained.SCROLLBAR_WIDTH = value; }
// public int SCROLLBAR_HEIGHT() { return wrapperContained.SCROLLBAR_HEIGHT; }
// public void SCROLLBAR_HEIGHT(int value) { wrapperContained.SCROLLBAR_HEIGHT = value; }
// public int WHITE() { return wrapperContained.WHITE; }
// public void WHITE(int value) { wrapperContained.WHITE = value; }
// public boolean operatorTabEnabled() { return wrapperContained.operatorTabEnabled; }
// public void operatorTabEnabled(boolean value) { wrapperContained.operatorTabEnabled = value; }
// public net.minecraft.util.Identifier[] TAB_TOP_SELECTED_TEXTURES() { return wrapperContained.TAB_TOP_SELECTED_TEXTURES; }
// public void TAB_TOP_SELECTED_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.TAB_TOP_SELECTED_TEXTURES = value; }
// public net.minecraft.util.Identifier[] TAB_BOTTOM_UNSELECTED_TEXTURES() { return wrapperContained.TAB_BOTTOM_UNSELECTED_TEXTURES; }
// public void TAB_BOTTOM_UNSELECTED_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.TAB_BOTTOM_UNSELECTED_TEXTURES = value; }
// public net.minecraft.util.Identifier[] TAB_BOTTOM_SELECTED_TEXTURES() { return wrapperContained.TAB_BOTTOM_SELECTED_TEXTURES; }
// public void TAB_BOTTOM_SELECTED_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.TAB_BOTTOM_SELECTED_TEXTURES = value; }
// public yarnwrap.util.Identifier SCROLLER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_TEXTURE); }
// public void SCROLLER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLLER_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SCROLLER_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_DISABLED_TEXTURE); }
// public void SCROLLER_DISABLED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLLER_DISABLED_TEXTURE = value.wrapperContained; }
// public net.minecraft.util.Identifier[] TAB_TOP_UNSELECTED_TEXTURES() { return wrapperContained.TAB_TOP_UNSELECTED_TEXTURES; }
// public void TAB_TOP_UNSELECTED_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.TAB_TOP_UNSELECTED_TEXTURES = value; }
public CreativeInventoryScreen(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean operatorTabEnabled) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen(player.wrapperContained,enabledFeatures.wrapperContained,operatorTabEnabled); }
// public void searchForTags(java.lang.String id) { wrapperContained.searchForTags(id); }
// public boolean method_15873(java.util.function.Predicate tag) { return wrapperContained.method_15873(tag); }
// public boolean method_15874(java.lang.String id) { return wrapperContained.method_15874(id); }
// public boolean method_15875(java.lang.String id) { return wrapperContained.method_15875(id); }
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
// public void method_51455(yarnwrap.item.ItemStack tagKey) { wrapperContained.method_51455(tagKey.wrapperContained); }
// public boolean populateDisplay(yarnwrap.client.search.SearchManager searchManager,yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures,boolean showOperatorTab,Object registryLookup) { return wrapperContained.populateDisplay(searchManager.wrapperContained,enabledFeatures.wrapperContained,showOperatorTab,registryLookup); }

}