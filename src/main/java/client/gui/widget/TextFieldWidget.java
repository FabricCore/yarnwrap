package yarnwrap.client.gui.widget;
public class TextFieldWidget { public net.minecraft.client.gui.widget.TextFieldWidget wrapperContained; public TextFieldWidget(net.minecraft.client.gui.widget.TextFieldWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer changedListener() { return wrapperContained.changedListener; }
// public java.lang.String text() { return wrapperContained.text; }
// public boolean editable() { return wrapperContained.editable; }
// public boolean drawsBackground() { return wrapperContained.drawsBackground; }
// public boolean focusUnlocked() { return wrapperContained.focusUnlocked; }
// public int uneditableColor() { return wrapperContained.uneditableColor; }
// public java.util.function.BiFunction renderTextProvider() { return wrapperContained.renderTextProvider; }
// public int editableColor() { return wrapperContained.editableColor; }
// public int selectionEnd() { return wrapperContained.selectionEnd; }
// public int selectionStart() { return wrapperContained.selectionStart; }
// public int firstCharacterIndex() { return wrapperContained.firstCharacterIndex; }
// public java.util.function.Predicate textPredicate() { return wrapperContained.textPredicate; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public java.lang.String suggestion() { return wrapperContained.suggestion; }
// public int maxLength() { return wrapperContained.maxLength; }
public int DEFAULT_EDITABLE_COLOR() { return wrapperContained.DEFAULT_EDITABLE_COLOR; }
// public int VERTICAL_CURSOR_COLOR() { return wrapperContained.VERTICAL_CURSOR_COLOR; }
// public java.lang.String HORIZONTAL_CURSOR() { return wrapperContained.HORIZONTAL_CURSOR; }
// public yarnwrap.text.Text placeholder() { return new yarnwrap.text.Text(wrapperContained.placeholder); }
// public long lastSwitchFocusTime() { return wrapperContained.lastSwitchFocusTime; }
// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void erase(int offset) { wrapperContained.erase(offset); }
// public boolean drawsBackground() { return wrapperContained.drawsBackground(); }
public void setText(java.lang.String text) { wrapperContained.setText(text); }
public int getWordSkipPosition(int wordOffset) { return wrapperContained.getWordSkipPosition(wordOffset); }
public void setRenderTextProvider(java.util.function.BiFunction renderTextProvider) { wrapperContained.setRenderTextProvider(renderTextProvider); }
public void moveCursor(int offset,boolean shiftKeyPressed) { wrapperContained.moveCursor(offset,shiftKeyPressed); }
public void setFocusUnlocked(boolean focusUnlocked) { wrapperContained.setFocusUnlocked(focusUnlocked); }
public void setDrawsBackground(boolean drawsBackground) { wrapperContained.setDrawsBackground(drawsBackground); }
public int getInnerWidth() { return wrapperContained.getInnerWidth(); }
public void setUneditableColor(int uneditableColor) { wrapperContained.setUneditableColor(uneditableColor); }
// public int getMaxLength() { return wrapperContained.getMaxLength(); }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
public void setChangedListener(java.util.function.Consumer changedListener) { wrapperContained.setChangedListener(changedListener); }
// public int getWordSkipPosition(int wordOffset,int cursorPosition,boolean skipOverSpaces) { return wrapperContained.getWordSkipPosition(wordOffset,cursorPosition,skipOverSpaces); }
public java.lang.String getSelectedText() { return wrapperContained.getSelectedText(); }
public void write(java.lang.String text) { wrapperContained.write(text); }
public void setEditableColor(int editableColor) { wrapperContained.setEditableColor(editableColor); }
// public int getWordSkipPosition(int wordOffset,int cursorPosition) { return wrapperContained.getWordSkipPosition(wordOffset,cursorPosition); }
public void setCursorToStart(boolean shiftKeyPressed) { wrapperContained.setCursorToStart(shiftKeyPressed); }
public void setCursorToEnd(boolean shiftKeyPressed) { wrapperContained.setCursorToEnd(shiftKeyPressed); }
// public void onChanged(java.lang.String newText) { wrapperContained.onChanged(newText); }
public void setSelectionStart(int cursor) { wrapperContained.setSelectionStart(cursor); }
public void eraseWords(int wordOffset) { wrapperContained.eraseWords(wordOffset); }
public void eraseCharacters(int characterOffset) { wrapperContained.eraseCharacters(characterOffset); }
public void setMaxLength(int maxLength) { wrapperContained.setMaxLength(maxLength); }
public int getCursor() { return wrapperContained.getCursor(); }
public java.lang.String getText() { return wrapperContained.getText(); }
public void setCursor(int cursor,boolean shiftKeyPressed) { wrapperContained.setCursor(cursor,shiftKeyPressed); }
public void setSelectionEnd(int index) { wrapperContained.setSelectionEnd(index); }
public boolean isVisible() { return wrapperContained.isVisible(); }
// public void drawSelectionHighlight(yarnwrap.client.gui.DrawContext context,int x1,int y1,int x2,int y2) { wrapperContained.drawSelectionHighlight(context.wrapperContained,x1,y1,x2,y2); }
public void setSuggestion(java.lang.String suggestion) { wrapperContained.setSuggestion(suggestion); }
public void setEditable(boolean editable) { wrapperContained.setEditable(editable); }
public int getCharacterX(int index) { return wrapperContained.getCharacterX(index); }
public void setTextPredicate(java.util.function.Predicate textPredicate) { wrapperContained.setTextPredicate(textPredicate); }
public boolean isActive() { return wrapperContained.isActive(); }
// public boolean isEditable() { return wrapperContained.isEditable(); }
// public int getCursorPosWithOffset(int offset) { return wrapperContained.getCursorPosWithOffset(offset); }
public void setPlaceholder(yarnwrap.text.Text placeholder) { wrapperContained.setPlaceholder(placeholder.wrapperContained); }
// public void updateFirstCharacterIndex(int cursor) { wrapperContained.updateFirstCharacterIndex(cursor); }
public void eraseCharactersTo(int position) { wrapperContained.eraseCharactersTo(position); }

}