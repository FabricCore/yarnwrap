package yarnwrap.client.gui.widget;
public class EntryListWidget { public net.minecraft.client.gui.widget.EntryListWidget wrapperContained; public EntryListWidget(net.minecraft.client.gui.widget.EntryListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public int itemHeight() { return wrapperContained.itemHeight; }
// public void itemHeight(int value) { wrapperContained.itemHeight = value; }
// public boolean centerListVertically() { return wrapperContained.centerListVertically; }
// public void centerListVertically(boolean value) { wrapperContained.centerListVertically = value; }
// public boolean renderHeader() { return wrapperContained.renderHeader; }
// public void renderHeader(boolean value) { wrapperContained.renderHeader = value; }
// public int headerHeight() { return wrapperContained.headerHeight; }
// public void headerHeight(int value) { wrapperContained.headerHeight = value; }
// public double scrollAmount() { return wrapperContained.scrollAmount; }
// public void scrollAmount(double value) { wrapperContained.scrollAmount = value; }
// public boolean scrolling() { return wrapperContained.scrolling; }
// public void scrolling(boolean value) { wrapperContained.scrolling = value; }
// public Object selected() { return wrapperContained.selected; }
// // public void selected(Object value) { wrapperContained.selected = value; }
// public Object hoveredEntry() { return wrapperContained.hoveredEntry; }
// // public void hoveredEntry(Object value) { wrapperContained.hoveredEntry = value; }
// public yarnwrap.util.Identifier SCROLLER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_TEXTURE); }
// public void SCROLLER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLLER_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SCROLLER_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLLER_BACKGROUND_TEXTURE); }
// public void SCROLLER_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLLER_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier MENU_LIST_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MENU_LIST_BACKGROUND_TEXTURE); }
// public void MENU_LIST_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.MENU_LIST_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier INWORLD_MENU_LIST_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INWORLD_MENU_LIST_BACKGROUND_TEXTURE); }
// public void INWORLD_MENU_LIST_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.INWORLD_MENU_LIST_BACKGROUND_TEXTURE = value.wrapperContained; }
public void setScrollAmount(double amount) { wrapperContained.setScrollAmount(amount); }
// public Object getEntryAtPosition(double x,double y) { return wrapperContained.getEntryAtPosition(x,y); }
// public void scroll(int amount) { wrapperContained.scroll(amount); }
// public boolean clickedHeader(int x,int y) { return wrapperContained.clickedHeader(x,y); }
// public void renderList(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderList(context.wrapperContained,mouseX,mouseY,delta); }
// public void renderHeader(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.renderHeader(context.wrapperContained,x,y); }
// public void setSelected(Object entry) { wrapperContained.setSelected(entry); }
// public void replaceEntries(java.util.Collection newEntries) { wrapperContained.replaceEntries(newEntries); }
// public void setRenderHeader(boolean renderHeader,int headerHeight) { wrapperContained.setRenderHeader(renderHeader,headerHeight); }
// public int getMaxPosition() { return wrapperContained.getMaxPosition(); }
// public void updateScrollingState(double mouseX,double mouseY,int button) { wrapperContained.updateScrollingState(mouseX,mouseY,button); }
// public int getRowBottom(int index) { return wrapperContained.getRowBottom(index); }
// public void renderDecorations(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY) { wrapperContained.renderDecorations(context.wrapperContained,mouseX,mouseY); }
// public int addEntry(Object entry) { return wrapperContained.addEntry(entry); }
public int getRowWidth() { return wrapperContained.getRowWidth(); }
// public void centerScrollOn(Object entry) { wrapperContained.centerScrollOn(entry); }
// public Object getEntry(int index) { return wrapperContained.getEntry(index); }
// public void ensureVisible(Object entry) { wrapperContained.ensureVisible(entry); }
// public int getScrollbarX() { return wrapperContained.getScrollbarX(); }
// public boolean removeEntry(Object entry) { return wrapperContained.removeEntry(entry); }
public int getMaxScroll() { return wrapperContained.getMaxScroll(); }
// public boolean isSelectedEntry(int index) { return wrapperContained.isSelectedEntry(index); }
public Object getSelectedOrNull() { return wrapperContained.getSelectedOrNull(); }
// public int getRowTop(int index) { return wrapperContained.getRowTop(index); }
// public Object remove(int index) { return wrapperContained.remove(index); }
// public void clearEntries() { wrapperContained.clearEntries(); }
// public int getEntryCount() { return wrapperContained.getEntryCount(); }
public double getScrollAmount() { return wrapperContained.getScrollAmount(); }
public int getRowLeft() { return wrapperContained.getRowLeft(); }
// public void setEntryParentList(Object entry) { wrapperContained.setEntryParentList(entry); }
public int getRowRight() { return wrapperContained.getRowRight(); }
// public void appendNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder,Object entry) { wrapperContained.appendNarrations(builder.wrapperContained,entry); }
// public Object getHoveredEntry() { return wrapperContained.getHoveredEntry(); }
// public void renderEntry(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta,int index,int x,int y,int entryWidth,int entryHeight) { wrapperContained.renderEntry(context.wrapperContained,mouseX,mouseY,delta,index,x,y,entryWidth,entryHeight); }
// public void drawSelectionHighlight(yarnwrap.client.gui.DrawContext context,int y,int entryWidth,int entryHeight,int borderColor,int fillColor) { wrapperContained.drawSelectionHighlight(context.wrapperContained,y,entryWidth,entryHeight,borderColor,fillColor); }
// public void addEntryToTop(Object entry) { wrapperContained.addEntryToTop(entry); }
// public boolean removeEntryWithoutScrolling(Object entry) { return wrapperContained.removeEntryWithoutScrolling(entry); }
// public Object getNeighboringEntry(yarnwrap.client.gui.navigation.NavigationDirection direction) { return wrapperContained.getNeighboringEntry(direction.wrapperContained); }
// public Object getNeighboringEntry(yarnwrap.client.gui.navigation.NavigationDirection direction,java.util.function.Predicate predicate) { return wrapperContained.getNeighboringEntry(direction.wrapperContained,predicate); }
// public Object getNeighboringEntry(yarnwrap.client.gui.navigation.NavigationDirection direction,java.util.function.Predicate predicate,Object selected) { return wrapperContained.getNeighboringEntry(direction.wrapperContained,predicate,selected); }
public Object getFirst() { return wrapperContained.getFirst(); }
// public void enableScissor(yarnwrap.client.gui.DrawContext context) { wrapperContained.enableScissor(context.wrapperContained); }
// public boolean isSelectButton(int button) { return wrapperContained.isSelectButton(button); }
// public int getBorderBoxLeft() { return wrapperContained.getBorderBoxLeft(); }
// public int getBorderBoxRight() { return wrapperContained.getBorderBoxRight(); }
public void position(int width,yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout) { wrapperContained.position(width,layout.wrapperContained); }
// public void drawHeaderAndFooterSeparators(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawHeaderAndFooterSeparators(context.wrapperContained); }
public void position(int width,int height,int y) { wrapperContained.position(width,height,y); }
// public void drawMenuListBackground(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawMenuListBackground(context.wrapperContained); }
// public int getScrollbarMarginX() { return wrapperContained.getScrollbarMarginX(); }
// public boolean isScrollbarVisible() { return wrapperContained.isScrollbarVisible(); }
// public int getDefaultScrollbarX() { return wrapperContained.getDefaultScrollbarX(); }
public void setScrollAmountOnly(double amount) { wrapperContained.setScrollAmountOnly(amount); }
public void refreshScroll() { wrapperContained.refreshScroll(); }

}