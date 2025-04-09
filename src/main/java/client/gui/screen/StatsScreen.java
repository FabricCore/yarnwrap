package yarnwrap.client.gui.screen;
public class StatsScreen { public net.minecraft.client.gui.screen.StatsScreen wrapperContained; public StatsScreen(net.minecraft.client.gui.screen.StatsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object itemStats() { return wrapperContained.itemStats; }
// public yarnwrap.client.gui.widget.AlwaysSelectedEntryListWidget selectedList() { return new yarnwrap.client.gui.widget.AlwaysSelectedEntryListWidget(wrapperContained.selectedList); }
// public Object generalStats() { return wrapperContained.generalStats; }
// public boolean downloadingStats() { return wrapperContained.downloadingStats; }
// public Object mobStats() { return wrapperContained.mobStats; }
// public yarnwrap.stat.StatHandler statHandler() { return new yarnwrap.stat.StatHandler(wrapperContained.statHandler); }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.text.Text DOWNLOADING_STATS_TEXT() { return new yarnwrap.text.Text(wrapperContained.DOWNLOADING_STATS_TEXT); }
// public yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_TEXTURE); }
// public yarnwrap.util.Identifier HEADER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HEADER_TEXTURE); }
// public yarnwrap.util.Identifier SORT_UP_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SORT_UP_TEXTURE); }
// public yarnwrap.util.Identifier SORT_DOWN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SORT_DOWN_TEXTURE); }
// public yarnwrap.text.Text NONE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NONE_TEXT); }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public yarnwrap.text.Text GENERAL_BUTTON_TEXT() { return new yarnwrap.text.Text(wrapperContained.GENERAL_BUTTON_TEXT); }
// public yarnwrap.text.Text ITEM_BUTTON_TEXT() { return new yarnwrap.text.Text(wrapperContained.ITEM_BUTTON_TEXT); }
// public yarnwrap.text.Text MOBS_BUTTON_TEXT() { return new yarnwrap.text.Text(wrapperContained.MOBS_BUTTON_TEXT); }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
public void selectStatList(yarnwrap.client.gui.widget.AlwaysSelectedEntryListWidget list) { wrapperContained.selectStatList(list.wrapperContained); }
public void createButtons() { wrapperContained.createButtons(); }
public void createLists() { wrapperContained.createLists(); }
public void onStatsReady() { wrapperContained.onStatsReady(); }
// public java.lang.String getStatTranslationKey(yarnwrap.stat.Stat stat) { return wrapperContained.getStatTranslationKey(stat.wrapperContained); }

}