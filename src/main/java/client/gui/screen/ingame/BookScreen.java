package yarnwrap.client.gui.screen.ingame;
public class BookScreen { public net.minecraft.client.gui.screen.ingame.BookScreen wrapperContained; public BookScreen(net.minecraft.client.gui.screen.ingame.BookScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier BOOK_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BOOK_TEXTURE); }
// public int pageIndex() { return wrapperContained.pageIndex; }
// public java.util.List cachedPage() { return wrapperContained.cachedPage; }
// public int cachedPageIndex() { return wrapperContained.cachedPageIndex; }
// public yarnwrap.client.gui.widget.PageTurnWidget nextPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.nextPageButton); }
// public yarnwrap.client.gui.widget.PageTurnWidget previousPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.previousPageButton); }
public Object EMPTY_PROVIDER() { return wrapperContained.EMPTY_PROVIDER; }
// public Object contents() { return wrapperContained.contents; }
// public boolean pageTurnSound() { return wrapperContained.pageTurnSound; }
// public yarnwrap.text.Text pageIndexText() { return new yarnwrap.text.Text(wrapperContained.pageIndexText); }
// public int MAX_TEXT_WIDTH() { return wrapperContained.MAX_TEXT_WIDTH; }
// public int MAX_TEXT_HEIGHT() { return wrapperContained.MAX_TEXT_HEIGHT; }
// public int WIDTH() { return wrapperContained.WIDTH; }
// public int HEIGHT() { return wrapperContained.HEIGHT; }
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
// public void closeScreen() { wrapperContained.closeScreen(); }

}