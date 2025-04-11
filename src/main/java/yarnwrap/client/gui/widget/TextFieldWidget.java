package yarnwrap.client.gui.widget;
public class TextFieldWidget { public net.minecraft.client.gui.widget.TextFieldWidget wrapperContained; public TextFieldWidget(net.minecraft.client.gui.widget.TextFieldWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer changedListener() { return wrapperContained.changedListener; }
// public void changedListener(java.util.function.Consumer value) { wrapperContained.changedListener = value; }
// public java.lang.String text() { return wrapperContained.text; }
// public void text(java.lang.String value) { wrapperContained.text = value; }
// public boolean editable() { return wrapperContained.editable; }
// public void editable(boolean value) { wrapperContained.editable = value; }
// public boolean drawsBackground() { return wrapperContained.drawsBackground; }
// public void drawsBackground(boolean value) { wrapperContained.drawsBackground = value; }
// public boolean focusUnlocked() { return wrapperContained.focusUnlocked; }
// public void focusUnlocked(boolean value) { wrapperContained.focusUnlocked = value; }
// public int uneditableColor() { return wrapperContained.uneditableColor; }
// public void uneditableColor(int value) { wrapperContained.uneditableColor = value; }
// public java.util.function.BiFunction renderTextProvider() { return wrapperContained.renderTextProvider; }
// public void renderTextProvider(java.util.function.BiFunction value) { wrapperContained.renderTextProvider = value; }
// public int editableColor() { return wrapperContained.editableColor; }
// public void editableColor(int value) { wrapperContained.editableColor = value; }
// public int selectionEnd() { return wrapperContained.selectionEnd; }
// public void selectionEnd(int value) { wrapperContained.selectionEnd = value; }
// public int selectionStart() { return wrapperContained.selectionStart; }
// public void selectionStart(int value) { wrapperContained.selectionStart = value; }
// public int firstCharacterIndex() { return wrapperContained.firstCharacterIndex; }
// public void firstCharacterIndex(int value) { wrapperContained.firstCharacterIndex = value; }
// public java.util.function.Predicate textPredicate() { return wrapperContained.textPredicate; }
// public void textPredicate(java.util.function.Predicate value) { wrapperContained.textPredicate = value; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public java.lang.String suggestion() { return wrapperContained.suggestion; }
// public void suggestion(java.lang.String value) { wrapperContained.suggestion = value; }
// public int maxLength() { return wrapperContained.maxLength; }
// public void maxLength(int value) { wrapperContained.maxLength = value; }
public int DEFAULT_EDITABLE_COLOR() { return wrapperContained.DEFAULT_EDITABLE_COLOR; }
// public void DEFAULT_EDITABLE_COLOR(int value) { wrapperContained.DEFAULT_EDITABLE_COLOR = value; }
// public int VERTICAL_CURSOR_COLOR() { return wrapperContained.VERTICAL_CURSOR_COLOR; }
// public void VERTICAL_CURSOR_COLOR(int value) { wrapperContained.VERTICAL_CURSOR_COLOR = value; }
// public java.lang.String HORIZONTAL_CURSOR() { return wrapperContained.HORIZONTAL_CURSOR; }
// public void HORIZONTAL_CURSOR(java.lang.String value) { wrapperContained.HORIZONTAL_CURSOR = value; }
// public yarnwrap.text.Text placeholder() { return new yarnwrap.text.Text(wrapperContained.placeholder); }
// public void placeholder(yarnwrap.text.Text value) { wrapperContained.placeholder = value.wrapperContained; }
// public long lastSwitchFocusTime() { return wrapperContained.lastSwitchFocusTime; }
// public void lastSwitchFocusTime(long value) { wrapperContained.lastSwitchFocusTime = value; }
// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXTURES = value.wrapperContained; }
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