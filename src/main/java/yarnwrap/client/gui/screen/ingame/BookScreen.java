package yarnwrap.client.gui.screen.ingame;
public class BookScreen { public net.minecraft.client.gui.screen.ingame.BookScreen wrapperContained; public BookScreen(net.minecraft.client.gui.screen.ingame.BookScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier BOOK_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BOOK_TEXTURE); }
// public void BOOK_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BOOK_TEXTURE = value.wrapperContained; }
// public int pageIndex() { return wrapperContained.pageIndex; }
// public void pageIndex(int value) { wrapperContained.pageIndex = value; }
// public java.util.List cachedPage() { return wrapperContained.cachedPage; }
// public void cachedPage(java.util.List value) { wrapperContained.cachedPage = value; }
// public int cachedPageIndex() { return wrapperContained.cachedPageIndex; }
// public void cachedPageIndex(int value) { wrapperContained.cachedPageIndex = value; }
// public yarnwrap.client.gui.widget.PageTurnWidget nextPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.nextPageButton); }
// public void nextPageButton(yarnwrap.client.gui.widget.PageTurnWidget value) { wrapperContained.nextPageButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.PageTurnWidget previousPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.previousPageButton); }
// public void previousPageButton(yarnwrap.client.gui.widget.PageTurnWidget value) { wrapperContained.previousPageButton = value.wrapperContained; }
public Object EMPTY_PROVIDER() { return wrapperContained.EMPTY_PROVIDER; }
// // public void EMPTY_PROVIDER(Object value) { wrapperContained.EMPTY_PROVIDER = value; }
// public Object contents() { return wrapperContained.contents; }
// // public void contents(Object value) { wrapperContained.contents = value; }
// public boolean pageTurnSound() { return wrapperContained.pageTurnSound; }
// public void pageTurnSound(boolean value) { wrapperContained.pageTurnSound = value; }
// public yarnwrap.text.Text pageIndexText() { return new yarnwrap.text.Text(wrapperContained.pageIndexText); }
// public void pageIndexText(yarnwrap.text.Text value) { wrapperContained.pageIndexText = value.wrapperContained; }
// public int MAX_TEXT_WIDTH() { return wrapperContained.MAX_TEXT_WIDTH; }
// public void MAX_TEXT_WIDTH(int value) { wrapperContained.MAX_TEXT_WIDTH = value; }
// public int MAX_TEXT_HEIGHT() { return wrapperContained.MAX_TEXT_HEIGHT; }
// public void MAX_TEXT_HEIGHT(int value) { wrapperContained.MAX_TEXT_HEIGHT = value; }
// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(int value) { wrapperContained.HEIGHT = value; }
// public BookScreen(Object pageProvider) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.BookScreen(pageProvider); }
// public BookScreen(Object contents,boolean playPageTurnSound) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.BookScreen(contents,playPageTurnSound); }
public yarnwrap.text.Style getTextStyleAt(double x,double y) { return new yarnwrap.text.Style(wrapperContained.getTextStyleAt(x,y)); }
// public int getPageCount() { return wrapperContained.getPageCount(); }
// public void goToPreviousPage() { wrapperContained.goToPreviousPage(); }
// public void goToNextPage() { wrapperContained.goToNextPage(); }
// public void updatePageButtons() { wrapperContained.updatePageButtons(); }
// public void setPageProvider(Object pageProvider) { wrapperContained.setPageProvider(pageProvider); }
public boolean setPage(int index) { return wrapperContained.setPage(index); }
// public void addCloseButton() { wrapperContained.addCloseButton(); }
// public void addPageButtons() { wrapperContained.addPageButtons(); }
// public boolean jumpToPage(int page) { return wrapperContained.jumpToPage(page); }
// public void method_19884(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19884(button.wrapperContained); }
// public void method_19885(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19885(button.wrapperContained); }
// public void method_19886(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19886(button.wrapperContained); }
// public void closeScreen() { wrapperContained.closeScreen(); }

}