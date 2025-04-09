package yarnwrap.client.gui.tab;
public class TabManager { public net.minecraft.client.gui.tab.TabManager wrapperContained; public TabManager(net.minecraft.client.gui.tab.TabManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer tabLoadConsumer() { return wrapperContained.tabLoadConsumer; }
// public java.util.function.Consumer tabUnloadConsumer() { return wrapperContained.tabUnloadConsumer; }
// public yarnwrap.client.gui.tab.Tab currentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.currentTab); }
// public yarnwrap.client.gui.ScreenRect tabArea() { return new yarnwrap.client.gui.ScreenRect(wrapperContained.tabArea); }
public yarnwrap.client.gui.tab.Tab getCurrentTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.getCurrentTab()); }
public void setCurrentTab(yarnwrap.client.gui.tab.Tab tab,boolean clickSound) { wrapperContained.setCurrentTab(tab.wrapperContained,clickSound); }
public void setTabArea(yarnwrap.client.gui.ScreenRect tabArea) { wrapperContained.setTabArea(tabArea.wrapperContained); }

}