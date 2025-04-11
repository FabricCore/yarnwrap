package yarnwrap.client.gui.screen.advancement;
public class AdvancementsScreen { public net.minecraft.client.gui.screen.advancement.AdvancementsScreen wrapperContained; public AdvancementsScreen(net.minecraft.client.gui.screen.advancement.AdvancementsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SAD_LABEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.SAD_LABEL_TEXT); }
// public void SAD_LABEL_TEXT(yarnwrap.text.Text value) { wrapperContained.SAD_LABEL_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text EMPTY_TEXT() { return new yarnwrap.text.Text(wrapperContained.EMPTY_TEXT); }
// public void EMPTY_TEXT(yarnwrap.text.Text value) { wrapperContained.EMPTY_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text ADVANCEMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.ADVANCEMENTS_TEXT); }
// public void ADVANCEMENTS_TEXT(yarnwrap.text.Text value) { wrapperContained.ADVANCEMENTS_TEXT = value.wrapperContained; }
// public yarnwrap.util.Identifier WINDOW_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.WINDOW_TEXTURE); }
// public void WINDOW_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.WINDOW_TEXTURE = value.wrapperContained; }
// public boolean movingTab() { return wrapperContained.movingTab; }
// public void movingTab(boolean value) { wrapperContained.movingTab = value; }
// public java.util.Map tabs() { return wrapperContained.tabs; }
// public void tabs(java.util.Map value) { wrapperContained.tabs = value; }
// public yarnwrap.client.gui.screen.advancement.AdvancementTab selectedTab() { return new yarnwrap.client.gui.screen.advancement.AdvancementTab(wrapperContained.selectedTab); }
// public void selectedTab(yarnwrap.client.gui.screen.advancement.AdvancementTab value) { wrapperContained.selectedTab = value.wrapperContained; }
// public yarnwrap.client.network.ClientAdvancementManager advancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(wrapperContained.advancementHandler); }
// public void advancementHandler(yarnwrap.client.network.ClientAdvancementManager value) { wrapperContained.advancementHandler = value.wrapperContained; }
public int WINDOW_WIDTH() { return wrapperContained.WINDOW_WIDTH; }
// public void WINDOW_WIDTH(int value) { wrapperContained.WINDOW_WIDTH = value; }
public int WINDOW_HEIGHT() { return wrapperContained.WINDOW_HEIGHT; }
// public void WINDOW_HEIGHT(int value) { wrapperContained.WINDOW_HEIGHT = value; }
public int PAGE_WIDTH() { return wrapperContained.PAGE_WIDTH; }
// public void PAGE_WIDTH(int value) { wrapperContained.PAGE_WIDTH = value; }
public int PAGE_HEIGHT() { return wrapperContained.PAGE_HEIGHT; }
// public void PAGE_HEIGHT(int value) { wrapperContained.PAGE_HEIGHT = value; }
// public int PAGE_OFFSET_X() { return wrapperContained.PAGE_OFFSET_X; }
// public void PAGE_OFFSET_X(int value) { wrapperContained.PAGE_OFFSET_X = value; }
// public int PAGE_OFFSET_Y() { return wrapperContained.PAGE_OFFSET_Y; }
// public void PAGE_OFFSET_Y(int value) { wrapperContained.PAGE_OFFSET_Y = value; }
// public int TITLE_OFFSET_X() { return wrapperContained.TITLE_OFFSET_X; }
// public void TITLE_OFFSET_X(int value) { wrapperContained.TITLE_OFFSET_X = value; }
// public int TITLE_OFFSET_Y() { return wrapperContained.TITLE_OFFSET_Y; }
// public void TITLE_OFFSET_Y(int value) { wrapperContained.TITLE_OFFSET_Y = value; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
public AdvancementsScreen(yarnwrap.client.network.ClientAdvancementManager advancementHandler) { this.wrapperContained = new net.minecraft.client.gui.screen.advancement.AdvancementsScreen(advancementHandler.wrapperContained); }
public AdvancementsScreen(yarnwrap.client.network.ClientAdvancementManager advancementHandler,yarnwrap.client.gui.screen.Screen parent) { this.wrapperContained = new net.minecraft.client.gui.screen.advancement.AdvancementsScreen(advancementHandler.wrapperContained,parent.wrapperContained); }
public void drawWindow(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawWindow(context.wrapperContained,x,y); }
public yarnwrap.client.gui.screen.advancement.AdvancementWidget getAdvancementWidget(yarnwrap.advancement.PlacedAdvancement advancement) { return new yarnwrap.client.gui.screen.advancement.AdvancementWidget(wrapperContained.getAdvancementWidget(advancement.wrapperContained)); }
// public yarnwrap.client.gui.screen.advancement.AdvancementTab getTab(yarnwrap.advancement.PlacedAdvancement advancement) { return new yarnwrap.client.gui.screen.advancement.AdvancementTab(wrapperContained.getTab(advancement.wrapperContained)); }
// public void drawAdvancementTree(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,int x,int y) { wrapperContained.drawAdvancementTree(context.wrapperContained,mouseX,mouseY,x,y); }
// public void drawWidgetTooltip(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,int x,int y) { wrapperContained.drawWidgetTooltip(context.wrapperContained,mouseX,mouseY,x,y); }

}