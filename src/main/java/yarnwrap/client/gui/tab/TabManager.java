package yarnwrap.client.gui.tab;
public class TabManager { public net.minecraft.client.gui.tab.TabManager wrapperContained; public TabManager(net.minecraft.client.gui.tab.TabManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer tabLoadConsumer() { return wrapperContained.tabLoadConsumer; }
// public void tabLoadConsumer(java.util.function.Consumer value) { wrapperContained.tabLoadConsumer = value; }
// public static java.util.function.Consumer tabLoadConsumer() { return net.minecraft.client.gui.tab.TabManager.tabLoadConsumer; }
// public static void tabLoadConsumer(java.util.function.Consumer value, ) { net.minecraft.client.gui.tab.TabManager.tabLoadConsumer = value; }

// public java.util.function.Consumer tabUnloadConsumer() { return wrapperContained.tabUnloadConsumer; }
// public void tabUnloadConsumer(java.util.function.Consumer value) { wrapperContained.tabUnloadConsumer = value; }
// public static java.util.function.Consumer tabUnloadConsumer() { return net.minecraft.client.gui.tab.TabManager.tabUnloadConsumer; }
// public static void tabUnloadConsumer(java.util.function.Consumer value, ) { net.minecraft.client.gui.tab.TabManager.tabUnloadConsumer = value; }

// public yarnwrap.client.gui.tab.Tab currentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.currentTab); }
// public void currentTab(yarnwrap.client.gui.tab.Tab value) { wrapperContained.currentTab = value.wrapperContained; }
// public static yarnwrap.client.gui.tab.Tab currentTab() { return new yarnwrap.client.gui.tab.Tab(net.minecraft.client.gui.tab.TabManager.currentTab); }
// public static void currentTab(yarnwrap.client.gui.tab.Tab value, ) { net.minecraft.client.gui.tab.TabManager.currentTab = value.wrapperContained; }

// public yarnwrap.client.gui.ScreenRect tabArea() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.tabArea); }
// public void tabArea(yarnwrap.client.gui.ScreenRect value) { wrapperContained.tabArea = value.wrapperContained; }
// public static yarnwrap.client.gui.ScreenRect tabArea() { return new yarnwrap.client.gui.ScreenRect(net.minecraft.client.gui.tab.TabManager.tabArea); }
// public static void tabArea(yarnwrap.client.gui.ScreenRect value, ) { net.minecraft.client.gui.tab.TabManager.tabArea = value.wrapperContained; }

public TabManager(java.util.function.Consumer tabLoadConsumer,java.util.function.Consumer tabUnloadConsumer) { this.wrapperContained = new net.minecraft.client.gui.tab.TabManager(tabLoadConsumer,tabUnloadConsumer); }
public yarnwrap.client.gui.tab.Tab getCurrentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.getCurrentTab()); }
// public static yarnwrap.client.gui.tab.Tab getCurrentTab() { return new yarnwrap.client.gui.tab.Tab(net.minecraft.client.gui.tab.TabManager.getCurrentTab()); }
public void setCurrentTab(yarnwrap.client.gui.tab.Tab tab,boolean clickSound) { wrapperContained.setCurrentTab(tab.wrapperContained,clickSound); }
// public static void setCurrentTab(yarnwrap.client.gui.tab.Tab tab,boolean clickSound, ) { net.minecraft.client.gui.tab.TabManager.setCurrentTab(tab.wrapperContained,clickSound); }
public void setTabArea(yarnwrap.client.gui.ScreenRect tabArea) { wrapperContained.setTabArea(tabArea.wrapperContained); }
// public static void setTabArea(yarnwrap.client.gui.ScreenRect tabArea, ) { net.minecraft.client.gui.tab.TabManager.setTabArea(tabArea.wrapperContained); }

}