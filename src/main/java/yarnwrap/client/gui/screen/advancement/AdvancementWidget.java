package yarnwrap.client.gui.screen.advancement;
public class AdvancementWidget { public net.minecraft.client.gui.screen.advancement.AdvancementWidget wrapperContained; public AdvancementWidget(net.minecraft.client.gui.screen.advancement.AdvancementWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] SPLIT_OFFSET_CANDIDATES() { return wrapperContained.SPLIT_OFFSET_CANDIDATES; }
// public void SPLIT_OFFSET_CANDIDATES(int[] value) { wrapperContained.SPLIT_OFFSET_CANDIDATES = value; }
// public yarnwrap.client.gui.screen.advancement.AdvancementTab tab() { return new yarnwrap.client.gui.screen.advancement.AdvancementTab(wrapperContained.tab); }
// public void tab(yarnwrap.client.gui.screen.advancement.AdvancementTab value) { wrapperContained.tab = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.List description() { return wrapperContained.description; }
// public void description(java.util.List value) { wrapperContained.description = value; }
// public yarnwrap.client.gui.screen.advancement.AdvancementWidget parent() { return new yarnwrap.client.gui.screen.advancement.AdvancementWidget(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.advancement.AdvancementWidget value) { wrapperContained.parent = value.wrapperContained; }
// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public yarnwrap.advancement.AdvancementDisplay display() { return new yarnwrap.advancement.AdvancementDisplay(wrapperContained.display); }
// public void display(yarnwrap.advancement.AdvancementDisplay value) { wrapperContained.display = value.wrapperContained; }
// public yarnwrap.text.OrderedText title() { return new yarnwrap.text.OrderedText(wrapperContained.title); }
// public void title(yarnwrap.text.OrderedText value) { wrapperContained.title = value.wrapperContained; }
// public yarnwrap.advancement.AdvancementProgress progress() { return new yarnwrap.advancement.AdvancementProgress(wrapperContained.progress); }
// public void progress(yarnwrap.advancement.AdvancementProgress value) { wrapperContained.progress = value.wrapperContained; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int ICON_OFFSET_X() { return wrapperContained.ICON_OFFSET_X; }
// public void ICON_OFFSET_X(int value) { wrapperContained.ICON_OFFSET_X = value; }
// public int ICON_OFFSET_Y() { return wrapperContained.ICON_OFFSET_Y; }
// public void ICON_OFFSET_Y(int value) { wrapperContained.ICON_OFFSET_Y = value; }
// public int ICON_SIZE() { return wrapperContained.ICON_SIZE; }
// public void ICON_SIZE(int value) { wrapperContained.ICON_SIZE = value; }
// public int TITLE_OFFSET_X() { return wrapperContained.TITLE_OFFSET_X; }
// public void TITLE_OFFSET_X(int value) { wrapperContained.TITLE_OFFSET_X = value; }
// public int TITLE_OFFSET_Y() { return wrapperContained.TITLE_OFFSET_Y; }
// public void TITLE_OFFSET_Y(int value) { wrapperContained.TITLE_OFFSET_Y = value; }
// public int TITLE_MAX_WIDTH() { return wrapperContained.TITLE_MAX_WIDTH; }
// public void TITLE_MAX_WIDTH(int value) { wrapperContained.TITLE_MAX_WIDTH = value; }
// public yarnwrap.util.Identifier TITLE_BOX_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TITLE_BOX_TEXTURE); }
// public void TITLE_BOX_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TITLE_BOX_TEXTURE = value.wrapperContained; }
// public yarnwrap.advancement.PlacedAdvancement advancement() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.advancement); }
// public void advancement(yarnwrap.advancement.PlacedAdvancement value) { wrapperContained.advancement = value.wrapperContained; }
public AdvancementWidget(yarnwrap.client.gui.screen.advancement.AdvancementTab tab,yarnwrap.client.MinecraftClient client,yarnwrap.advancement.PlacedAdvancement advancement,yarnwrap.advancement.AdvancementDisplay display) { this.wrapperContained = new net.minecraft.client.gui.screen.advancement.AdvancementWidget(tab.wrapperContained,client.wrapperContained,advancement.wrapperContained,display.wrapperContained); }
public void addChild(yarnwrap.client.gui.screen.advancement.AdvancementWidget widget) { wrapperContained.addChild(widget.wrapperContained); }
public void renderLines(yarnwrap.client.gui.DrawContext context,int x,int y,boolean border) { wrapperContained.renderLines(context.wrapperContained,x,y,border); }
public void renderWidgets(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.renderWidgets(context.wrapperContained,x,y); }
public int getY() { return wrapperContained.getY(); }
public int getX() { return wrapperContained.getX(); }
// public yarnwrap.client.gui.screen.advancement.AdvancementWidget getParent(yarnwrap.advancement.PlacedAdvancement advancement) { return new yarnwrap.client.gui.screen.advancement.AdvancementWidget(wrapperContained.getParent(advancement.wrapperContained)); }
public boolean shouldRender(int originX,int originY,int mouseX,int mouseY) { return wrapperContained.shouldRender(originX,originY,mouseX,mouseY); }
// public java.util.List wrapDescription(yarnwrap.text.Text text,int width) { return wrapperContained.wrapDescription(text.wrapperContained,width); }
public void drawTooltip(yarnwrap.client.gui.DrawContext context,int originX,int originY,float alpha,int x,int y) { wrapperContained.drawTooltip(context.wrapperContained,originX,originY,alpha,x,y); }
public void addToTree() { wrapperContained.addToTree(); }
public void setProgress(yarnwrap.advancement.AdvancementProgress progress) { wrapperContained.setProgress(progress.wrapperContained); }
// public float getMaxWidth(yarnwrap.client.font.TextHandler textHandler,java.util.List lines) { return wrapperContained.getMaxWidth(textHandler.wrapperContained,lines); }
public int getWidth() { return wrapperContained.getWidth(); }
// public int getProgressWidth() { return wrapperContained.getProgressWidth(); }

}