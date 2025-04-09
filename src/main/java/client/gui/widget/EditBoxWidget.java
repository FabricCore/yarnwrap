package yarnwrap.client.gui.widget;
public class EditBoxWidget { public net.minecraft.client.gui.widget.EditBoxWidget wrapperContained; public EditBoxWidget(net.minecraft.client.gui.widget.EditBoxWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CURSOR_PADDING() { return wrapperContained.CURSOR_PADDING; }
// public int CURSOR_COLOR() { return wrapperContained.CURSOR_COLOR; }
// public java.lang.String UNDERSCORE() { return wrapperContained.UNDERSCORE; }
// public int FOCUSED_BOX_TEXT_COLOR() { return wrapperContained.FOCUSED_BOX_TEXT_COLOR; }
// public int UNFOCUSED_BOX_TEXT_COLOR() { return wrapperContained.UNFOCUSED_BOX_TEXT_COLOR; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public yarnwrap.text.Text placeholder() { return new yarnwrap.text.Text(wrapperContained.placeholder); }
// public yarnwrap.client.gui.EditBox editBox() { return new yarnwrap.client.gui.EditBox(wrapperContained.editBox); }
// public int CURSOR_BLINK_INTERVAL() { return wrapperContained.CURSOR_BLINK_INTERVAL; }
// public long lastSwitchFocusTime() { return wrapperContained.lastSwitchFocusTime; }
public void setText(java.lang.String text) { wrapperContained.setText(text); }
public void setChangeListener(java.util.function.Consumer changeListener) { wrapperContained.setChangeListener(changeListener); }
public void setMaxLength(int maxLength) { wrapperContained.setMaxLength(maxLength); }
// public void drawSelection(yarnwrap.client.gui.DrawContext context,int left,int top,int right,int bottom) { wrapperContained.drawSelection(context.wrapperContained,left,top,right,bottom); }
// public void moveCursor(double mouseX,double mouseY) { wrapperContained.moveCursor(mouseX,mouseY); }
public java.lang.String getText() { return wrapperContained.getText(); }
// public void onCursorChange() { wrapperContained.onCursorChange(); }
// public double getMaxLinesWithoutOverflow() { return wrapperContained.getMaxLinesWithoutOverflow(); }

}