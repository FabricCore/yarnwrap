package yarnwrap.client.gui.widget;
public class ClickableWidget { public net.minecraft.client.gui.widget.ClickableWidget wrapperContained; public ClickableWidget(net.minecraft.client.gui.widget.ClickableWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public static yarnwrap.text.Text message() { return new yarnwrap.text.Text(net.minecraft.client.gui.widget.ClickableWidget.message); }
// public static void message(yarnwrap.text.Text value, ) { net.minecraft.client.gui.widget.ClickableWidget.message = value.wrapperContained; }

// public boolean focused() { return wrapperContained.focused; }
// public void focused(boolean value) { wrapperContained.focused = value; }
// public static boolean focused() { return net.minecraft.client.gui.widget.ClickableWidget.focused; }
// public static void focused(boolean value, ) { net.minecraft.client.gui.widget.ClickableWidget.focused = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.gui.widget.ClickableWidget.width; }
// public static void width(int value, ) { net.minecraft.client.gui.widget.ClickableWidget.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.client.gui.widget.ClickableWidget.height; }
// public static void height(int value, ) { net.minecraft.client.gui.widget.ClickableWidget.height = value; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.client.gui.widget.ClickableWidget.x; }
// public static void x(int value, ) { net.minecraft.client.gui.widget.ClickableWidget.x = value; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.client.gui.widget.ClickableWidget.y; }
// public static void y(int value, ) { net.minecraft.client.gui.widget.ClickableWidget.y = value; }

// public boolean hovered() { return wrapperContained.hovered; }
// public void hovered(boolean value) { wrapperContained.hovered = value; }
// public static boolean hovered() { return net.minecraft.client.gui.widget.ClickableWidget.hovered; }
// public static void hovered(boolean value, ) { net.minecraft.client.gui.widget.ClickableWidget.hovered = value; }

public boolean active() { return wrapperContained.active; }
public void active(boolean value) { wrapperContained.active = value; }
// public static boolean active() { return net.minecraft.client.gui.widget.ClickableWidget.active; }
// public static void active(boolean value, ) { net.minecraft.client.gui.widget.ClickableWidget.active = value; }

public boolean visible() { return wrapperContained.visible; }
public void visible(boolean value) { wrapperContained.visible = value; }
// public static boolean visible() { return net.minecraft.client.gui.widget.ClickableWidget.visible; }
// public static void visible(boolean value, ) { net.minecraft.client.gui.widget.ClickableWidget.visible = value; }

// public float alpha() { return wrapperContained.alpha; }
// public void alpha(float value) { wrapperContained.alpha = value; }
// public static float alpha() { return net.minecraft.client.gui.widget.ClickableWidget.alpha; }
// public static void alpha(float value, ) { net.minecraft.client.gui.widget.ClickableWidget.alpha = value; }

// public yarnwrap.client.gui.tooltip.TooltipState tooltip() { return new yarnwrap.client.gui.tooltip.TooltipState(wrapperContained.tooltip); }
// public void tooltip(yarnwrap.client.gui.tooltip.TooltipState value) { wrapperContained.tooltip = value.wrapperContained; }
// public static yarnwrap.client.gui.tooltip.TooltipState tooltip() { return new yarnwrap.client.gui.tooltip.TooltipState(net.minecraft.client.gui.widget.ClickableWidget.tooltip); }
// public static void tooltip(yarnwrap.client.gui.tooltip.TooltipState value, ) { net.minecraft.client.gui.widget.ClickableWidget.tooltip = value.wrapperContained; }

// public int navigationOrder() { return wrapperContained.navigationOrder; }
// public void navigationOrder(int value) { wrapperContained.navigationOrder = value; }
// public static int navigationOrder() { return net.minecraft.client.gui.widget.ClickableWidget.navigationOrder; }
// public static void navigationOrder(int value, ) { net.minecraft.client.gui.widget.ClickableWidget.navigationOrder = value; }

// public double FOCUSED_NARRATION_DELAY() { return wrapperContained.FOCUSED_NARRATION_DELAY; }
// public void FOCUSED_NARRATION_DELAY(double value) { wrapperContained.FOCUSED_NARRATION_DELAY = value; }
// public static double FOCUSED_NARRATION_DELAY() { return net.minecraft.client.gui.widget.ClickableWidget.FOCUSED_NARRATION_DELAY; }
// public static void FOCUSED_NARRATION_DELAY(double value, ) { net.minecraft.client.gui.widget.ClickableWidget.FOCUSED_NARRATION_DELAY = value; }

// public double UNFOCUSED_NARRATION_DELAY() { return wrapperContained.UNFOCUSED_NARRATION_DELAY; }
// public void UNFOCUSED_NARRATION_DELAY(double value) { wrapperContained.UNFOCUSED_NARRATION_DELAY = value; }
// public static double UNFOCUSED_NARRATION_DELAY() { return net.minecraft.client.gui.widget.ClickableWidget.UNFOCUSED_NARRATION_DELAY; }
// public static void UNFOCUSED_NARRATION_DELAY(double value, ) { net.minecraft.client.gui.widget.ClickableWidget.UNFOCUSED_NARRATION_DELAY = value; }

// public ClickableWidget(int x,int y,int width,int height,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.gui.widget.ClickableWidget(x,y,width,height,message.wrapperContained); }
public void onClick(double mouseX,double mouseY) { wrapperContained.onClick(mouseX,mouseY); }
// public static void onClick(double mouseX,double mouseY, ) { net.minecraft.client.gui.widget.ClickableWidget.onClick(mouseX,mouseY); }
// public void onDrag(double mouseX,double mouseY,double deltaX,double deltaY) { wrapperContained.onDrag(mouseX,mouseY,deltaX,deltaY); }
// public static void onDrag(double mouseX,double mouseY,double deltaX,double deltaY, ) { net.minecraft.client.gui.widget.ClickableWidget.onDrag(mouseX,mouseY,deltaX,deltaY); }
public void setAlpha(float alpha) { wrapperContained.setAlpha(alpha); }
// public static void setAlpha(float alpha, ) { net.minecraft.client.gui.widget.ClickableWidget.setAlpha(alpha); }
// public boolean isValidClickButton(int button) { return wrapperContained.isValidClickButton(button); }
// public static boolean isValidClickButton(int button, ) { return net.minecraft.client.gui.widget.ClickableWidget.isValidClickButton(button); }
public void playDownSound(yarnwrap.client.sound.SoundManager soundManager) { wrapperContained.playDownSound(soundManager.wrapperContained); }
// public static void playDownSound(yarnwrap.client.sound.SoundManager soundManager, ) { net.minecraft.client.gui.widget.ClickableWidget.playDownSound(soundManager.wrapperContained); }
public void setMessage(yarnwrap.text.Text message) { wrapperContained.setMessage(message.wrapperContained); }
// public static void setMessage(yarnwrap.text.Text message, ) { net.minecraft.client.gui.widget.ClickableWidget.setMessage(message.wrapperContained); }
public void onRelease(double mouseX,double mouseY) { wrapperContained.onRelease(mouseX,mouseY); }
// public static void onRelease(double mouseX,double mouseY, ) { net.minecraft.client.gui.widget.ClickableWidget.onRelease(mouseX,mouseY); }
public void setWidth(int width) { wrapperContained.setWidth(width); }
// public static void setWidth(int width, ) { net.minecraft.client.gui.widget.ClickableWidget.setWidth(width); }
// public yarnwrap.text.MutableText getNarrationMessage() { return new yarnwrap.text.MutableText(wrapperContained.getNarrationMessage()); }
// public static yarnwrap.text.MutableText getNarrationMessage() { return new yarnwrap.text.MutableText(net.minecraft.client.gui.widget.ClickableWidget.getNarrationMessage()); }
public boolean isSelected() { return wrapperContained.isSelected(); }
// public static boolean isSelected() { return net.minecraft.client.gui.widget.ClickableWidget.isSelected(); }
public yarnwrap.text.Text getMessage() { return new yarnwrap.text.Text(wrapperContained.getMessage()); }
// public static yarnwrap.text.Text getMessage() { return new yarnwrap.text.Text(net.minecraft.client.gui.widget.ClickableWidget.getMessage()); }
// public yarnwrap.text.MutableText getNarrationMessage(yarnwrap.text.Text message) { return new yarnwrap.text.MutableText(wrapperContained.getNarrationMessage(message.wrapperContained)); }
// public static yarnwrap.text.MutableText getNarrationMessage(yarnwrap.text.Text message, ) { return new yarnwrap.text.MutableText(net.minecraft.client.gui.widget.ClickableWidget.getNarrationMessage(message.wrapperContained)); }
// public void appendDefaultNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.appendDefaultNarrations(builder.wrapperContained); }
// public static void appendDefaultNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder, ) { net.minecraft.client.gui.widget.ClickableWidget.appendDefaultNarrations(builder.wrapperContained); }
// public void appendClickableNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.appendClickableNarrations(builder.wrapperContained); }
// public static void appendClickableNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder, ) { net.minecraft.client.gui.widget.ClickableWidget.appendClickableNarrations(builder.wrapperContained); }
public void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip) { wrapperContained.setTooltip(tooltip.wrapperContained); }
// public static void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip, ) { net.minecraft.client.gui.widget.ClickableWidget.setTooltip(tooltip.wrapperContained); }
public void setTooltipDelay(java.time.Duration tooltipDelay) { wrapperContained.setTooltipDelay(tooltipDelay); }
// public static void setTooltipDelay(java.time.Duration tooltipDelay, ) { net.minecraft.client.gui.widget.ClickableWidget.setTooltipDelay(tooltipDelay); }
// public void renderWidget(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float deltaTicks) { wrapperContained.renderWidget(context.wrapperContained,mouseX,mouseY,deltaTicks); }
// public static void renderWidget(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float deltaTicks, ) { net.minecraft.client.gui.widget.ClickableWidget.renderWidget(context.wrapperContained,mouseX,mouseY,deltaTicks); }
public void setNavigationOrder(int navigationOrder) { wrapperContained.setNavigationOrder(navigationOrder); }
// public static void setNavigationOrder(int navigationOrder, ) { net.minecraft.client.gui.widget.ClickableWidget.setNavigationOrder(navigationOrder); }
// public void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int xMargin,int color) { wrapperContained.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,xMargin,color); }
// public static void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int xMargin,int color, ) { net.minecraft.client.gui.widget.ClickableWidget.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,xMargin,color); }
// public void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int centerX,int startX,int startY,int endX,int endY,int color) { wrapperContained.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,text.wrapperContained,centerX,startX,startY,endX,endY,color); }
// public static void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int centerX,int startX,int startY,int endX,int endY,int color, ) { net.minecraft.client.gui.widget.ClickableWidget.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,text.wrapperContained,centerX,startX,startY,endX,endY,color); }
public boolean isHovered() { return wrapperContained.isHovered(); }
// public static boolean isHovered() { return net.minecraft.client.gui.widget.ClickableWidget.isHovered(); }
// public void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int startX,int startY,int endX,int endY,int color) { wrapperContained.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,text.wrapperContained,startX,startY,endX,endY,color); }
// public static void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int startX,int startY,int endX,int endY,int color, ) { net.minecraft.client.gui.widget.ClickableWidget.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,text.wrapperContained,startX,startY,endX,endY,color); }
public void setHeight(int height) { wrapperContained.setHeight(height); }
// public static void setHeight(int height, ) { net.minecraft.client.gui.widget.ClickableWidget.setHeight(height); }
public int getRight() { return wrapperContained.getRight(); }
// public static int getRight() { return net.minecraft.client.gui.widget.ClickableWidget.getRight(); }
public int getBottom() { return wrapperContained.getBottom(); }
// public static int getBottom() { return net.minecraft.client.gui.widget.ClickableWidget.getBottom(); }
public void setDimensionsAndPosition(int width,int height,int x,int y) { wrapperContained.setDimensionsAndPosition(width,height,x,y); }
// public static void setDimensionsAndPosition(int width,int height,int x,int y, ) { net.minecraft.client.gui.widget.ClickableWidget.setDimensionsAndPosition(width,height,x,y); }
public void setDimensions(int width,int height) { wrapperContained.setDimensions(width,height); }
// public static void setDimensions(int width,int height, ) { net.minecraft.client.gui.widget.ClickableWidget.setDimensions(width,height); }
// public void playClickSound(yarnwrap.client.sound.SoundManager soundManager) { wrapperContained.playClickSound(soundManager.wrapperContained); }
// public static void playClickSound(yarnwrap.client.sound.SoundManager soundManager, ) { net.minecraft.client.gui.widget.ClickableWidget.playClickSound(soundManager.wrapperContained); }

}