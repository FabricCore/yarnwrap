package yarnwrap.client.gui.widget;
public class EditBoxWidget { public net.minecraft.client.gui.widget.EditBoxWidget wrapperContained; public EditBoxWidget(net.minecraft.client.gui.widget.EditBoxWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CURSOR_PADDING() { return wrapperContained.CURSOR_PADDING; }
// public void CURSOR_PADDING(int value) { wrapperContained.CURSOR_PADDING = value; }
// public static int CURSOR_PADDING() { return net.minecraft.client.gui.widget.EditBoxWidget.CURSOR_PADDING; }
// public static void CURSOR_PADDING(int value, ) { net.minecraft.client.gui.widget.EditBoxWidget.CURSOR_PADDING = value; }

// public int CURSOR_COLOR() { return wrapperContained.CURSOR_COLOR; }
// public void CURSOR_COLOR(int value) { wrapperContained.CURSOR_COLOR = value; }
// public static int CURSOR_COLOR() { return net.minecraft.client.gui.widget.EditBoxWidget.CURSOR_COLOR; }
// public static void CURSOR_COLOR(int value, ) { net.minecraft.client.gui.widget.EditBoxWidget.CURSOR_COLOR = value; }

// public java.lang.String UNDERSCORE() { return wrapperContained.UNDERSCORE; }
// public void UNDERSCORE(java.lang.String value) { wrapperContained.UNDERSCORE = value; }
// public static java.lang.String UNDERSCORE() { return net.minecraft.client.gui.widget.EditBoxWidget.UNDERSCORE; }
// public static void UNDERSCORE(java.lang.String value, ) { net.minecraft.client.gui.widget.EditBoxWidget.UNDERSCORE = value; }

// public int FOCUSED_BOX_TEXT_COLOR() { return wrapperContained.FOCUSED_BOX_TEXT_COLOR; }
// public void FOCUSED_BOX_TEXT_COLOR(int value) { wrapperContained.FOCUSED_BOX_TEXT_COLOR = value; }
// public static int FOCUSED_BOX_TEXT_COLOR() { return net.minecraft.client.gui.widget.EditBoxWidget.FOCUSED_BOX_TEXT_COLOR; }
// public static void FOCUSED_BOX_TEXT_COLOR(int value, ) { net.minecraft.client.gui.widget.EditBoxWidget.FOCUSED_BOX_TEXT_COLOR = value; }

// public int UNFOCUSED_BOX_TEXT_COLOR() { return wrapperContained.UNFOCUSED_BOX_TEXT_COLOR; }
// public void UNFOCUSED_BOX_TEXT_COLOR(int value) { wrapperContained.UNFOCUSED_BOX_TEXT_COLOR = value; }
// public static int UNFOCUSED_BOX_TEXT_COLOR() { return net.minecraft.client.gui.widget.EditBoxWidget.UNFOCUSED_BOX_TEXT_COLOR; }
// public static void UNFOCUSED_BOX_TEXT_COLOR(int value, ) { net.minecraft.client.gui.widget.EditBoxWidget.UNFOCUSED_BOX_TEXT_COLOR = value; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.widget.EditBoxWidget.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.widget.EditBoxWidget.textRenderer = value.wrapperContained; }

// public yarnwrap.text.Text placeholder() { return new yarnwrap.text.Text(wrapperContained.placeholder); }
// public void placeholder(yarnwrap.text.Text value) { wrapperContained.placeholder = value.wrapperContained; }
// public static yarnwrap.text.Text placeholder() { return new yarnwrap.text.Text(net.minecraft.client.gui.widget.EditBoxWidget.placeholder); }
// public static void placeholder(yarnwrap.text.Text value, ) { net.minecraft.client.gui.widget.EditBoxWidget.placeholder = value.wrapperContained; }

// public yarnwrap.client.gui.EditBox editBox() { return new yarnwrap.client.gui.EditBox(wrapperContained.editBox); }
// public void editBox(yarnwrap.client.gui.EditBox value) { wrapperContained.editBox = value.wrapperContained; }
// public static yarnwrap.client.gui.EditBox editBox() { return new yarnwrap.client.gui.EditBox(net.minecraft.client.gui.widget.EditBoxWidget.editBox); }
// public static void editBox(yarnwrap.client.gui.EditBox value, ) { net.minecraft.client.gui.widget.EditBoxWidget.editBox = value.wrapperContained; }

// public int CURSOR_BLINK_INTERVAL() { return wrapperContained.CURSOR_BLINK_INTERVAL; }
// public void CURSOR_BLINK_INTERVAL(int value) { wrapperContained.CURSOR_BLINK_INTERVAL = value; }
// public static int CURSOR_BLINK_INTERVAL() { return net.minecraft.client.gui.widget.EditBoxWidget.CURSOR_BLINK_INTERVAL; }
// public static void CURSOR_BLINK_INTERVAL(int value, ) { net.minecraft.client.gui.widget.EditBoxWidget.CURSOR_BLINK_INTERVAL = value; }

// public long lastSwitchFocusTime() { return wrapperContained.lastSwitchFocusTime; }
// public void lastSwitchFocusTime(long value) { wrapperContained.lastSwitchFocusTime = value; }
// public static long lastSwitchFocusTime() { return net.minecraft.client.gui.widget.EditBoxWidget.lastSwitchFocusTime; }
// public static void lastSwitchFocusTime(long value, ) { net.minecraft.client.gui.widget.EditBoxWidget.lastSwitchFocusTime = value; }

public EditBoxWidget(yarnwrap.client.font.TextRenderer textRenderer,int x,int y,int width,int height,yarnwrap.text.Text placeholder,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.gui.widget.EditBoxWidget(textRenderer.wrapperContained,x,y,width,height,placeholder.wrapperContained,message.wrapperContained); }
public void setText(java.lang.String text) { wrapperContained.setText(text); }
// public static void setText(java.lang.String text, ) { net.minecraft.client.gui.widget.EditBoxWidget.setText(text); }
public void setChangeListener(java.util.function.Consumer changeListener) { wrapperContained.setChangeListener(changeListener); }
// public static void setChangeListener(java.util.function.Consumer changeListener, ) { net.minecraft.client.gui.widget.EditBoxWidget.setChangeListener(changeListener); }
public void setMaxLength(int maxLength) { wrapperContained.setMaxLength(maxLength); }
// public static void setMaxLength(int maxLength, ) { net.minecraft.client.gui.widget.EditBoxWidget.setMaxLength(maxLength); }
// public void drawSelection(yarnwrap.client.gui.DrawContext context,int left,int top,int right,int bottom) { wrapperContained.drawSelection(context.wrapperContained,left,top,right,bottom); }
// public static void drawSelection(yarnwrap.client.gui.DrawContext context,int left,int top,int right,int bottom, ) { net.minecraft.client.gui.widget.EditBoxWidget.drawSelection(context.wrapperContained,left,top,right,bottom); }
// public void moveCursor(double mouseX,double mouseY) { wrapperContained.moveCursor(mouseX,mouseY); }
// public static void moveCursor(double mouseX,double mouseY, ) { net.minecraft.client.gui.widget.EditBoxWidget.moveCursor(mouseX,mouseY); }
public java.lang.String getText() { return wrapperContained.getText(); }
// public static java.lang.String getText() { return net.minecraft.client.gui.widget.EditBoxWidget.getText(); }
// public void onCursorChange() { wrapperContained.onCursorChange(); }
// public static void onCursorChange() { net.minecraft.client.gui.widget.EditBoxWidget.onCursorChange(); }
// public double getMaxLinesWithoutOverflow() { return wrapperContained.getMaxLinesWithoutOverflow(); }
// public static double getMaxLinesWithoutOverflow() { return net.minecraft.client.gui.widget.EditBoxWidget.getMaxLinesWithoutOverflow(); }

}