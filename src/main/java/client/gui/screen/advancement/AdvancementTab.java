package yarnwrap.client.gui.screen.advancement;
public class AdvancementTab { public net.minecraft.client.gui.screen.advancement.AdvancementTab wrapperContained; public AdvancementTab(net.minecraft.client.gui.screen.advancement.AdvancementTab wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public int index() { return wrapperContained.index; }
// public boolean initialized() { return wrapperContained.initialized; }
// public yarnwrap.client.gui.screen.advancement.AdvancementTabType type() { return new yarnwrap.client.gui.screen.advancement.AdvancementTabType(wrapperContained.type); }
// public java.util.Map widgets() { return wrapperContained.widgets; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public yarnwrap.client.gui.screen.advancement.AdvancementsScreen screen() { return new yarnwrap.client.gui.screen.advancement.AdvancementsScreen(wrapperContained.screen); }
// public float alpha() { return wrapperContained.alpha; }
// public double originY() { return wrapperContained.originY; }
// public double originX() { return wrapperContained.originX; }
// public int maxPanY() { return wrapperContained.maxPanY; }
// public int maxPanX() { return wrapperContained.maxPanX; }
// public int minPanY() { return wrapperContained.minPanY; }
// public int minPanX() { return wrapperContained.minPanX; }
// public yarnwrap.advancement.AdvancementDisplay display() { return new yarnwrap.advancement.AdvancementDisplay(wrapperContained.display); }
// public yarnwrap.client.gui.screen.advancement.AdvancementWidget rootWidget() { return new yarnwrap.client.gui.screen.advancement.AdvancementWidget(wrapperContained.rootWidget); }
// public yarnwrap.item.ItemStack icon() { return new yarnwrap.item.ItemStack(wrapperContained.icon); }
// public yarnwrap.advancement.PlacedAdvancement root() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.root); }
public yarnwrap.client.gui.screen.advancement.AdvancementWidget getWidget(yarnwrap.advancement.AdvancementEntry advancement) { return new yarnwrap.client.gui.screen.advancement.AdvancementWidget(wrapperContained.getWidget(advancement.wrapperContained)); }
public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
public void render(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.render(context.wrapperContained,x,y); }
public void drawBackground(yarnwrap.client.gui.DrawContext context,int x,int y,boolean selected) { wrapperContained.drawBackground(context.wrapperContained,x,y,selected); }
public yarnwrap.client.gui.screen.advancement.AdvancementsScreen getScreen() { return new yarnwrap.client.gui.screen.advancement.AdvancementsScreen(wrapperContained.getScreen()); }
public void move(double offsetX,double offsetY) { wrapperContained.move(offsetX,offsetY); }
public void drawWidgetTooltip(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,int x,int y) { wrapperContained.drawWidgetTooltip(context.wrapperContained,mouseX,mouseY,x,y); }
public void drawIcon(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawIcon(context.wrapperContained,x,y); }
public boolean isClickOnTab(int screenX,int screenY,double mouseX,double mouseY) { return wrapperContained.isClickOnTab(screenX,screenY,mouseX,mouseY); }
public yarnwrap.client.gui.screen.advancement.AdvancementTab create(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.advancement.AdvancementsScreen screen,int index,yarnwrap.advancement.PlacedAdvancement root) { return new yarnwrap.client.gui.screen.advancement.AdvancementTab(wrapperContained.create(client.wrapperContained,screen.wrapperContained,index,root.wrapperContained)); }
public void addAdvancement(yarnwrap.advancement.PlacedAdvancement advancement) { wrapperContained.addAdvancement(advancement.wrapperContained); }
// public void addWidget(yarnwrap.client.gui.screen.advancement.AdvancementWidget widget,yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.addWidget(widget.wrapperContained,advancement.wrapperContained); }
// public yarnwrap.client.gui.screen.advancement.AdvancementTabType getType() { return new yarnwrap.client.gui.screen.advancement.AdvancementTabType(wrapperContained.getType()); }
public int getIndex() { return wrapperContained.getIndex(); }
public yarnwrap.advancement.AdvancementDisplay getDisplay() { return new yarnwrap.advancement.AdvancementDisplay(wrapperContained.getDisplay()); }
public yarnwrap.advancement.PlacedAdvancement getRoot() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.getRoot()); }

}