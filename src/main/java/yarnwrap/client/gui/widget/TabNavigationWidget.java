package yarnwrap.client.gui.widget;
public class TabNavigationWidget { public net.minecraft.client.gui.widget.TabNavigationWidget wrapperContained; public TabNavigationWidget(net.minecraft.client.gui.widget.TabNavigationWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tabNavWidth() { return wrapperContained.tabNavWidth; }
// public void tabNavWidth(int value) { wrapperContained.tabNavWidth = value; }
// public static int tabNavWidth() { return net.minecraft.client.gui.widget.TabNavigationWidget.tabNavWidth; }
// public static void tabNavWidth(int value, ) { net.minecraft.client.gui.widget.TabNavigationWidget.tabNavWidth = value; }

// public yarnwrap.client.gui.tab.TabManager tabManager() { return new yarnwrap.client.gui.tab.TabManager(wrapperContained.tabManager); }
// public void tabManager(yarnwrap.client.gui.tab.TabManager value) { wrapperContained.tabManager = value.wrapperContained; }
// public static yarnwrap.client.gui.tab.TabManager tabManager() { return new yarnwrap.client.gui.tab.TabManager(net.minecraft.client.gui.widget.TabNavigationWidget.tabManager); }
// public static void tabManager(yarnwrap.client.gui.tab.TabManager value, ) { net.minecraft.client.gui.widget.TabNavigationWidget.tabManager = value.wrapperContained; }

// public com.google.common.collect.ImmutableList tabs() { return wrapperContained.tabs; }
// public void tabs(com.google.common.collect.ImmutableList value) { wrapperContained.tabs = value; }
// public static com.google.common.collect.ImmutableList tabs() { return net.minecraft.client.gui.widget.TabNavigationWidget.tabs; }
// public static void tabs(com.google.common.collect.ImmutableList value, ) { net.minecraft.client.gui.widget.TabNavigationWidget.tabs = value; }

// public com.google.common.collect.ImmutableList tabButtons() { return wrapperContained.tabButtons; }
// public void tabButtons(com.google.common.collect.ImmutableList value) { wrapperContained.tabButtons = value; }
// public static com.google.common.collect.ImmutableList tabButtons() { return net.minecraft.client.gui.widget.TabNavigationWidget.tabButtons; }
// public static void tabButtons(com.google.common.collect.ImmutableList value, ) { net.minecraft.client.gui.widget.TabNavigationWidget.tabButtons = value; }

// public yarnwrap.text.Text USAGE_NARRATION_TEXT() { return new yarnwrap.text.Text(wrapperContained.USAGE_NARRATION_TEXT); }
// public void USAGE_NARRATION_TEXT(yarnwrap.text.Text value) { wrapperContained.USAGE_NARRATION_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text USAGE_NARRATION_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.widget.TabNavigationWidget.USAGE_NARRATION_TEXT); }
// public static void USAGE_NARRATION_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.widget.TabNavigationWidget.USAGE_NARRATION_TEXT = value.wrapperContained; }

// public yarnwrap.client.gui.widget.DirectionalLayoutWidget grid() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.grid); }
// public void grid(yarnwrap.client.gui.widget.DirectionalLayoutWidget value) { wrapperContained.grid = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.DirectionalLayoutWidget grid() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(net.minecraft.client.gui.widget.TabNavigationWidget.grid); }
// public static void grid(yarnwrap.client.gui.widget.DirectionalLayoutWidget value, ) { net.minecraft.client.gui.widget.TabNavigationWidget.grid = value.wrapperContained; }

// public TabNavigationWidget(int x,yarnwrap.client.gui.tab.TabManager tabManager,java.lang.Iterable tabs) { this.wrapperContained = new net.minecraft.client.gui.widget.TabNavigationWidget(x,tabManager.wrapperContained,tabs); }
public void setWidth(int width) { wrapperContained.setWidth(width); }
// public static void setWidth(int width, ) { net.minecraft.client.gui.widget.TabNavigationWidget.setWidth(width); }
// public Object builder(yarnwrap.client.gui.tab.TabManager tabManager,int width) { return wrapperContained.builder(tabManager.wrapperContained,width); }
// public static Object builder(yarnwrap.client.gui.tab.TabManager tabManager,int width, ) { return net.minecraft.client.gui.widget.TabNavigationWidget.builder(tabManager.wrapperContained,width); }
public void selectTab(int index,boolean clickSound) { wrapperContained.selectTab(index,clickSound); }
// public static void selectTab(int index,boolean clickSound, ) { net.minecraft.client.gui.widget.TabNavigationWidget.selectTab(index,clickSound); }
public boolean trySwitchTabsWithKey(int keyCode) { return wrapperContained.trySwitchTabsWithKey(keyCode); }
// public static boolean trySwitchTabsWithKey(int keyCode, ) { return net.minecraft.client.gui.widget.TabNavigationWidget.trySwitchTabsWithKey(keyCode); }
// public int getCurrentTabIndex() { return wrapperContained.getCurrentTabIndex(); }
// public static int getCurrentTabIndex() { return net.minecraft.client.gui.widget.TabNavigationWidget.getCurrentTabIndex(); }
// public int getTabForKey(int keyCode) { return wrapperContained.getTabForKey(keyCode); }
// public static int getTabForKey(int keyCode, ) { return net.minecraft.client.gui.widget.TabNavigationWidget.getTabForKey(keyCode); }
// public void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder,yarnwrap.client.gui.widget.TabButtonWidget button) { wrapperContained.appendNarrations(builder.wrapperContained,button.wrapperContained); }
// public static void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder,yarnwrap.client.gui.widget.TabButtonWidget button, ) { net.minecraft.client.gui.widget.TabNavigationWidget.appendNarrations(builder.wrapperContained,button.wrapperContained); }
public void init() { wrapperContained.init(); }
// public static void init() { net.minecraft.client.gui.widget.TabNavigationWidget.init(); }
// public void method_49614(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder button) { wrapperContained.method_49614(button.wrapperContained); }
// public static void method_49614(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder button, ) { net.minecraft.client.gui.widget.TabNavigationWidget.method_49614(button.wrapperContained); }
// public yarnwrap.client.gui.widget.TabButtonWidget getCurrentTabButton() { return new yarnwrap.client.gui.widget.TabButtonWidget(wrapperContained.getCurrentTabButton()); }
// public static yarnwrap.client.gui.widget.TabButtonWidget getCurrentTabButton() { return new yarnwrap.client.gui.widget.TabButtonWidget(net.minecraft.client.gui.widget.TabNavigationWidget.getCurrentTabButton()); }

}