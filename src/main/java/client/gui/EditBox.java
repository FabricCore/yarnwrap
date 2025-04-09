package yarnwrap.client.gui;
public class EditBox { public net.minecraft.client.gui.EditBox wrapperContained; public EditBox(net.minecraft.client.gui.EditBox wrapperContained) { this.wrapperContained = wrapperContained; }

public int UNLIMITED_LENGTH() { return wrapperContained.UNLIMITED_LENGTH; }
// public int CURSOR_WIDTH() { return wrapperContained.CURSOR_WIDTH; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public java.util.List lines() { return wrapperContained.lines; }
// public java.lang.String text() { return wrapperContained.text; }
// public int cursor() { return wrapperContained.cursor; }
// public int selectionEnd() { return wrapperContained.selectionEnd; }
// public boolean selecting() { return wrapperContained.selecting; }
// public int maxLength() { return wrapperContained.maxLength; }
// public int width() { return wrapperContained.width; }
// public java.util.function.Consumer changeListener() { return wrapperContained.changeListener; }
// public java.lang.Runnable cursorChangeListener() { return wrapperContained.cursorChangeListener; }
public int getMaxLength() { return wrapperContained.getMaxLength(); }
public void moveCursor(double x,double y) { wrapperContained.moveCursor(x,y); }
public void setMaxLength(int maxLength) { wrapperContained.setMaxLength(maxLength); }
public void moveCursor(yarnwrap.client.input.CursorMovement movement,int amount) { wrapperContained.moveCursor(movement.wrapperContained,amount); }
public void setCursorChangeListener(java.lang.Runnable cursorChangeListener) { wrapperContained.setCursorChangeListener(cursorChangeListener); }
public void setText(java.lang.String text) { wrapperContained.setText(text); }
public void setChangeListener(java.util.function.Consumer changeListener) { wrapperContained.setChangeListener(changeListener); }
public void setSelecting(boolean selecting) { wrapperContained.setSelecting(selecting); }
public boolean hasMaxLength() { return wrapperContained.hasMaxLength(); }
public void delete(int offset) { wrapperContained.delete(offset); }
public void replaceSelection(java.lang.String string) { wrapperContained.replaceSelection(string); }
public java.lang.String getText() { return wrapperContained.getText(); }
public Object getLine(int index) { return wrapperContained.getLine(index); }
// public java.lang.String truncateForReplacement(java.lang.String value) { return wrapperContained.truncateForReplacement(value); }
public int getCursor() { return wrapperContained.getCursor(); }
public void moveCursorLine(int offset) { wrapperContained.moveCursorLine(offset); }
// public java.lang.String truncate(java.lang.String value) { return wrapperContained.truncate(value); }
public Object getSelection() { return wrapperContained.getSelection(); }
public boolean handleSpecialKey(int keyCode) { return wrapperContained.handleSpecialKey(keyCode); }
public int getLineCount() { return wrapperContained.getLineCount(); }
// public Object getOffsetLine(int offsetFromCurrent) { return wrapperContained.getOffsetLine(offsetFromCurrent); }
public int getCurrentLineIndex() { return wrapperContained.getCurrentLineIndex(); }
// public int getWordEndIndex(int startIndex) { return wrapperContained.getWordEndIndex(startIndex); }
public java.lang.Iterable getLines() { return wrapperContained.getLines(); }
public boolean hasSelection() { return wrapperContained.hasSelection(); }
public java.lang.String getSelectedText() { return wrapperContained.getSelectedText(); }
public Object getPreviousWordAtCursor() { return wrapperContained.getPreviousWordAtCursor(); }
public Object getNextWordAtCursor() { return wrapperContained.getNextWordAtCursor(); }
// public Object getCurrentLine() { return wrapperContained.getCurrentLine(); }
// public void onChange() { wrapperContained.onChange(); }
// public void rewrap() { wrapperContained.rewrap(); }

}