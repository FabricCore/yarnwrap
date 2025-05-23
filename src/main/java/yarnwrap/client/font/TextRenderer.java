package yarnwrap.client.font;
public class TextRenderer { public net.minecraft.client.font.TextRenderer wrapperContained; public TextRenderer(net.minecraft.client.font.TextRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function fontStorageAccessor() { return wrapperContained.fontStorageAccessor; }
// public void fontStorageAccessor(java.util.function.Function value) { wrapperContained.fontStorageAccessor = value; }
// public static java.util.function.Function fontStorageAccessor() { return net.minecraft.client.font.TextRenderer.fontStorageAccessor; }
// public static void fontStorageAccessor(java.util.function.Function value, ) { net.minecraft.client.font.TextRenderer.fontStorageAccessor = value; }

public int fontHeight() { return wrapperContained.fontHeight; }
// public void fontHeight(int value) { wrapperContained.fontHeight = value; }
// public static int fontHeight() { return net.minecraft.client.font.TextRenderer.fontHeight; }
// public static void fontHeight(int value, ) { net.minecraft.client.font.TextRenderer.fontHeight = value; }

public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.font.TextRenderer.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.font.TextRenderer.random = value.wrapperContained; }

// public float FORWARD_SHIFT() { return wrapperContained.FORWARD_SHIFT; }
// public void FORWARD_SHIFT(float value) { wrapperContained.FORWARD_SHIFT = value; }
public static float FORWARD_SHIFT() { return net.minecraft.client.font.TextRenderer.FORWARD_SHIFT; }
// public static void FORWARD_SHIFT(float value, ) { net.minecraft.client.font.TextRenderer.FORWARD_SHIFT = value; }

// public yarnwrap.client.font.TextHandler handler() { return new yarnwrap.client.font.TextHandler(wrapperContained.handler); }
// public void handler(yarnwrap.client.font.TextHandler value) { wrapperContained.handler = value.wrapperContained; }
// public static yarnwrap.client.font.TextHandler handler() { return new yarnwrap.client.font.TextHandler(net.minecraft.client.font.TextRenderer.handler); }
// public static void handler(yarnwrap.client.font.TextHandler value, ) { net.minecraft.client.font.TextRenderer.handler = value.wrapperContained; }

// public float Z_INDEX() { return wrapperContained.Z_INDEX; }
// public void Z_INDEX(float value) { wrapperContained.Z_INDEX = value; }
// public static float Z_INDEX() { return net.minecraft.client.font.TextRenderer.Z_INDEX; }
// public static void Z_INDEX(float value, ) { net.minecraft.client.font.TextRenderer.Z_INDEX = value; }

// public boolean validateAdvance() { return wrapperContained.validateAdvance; }
// public void validateAdvance(boolean value) { wrapperContained.validateAdvance = value; }
// public static boolean validateAdvance() { return net.minecraft.client.font.TextRenderer.validateAdvance; }
// public static void validateAdvance(boolean value, ) { net.minecraft.client.font.TextRenderer.validateAdvance = value; }

public TextRenderer(java.util.function.Function fontStorageAccessor,boolean validateAdvance) { this.wrapperContained = new net.minecraft.client.font.TextRenderer(fontStorageAccessor,validateAdvance); }
public int getWrappedLinesHeight(java.lang.String text,int maxWidth) { return wrapperContained.getWrappedLinesHeight(text,maxWidth); }
// public static int getWrappedLinesHeight(java.lang.String text,int maxWidth, ) { return net.minecraft.client.font.TextRenderer.getWrappedLinesHeight(text,maxWidth); }
public yarnwrap.text.StringVisitable trimToWidth(yarnwrap.text.StringVisitable text,int width) { return new yarnwrap.text.StringVisitable(wrapperContained.trimToWidth(text.wrapperContained,width)); }
// public static yarnwrap.text.StringVisitable trimToWidth(yarnwrap.text.StringVisitable text,int width, ) { return new yarnwrap.text.StringVisitable(net.minecraft.client.font.TextRenderer.trimToWidth(text.wrapperContained,width)); }
public java.lang.String mirror(java.lang.String text) { return wrapperContained.mirror(text); }
// public static java.lang.String mirror(java.lang.String text, ) { return net.minecraft.client.font.TextRenderer.mirror(text); }
public boolean isRightToLeft() { return wrapperContained.isRightToLeft(); }
// public static boolean isRightToLeft() { return net.minecraft.client.font.TextRenderer.isRightToLeft(); }
public int getWidth(java.lang.String text) { return wrapperContained.getWidth(text); }
// public static int getWidth(java.lang.String text, ) { return net.minecraft.client.font.TextRenderer.getWidth(text); }
public java.util.List wrapLines(yarnwrap.text.StringVisitable text,int width) { return wrapperContained.wrapLines(text.wrapperContained,width); }
// public static java.util.List wrapLines(yarnwrap.text.StringVisitable text,int width, ) { return net.minecraft.client.font.TextRenderer.wrapLines(text.wrapperContained,width); }
// public void draw(yarnwrap.text.OrderedText text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light) { wrapperContained.draw(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light); }
// public static void draw(yarnwrap.text.OrderedText text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light, ) { net.minecraft.client.font.TextRenderer.draw(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light); }
// public float method_27516(int codePoint,yarnwrap.text.Style style) { return wrapperContained.method_27516(codePoint,style.wrapperContained); }
// public static float method_27516(int codePoint,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextRenderer.method_27516(codePoint,style.wrapperContained); }
// public void draw(java.lang.String x,float y,float color,int shadow,boolean matrix,org.joml.Matrix4f vertexConsumers,yarnwrap.client.render.VertexConsumerProvider layerType,Object backgroundColor,int light) { wrapperContained.draw(x,y,color,shadow,matrix,vertexConsumers,layerType.wrapperContained,backgroundColor,light); }
// public static void draw(java.lang.String x,float y,float color,int shadow,boolean matrix,org.joml.Matrix4f vertexConsumers,yarnwrap.client.render.VertexConsumerProvider layerType,Object backgroundColor,int light, ) { net.minecraft.client.font.TextRenderer.draw(x,y,color,shadow,matrix,vertexConsumers,layerType.wrapperContained,backgroundColor,light); }
// public void draw(yarnwrap.text.Text text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light) { wrapperContained.draw(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light); }
// public static void draw(yarnwrap.text.Text text,float x,float y,int color,boolean shadow,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object layerType,int backgroundColor,int light, ) { net.minecraft.client.font.TextRenderer.draw(text.wrapperContained,x,y,color,shadow,matrix,vertexConsumers.wrapperContained,layerType,backgroundColor,light); }
public java.lang.String trimToWidth(java.lang.String text,int maxWidth) { return wrapperContained.trimToWidth(text,maxWidth); }
// public static java.lang.String trimToWidth(java.lang.String text,int maxWidth, ) { return net.minecraft.client.font.TextRenderer.trimToWidth(text,maxWidth); }
public java.lang.String trimToWidth(java.lang.String text,int maxWidth,boolean backwards) { return wrapperContained.trimToWidth(text,maxWidth,backwards); }
// public static java.lang.String trimToWidth(java.lang.String text,int maxWidth,boolean backwards, ) { return net.minecraft.client.font.TextRenderer.trimToWidth(text,maxWidth,backwards); }
public int getWidth(yarnwrap.text.StringVisitable text) { return wrapperContained.getWidth(text.wrapperContained); }
// public static int getWidth(yarnwrap.text.StringVisitable text, ) { return net.minecraft.client.font.TextRenderer.getWidth(text.wrapperContained); }
// public yarnwrap.client.font.FontStorage getFontStorage(yarnwrap.util.Identifier id) { return new yarnwrap.client.font.FontStorage(wrapperContained.getFontStorage(id.wrapperContained)); }
// public static yarnwrap.client.font.FontStorage getFontStorage(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.font.FontStorage(net.minecraft.client.font.TextRenderer.getFontStorage(id.wrapperContained)); }
public yarnwrap.client.font.TextHandler getTextHandler() { return new yarnwrap.client.font.TextHandler(wrapperContained.getTextHandler()); }
// public static yarnwrap.client.font.TextHandler getTextHandler() { return new yarnwrap.client.font.TextHandler(net.minecraft.client.font.TextRenderer.getTextHandler()); }
public int getWidth(yarnwrap.text.OrderedText text) { return wrapperContained.getWidth(text.wrapperContained); }
// public static int getWidth(yarnwrap.text.OrderedText text, ) { return net.minecraft.client.font.TextRenderer.getWidth(text.wrapperContained); }
public void drawWithOutline(yarnwrap.text.OrderedText text,float x,float y,int color,int outlineColor,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.drawWithOutline(text.wrapperContained,x,y,color,outlineColor,matrix,vertexConsumers.wrapperContained,light); }
// public static void drawWithOutline(yarnwrap.text.OrderedText text,float x,float y,int color,int outlineColor,org.joml.Matrix4f matrix,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.font.TextRenderer.drawWithOutline(text.wrapperContained,x,y,color,outlineColor,matrix,vertexConsumers.wrapperContained,light); }
// public boolean method_37297(Object index,float style,int codePoint) { return wrapperContained.method_37297(index,style,codePoint); }
// public static boolean method_37297(Object index,float style,int codePoint, ) { return net.minecraft.client.font.TextRenderer.method_37297(index,style,codePoint); }
public int getWrappedLinesHeight(yarnwrap.text.StringVisitable text,int maxWidth) { return wrapperContained.getWrappedLinesHeight(text.wrapperContained,maxWidth); }
// public static int getWrappedLinesHeight(yarnwrap.text.StringVisitable text,int maxWidth, ) { return net.minecraft.client.font.TextRenderer.getWrappedLinesHeight(text.wrapperContained,maxWidth); }
// public Object prepare(yarnwrap.text.OrderedText text,float x,float y,int color,boolean shadow,int backgroundColor) { return wrapperContained.prepare(text.wrapperContained,x,y,color,shadow,backgroundColor); }
// public static Object prepare(yarnwrap.text.OrderedText text,float x,float y,int color,boolean shadow,int backgroundColor, ) { return net.minecraft.client.font.TextRenderer.prepare(text.wrapperContained,x,y,color,shadow,backgroundColor); }
// public Object prepare(java.lang.String x,float y,float color,int shadow,boolean backgroundColor) { return wrapperContained.prepare(x,y,color,shadow,backgroundColor); }
// public static Object prepare(java.lang.String x,float y,float color,int shadow,boolean backgroundColor, ) { return net.minecraft.client.font.TextRenderer.prepare(x,y,color,shadow,backgroundColor); }

}