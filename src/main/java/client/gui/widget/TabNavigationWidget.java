package yarnwrap.client.gui.widget;
public class TabNavigationWidget { public net.minecraft.client.gui.widget.TabNavigationWidget wrapperContained; public TabNavigationWidget(net.minecraft.client.gui.widget.TabNavigationWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tabNavWidth() { return wrapperContained.tabNavWidth; }
// public yarnwrap.client.gui.tab.TabManager tabManager() { return new yarnwrap.client.gui.tab.TabManager(wrapperContained.tabManager); }
// public com.google.common.collect.ImmutableList tabs() { return wrapperContained.tabs; }
// public com.google.common.collect.ImmutableList tabButtons() { return wrapperContained.tabButtons; }
// public yarnwrap.text.Text USAGE_NARRATION_TEXT() { return new yarnwrap.text.Text(wrapperContained.USAGE_NARRATION_TEXT); }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget grid() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.grid); }
public void setWidth(int width) { wrapperContained.setWidth(width); }
public Object builder(yarnwrap.client.gui.tab.TabManager tabManager,int width) { return wrapperContained.builder(tabManager.wrapperContained,width); }
public void selectTab(int index,boolean clickSound) { wrapperContained.selectTab(index,clickSound); }
public boolean trySwitchTabsWithKey(int keyCode) { return wrapperContained.trySwitchTabsWithKey(keyCode); }
// public int getCurrentTabIndex() { return wrapperContained.getCurrentTabIndex(); }
// public int getTabForKey(int keyCode) { return wrapperContained.getTabForKey(keyCode); }
// public void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder,yarnwrap.client.gui.widget.TabButtonWidget button) { wrapperContained.appendNarrations(builder.wrapperContained,button.wrapperContained); }
public void init() { wrapperContained.init(); }
// public yarnwrap.client.gui.widget.TabButtonWidget getCurrentTabButton() { return new yarnwrap.client.gui.widget.TabButtonWidget(wrapperContained.getCurrentTabButton()); }

}