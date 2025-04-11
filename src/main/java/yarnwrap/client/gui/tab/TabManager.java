package yarnwrap.client.gui.tab;
public class TabManager { public net.minecraft.client.gui.tab.TabManager wrapperContained; public TabManager(net.minecraft.client.gui.tab.TabManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer tabLoadConsumer() { return wrapperContained.tabLoadConsumer; }
// public void tabLoadConsumer(java.util.function.Consumer value) { wrapperContained.tabLoadConsumer = value; }
// public java.util.function.Consumer tabUnloadConsumer() { return wrapperContained.tabUnloadConsumer; }
// public void tabUnloadConsumer(java.util.function.Consumer value) { wrapperContained.tabUnloadConsumer = value; }
// public yarnwrap.client.gui.tab.Tab currentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.currentTab); }
// public void currentTab(yarnwrap.client.gui.tab.Tab value) { wrapperContained.currentTab = value.wrapperContained; }
// public yarnwrap.client.gui.ScreenRect tabArea() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.tabArea); }
// public void tabArea(yarnwrap.client.gui.ScreenRect value) { wrapperContained.tabArea = value.wrapperContained; }
public yarnwrap.client.gui.tab.Tab getCurrentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.getCurrentTab()); }
public void setCurrentTab(yarnwrap.client.gui.tab.Tab tab,boolean clickSound) { wrapperContained.setCurrentTab(tab.wrapperContained,clickSound); }
public void setTabArea(yarnwrap.client.gui.ScreenRect tabArea) { wrapperContained.setTabArea(tabArea.wrapperContained); }

}