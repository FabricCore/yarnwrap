package yarnwrap.client.gui.widget;
public class EditBoxWidget { public net.minecraft.client.gui.widget.EditBoxWidget wrapperContained; public EditBoxWidget(net.minecraft.client.gui.widget.EditBoxWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CURSOR_PADDING() { return wrapperContained.CURSOR_PADDING; }
// public void CURSOR_PADDING(int value) { wrapperContained.CURSOR_PADDING = value; }
// public int CURSOR_COLOR() { return wrapperContained.CURSOR_COLOR; }
// public void CURSOR_COLOR(int value) { wrapperContained.CURSOR_COLOR = value; }
// public java.lang.String UNDERSCORE() { return wrapperContained.UNDERSCORE; }
// public void UNDERSCORE(java.lang.String value) { wrapperContained.UNDERSCORE = value; }
// public int FOCUSED_BOX_TEXT_COLOR() { return wrapperContained.FOCUSED_BOX_TEXT_COLOR; }
// public void FOCUSED_BOX_TEXT_COLOR(int value) { wrapperContained.FOCUSED_BOX_TEXT_COLOR = value; }
// public int UNFOCUSED_BOX_TEXT_COLOR() { return wrapperContained.UNFOCUSED_BOX_TEXT_COLOR; }
// public void UNFOCUSED_BOX_TEXT_COLOR(int value) { wrapperContained.UNFOCUSED_BOX_TEXT_COLOR = value; }
// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public yarnwrap.text.Text placeholder() { return new yarnwrap.text.Text(wrapperContained.placeholder); }
// public void placeholder(yarnwrap.text.Text value) { wrapperContained.placeholder = value.wrapperContained; }
// public yarnwrap.client.gui.EditBox editBox() { return new yarnwrap.client.gui.EditBox(wrapperContained.editBox); }
// public void editBox(yarnwrap.client.gui.EditBox value) { wrapperContained.editBox = value.wrapperContained; }
// public int CURSOR_BLINK_INTERVAL() { return wrapperContained.CURSOR_BLINK_INTERVAL; }
// public void CURSOR_BLINK_INTERVAL(int value) { wrapperContained.CURSOR_BLINK_INTERVAL = value; }
// public long lastSwitchFocusTime() { return wrapperContained.lastSwitchFocusTime; }
// public void lastSwitchFocusTime(long value) { wrapperContained.lastSwitchFocusTime = value; }
public EditBoxWidget(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,int width,int height,yarnwrap.text.Text placeholder,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.gui.widget.EditBoxWidget(textRenderer.wrapperContained,x,y,width,height,placeholder.wrapperContained,message.wrapperContained); }
public void setText(java.lang.String text) { wrapperContained.setText(text); }
public void setChangeListener(java.util.function.Consumer changeListener) { wrapperContained.setChangeListener(changeListener); }
public void setMaxLength(int maxLength) { wrapperContained.setMaxLength(maxLength); }
// public void drawSelection(yarnwrap.client.gui.DrawContext context,int left,int top,int right,int bottom) { wrapperContained.drawSelection(context.wrapperContained,left,top,right,bottom); }
// public void moveCursor(double mouseX,double mouseY) { wrapperContained.moveCursor(mouseX,mouseY); }
public java.lang.String getText() { return wrapperContained.getText(); }
// public void onCursorChange() { wrapperContained.onCursorChange(); }
// public double getMaxLinesWithoutOverflow() { return wrapperContained.getMaxLinesWithoutOverflow(); }

}