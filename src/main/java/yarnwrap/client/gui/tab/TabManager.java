package yarnwrap.client.gui.tab;
public class TabManager { public net.minecraft.client.gui.tab.TabManager wrapperContained; public TabManager(net.minecraft.client.gui.tab.TabManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer tabLoadWidgetConsumer() { return wrapperContained.tabLoadWidgetConsumer; }
// public void tabLoadWidgetConsumer(java.util.function.Consumer value) { wrapperContained.tabLoadWidgetConsumer = value; }
// public static java.util.function.Consumer tabLoadWidgetConsumer() { return net.minecraft.client.gui.tab.TabManager.tabLoadWidgetConsumer; }
// public static void tabLoadWidgetConsumer(java.util.function.Consumer value, ) { net.minecraft.client.gui.tab.TabManager.tabLoadWidgetConsumer = value; }

// public java.util.function.Consumer tabUnloadWidgetConsumer() { return wrapperContained.tabUnloadWidgetConsumer; }
// public void tabUnloadWidgetConsumer(java.util.function.Consumer value) { wrapperContained.tabUnloadWidgetConsumer = value; }
// public static java.util.function.Consumer tabUnloadWidgetConsumer() { return net.minecraft.client.gui.tab.TabManager.tabUnloadWidgetConsumer; }
// public static void tabUnloadWidgetConsumer(java.util.function.Consumer value, ) { net.minecraft.client.gui.tab.TabManager.tabUnloadWidgetConsumer = value; }

// public yarnwrap.client.gui.tab.Tab currentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.currentTab); }
// public void currentTab(yarnwrap.client.gui.tab.Tab value) { wrapperContained.currentTab = value.wrapperContained; }
// public static yarnwrap.client.gui.tab.Tab currentTab() { return new yarnwrap.client.gui.tab.Tab(net.minecraft.client.gui.tab.TabManager.currentTab); }
// public static void currentTab(yarnwrap.client.gui.tab.Tab value, ) { net.minecraft.client.gui.tab.TabManager.currentTab = value.wrapperContained; }

// public yarnwrap.client.gui.ScreenRect tabArea() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.tabArea); }
// public void tabArea(yarnwrap.client.gui.ScreenRect value) { wrapperContained.tabArea = value.wrapperContained; }
// public static yarnwrap.client.gui.ScreenRect tabArea() { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.tab.TabManager.tabArea); }
// public static void tabArea(yarnwrap.client.gui.ScreenRect value, ) { net.minecraft.client.gui.tab.TabManager.tabArea = value.wrapperContained; }

// public java.util.function.Consumer tabLoadTabConsumer() { return wrapperContained.tabLoadTabConsumer; }
// public void tabLoadTabConsumer(java.util.function.Consumer value) { wrapperContained.tabLoadTabConsumer = value; }
// public static java.util.function.Consumer tabLoadTabConsumer() { return net.minecraft.client.gui.tab.TabManager.tabLoadTabConsumer; }
// public static void tabLoadTabConsumer(java.util.function.Consumer value, ) { net.minecraft.client.gui.tab.TabManager.tabLoadTabConsumer = value; }

// public java.util.function.Consumer tabUnloadTabConsumer() { return wrapperContained.tabUnloadTabConsumer; }
// public void tabUnloadTabConsumer(java.util.function.Consumer value) { wrapperContained.tabUnloadTabConsumer = value; }
// public static java.util.function.Consumer tabUnloadTabConsumer() { return net.minecraft.client.gui.tab.TabManager.tabUnloadTabConsumer; }
// public static void tabUnloadTabConsumer(java.util.function.Consumer value, ) { net.minecraft.client.gui.tab.TabManager.tabUnloadTabConsumer = value; }

public TabManager(java.util.function.Consumer tabLoadWidgetConsumer,java.util.function.Consumer tabUnloadWidgetConsumer) { this.wrapperContained = new net.minecraft.client.gui.tab.TabManager(tabLoadWidgetConsumer,tabUnloadWidgetConsumer); }
// public TabManager(java.util.function.Consumer tabLoadWidgetConsumer,java.util.function.Consumer tabUnloadWidgetConsumer,java.util.function.Consumer tabLoadTabConsumer,java.util.function.Consumer tabUnloadTabConsumer) { this.wrapperContained = new net.minecraft.client.gui.tab.TabManager(tabLoadWidgetConsumer,tabUnloadWidgetConsumer,tabLoadTabConsumer,tabUnloadTabConsumer); }
public yarnwrap.client.gui.tab.Tab getCurrentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.getCurrentTab()); }
// public static yarnwrap.client.gui.tab.Tab getCurrentTab() { return new yarnwrap.client.gui.tab.Tab(net.minecraft.client.gui.tab.TabManager.getCurrentTab()); }
public void setCurrentTab(yarnwrap.client.gui.tab.Tab tab,boolean clickSound) { wrapperContained.setCurrentTab(tab.wrapperContained,clickSound); }
// public static void setCurrentTab(yarnwrap.client.gui.tab.Tab tab,boolean clickSound, ) { net.minecraft.client.gui.tab.TabManager.setCurrentTab(tab.wrapperContained,clickSound); }
public void setTabArea(yarnwrap.client.gui.ScreenRect tabArea) { wrapperContained.setTabArea(tabArea.wrapperContained); }
// public static void setTabArea(yarnwrap.client.gui.ScreenRect tabArea, ) { net.minecraft.client.gui.tab.TabManager.setTabArea(tabArea.wrapperContained); }
// public void method_71282(yarnwrap.client.gui.tab.Tab unloadedTab) { wrapperContained.method_71282(unloadedTab.wrapperContained); }
// public static void method_71282(yarnwrap.client.gui.tab.Tab unloadedTab, ) { net.minecraft.client.gui.tab.TabManager.method_71282(unloadedTab.wrapperContained); }
// public void method_71283(yarnwrap.client.gui.tab.Tab loadedTab) { wrapperContained.method_71283(loadedTab.wrapperContained); }
// public static void method_71283(yarnwrap.client.gui.tab.Tab loadedTab, ) { net.minecraft.client.gui.tab.TabManager.method_71283(loadedTab.wrapperContained); }

}