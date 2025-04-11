package yarnwrap.client.gui.widget;
public class ClickableWidget { public net.minecraft.client.gui.widget.ClickableWidget wrapperContained; public ClickableWidget(net.minecraft.client.gui.widget.ClickableWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public boolean focused() { return wrapperContained.focused; }
// public void focused(boolean value) { wrapperContained.focused = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public boolean hovered() { return wrapperContained.hovered; }
// public void hovered(boolean value) { wrapperContained.hovered = value; }
public boolean active() { return wrapperContained.active; }
public void active(boolean value) { wrapperContained.active = value; }
public boolean visible() { return wrapperContained.visible; }
public void visible(boolean value) { wrapperContained.visible = value; }
// public float alpha() { return wrapperContained.alpha; }
// public void alpha(float value) { wrapperContained.alpha = value; }
// public yarnwrap.client.gui.tooltip.TooltipState tooltip() { return new yarnwrap.client.gui.tooltip.TooltipState(wrapperContained.tooltip); }
// public void tooltip(yarnwrap.client.gui.tooltip.TooltipState value) { wrapperContained.tooltip = value.wrapperContained; }
// public int navigationOrder() { return wrapperContained.navigationOrder; }
// public void navigationOrder(int value) { wrapperContained.navigationOrder = value; }
// public ClickableWidget(int x,int y,int width,int height,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.gui.widget.ClickableWidget(x,y,width,height,message.wrapperContained); }
public void onClick(double mouseX,double mouseY) { wrapperContained.onClick(mouseX,mouseY); }
// public void onDrag(double mouseX,double mouseY,double deltaX,double deltaY) { wrapperContained.onDrag(mouseX,mouseY,deltaX,deltaY); }
public void setAlpha(float alpha) { wrapperContained.setAlpha(alpha); }
// public boolean isValidClickButton(int button) { return wrapperContained.isValidClickButton(button); }
public void playDownSound(yarnwrap.client.sound.SoundManager soundManager) { wrapperContained.playDownSound(soundManager.wrapperContained); }
public void setMessage(yarnwrap.text.Text message) { wrapperContained.setMessage(message.wrapperContained); }
public void onRelease(double mouseX,double mouseY) { wrapperContained.onRelease(mouseX,mouseY); }
public void setWidth(int width) { wrapperContained.setWidth(width); }
// public yarnwrap.text.MutableText getNarrationMessage() { return new yarnwrap.text.MutableText(wrapperContained.getNarrationMessage()); }
// public boolean clicked(double mouseX,double mouseY) { return wrapperContained.clicked(mouseX,mouseY); }
public boolean isSelected() { return wrapperContained.isSelected(); }
public yarnwrap.text.Text getMessage() { return new yarnwrap.text.Text(wrapperContained.getMessage()); }
public yarnwrap.text.MutableText getNarrationMessage(yarnwrap.text.Text message) { return new yarnwrap.text.MutableText(wrapperContained.getNarrationMessage(message.wrapperContained)); }
// public void appendDefaultNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.appendDefaultNarrations(builder.wrapperContained); }
// public void appendClickableNarrations(yarnwrap.client.gui.screen.narration.NarrationMessageBuilder builder) { wrapperContained.appendClickableNarrations(builder.wrapperContained); }
public void setTooltip(yarnwrap.client.gui.tooltip.Tooltip tooltip) { wrapperContained.setTooltip(tooltip.wrapperContained); }
public void setTooltipDelay(java.time.Duration tooltipDelay) { wrapperContained.setTooltipDelay(tooltipDelay); }
// public void renderWidget(yarnwrap.client.gui.DrawContext context,int mouseX,int mouseY,float delta) { wrapperContained.renderWidget(context.wrapperContained,mouseX,mouseY,delta); }
public void setNavigationOrder(int navigationOrder) { wrapperContained.setNavigationOrder(navigationOrder); }
// public void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int xMargin,int color) { wrapperContained.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,xMargin,color); }
// public void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int centerX,int startX,int startY,int endX,int endY,int color) { wrapperContained.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,text.wrapperContained,centerX,startX,startY,endX,endY,color); }
public boolean isHovered() { return wrapperContained.isHovered(); }
public yarnwrap.client.gui.tooltip.Tooltip getTooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.getTooltip()); }
// public void drawScrollableText(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int startX,int startY,int endX,int endY,int color) { wrapperContained.drawScrollableText(context.wrapperContained,textRenderer.wrapperContained,text.wrapperContained,startX,startY,endX,endY,color); }
public void setHeight(int height) { wrapperContained.setHeight(height); }
public int getRight() { return wrapperContained.getRight(); }
public int getBottom() { return wrapperContained.getBottom(); }
public void setDimensionsAndPosition(int width,int height,int x,int y) { wrapperContained.setDimensionsAndPosition(width,height,x,y); }
public void setDimensions(int width,int height) { wrapperContained.setDimensions(width,height); }

}