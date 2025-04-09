package yarnwrap.client.util;
public class SelectionManager { public net.minecraft.client.util.SelectionManager wrapperContained; public SelectionManager(net.minecraft.client.util.SelectionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int selectionEnd() { return wrapperContained.selectionEnd; }
// public int selectionStart() { return wrapperContained.selectionStart; }
// public java.util.function.Supplier clipboardGetter() { return wrapperContained.clipboardGetter; }
// public java.util.function.Consumer clipboardSetter() { return wrapperContained.clipboardSetter; }
// public java.util.function.Supplier stringGetter() { return wrapperContained.stringGetter; }
// public java.util.function.Consumer stringSetter() { return wrapperContained.stringSetter; }
// public java.util.function.Predicate stringFilter() { return wrapperContained.stringFilter; }
public void insert(java.lang.String string) { wrapperContained.insert(string); }
// public java.lang.String deleteSelectedText(java.lang.String string) { return wrapperContained.deleteSelectedText(string); }
public boolean insert(char c) { return wrapperContained.insert(c); }
// public java.lang.String getSelectedText(java.lang.String string) { return wrapperContained.getSelectedText(string); }
public int getSelectionStart() { return wrapperContained.getSelectionStart(); }
public boolean handleSpecialKey(int keyCode) { return wrapperContained.handleSpecialKey(keyCode); }
public int getSelectionEnd() { return wrapperContained.getSelectionEnd(); }
public void putCursorAtEnd() { wrapperContained.putCursorAtEnd(); }
public void cut() { wrapperContained.cut(); }
public void setSelection(int start,int end) { wrapperContained.setSelection(start,end); }
public void moveCursor(int offset,boolean shiftDown) { wrapperContained.moveCursor(offset,shiftDown); }
public java.util.function.Supplier makeClipboardGetter(yarnwrap.client.MinecraftClient client) { return wrapperContained.makeClipboardGetter(client.wrapperContained); }
public void setClipboard(yarnwrap.client.MinecraftClient client,java.lang.String clipboard) { wrapperContained.setClipboard(client.wrapperContained,clipboard); }
// public void insert(java.lang.String string,java.lang.String insertion) { wrapperContained.insert(string,insertion); }
public void moveCursorToStart(boolean shiftDown) { wrapperContained.moveCursorToStart(shiftDown); }
public void paste() { wrapperContained.paste(); }
public void moveCursorPastWord(int offset,boolean shiftDown) { wrapperContained.moveCursorPastWord(offset,shiftDown); }
public java.lang.String getClipboard(yarnwrap.client.MinecraftClient client) { return wrapperContained.getClipboard(client.wrapperContained); }
public void moveCursorToEnd(boolean shiftDown) { wrapperContained.moveCursorToEnd(shiftDown); }
public void copy() { wrapperContained.copy(); }
public void moveCursorTo(int position,boolean shiftDown) { wrapperContained.moveCursorTo(position,shiftDown); }
public java.util.function.Consumer makeClipboardSetter(yarnwrap.client.MinecraftClient client) { return wrapperContained.makeClipboardSetter(client.wrapperContained); }
// public void updateSelectionRange(boolean shiftDown) { wrapperContained.updateSelectionRange(shiftDown); }
public void selectAll() { wrapperContained.selectAll(); }
public void delete(int offset) { wrapperContained.delete(offset); }
// public int clampCursorPosition(int pos) { return wrapperContained.clampCursorPosition(pos); }
public boolean isSelecting() { return wrapperContained.isSelecting(); }
public void moveCursor(int offset) { wrapperContained.moveCursor(offset); }
public void moveCursorPastWord(int offset) { wrapperContained.moveCursorPastWord(offset); }
public void moveCursorToStart() { wrapperContained.moveCursorToStart(); }
public void moveCursorTo(int position) { wrapperContained.moveCursorTo(position); }
public void setSelectionEnd(int pos) { wrapperContained.setSelectionEnd(pos); }
// public void delete(int offset,Object selectionType) { wrapperContained.delete(offset,selectionType); }
// public void moveCursor(int offset,boolean shiftDown,Object selectionType) { wrapperContained.moveCursor(offset,shiftDown,selectionType); }
public void deleteWord(int offset) { wrapperContained.deleteWord(offset); }

}