package yarnwrap.client.gui.screen.ingame;
public class BookScreen { public net.minecraft.client.gui.screen.ingame.BookScreen wrapperContained; public BookScreen(net.minecraft.client.gui.screen.ingame.BookScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier BOOK_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BOOK_TEXTURE); }
// public void BOOK_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BOOK_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier BOOK_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BookScreen.BOOK_TEXTURE); }
// public static void BOOK_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.BOOK_TEXTURE = value.wrapperContained; }

// public int pageIndex() { return wrapperContained.pageIndex; }
// public void pageIndex(int value) { wrapperContained.pageIndex = value; }
// public static int pageIndex() { return net.minecraft.client.gui.screen.ingame.BookScreen.pageIndex; }
// public static void pageIndex(int value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.pageIndex = value; }

// public java.util.List cachedPage() { return wrapperContained.cachedPage; }
// public void cachedPage(java.util.List value) { wrapperContained.cachedPage = value; }
// public static java.util.List cachedPage() { return net.minecraft.client.gui.screen.ingame.BookScreen.cachedPage; }
// public static void cachedPage(java.util.List value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.cachedPage = value; }

// public int cachedPageIndex() { return wrapperContained.cachedPageIndex; }
// public void cachedPageIndex(int value) { wrapperContained.cachedPageIndex = value; }
// public static int cachedPageIndex() { return net.minecraft.client.gui.screen.ingame.BookScreen.cachedPageIndex; }
// public static void cachedPageIndex(int value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.cachedPageIndex = value; }

// public yarnwrap.client.gui.widget.PageTurnWidget nextPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.nextPageButton); }
// public void nextPageButton(yarnwrap.client.gui.widget.PageTurnWidget value) { wrapperContained.nextPageButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.PageTurnWidget nextPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(net.minecraft.client.gui.screen.ingame.BookScreen.nextPageButton); }
// public static void nextPageButton(yarnwrap.client.gui.widget.PageTurnWidget value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.nextPageButton = value.wrapperContained; }

// public yarnwrap.client.gui.widget.PageTurnWidget previousPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.previousPageButton); }
// public void previousPageButton(yarnwrap.client.gui.widget.PageTurnWidget value) { wrapperContained.previousPageButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.PageTurnWidget previousPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(net.minecraft.client.gui.screen.ingame.BookScreen.previousPageButton); }
// public static void previousPageButton(yarnwrap.client.gui.widget.PageTurnWidget value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.previousPageButton = value.wrapperContained; }

// public Object EMPTY_PROVIDER() { return wrapperContained.EMPTY_PROVIDER; }
// // public void EMPTY_PROVIDER(Object value) { wrapperContained.EMPTY_PROVIDER = value; }
// public static Object EMPTY_PROVIDER() { return net.minecraft.client.gui.screen.ingame.BookScreen.EMPTY_PROVIDER; }
// // public static void EMPTY_PROVIDER(Object value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.EMPTY_PROVIDER = value; }

// public Object contents() { return wrapperContained.contents; }
// // public void contents(Object value) { wrapperContained.contents = value; }
// // public static Object contents() { return net.minecraft.client.gui.screen.ingame.BookScreen.contents; }
// // public static void contents(Object value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.contents = value; }

// public boolean pageTurnSound() { return wrapperContained.pageTurnSound; }
// public void pageTurnSound(boolean value) { wrapperContained.pageTurnSound = value; }
// public static boolean pageTurnSound() { return net.minecraft.client.gui.screen.ingame.BookScreen.pageTurnSound; }
// public static void pageTurnSound(boolean value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.pageTurnSound = value; }

// public yarnwrap.text.Text pageIndexText() { return new yarnwrap.text.Text(wrapperContained.pageIndexText); }
// public void pageIndexText(yarnwrap.text.Text value) { wrapperContained.pageIndexText = value.wrapperContained; }
// public static yarnwrap.text.Text pageIndexText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.BookScreen.pageIndexText); }
// public static void pageIndexText(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.pageIndexText = value.wrapperContained; }

// public int MAX_TEXT_WIDTH() { return wrapperContained.MAX_TEXT_WIDTH; }
// public void MAX_TEXT_WIDTH(int value) { wrapperContained.MAX_TEXT_WIDTH = value; }
// public static int MAX_TEXT_WIDTH() { return net.minecraft.client.gui.screen.ingame.BookScreen.MAX_TEXT_WIDTH; }
// public static void MAX_TEXT_WIDTH(int value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.MAX_TEXT_WIDTH = value; }

