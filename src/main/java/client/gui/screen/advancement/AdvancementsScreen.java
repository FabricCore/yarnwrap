package yarnwrap.client.gui.screen.advancement;
public class AdvancementsScreen { public net.minecraft.client.gui.screen.advancement.AdvancementsScreen wrapperContained; public AdvancementsScreen(net.minecraft.client.gui.screen.advancement.AdvancementsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SAD_LABEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.SAD_LABEL_TEXT); }
// public yarnwrap.text.Text EMPTY_TEXT() { return new yarnwrap.text.Text(wrapperContained.EMPTY_TEXT); }
// public yarnwrap.text.Text ADVANCEMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.ADVANCEMENTS_TEXT); }
// public yarnwrap.util.Identifier WINDOW_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.WINDOW_TEXTURE); }
// public boolean movingTab() { return wrapperContained.movingTab; }
// public java.util.Map tabs() { return wrapperContained.tabs; }
// public yarnwrap.client.gui.screen.advancement.AdvancementTab selectedTab() { return new yarnwrap.client.gui.screen.advancement.AdvancementTab(wrapperContained.selectedTab); }
// public yarnwrap.client.network.ClientAdvancementManager advancementHandler() { return new yarnwrap.client.network.ClientAdvancementManager(wrapperContained.advancementHandler); }
public int WINDOW_WIDTH() { return wrapperContained.WINDOW_WIDTH; }
public int WINDOW_HEIGHT() { return wrapperContained.WINDOW_HEIGHT; }
public int PAGE_WIDTH() { return wrapperContained.PAGE_WIDTH; }
public int PAGE_HEIGHT() { return wrapperContained.PAGE_HEIGHT; }
// public int PAGE_OFFSET_X() { return wrapperContained.PAGE_OFFSET_X; }
// public int PAGE_OFFSET_Y() { return wrapperContained.PAGE_OFFSET_Y; }
// public int TITLE_OFFSET_X() { return wrapperContained.TITLE_OFFSET_X; }
// public int TITLE_OFFSET_Y() { return wrapperContained.TITLE_OFFSET_Y; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
public void drawWindow(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawWindow(context.wrapperContained,x,y); }
public yarnwrap.client.gui.screen.advancement.AdvancementWidget getAdvancementWidget(yarnwrap.advancement.PlacedAdvancement advancement) { return new yarnwrap.client.gui.screen.advancement.AdvancementWidget(wrapperContained.getAdvancementWidget(advancement.wrapperContained)); }
// public yarnwrap.client.gui.screen.advancement.AdvancementTab getTab(yarnwrap.advancement.PlacedAdvancement advancement) { return new yarnwrap.client.gui.screen.advancement.AdvancementTab(wrapperContained.getTab(advancement.wrapperContained)); }
// public void drawAdvancementTree(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,int x,int y) { wrapperContained.drawAdvancementTree(context.wrapperContained,mouseX,mouseY,x,y); }
// public void drawWidgetTooltip(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,int x,int y) { wrapperContained.drawWidgetTooltip(context.wrapperContained,mouseX,mouseY,x,y); }

}