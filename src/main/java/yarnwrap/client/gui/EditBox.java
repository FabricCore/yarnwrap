package yarnwrap.client.gui;
public class EditBox { public net.minecraft.client.gui.EditBox wrapperContained; public EditBox(net.minecraft.client.gui.EditBox wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UNLIMITED_LENGTH() { return wrapperContained.UNLIMITED_LENGTH; }
// public void UNLIMITED_LENGTH(int value) { wrapperContained.UNLIMITED_LENGTH = value; }
public static int UNLIMITED_LENGTH() { return net.minecraft.client.gui.EditBox.UNLIMITED_LENGTH; }
// public static void UNLIMITED_LENGTH(int value, ) { net.minecraft.client.gui.EditBox.UNLIMITED_LENGTH = value; }

// public int CURSOR_WIDTH() { return wrapperContained.CURSOR_WIDTH; }
// public void CURSOR_WIDTH(int value) { wrapperContained.CURSOR_WIDTH = value; }
// public static int CURSOR_WIDTH() { return net.minecraft.client.gui.EditBox.CURSOR_WIDTH; }
// public static void CURSOR_WIDTH(int value, ) { net.minecraft.client.gui.EditBox.CURSOR_WIDTH = value; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.EditBox.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.EditBox.textRenderer = value.wrapperContained; }

// public java.util.List lines() { return wrapperContained.lines; }
// public void lines(java.util.List value) { wrapperContained.lines = value; }
// public static java.util.List lines() { return net.minecraft.client.gui.EditBox.lines; }
// public static void lines(java.util.List value, ) { net.minecraft.client.gui.EditBox.lines = value; }

// public java.lang.String text() { return wrapperContained.text; }
// public void text(java.lang.String value) { wrapperContained.text = value; }
// public static java.lang.String text() { return net.minecraft.client.gui.EditBox.text; }
// public static void text(java.lang.String value, ) { net.minecraft.client.gui.EditBox.text = value; }

// public int cursor() { return wrapperContained.cursor; }
// public void cursor(int value) { wrapperContained.cursor = value; }
// public static int cursor() { return net.minecraft.client.gui.EditBox.cursor; }
// public static void cursor(int value, ) { net.minecraft.client.gui.EditBox.cursor = value; }

// public int selectionEnd() { return wrapperContained.selectionEnd; }
// public void selectionEnd(int value) { wrapperContained.selectionEnd = value; }
// public static int selectionEnd() { return net.minecraft.client.gui.EditBox.selectionEnd; }
// public static void selectionEnd(int value, ) { net.minecraft.client.gui.EditBox.selectionEnd = value; }

// public boolean selecting() { return wrapperContained.selecting; }
// public void selecting(boolean value) { wrapperContained.selecting = value; }
// public static boolean selecting() { return net.minecraft.client.gui.EditBox.selecting; }
// public static void selecting(boolean value, ) { net.minecraft.client.gui.EditBox.selecting = value; }

// public int maxLength() { return wrapperContained.maxLength; }
// public void maxLength(int value) { wrapperContained.maxLength = value; }
// public static int maxLength() { return net.minecraft.client.gui.EditBox.maxLength; }
// public static void maxLength(int value, ) { net.minecraft.client.gui.EditBox.maxLength = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.gui.EditBox.width; }
// public static void width(int value, ) { net.minecraft.client.gui.EditBox.width = value; }

// public java.util.function.Consumer changeListener() { return wrapperContained.changeListener; }
// public void changeListener(java.util.function.Consumer value) { wrapperContained.changeListener = value; }
// public static java.util.function.Consumer changeListener() { return net.minecraft.client.gui.EditBox.changeListener; }
// public static void changeListener(java.util.function.Consumer value, ) { net.minecraft.client.gui.EditBox.changeListener = value; }

// public java.lang.Runnable cursorChangeListener() { return wrapperContained.cursorChangeListener; }
// public void cursorChangeListener(java.lang.Runnable value) { wrapperContained.cursorChangeListener = value; }
// public static java.lang.Runnable cursorChangeListener() { return net.minecraft.client.gui.EditBox.cursorChangeListener; }
// public static void cursorChangeListener(java.lang.Runnable value, ) { net.minecraft.client.gui.EditBox.cursorChangeListener = value; }

public EditBox(yarnwrap.client.font.TextRenderer textRenderer,int width) { this.wrapperContained = new net.minecraft.client.gui.EditBox(textRenderer.wrapperContained,width); }
public int getMaxLength() { return wrapperContained.getMaxLength(); }
// public static int getMaxLength() { return net.minecraft.client.gui.EditBox.getMaxLength(); }
public void moveCursor(double x,double y) { wrapperContained.moveCursor(x,y); }
// public static void moveCursor(double x,double y, ) { net.minecraft.client.gui.EditBox.moveCursor(x,y); }
public void setMaxLength(int maxLength) { wrapperContained.setMaxLength(maxLength); }
// public static void setMaxLength(int maxLength, ) { net.minecraft.client.gui.EditBox.setMaxLength(maxLength); }
public void moveCursor(yarnwrap.client.input.CursorMovement movement,int amount) { wrapperContained.moveCursor(movement.wrapperContained,amount); }
// public static void moveCursor(yarnwrap.client.input.CursorMovement movement,int amount, ) { net.minecraft.client.gui.EditBox.moveCursor(movement.wrapperContained,amount); }
public void setCursorChangeListener(java.lang.Runnable cursorChangeListener) { wrapperContained.setCursorChangeListener(cursorChangeListener); }
// public static void setCursorChangeListener(java.lang.Runnable cursorChangeListener, ) { net.minecraft.client.gui.EditBox.setCursorChangeListener(cursorChangeListener); }
public void setText(java.lang.String text) { wrapperContained.setText(text); }
// public static void setText(java.lang.String text, ) { net.minecraft.client.gui.EditBox.setText(text); }
public void setChangeListener(java.util.function.Consumer changeListener) { wrapperContained.setChangeListener(changeListener); }
// public static void setChangeListener(java.util.function.Consumer changeListener, ) { net.minecraft.client.gui.EditBox.setChangeListener(changeListener); }
// public void method_44416(yarnwrap.text.Style style,int start,int end) { wrapperContained.method_44416(style.wrapperContained,start,end); }
// public static void method_44416(yarnwrap.text.Style style,int start,int end, ) { net.minecraft.client.gui.EditBox.method_44416(style.wrapperContained,start,end); }
public void setSelecting(boolean selecting) { wrapperContained.setSelecting(selecting); }
// public static void setSelecting(boolean selecting, ) { net.minecraft.client.gui.EditBox.setSelecting(selecting); }
public boolean hasMaxLength() { return wrapperContained.hasMaxLength(); }
// public static boolean hasMaxLength() { return net.minecraft.client.gui.EditBox.hasMaxLength(); }
public void delete(int offset) { wrapperContained.delete(offset); }
// public static void delete(int offset, ) { net.minecraft.client.gui.EditBox.delete(offset); }
public void replaceSelection(java.lang.String string) { wrapperContained.replaceSelection(string); }
// public static void replaceSelection(java.lang.String string, ) { net.minecraft.client.gui.EditBox.replaceSelection(string); }
public java.lang.String getText() { return wrapperContained.getText(); }
// public static java.lang.String getText() { return net.minecraft.client.gui.EditBox.getText(); }
public Object getLine(int index) { return wrapperContained.getLine(index); }
// public static Object getLine(int index, ) { return net.minecraft.client.gui.EditBox.getLine(index); }
// public java.lang.String truncateForReplacement(java.lang.String value) { return wrapperContained.truncateForReplacement(value); }
// public static java.lang.String truncateForReplacement(java.lang.String value, ) { return net.minecraft.client.gui.EditBox.truncateForReplacement(value); }
public int getCursor() { return wrapperContained.getCursor(); }
// public static int getCursor() { return net.minecraft.client.gui.EditBox.getCursor(); }
public void moveCursorLine(int offset) { wrapperContained.moveCursorLine(offset); }
// public static void moveCursorLine(int offset, ) { net.minecraft.client.gui.EditBox.moveCursorLine(offset); }
// public java.lang.String truncate(java.lang.String value) { return wrapperContained.truncate(value); }
// public static java.lang.String truncate(java.lang.String value, ) { return net.minecraft.client.gui.EditBox.truncate(value); }
public Object getSelection() { return wrapperContained.getSelection(); }
// public static Object getSelection() { return net.minecraft.client.gui.EditBox.getSelection(); }
public boolean handleSpecialKey(int keyCode) { return wrapperContained.handleSpecialKey(keyCode); }
// public static boolean handleSpecialKey(int keyCode, ) { return net.minecraft.client.gui.EditBox.handleSpecialKey(keyCode); }
// public void method_44429(java.lang.String text) { wrapperContained.method_44429(text); }
// public static void method_44429(java.lang.String text, ) { net.minecraft.client.gui.EditBox.method_44429(text); }
public int getLineCount() { return wrapperContained.getLineCount(); }
// public static int getLineCount() { return net.minecraft.client.gui.EditBox.getLineCount(); }
// public Object getOffsetLine(int offsetFromCurrent) { return wrapperContained.getOffsetLine(offsetFromCurrent); }
// public static Object getOffsetLine(int offsetFromCurrent, ) { return net.minecraft.client.gui.EditBox.getOffsetLine(offsetFromCurrent); }
public int getCurrentLineIndex() { return wrapperContained.getCurrentLineIndex(); }
// public static int getCurrentLineIndex() { return net.minecraft.client.gui.EditBox.getCurrentLineIndex(); }
// public int getWordEndIndex(int startIndex) { return wrapperContained.getWordEndIndex(startIndex); }
// public static int getWordEndIndex(int startIndex, ) { return net.minecraft.client.gui.EditBox.getWordEndIndex(startIndex); }
public java.lang.Iterable getLines() { return wrapperContained.getLines(); }
// public static java.lang.Iterable getLines() { return net.minecraft.client.gui.EditBox.getLines(); }
public boolean hasSelection() { return wrapperContained.hasSelection(); }
// public static boolean hasSelection() { return net.minecraft.client.gui.EditBox.hasSelection(); }
public java.lang.String getSelectedText() { return wrapperContained.getSelectedText(); }
// public static java.lang.String getSelectedText() { return net.minecraft.client.gui.EditBox.getSelectedText(); }
public Object getPreviousWordAtCursor() { return wrapperContained.getPreviousWordAtCursor(); }
// public static Object getPreviousWordAtCursor() { return net.minecraft.client.gui.EditBox.getPreviousWordAtCursor(); }
public Object getNextWordAtCursor() { return wrapperContained.getNextWordAtCursor(); }
// public static Object getNextWordAtCursor() { return net.minecraft.client.gui.EditBox.getNextWordAtCursor(); }
// public Object getCurrentLine() { return wrapperContained.getCurrentLine(); }
// public static Object getCurrentLine() { return net.minecraft.client.gui.EditBox.getCurrentLine(); }
// public void onChange() { wrapperContained.onChange(); }
// public static void onChange() { net.minecraft.client.gui.EditBox.onChange(); }
// public void rewrap() { wrapperContained.rewrap(); }
// public static void rewrap() { net.minecraft.client.gui.EditBox.rewrap(); }

}