package yarnwrap.client.util;
public class SelectionManager { public net.minecraft.client.util.SelectionManager wrapperContained; public SelectionManager(net.minecraft.client.util.SelectionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int selectionEnd() { return wrapperContained.selectionEnd; }
// public void selectionEnd(int value) { wrapperContained.selectionEnd = value; }
// public static int selectionEnd() { return net.minecraft.client.util.SelectionManager.selectionEnd; }
// public static void selectionEnd(int value, ) { net.minecraft.client.util.SelectionManager.selectionEnd = value; }

// public int selectionStart() { return wrapperContained.selectionStart; }
// public void selectionStart(int value) { wrapperContained.selectionStart = value; }
// public static int selectionStart() { return net.minecraft.client.util.SelectionManager.selectionStart; }
// public static void selectionStart(int value, ) { net.minecraft.client.util.SelectionManager.selectionStart = value; }

// public java.util.function.Supplier clipboardGetter() { return wrapperContained.clipboardGetter; }
// public void clipboardGetter(java.util.function.Supplier value) { wrapperContained.clipboardGetter = value; }
// public static java.util.function.Supplier clipboardGetter() { return net.minecraft.client.util.SelectionManager.clipboardGetter; }
// public static void clipboardGetter(java.util.function.Supplier value, ) { net.minecraft.client.util.SelectionManager.clipboardGetter = value; }

// public java.util.function.Consumer clipboardSetter() { return wrapperContained.clipboardSetter; }
// public void clipboardSetter(java.util.function.Consumer value) { wrapperContained.clipboardSetter = value; }
// public static java.util.function.Consumer clipboardSetter() { return net.minecraft.client.util.SelectionManager.clipboardSetter; }
// public static void clipboardSetter(java.util.function.Consumer value, ) { net.minecraft.client.util.SelectionManager.clipboardSetter = value; }

// public java.util.function.Supplier stringGetter() { return wrapperContained.stringGetter; }
// public void stringGetter(java.util.function.Supplier value) { wrapperContained.stringGetter = value; }
// public static java.util.function.Supplier stringGetter() { return net.minecraft.client.util.SelectionManager.stringGetter; }
// public static void stringGetter(java.util.function.Supplier value, ) { net.minecraft.client.util.SelectionManager.stringGetter = value; }

// public java.util.function.Consumer stringSetter() { return wrapperContained.stringSetter; }
// public void stringSetter(java.util.function.Consumer value) { wrapperContained.stringSetter = value; }
// public static java.util.function.Consumer stringSetter() { return net.minecraft.client.util.SelectionManager.stringSetter; }
// public static void stringSetter(java.util.function.Consumer value, ) { net.minecraft.client.util.SelectionManager.stringSetter = value; }

// public java.util.function.Predicate stringFilter() { return wrapperContained.stringFilter; }
// public void stringFilter(java.util.function.Predicate value) { wrapperContained.stringFilter = value; }
// public static java.util.function.Predicate stringFilter() { return net.minecraft.client.util.SelectionManager.stringFilter; }
// public static void stringFilter(java.util.function.Predicate value, ) { net.minecraft.client.util.SelectionManager.stringFilter = value; }

public SelectionManager(java.util.function.Supplier stringGetter,java.util.function.Consumer stringSetter,java.util.function.Supplier clipboardGetter,java.util.function.Consumer clipboardSetter,java.util.function.Predicate stringFilter) { this.wrapperContained = new net.minecraft.client.util.SelectionManager(stringGetter,stringSetter,clipboardGetter,clipboardSetter,stringFilter); }
public void insert(java.lang.String string) { wrapperContained.insert(string); }
// public static void insert(java.lang.String string, ) { net.minecraft.client.util.SelectionManager.insert(string); }
// public java.lang.String deleteSelectedText(java.lang.String string) { return wrapperContained.deleteSelectedText(string); }
// public static java.lang.String deleteSelectedText(java.lang.String string, ) { return net.minecraft.client.util.SelectionManager.deleteSelectedText(string); }
public boolean insert(char c) { return wrapperContained.insert(c); }
// public static boolean insert(char c, ) { return net.minecraft.client.util.SelectionManager.insert(c); }
// public java.lang.String getSelectedText(java.lang.String string) { return wrapperContained.getSelectedText(string); }
// public static java.lang.String getSelectedText(java.lang.String string, ) { return net.minecraft.client.util.SelectionManager.getSelectedText(string); }
public int getSelectionStart() { return wrapperContained.getSelectionStart(); }
// public static int getSelectionStart() { return net.minecraft.client.util.SelectionManager.getSelectionStart(); }
public boolean handleSpecialKey(int keyCode) { return wrapperContained.handleSpecialKey(keyCode); }
// public static boolean handleSpecialKey(int keyCode, ) { return net.minecraft.client.util.SelectionManager.handleSpecialKey(keyCode); }
public int getSelectionEnd() { return wrapperContained.getSelectionEnd(); }
// public static int getSelectionEnd() { return net.minecraft.client.util.SelectionManager.getSelectionEnd(); }
public void putCursorAtEnd() { wrapperContained.putCursorAtEnd(); }
// public static void putCursorAtEnd() { net.minecraft.client.util.SelectionManager.putCursorAtEnd(); }
public void cut() { wrapperContained.cut(); }
// public static void cut() { net.minecraft.client.util.SelectionManager.cut(); }
public void setSelection(int start,int end) { wrapperContained.setSelection(start,end); }
// public static void setSelection(int start,int end, ) { net.minecraft.client.util.SelectionManager.setSelection(start,end); }
public void moveCursor(int offset,boolean shiftDown) { wrapperContained.moveCursor(offset,shiftDown); }
// public static void moveCursor(int offset,boolean shiftDown, ) { net.minecraft.client.util.SelectionManager.moveCursor(offset,shiftDown); }
// public java.util.function.Supplier makeClipboardGetter(yarnwrap.client.MinecraftClient client) { return wrapperContained.makeClipboardGetter(client.wrapperContained); }
// public static java.util.function.Supplier makeClipboardGetter(yarnwrap.client.MinecraftClient client, ) { return net.minecraft.client.util.SelectionManager.makeClipboardGetter(client.wrapperContained); }
// public void setClipboard(yarnwrap.client.MinecraftClient client,java.lang.String clipboard) { wrapperContained.setClipboard(client.wrapperContained,clipboard); }
// public static void setClipboard(yarnwrap.client.MinecraftClient client,java.lang.String clipboard, ) { net.minecraft.client.util.SelectionManager.setClipboard(client.wrapperContained,clipboard); }
// public void insert(java.lang.String string,java.lang.String insertion) { wrapperContained.insert(string,insertion); }
// public static void insert(java.lang.String string,java.lang.String insertion, ) { net.minecraft.client.util.SelectionManager.insert(string,insertion); }
public void moveCursorToStart(boolean shiftDown) { wrapperContained.moveCursorToStart(shiftDown); }
// public static void moveCursorToStart(boolean shiftDown, ) { net.minecraft.client.util.SelectionManager.moveCursorToStart(shiftDown); }
public void paste() { wrapperContained.paste(); }
// public static void paste() { net.minecraft.client.util.SelectionManager.paste(); }
public void moveCursorPastWord(int offset,boolean shiftDown) { wrapperContained.moveCursorPastWord(offset,shiftDown); }
// public static void moveCursorPastWord(int offset,boolean shiftDown, ) { net.minecraft.client.util.SelectionManager.moveCursorPastWord(offset,shiftDown); }
// public java.lang.String getClipboard(yarnwrap.client.MinecraftClient client) { return wrapperContained.getClipboard(client.wrapperContained); }
// public static java.lang.String getClipboard(yarnwrap.client.MinecraftClient client, ) { return net.minecraft.client.util.SelectionManager.getClipboard(client.wrapperContained); }
// public void method_27557(yarnwrap.client.MinecraftClient clipboardString) { wrapperContained.method_27557(clipboardString.wrapperContained); }
// public static void method_27557(yarnwrap.client.MinecraftClient clipboardString, ) { net.minecraft.client.util.SelectionManager.method_27557(clipboardString.wrapperContained); }
public void moveCursorToEnd(boolean shiftDown) { wrapperContained.moveCursorToEnd(shiftDown); }
// public static void moveCursorToEnd(boolean shiftDown, ) { net.minecraft.client.util.SelectionManager.moveCursorToEnd(shiftDown); }
public void copy() { wrapperContained.copy(); }
// public static void copy() { net.minecraft.client.util.SelectionManager.copy(); }
public void moveCursorTo(int position,boolean shiftDown) { wrapperContained.moveCursorTo(position,shiftDown); }
// public static void moveCursorTo(int position,boolean shiftDown, ) { net.minecraft.client.util.SelectionManager.moveCursorTo(position,shiftDown); }
// public java.util.function.Consumer makeClipboardSetter(yarnwrap.client.MinecraftClient client) { return wrapperContained.makeClipboardSetter(client.wrapperContained); }
// public static java.util.function.Consumer makeClipboardSetter(yarnwrap.client.MinecraftClient client, ) { return net.minecraft.client.util.SelectionManager.makeClipboardSetter(client.wrapperContained); }
// public void updateSelectionRange(boolean shiftDown) { wrapperContained.updateSelectionRange(shiftDown); }
// public static void updateSelectionRange(boolean shiftDown, ) { net.minecraft.client.util.SelectionManager.updateSelectionRange(shiftDown); }
public void selectAll() { wrapperContained.selectAll(); }
// public static void selectAll() { net.minecraft.client.util.SelectionManager.selectAll(); }
public void delete(int offset) { wrapperContained.delete(offset); }
// public static void delete(int offset, ) { net.minecraft.client.util.SelectionManager.delete(offset); }
// public int clampCursorPosition(int pos) { return wrapperContained.clampCursorPosition(pos); }
// public static int clampCursorPosition(int pos, ) { return net.minecraft.client.util.SelectionManager.clampCursorPosition(pos); }
public boolean isSelecting() { return wrapperContained.isSelecting(); }
// public static boolean isSelecting() { return net.minecraft.client.util.SelectionManager.isSelecting(); }
public void moveCursor(int offset) { wrapperContained.moveCursor(offset); }
// public static void moveCursor(int offset, ) { net.minecraft.client.util.SelectionManager.moveCursor(offset); }
public void moveCursorPastWord(int offset) { wrapperContained.moveCursorPastWord(offset); }
// public static void moveCursorPastWord(int offset, ) { net.minecraft.client.util.SelectionManager.moveCursorPastWord(offset); }
public void moveCursorToStart() { wrapperContained.moveCursorToStart(); }
// public static void moveCursorToStart() { net.minecraft.client.util.SelectionManager.moveCursorToStart(); }
public void moveCursorTo(int position) { wrapperContained.moveCursorTo(position); }
// public static void moveCursorTo(int position, ) { net.minecraft.client.util.SelectionManager.moveCursorTo(position); }
public void setSelectionEnd(int pos) { wrapperContained.setSelectionEnd(pos); }
// public static void setSelectionEnd(int pos, ) { net.minecraft.client.util.SelectionManager.setSelectionEnd(pos); }
// // public void delete(int offset,Object selectionType) { wrapperContained.delete(offset,selectionType); }
// public static void delete(int offset,Object selectionType, ) { net.minecraft.client.util.SelectionManager.delete(offset,selectionType); }
// // public void moveCursor(int offset,boolean shiftDown,Object selectionType) { wrapperContained.moveCursor(offset,shiftDown,selectionType); }
// public static void moveCursor(int offset,boolean shiftDown,Object selectionType, ) { net.minecraft.client.util.SelectionManager.moveCursor(offset,shiftDown,selectionType); }
public void deleteWord(int offset) { wrapperContained.deleteWord(offset); }
// public static void deleteWord(int offset, ) { net.minecraft.client.util.SelectionManager.deleteWord(offset); }

}