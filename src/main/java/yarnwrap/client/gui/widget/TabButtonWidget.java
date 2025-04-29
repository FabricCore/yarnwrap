package yarnwrap.client.gui.widget;
public class TabButtonWidget { public net.minecraft.client.gui.widget.TabButtonWidget wrapperContained; public TabButtonWidget(net.minecraft.client.gui.widget.TabButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.tab.TabManager tabManager() { return new yarnwrap.client.gui.tab.TabManager(wrapperContained.tabManager); }
// public void tabManager(yarnwrap.client.gui.tab.TabManager value) { wrapperContained.tabManager = value.wrapperContained; }
// public static yarnwrap.client.gui.tab.TabManager tabManager() { return new yarnwrap.client.gui.tab.TabManager(net.minecraft.client.gui.widget.TabButtonWidget.tabManager); }
// public static void tabManager(yarnwrap.client.gui.tab.TabManager value, ) { net.minecraft.client.gui.widget.TabButtonWidget.tabManager = value.wrapperContained; }

// public yarnwrap.client.gui.tab.Tab tab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.tab); }
// public void tab(yarnwrap.client.gui.tab.Tab value) { wrapperContained.tab = value.wrapperContained; }
// public static yarnwrap.client.gui.tab.Tab tab() { return new yarnwrap.client.gui.tab.Tab(net.minecraft.client.gui.widget.TabButtonWidget.tab); }
// public static void tab(yarnwrap.client.gui.tab.Tab value, ) { net.minecraft.client.gui.widget.TabButtonWidget.tab = value.wrapperContained; }

// public yarnwrap.client.gui.screen.ButtonTextures TAB_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TAB_BUTTON_TEXTURES); }
// public void TAB_BUTTON_TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TAB_BUTTON_TEXTURES = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ButtonTextures TAB_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(net.minecraft.client.gui.widget.TabButtonWidget.TAB_BUTTON_TEXTURES); }
// public static void TAB_BUTTON_TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value, ) { net.minecraft.client.gui.widget.TabButtonWidget.TAB_BUTTON_TEXTURES = value.wrapperContained; }

public TabButtonWidget(yarnwrap.client.gui.tab.TabManager tabManager,yarnwrap.client.gui.tab.Tab tab,int width,int height) { this.wrapperContained = new net.minecraft.client.gui.widget.TabButtonWidget(tabManager.wrapperContained,tab.wrapperContained,width,height); }
public void drawMessage(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int color) { wrapperContained.drawMessage(context.wrapperContained,textRenderer.wrapperContained,color); }
// public static void drawMessage(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int color, ) { net.minecraft.client.gui.widget.TabButtonWidget.drawMessage(context.wrapperContained,textRenderer.wrapperContained,color); }
public yarnwrap.client.gui.tab.Tab getTab() { return new yarnwrap.client.gui.tab.Tab(wrapperContained.getTab()); }
// public static yarnwrap.client.gui.tab.Tab getTab() { return new yarnwrap.client.gui.tab.Tab(net.minecraft.client.gui.widget.TabButtonWidget.getTab()); }
// public void drawCurrentTabLine(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int color) { wrapperContained.drawCurrentTabLine(context.wrapperContained,textRenderer.wrapperContained,color); }
// public static void drawCurrentTabLine(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int color, ) { net.minecraft.client.gui.widget.TabButtonWidget.drawCurrentTabLine(context.wrapperContained,textRenderer.wrapperContained,color); }
public boolean isCurrentTab() { return wrapperContained.isCurrentTab(); }
// public static boolean isCurrentTab() { return net.minecraft.client.gui.widget.TabButtonWidget.isCurrentTab(); }
// public void renderBackgroundTexture(yarnwrap.client.gui.DrawContext context,int left,int top,int right,int bottom) { wrapperContained.renderBackgroundTexture(context.wrapperContained,left,top,right,bottom); }
// public static void renderBackgroundTexture(yarnwrap.client.gui.DrawContext context,int left,int top,int right,int bottom, ) { net.minecraft.client.gui.widget.TabButtonWidget.renderBackgroundTexture(context.wrapperContained,left,top,right,bottom); }

}