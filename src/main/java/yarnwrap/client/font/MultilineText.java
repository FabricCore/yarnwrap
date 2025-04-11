package yarnwrap.client.font;
public class MultilineText { public net.minecraft.client.font.MultilineText wrapperContained; public MultilineText(net.minecraft.client.font.MultilineText wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.font.MultilineText EMPTY() { return new yarnwrap.client.font.MultilineText(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.font.MultilineText value) { wrapperContained.EMPTY = value.wrapperContained; }
public int count() { return wrapperContained.count(); }
public void drawCenterWithShadow(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawCenterWithShadow(context.wrapperContained,x,y); }
public void drawCenterWithShadow(yarnwrap.client.gui.DrawContext context,int x,int y,int lineHeight,int color) { wrapperContained.drawCenterWithShadow(context.wrapperContained,x,y,lineHeight,color); }
// public yarnwrap.client.font.MultilineText create(yarnwrap.client.font.TextRenderer renderer,yarnwrap.text.Text text,int maxWidth) { return new yarnwrap.client.font.MultilineText(wrapperContained.create(renderer.wrapperContained,text.wrapperContained,maxWidth)); }
// public yarnwrap.client.font.MultilineText create(yarnwrap.client.font.TextRenderer renderer,net.minecraft.text.Text[] texts) { return new yarnwrap.client.font.MultilineText(wrapperContained.create(renderer.wrapperContained,texts)); }
public void drawWithShadow(yarnwrap.client.gui.DrawContext context,int x,int y,int lineHeight,int color) { wrapperContained.drawWithShadow(context.wrapperContained,x,y,lineHeight,color); }
public int draw(yarnwrap.client.gui.DrawContext context,int x,int y,int lineHeight,int color) { return wrapperContained.draw(context.wrapperContained,x,y,lineHeight,color); }
public int getMaxWidth() { return wrapperContained.getMaxWidth(); }
// public yarnwrap.client.font.MultilineText create(yarnwrap.client.font.TextRenderer renderer,int maxWidth,int maxLines,net.minecraft.text.Text[] texts) { return new yarnwrap.client.font.MultilineText(wrapperContained.create(renderer.wrapperContained,maxWidth,maxLines,texts)); }
// public yarnwrap.client.font.MultilineText create(yarnwrap.client.font.TextRenderer renderer,int maxWidth,net.minecraft.text.Text[] texts) { return new yarnwrap.client.font.MultilineText(wrapperContained.create(renderer.wrapperContained,maxWidth,texts)); }

}