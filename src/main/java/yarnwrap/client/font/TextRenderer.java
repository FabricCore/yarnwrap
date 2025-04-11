package yarnwrap.client.font;
public class TextRenderer { public net.minecraft.client.font.TextRenderer wrapperContained; public TextRenderer(net.minecraft.client.font.TextRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function fontStorageAccessor() { return wrapperContained.fontStorageAccessor; }
// public void fontStorageAccessor(java.util.function.Function value) { wrapperContained.fontStorageAccessor = value; }
public int fontHeight() { return wrapperContained.fontHeight; }
// public void fontHeight(int value) { wrapperContained.fontHeight = value; }
public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public org.joml.Vector3f FORWARD_SHIFT() { return wrapperContained.FORWARD_SHIFT; }
// public void FORWARD_SHIFT(org.joml.Vector3f value) { wrapperContained.FORWARD_SHIFT = value; }
// public yarnwrap.client.font.TextHandler handler() { return new yarnwrap.client.font.TextHandler(wrapperContained.handler); }
// public void handler(yarnwrap.client.font.TextHandler value) { wrapperContained.handler = value.wrapperContained; }
// public float Z_INDEX() { return wrapperContained.Z_INDEX; }
// public void Z_INDEX(float value) { wrapperContained.Z_INDEX = value; }
public int ARABIC_SHAPING_LETTERS_SHAPE() { return wrapperContained.ARABIC_SHAPING_LETTERS_SHAPE; }
// public void ARABIC_SHAPING_LETTERS_SHAPE(int value) { wrapperContained.ARABIC_SHAPING_LETTERS_SHAPE = value; }
// public boolean validateAdvance() { return wrapperContained.validateAdvance; }
// public void validateAdvance(boolean value) { wrapperContained.validateAdvance = value; }
public TextRenderer(java.util.function.Function fontStorageAccessor,boolean validateAdvance) { this.wrapperContained = new net.minecraft.client.font.TextRenderer(fontStorageAccessor,validateAdvance); }
// public void drawGlyph(yarnwrap.client.font.GlyphRenderer glyphRenderer,boolean bold,boolean italic,float weight,float x,float y,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumer vertexConsumer,float red,float green,float blue,float alpha,int light) { wrapperContained.drawGlyph(glyphRenderer.wrapperContained,bold,italic,weight,x,y,matrix,vertexConsumer.wrapperContained,red,green,blue,alpha,light); }
public int getWrappedLinesHeight(java.lang.String text,int maxWidth) { return wrapperContained.getWrappedLinesHeight(text,maxWidth); }
public yarnwrap.text.StringVisitable trimToWidth(yarnwrap.text.StringVisitable text,int width) { return new yarnwrap.text.StringVisitable(wrapperContained.trimToWidth(text.wrapperContained,width)); }
public java.lang.String mirror(java.lang.String text) { return wrapperContained.mirror(text); }
// public int drawInternal(yarnwrap.text.OrderedText text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumerProvider,Object layerType,int backgroundColor,int light) { return wrapperContained.drawInternal(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumerProvider.wrapperContained,layerType,backgroundColor,light); }
// public float drawLayer(java.lang.String text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumerProvider,Object layerType,int underlineColor,int light) { return wrapperContained.drawLayer(text,x,y,color,shadow,matrix,vertexConsumerProvider.wrapperContained,layerType,underlineColor,light); }
public boolean isRightToLeft() { return wrapperContained.isRightToLeft(); }
public int getWidth(java.lang.String text) { return wrapperContained.getWidth(text); }
public java.util.List wrapLines(yarnwrap.text.StringVisitable text,int width) { return wrapperContained.wrapLines(text.wrapperContained,width); }
// public int draw(yarnwrap.text.OrderedText text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light) { return wrapperContained.draw(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light); }
// public int tweakTransparency(int argb) { return wrapperContained.tweakTransparency(argb); }
// public float method_27516(int codePoint,yarnwrap.text.Style style) { return wrapperContained.method_27516(codePoint,style.wrapperContained); }
// public int draw(java.lang.String text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light) { return wrapperContained.draw(text,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light); }
// public int draw(java.lang.String text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light,boolean rightToLeft) { return wrapperContained.draw(text,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light,rightToLeft); }
public java.lang.String trimToWidth(java.lang.String text,int maxWidth) { return wrapperContained.trimToWidth(text,maxWidth); }
public java.lang.String trimToWidth(java.lang.String text,int maxWidth,boolean backwards) { return wrapperContained.trimToWidth(text,maxWidth,backwards); }
public int getWidth(yarnwrap.text.StringVisitable text) { return wrapperContained.getWidth(text.wrapperContained); }
// public yarnwrap.client.font.FontStorage getFontStorage(yarnwrap.util.Identifier id) { return new yarnwrap.client.font.FontStorage(wrapperContained.getFontStorage(id.wrapperContained)); }
public yarnwrap.client.font.TextHandler getTextHandler() { return new yarnwrap.client.font.TextHandler(wrapperContained.getTextHandler()); }
// public int drawInternal(java.lang.String text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light,boolean mirror) { return wrapperContained.drawInternal(text,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light,mirror); }
// public float drawLayer(yarnwrap.text.OrderedText text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumerProvider,Object layerType,int underlineColor,int light) { return wrapperContained.drawLayer(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumerProvider.wrapperContained,layerType,underlineColor,light); }
public int getWidth(yarnwrap.text.OrderedText text) { return wrapperContained.getWidth(text.wrapperContained); }
// public int draw(yarnwrap.text.Text text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light) { return wrapperContained.draw(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light); }
public void drawWithOutline(yarnwrap.text.OrderedText text,float x,float y,int color,int outlineColor,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.drawWithOutline(text.wrapperContained,x,y,color,outlineColor,matrix,vertexConsumers.wrapperContained,light); }
// public boolean method_37297(Object index,float style,int codePoint) { return wrapperContained.method_37297(index,style,codePoint); }
public int getWrappedLinesHeight(yarnwrap.text.StringVisitable text,int maxWidth) { return wrapperContained.getWrappedLinesHeight(text.wrapperContained,maxWidth); }

}