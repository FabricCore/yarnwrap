package yarnwrap.client.gui.screen;
public class StatsScreen { public net.minecraft.client.gui.screen.StatsScreen wrapperContained; public StatsScreen(net.minecraft.client.gui.screen.StatsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object itemStats() { return wrapperContained.itemStats; }
// // public void itemStats(Object value) { wrapperContained.itemStats = value; }
// public yarnwrap.client.gui.widget.AlwaysSelectedEntryListWidget selectedList() { return new yarnwrap.client.gui.widget.AlwaysSelectedEntryListWidget(wrapperContained.selectedList); }
// public void selectedList(yarnwrap.client.gui.widget.AlwaysSelectedEntryListWidget value) { wrapperContained.selectedList = value.wrapperContained; }
// public Object generalStats() { return wrapperContained.generalStats; }
// // public void generalStats(Object value) { wrapperContained.generalStats = value; }
// public boolean downloadingStats() { return wrapperContained.downloadingStats; }
// public void downloadingStats(boolean value) { wrapperContained.downloadingStats = value; }
// public Object mobStats() { return wrapperContained.mobStats; }
// // public void mobStats(Object value) { wrapperContained.mobStats = value; }
// public yarnwrap.stat.StatHandler statHandler() { return new yarnwrap.stat.StatHandler(wrapperContained.statHandler); }
// public void statHandler(yarnwrap.stat.StatHandler value) { wrapperContained.statHandler = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.text.Text DOWNLOADING_STATS_TEXT() { return new yarnwrap.text.Text(wrapperContained.DOWNLOADING_STATS_TEXT); }
// public void DOWNLOADING_STATS_TEXT(yarnwrap.text.Text value) { wrapperContained.DOWNLOADING_STATS_TEXT = value.wrapperContained; }
// public yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_TEXTURE); }
// public void SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HEADER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HEADER_TEXTURE); }
// public void HEADER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HEADER_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SORT_UP_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SORT_UP_TEXTURE); }
// public void SORT_UP_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SORT_UP_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SORT_DOWN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SORT_DOWN_TEXTURE); }
// public void SORT_DOWN_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SORT_DOWN_TEXTURE = value.wrapperContained; }
// public yarnwrap.text.Text NONE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NONE_TEXT); }
// public void NONE_TEXT(yarnwrap.text.Text value) { wrapperContained.NONE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text GENERAL_BUTTON_TEXT() { return new yarnwrap.text.Text(wrapperContained.GENERAL_BUTTON_TEXT); }
// public void GENERAL_BUTTON_TEXT(yarnwrap.text.Text value) { wrapperContained.GENERAL_BUTTON_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text ITEM_BUTTON_TEXT() { return new yarnwrap.text.Text(wrapperContained.ITEM_BUTTON_TEXT); }
// public void ITEM_BUTTON_TEXT(yarnwrap.text.Text value) { wrapperContained.ITEM_BUTTON_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text MOBS_BUTTON_TEXT() { return new yarnwrap.text.Text(wrapperContained.MOBS_BUTTON_TEXT); }
// public void MOBS_BUTTON_TEXT(yarnwrap.text.Text value) { wrapperContained.MOBS_BUTTON_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
public StatsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.stat.StatHandler statHandler) { this.wrapperContained = new net.minecraft.client.gui.screen.StatsScreen(parent.wrapperContained,statHandler.wrapperContained); }
public void selectStatList(yarnwrap.client.gui.widget.AlwaysSelectedEntryListWidget list) { wrapperContained.selectStatList(list.wrapperContained); }
// public void method_19866(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19866(button.wrapperContained); }
// public void method_19867(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19867(button.wrapperContained); }
// public void method_19868(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19868(button.wrapperContained); }
// public void method_19869(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19869(button.wrapperContained); }
public void createButtons() { wrapperContained.createButtons(); }
public void createLists() { wrapperContained.createLists(); }
public void onStatsReady() { wrapperContained.onStatsReady(); }
// public java.lang.String getStatTranslationKey(yarnwrap.stat.Stat stat) { return wrapperContained.getStatTranslationKey(stat.wrapperContained); }
// public void method_57739(yarnwrap.client.gui.screen.StatsScreen child) { wrapperContained.method_57739(child.wrapperContained); }

}