// public int MAX_TEXT_HEIGHT() { return wrapperContained.MAX_TEXT_HEIGHT; }
// public void MAX_TEXT_HEIGHT(int value) { wrapperContained.MAX_TEXT_HEIGHT = value; }
// public static int MAX_TEXT_HEIGHT() { return net.minecraft.client.gui.screen.ingame.BookScreen.MAX_TEXT_HEIGHT; }
// public static void MAX_TEXT_HEIGHT(int value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.MAX_TEXT_HEIGHT = value; }

// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
// public static int WIDTH() { return net.minecraft.client.gui.screen.ingame.BookScreen.WIDTH; }
// public static void WIDTH(int value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.WIDTH = value; }

// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(int value) { wrapperContained.HEIGHT = value; }
// public static int HEIGHT() { return net.minecraft.client.gui.screen.ingame.BookScreen.HEIGHT; }
// public static void HEIGHT(int value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.HEIGHT = value; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.BookScreen.TITLE_TEXT); }
// public static void TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.BookScreen.TITLE_TEXT = value.wrapperContained; }

// public BookScreen(Object pageProvider) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.BookScreen(pageProvider); }
// public BookScreen(Object contents,boolean playPageTurnSound) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.BookScreen(contents,playPageTurnSound); }
public yarnwrap.text.Style getTextStyleAt(double x,double y) { return new yarnwrap.text.Style(wrapperContained.getTextStyleAt(x,y)); }
// public static yarnwrap.text.Style getTextStyleAt(double x,double y, ) { return new yarnwrap.text.Style(net.minecraft.client.gui.screen.ingame.BookScreen.getTextStyleAt(x,y)); }
// public int getPageCount() { return wrapperContained.getPageCount(); }
// public static int getPageCount() { return net.minecraft.client.gui.screen.ingame.BookScreen.getPageCount(); }
// public void goToPreviousPage() { wrapperContained.goToPreviousPage(); }
// public static void goToPreviousPage() { net.minecraft.client.gui.screen.ingame.BookScreen.goToPreviousPage(); }
// public void goToNextPage() { wrapperContained.goToNextPage(); }
// public static void goToNextPage() { net.minecraft.client.gui.screen.ingame.BookScreen.goToNextPage(); }
// public void updatePageButtons() { wrapperContained.updatePageButtons(); }
// public static void updatePageButtons() { net.minecraft.client.gui.screen.ingame.BookScreen.updatePageButtons(); }
// public void setPageProvider(Object pageProvider) { wrapperContained.setPageProvider(pageProvider); }
// public static void setPageProvider(Object pageProvider, ) { net.minecraft.client.gui.screen.ingame.BookScreen.setPageProvider(pageProvider); }
public boolean setPage(int index) { return wrapperContained.setPage(index); }
// public static boolean setPage(int index, ) { return net.minecraft.client.gui.screen.ingame.BookScreen.setPage(index); }
// public void addCloseButton() { wrapperContained.addCloseButton(); }
// public static void addCloseButton() { net.minecraft.client.gui.screen.ingame.BookScreen.addCloseButton(); }
// public void addPageButtons() { wrapperContained.addPageButtons(); }
// public static void addPageButtons() { net.minecraft.client.gui.screen.ingame.BookScreen.addPageButtons(); }
// public boolean jumpToPage(int page) { return wrapperContained.jumpToPage(page); }
// public static boolean jumpToPage(int page, ) { return net.minecraft.client.gui.screen.ingame.BookScreen.jumpToPage(page); }
// public void method_19884(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19884(button.wrapperContained); }
// public static void method_19884(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.BookScreen.method_19884(button.wrapperContained); }
// public void method_19885(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19885(button.wrapperContained); }
// public static void method_19885(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.BookScreen.method_19885(button.wrapperContained); }
// public void method_19886(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19886(button.wrapperContained); }
// public static void method_19886(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.BookScreen.method_19886(button.wrapperContained); }
// public void closeScreen() { wrapperContained.closeScreen(); }
// public static void closeScreen() { net.minecraft.client.gui.screen.ingame.BookScreen.closeScreen(); }
// public yarnwrap.text.Text getPageIndicatorText() { return new yarnwrap.text.Text(wrapperContained.getPageIndicatorText()); }
// public static yarnwrap.text.Text getPageIndicatorText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.BookScreen.getPageIndicatorText()); }

}