package yarnwrap.client.gui.tab;
public class Tab { public net.minecraft.client.gui.tab.Tab wrapperContained; public Tab(net.minecraft.client.gui.tab.Tab wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
// public static yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(net.minecraft.client.gui.tab.Tab.getTitle()); }
public void refreshGrid(yarnwrap.client.gui.ScreenRect tabArea) { wrapperContained.refreshGrid(tabArea.wrapperContained); }
// public static void refreshGrid(yarnwrap.client.gui.ScreenRect tabArea, ) { net.minecraft.client.gui.tab.Tab.refreshGrid(tabArea.wrapperContained); }
public void forEachChild(java.util.function.Consumer consumer) { wrapperContained.forEachChild(consumer); }
// public static void forEachChild(java.util.function.Consumer consumer, ) { net.minecraft.client.gui.tab.Tab.forEachChild(consumer); }

}