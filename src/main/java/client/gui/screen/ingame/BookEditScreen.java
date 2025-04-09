package yarnwrap.client.gui.screen.ingame;
public class BookEditScreen { public net.minecraft.client.gui.screen.ingame.BookEditScreen wrapperContained; public BookEditScreen(net.minecraft.client.gui.screen.ingame.BookEditScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pages() { return wrapperContained.pages; }
// public Object pageContent() { return wrapperContained.pageContent; }
// public yarnwrap.client.util.SelectionManager currentPageSelectionManager() { return new yarnwrap.client.util.SelectionManager(wrapperContained.currentPageSelectionManager); }
// public yarnwrap.client.util.SelectionManager bookTitleSelectionManager() { return new yarnwrap.client.util.SelectionManager(wrapperContained.bookTitleSelectionManager); }
// public yarnwrap.text.Text pageIndicatorText() { return new yarnwrap.text.Text(wrapperContained.pageIndicatorText); }
// public yarnwrap.text.Text signedByText() { return new yarnwrap.text.Text(wrapperContained.signedByText); }
// public yarnwrap.text.Text EDIT_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.EDIT_TITLE_TEXT); }
// public yarnwrap.text.Text FINALIZE_WARNING_TEXT() { return new yarnwrap.text.Text(wrapperContained.FINALIZE_WARNING_TEXT); }
// public yarnwrap.text.OrderedText BLACK_CURSOR_TEXT() { return new yarnwrap.text.OrderedText(wrapperContained.BLACK_CURSOR_TEXT); }
// public yarnwrap.text.OrderedText GRAY_CURSOR_TEXT() { return new yarnwrap.text.OrderedText(wrapperContained.GRAY_CURSOR_TEXT); }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public int lastClickIndex() { return wrapperContained.lastClickIndex; }
// public boolean signing() { return wrapperContained.signing; }
// public long lastClickTime() { return wrapperContained.lastClickTime; }
// public yarnwrap.client.gui.widget.ButtonWidget signButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.signButton); }
// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public yarnwrap.item.ItemStack itemStack() { return new yarnwrap.item.ItemStack(wrapperContained.itemStack); }
// public boolean dirty() { return wrapperContained.dirty; }
// public yarnwrap.client.gui.widget.PageTurnWidget previousPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.previousPageButton); }
// public int currentPage() { return wrapperContained.currentPage; }
// public yarnwrap.client.gui.widget.ButtonWidget finalizeButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.finalizeButton); }
// public yarnwrap.client.gui.widget.PageTurnWidget nextPageButton() { return new yarnwrap.client.gui.widget.PageTurnWidget(wrapperContained.nextPageButton); }
// public int tickCounter() { return wrapperContained.tickCounter; }
// public java.lang.String title() { return wrapperContained.title; }
// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public yarnwrap.client.gui.widget.ButtonWidget cancelButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.cancelButton); }
// public int MAX_TEXT_WIDTH() { return wrapperContained.MAX_TEXT_WIDTH; }
// public int MAX_TEXT_HEIGHT() { return wrapperContained.MAX_TEXT_HEIGHT; }
// public int WIDTH() { return wrapperContained.WIDTH; }
// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public int countPages() { return wrapperContained.countPages(); }
// public void removeEmptyPages() { wrapperContained.removeEmptyPages(); }
// public void finalizeBook(boolean signBook) { wrapperContained.finalizeBook(signBook); }
// public void updateButtons() { wrapperContained.updateButtons(); }
// public void moveToLineEnd() { wrapperContained.moveToLineEnd(); }
// public void moveToLineStart() { wrapperContained.moveToLineStart(); }
// public java.lang.String getCurrentPageContent() { return wrapperContained.getCurrentPageContent(); }
// public void appendNewPage() { wrapperContained.appendNewPage(); }
// public void openPreviousPage() { wrapperContained.openPreviousPage(); }
// public void setPageContent(java.lang.String newContent) { wrapperContained.setPageContent(newContent); }
// public void openNextPage() { wrapperContained.openNextPage(); }
// public boolean keyPressedSignMode(int keyCode,int scanCode,int modifiers) { return wrapperContained.keyPressedSignMode(keyCode,scanCode,modifiers); }
// public Object getPageContent() { return wrapperContained.getPageContent(); }
// public void invalidatePageContent() { wrapperContained.invalidatePageContent(); }
// public Object createPageContent() { return wrapperContained.createPageContent(); }
// public void moveVertically(int lines) { wrapperContained.moveVertically(lines); }
// public void drawCursor(yarnwrap.client.gui.DrawContext context,Object position,boolean atEnd) { wrapperContained.drawCursor(context.wrapperContained,position,atEnd); }
// public Object screenPositionToAbsolutePosition(Object position) { return wrapperContained.screenPositionToAbsolutePosition(position); }
// public yarnwrap.client.util.math.Rect2i getRectFromCorners(Object start,Object end) { return new yarnwrap.client.util.math.Rect2i(wrapperContained.getRectFromCorners(start,end)); }
// public void setClipboard(java.lang.String clipboard) { wrapperContained.setClipboard(clipboard); }
// public yarnwrap.client.util.math.Rect2i getLineSelectionRectangle(java.lang.String string,yarnwrap.client.font.TextHandler handler,int selectionStart,int selectionEnd,int lineY,int lineStart) { return new yarnwrap.client.util.math.Rect2i(wrapperContained.getLineSelectionRectangle(string,handler.wrapperContained,selectionStart,selectionEnd,lineY,lineStart)); }
// public void createPageFromWrappedLines(org.apache.commons.lang3.mutable.MutableInt linesCount,java.lang.String content,org.apache.commons.lang3.mutable.MutableBoolean anyOfLinesEndsWithNewLine,it.unimi.dsi.fastutil.ints.IntList starts,java.util.List lines,yarnwrap.text.Style style,int start,int end) { wrapperContained.createPageFromWrappedLines(linesCount,content,anyOfLinesEndsWithNewLine,starts,lines,style.wrapperContained,start,end); }
// public void drawSelection(yarnwrap.client.gui.DrawContext context,net.minecraft.client.util.math.Rect2i[] selectionRectangles) { wrapperContained.drawSelection(context.wrapperContained,selectionRectangles); }
// public void selectCurrentWord(int cursor) { wrapperContained.selectCurrentWord(cursor); }
// public Object absolutePositionToScreenPosition(Object position) { return wrapperContained.absolutePositionToScreenPosition(position); }
// public int getLineFromOffset(int lineStarts,int position) { return wrapperContained.getLineFromOffset(lineStarts,position); }
// public boolean keyPressedEditMode(int keyCode,int scanCode,int modifiers) { return wrapperContained.keyPressedEditMode(keyCode,scanCode,modifiers); }
// public java.lang.String getClipboard() { return wrapperContained.getClipboard(); }
// public void moveUpLine() { wrapperContained.moveUpLine(); }
// public void moveDownLine() { wrapperContained.moveDownLine(); }
// public void changePage() { wrapperContained.changePage(); }
// public void writeNbtData() { wrapperContained.writeNbtData(); }

}