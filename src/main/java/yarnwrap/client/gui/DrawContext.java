package yarnwrap.client.gui;
public class DrawContext { public net.minecraft.client.gui.DrawContext wrapperContained; public DrawContext(net.minecraft.client.gui.DrawContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.DrawContext.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.DrawContext.client = value.wrapperContained; }

// public yarnwrap.client.util.math.MatrixStack matrices() { return new yarnwrap.client.util.math.MatrixStack(wrapperContained.matrices); }
// public void matrices(yarnwrap.client.util.math.MatrixStack value) { wrapperContained.matrices = value.wrapperContained; }
// public static yarnwrap.client.util.math.MatrixStack matrices() { return new yarnwrap.client.util.math.MatrixStack(net.minecraft.client.gui.DrawContext.matrices); }
// public static void matrices(yarnwrap.client.util.math.MatrixStack value, ) { net.minecraft.client.gui.DrawContext.matrices = value.wrapperContained; }

// public Object vertexConsumers() { return wrapperContained.vertexConsumers; }
// // public void vertexConsumers(Object value) { wrapperContained.vertexConsumers = value; }
// // public static Object vertexConsumers() { return net.minecraft.client.gui.DrawContext.vertexConsumers; }
// // public static void vertexConsumers(Object value, ) { net.minecraft.client.gui.DrawContext.vertexConsumers = value; }

// public Object scissorStack() { return wrapperContained.scissorStack; }
// // public void scissorStack(Object value) { wrapperContained.scissorStack = value; }
// // public static Object scissorStack() { return net.minecraft.client.gui.DrawContext.scissorStack; }
// // public static void scissorStack(Object value, ) { net.minecraft.client.gui.DrawContext.scissorStack = value; }

// public boolean runningDrawCallback() { return wrapperContained.runningDrawCallback; }
// public void runningDrawCallback(boolean value) { wrapperContained.runningDrawCallback = value; }
// public static boolean runningDrawCallback() { return net.minecraft.client.gui.DrawContext.runningDrawCallback; }
// public static void runningDrawCallback(boolean value, ) { net.minecraft.client.gui.DrawContext.runningDrawCallback = value; }

// public yarnwrap.client.texture.GuiAtlasManager guiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(wrapperContained.guiAtlasManager); }
// public void guiAtlasManager(yarnwrap.client.texture.GuiAtlasManager value) { wrapperContained.guiAtlasManager = value.wrapperContained; }
// public static yarnwrap.client.texture.GuiAtlasManager guiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(net.minecraft.client.gui.DrawContext.guiAtlasManager); }
// public static void guiAtlasManager(yarnwrap.client.texture.GuiAtlasManager value, ) { net.minecraft.client.gui.DrawContext.guiAtlasManager = value.wrapperContained; }

// public DrawContext(yarnwrap.client.MinecraftClient client,yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers) { this.wrapperContained = new net.minecraft.client.gui.DrawContext(client.wrapperContained,matrices.wrapperContained,vertexConsumers); }
// public DrawContext(yarnwrap.client.MinecraftClient client,Object vertexConsumers) { this.wrapperContained = new net.minecraft.client.gui.DrawContext(client.wrapperContained,vertexConsumers); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,float u,float v,int width,int height,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x,y,u,v,width,height,textureWidth,textureHeight); }
// public static void drawTexture(yarnwrap.util.Identifier texture,int x,int y,float u,float v,int width,int height,int textureWidth,int textureHeight, ) { net.minecraft.client.gui.DrawContext.drawTexture(texture.wrapperContained,x,y,u,v,width,height,textureWidth,textureHeight); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int z,float u,float v,int width,int height,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x,y,z,u,v,width,height,textureWidth,textureHeight); }
// public static void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int z,float u,float v,int width,int height,int textureWidth,int textureHeight, ) { net.minecraft.client.gui.DrawContext.drawTexture(texture.wrapperContained,x,y,z,u,v,width,height,textureWidth,textureHeight); }
public void drawHorizontalLine(int x1,int x2,int y,int color) { wrapperContained.drawHorizontalLine(x1,x2,y,color); }
// public static void drawHorizontalLine(int x1,int x2,int y,int color, ) { net.minecraft.client.gui.DrawContext.drawHorizontalLine(x1,x2,y,color); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height,float u,float v,int regionWidth,int regionHeight,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x,y,width,height,u,v,regionWidth,regionHeight,textureWidth,textureHeight); }
// public static void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height,float u,float v,int regionWidth,int regionHeight,int textureWidth,int textureHeight, ) { net.minecraft.client.gui.DrawContext.drawTexture(texture.wrapperContained,x,y,width,height,u,v,regionWidth,regionHeight,textureWidth,textureHeight); }
public void fill(int x1,int y1,int x2,int y2,int color) { wrapperContained.fill(x1,y1,x2,y2,color); }
// public static void fill(int x1,int y1,int x2,int y2,int color, ) { net.minecraft.client.gui.DrawContext.fill(x1,y1,x2,y2,color); }
// public void drawTexturedQuad(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,float u1,float u2,float v1,float v2) { wrapperContained.drawTexturedQuad(texture.wrapperContained,x1,x2,y1,y2,z,u1,u2,v1,v2); }
// public static void drawTexturedQuad(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,float u1,float u2,float v1,float v2, ) { net.minecraft.client.gui.DrawContext.drawTexturedQuad(texture.wrapperContained,x1,x2,y1,y2,z,u1,u2,v1,v2); }
public void fillGradient(int startX,int startY,int endX,int endY,int colorStart,int colorEnd) { wrapperContained.fillGradient(startX,startY,endX,endY,colorStart,colorEnd); }
// public static void fillGradient(int startX,int startY,int endX,int endY,int colorStart,int colorEnd, ) { net.minecraft.client.gui.DrawContext.fillGradient(startX,startY,endX,endY,colorStart,colorEnd); }
// public void drawTexture(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,int regionWidth,int regionHeight,float u,float v,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x1,x2,y1,y2,z,regionWidth,regionHeight,u,v,textureWidth,textureHeight); }
// public static void drawTexture(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,int regionWidth,int regionHeight,float u,float v,int textureWidth,int textureHeight, ) { net.minecraft.client.gui.DrawContext.drawTexture(texture.wrapperContained,x1,x2,y1,y2,z,regionWidth,regionHeight,u,v,textureWidth,textureHeight); }
public void drawSprite(int x,int y,int z,int width,int height,yarnwrap.client.texture.Sprite sprite) { wrapperContained.drawSprite(x,y,z,width,height,sprite.wrapperContained); }
// public static void drawSprite(int x,int y,int z,int width,int height,yarnwrap.client.texture.Sprite sprite, ) { net.minecraft.client.gui.DrawContext.drawSprite(x,y,z,width,height,sprite.wrapperContained); }
public void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int centerX,int y,int color) { wrapperContained.drawCenteredTextWithShadow(textRenderer.wrapperContained,text,centerX,y,color); }
// public static void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int centerX,int y,int color, ) { net.minecraft.client.gui.DrawContext.drawCenteredTextWithShadow(textRenderer.wrapperContained,text,centerX,y,color); }
public void drawVerticalLine(int x,int y1,int y2,int color) { wrapperContained.drawVerticalLine(x,y1,y2,color); }
// public static void drawVerticalLine(int x,int y1,int y2,int color, ) { net.minecraft.client.gui.DrawContext.drawVerticalLine(x,y1,y2,color); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int u,int v,int width,int height) { wrapperContained.drawTexture(texture.wrapperContained,x,y,u,v,width,height); }
// public static void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int u,int v,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawTexture(texture.wrapperContained,x,y,u,v,width,height); }
public int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int x,int y,int color) { return wrapperContained.drawTextWithShadow(textRenderer.wrapperContained,text,x,y,color); }
// public static int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int x,int y,int color, ) { return net.minecraft.client.gui.DrawContext.drawTextWithShadow(textRenderer.wrapperContained,text,x,y,color); }
// public void fillGradient(yarnwrap.client.render.VertexConsumer vertexConsumer,int startX,int startY,int endX,int endY,int z,int colorStart,int colorEnd) { wrapperContained.fillGradient(vertexConsumer.wrapperContained,startX,startY,endX,endY,z,colorStart,colorEnd); }
// public static void fillGradient(yarnwrap.client.render.VertexConsumer vertexConsumer,int startX,int startY,int endX,int endY,int z,int colorStart,int colorEnd, ) { net.minecraft.client.gui.DrawContext.fillGradient(vertexConsumer.wrapperContained,startX,startY,endX,endY,z,colorStart,colorEnd); }
public void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int centerX,int y,int color) { wrapperContained.drawCenteredTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,centerX,y,color); }
// public static void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int centerX,int y,int color, ) { net.minecraft.client.gui.DrawContext.drawCenteredTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,centerX,y,color); }
public int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int color) { return wrapperContained.drawTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,x,y,color); }
// public static int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int color, ) { return net.minecraft.client.gui.DrawContext.drawTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,x,y,color); }
public void fillGradient(int startX,int startY,int endX,int endY,int z,int colorStart,int colorEnd) { wrapperContained.fillGradient(startX,startY,endX,endY,z,colorStart,colorEnd); }
// public static void fillGradient(int startX,int startY,int endX,int endY,int z,int colorStart,int colorEnd, ) { net.minecraft.client.gui.DrawContext.fillGradient(startX,startY,endX,endY,z,colorStart,colorEnd); }
public void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int centerX,int y,int color) { wrapperContained.drawCenteredTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,centerX,y,color); }
// public static void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int centerX,int y,int color, ) { net.minecraft.client.gui.DrawContext.drawCenteredTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,centerX,y,color); }
public int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int x,int y,int color) { return wrapperContained.drawTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,x,y,color); }
// public static int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int x,int y,int color, ) { return net.minecraft.client.gui.DrawContext.drawTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,x,y,color); }
public void enableScissor(int x1,int y1,int x2,int y2) { wrapperContained.enableScissor(x1,y1,x2,y2); }
// public static void enableScissor(int x1,int y1,int x2,int y2, ) { net.minecraft.client.gui.DrawContext.enableScissor(x1,y1,x2,y2); }
public void disableScissor() { wrapperContained.disableScissor(); }
// public static void disableScissor() { net.minecraft.client.gui.DrawContext.disableScissor(); }
public void fill(yarnwrap.client.render.RenderLayer layer,int x1,int y1,int x2,int y2,int z,int color) { wrapperContained.fill(layer.wrapperContained,x1,y1,x2,y2,z,color); }
// public static void fill(yarnwrap.client.render.RenderLayer layer,int x1,int y1,int x2,int y2,int z,int color, ) { net.minecraft.client.gui.DrawContext.fill(layer.wrapperContained,x1,y1,x2,y2,z,color); }
public void drawSprite(int x,int y,int z,int width,int height,yarnwrap.client.texture.Sprite sprite,float red,float green,float blue,float alpha) { wrapperContained.drawSprite(x,y,z,width,height,sprite.wrapperContained,red,green,blue,alpha); }
// public static void drawSprite(int x,int y,int z,int width,int height,yarnwrap.client.texture.Sprite sprite,float red,float green,float blue,float alpha, ) { net.minecraft.client.gui.DrawContext.drawSprite(x,y,z,width,height,sprite.wrapperContained,red,green,blue,alpha); }
// public void drawTexturedQuad(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,float u1,float u2,float v1,float v2,float red,float green,float blue,float alpha) { wrapperContained.drawTexturedQuad(texture.wrapperContained,x1,x2,y1,y2,z,u1,u2,v1,v2,red,green,blue,alpha); }
// public static void drawTexturedQuad(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,float u1,float u2,float v1,float v2,float red,float green,float blue,float alpha, ) { net.minecraft.client.gui.DrawContext.drawTexturedQuad(texture.wrapperContained,x1,x2,y1,y2,z,u1,u2,v1,v2,red,green,blue,alpha); }
public void drawBorder(int x,int y,int width,int height,int color) { wrapperContained.drawBorder(x,y,width,height,color); }
// public static void drawBorder(int x,int y,int width,int height,int color, ) { net.minecraft.client.gui.DrawContext.drawBorder(x,y,width,height,color); }
// public void setScissor(yarnwrap.client.gui.ScreenRect rect) { wrapperContained.setScissor(rect.wrapperContained); }
// public static void setScissor(yarnwrap.client.gui.ScreenRect rect, ) { net.minecraft.client.gui.DrawContext.setScissor(rect.wrapperContained); }
public int getScaledWindowWidth() { return wrapperContained.getScaledWindowWidth(); }
// public static int getScaledWindowWidth() { return net.minecraft.client.gui.DrawContext.getScaledWindowWidth(); }
public void setShaderColor(float red,float green,float blue,float alpha) { wrapperContained.setShaderColor(red,green,blue,alpha); }
// public static void setShaderColor(float red,float green,float blue,float alpha, ) { net.minecraft.client.gui.DrawContext.setShaderColor(red,green,blue,alpha); }
public void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItem(entity.wrapperContained,stack.wrapperContained,x,y,seed); }
// public static void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,int x,int y,int seed, ) { net.minecraft.client.gui.DrawContext.drawItem(entity.wrapperContained,stack.wrapperContained,x,y,seed); }
// public void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItem(entity.wrapperContained,world.wrapperContained,stack.wrapperContained,x,y,seed); }
// public static void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,int x,int y,int seed, ) { net.minecraft.client.gui.DrawContext.drawItem(entity.wrapperContained,world.wrapperContained,stack.wrapperContained,x,y,seed); }
// public void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,int x,int y,int seed,int z) { wrapperContained.drawItem(entity.wrapperContained,world.wrapperContained,stack.wrapperContained,x,y,seed,z); }
// public static void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,int x,int y,int seed,int z, ) { net.minecraft.client.gui.DrawContext.drawItem(entity.wrapperContained,world.wrapperContained,stack.wrapperContained,x,y,seed,z); }
public void drawItem(yarnwrap.item.ItemStack item,int x,int y) { wrapperContained.drawItem(item.wrapperContained,x,y); }
// public static void drawItem(yarnwrap.item.ItemStack item,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawItem(item.wrapperContained,x,y); }
public void drawItem(yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItem(stack.wrapperContained,x,y,seed); }
// public static void drawItem(yarnwrap.item.ItemStack stack,int x,int y,int seed, ) { net.minecraft.client.gui.DrawContext.drawItem(stack.wrapperContained,x,y,seed); }
public void drawItem(yarnwrap.item.ItemStack stack,int x,int y,int seed,int z) { wrapperContained.drawItem(stack.wrapperContained,x,y,seed,z); }
// public static void drawItem(yarnwrap.item.ItemStack stack,int x,int y,int seed,int z, ) { net.minecraft.client.gui.DrawContext.drawItem(stack.wrapperContained,x,y,seed,z); }
public int drawText(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int x,int y,int color,boolean shadow) { return wrapperContained.drawText(textRenderer.wrapperContained,text.wrapperContained,x,y,color,shadow); }
// public static int drawText(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int x,int y,int color,boolean shadow, ) { return net.minecraft.client.gui.DrawContext.drawText(textRenderer.wrapperContained,text.wrapperContained,x,y,color,shadow); }
public void drawItemInSlot(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y) { wrapperContained.drawItemInSlot(textRenderer.wrapperContained,stack.wrapperContained,x,y); }
// public static void drawItemInSlot(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawItemInSlot(textRenderer.wrapperContained,stack.wrapperContained,x,y); }
public void drawItemInSlot(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y,java.lang.String countOverride) { wrapperContained.drawItemInSlot(textRenderer.wrapperContained,stack.wrapperContained,x,y,countOverride); }
// public static void drawItemInSlot(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y,java.lang.String countOverride, ) { net.minecraft.client.gui.DrawContext.drawItemInSlot(textRenderer.wrapperContained,stack.wrapperContained,x,y,countOverride); }
public int drawText(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int x,int y,int color,boolean shadow) { return wrapperContained.drawText(textRenderer.wrapperContained,text,x,y,color,shadow); }
// public static int drawText(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int x,int y,int color,boolean shadow, ) { return net.minecraft.client.gui.DrawContext.drawText(textRenderer.wrapperContained,text,x,y,color,shadow); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text,x,y); }
// public static void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawTooltip(textRenderer.wrapperContained,text,x,y); }
// public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List components,int x,int y,yarnwrap.client.gui.tooltip.TooltipPositioner positioner) { wrapperContained.drawTooltip(textRenderer.wrapperContained,components,x,y,positioner.wrapperContained); }
// public static void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List components,int x,int y,yarnwrap.client.gui.tooltip.TooltipPositioner positioner, ) { net.minecraft.client.gui.DrawContext.drawTooltip(textRenderer.wrapperContained,components,x,y,positioner.wrapperContained); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text,positioner.wrapperContained,x,y); }
// public static void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawTooltip(textRenderer.wrapperContained,text,positioner.wrapperContained,x,y); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,java.util.Optional data,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text,data,x,y); }
// public static void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,java.util.Optional data,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawTooltip(textRenderer.wrapperContained,text,data,x,y); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text.wrapperContained,x,y); }
// public static void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawTooltip(textRenderer.wrapperContained,text.wrapperContained,x,y); }
public int drawText(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int color,boolean shadow) { return wrapperContained.drawText(textRenderer.wrapperContained,text.wrapperContained,x,y,color,shadow); }
// public static int drawText(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int color,boolean shadow, ) { return net.minecraft.client.gui.DrawContext.drawText(textRenderer.wrapperContained,text.wrapperContained,x,y,color,shadow); }
public void drawTextWrapped(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.StringVisitable text,int x,int y,int width,int color) { wrapperContained.drawTextWrapped(textRenderer.wrapperContained,text.wrapperContained,x,y,width,color); }
// public static void drawTextWrapped(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.StringVisitable text,int x,int y,int width,int color, ) { net.minecraft.client.gui.DrawContext.drawTextWrapped(textRenderer.wrapperContained,text.wrapperContained,x,y,width,color); }
public void drawHoverEvent(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Style style,int x,int y) { wrapperContained.drawHoverEvent(textRenderer.wrapperContained,style.wrapperContained,x,y); }
// public static void drawHoverEvent(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Style style,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawHoverEvent(textRenderer.wrapperContained,style.wrapperContained,x,y); }
// public void method_51442(java.util.List data) { wrapperContained.method_51442(data); }
// public static void method_51442(java.util.List data, ) { net.minecraft.client.gui.DrawContext.method_51442(data); }
public int getScaledWindowHeight() { return wrapperContained.getScaledWindowHeight(); }
// public static int getScaledWindowHeight() { return net.minecraft.client.gui.DrawContext.getScaledWindowHeight(); }
public void drawItemWithoutEntity(yarnwrap.item.ItemStack stack,int x,int y) { wrapperContained.drawItemWithoutEntity(stack.wrapperContained,x,y); }
// public static void drawItemWithoutEntity(yarnwrap.item.ItemStack stack,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawItemWithoutEntity(stack.wrapperContained,x,y); }
public void drawItemTooltip(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y) { wrapperContained.drawItemTooltip(textRenderer.wrapperContained,stack.wrapperContained,x,y); }
// public static void drawItemTooltip(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawItemTooltip(textRenderer.wrapperContained,stack.wrapperContained,x,y); }
public void drawOrderedTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,int x,int y) { wrapperContained.drawOrderedTooltip(textRenderer.wrapperContained,text,x,y); }
// public static void drawOrderedTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,int x,int y, ) { net.minecraft.client.gui.DrawContext.drawOrderedTooltip(textRenderer.wrapperContained,text,x,y); }
public yarnwrap.client.util.math.MatrixStack getMatrices() { return new yarnwrap.client.util.math.MatrixStack(wrapperContained.getMatrices()); }
// public static yarnwrap.client.util.math.MatrixStack getMatrices() { return new yarnwrap.client.util.math.MatrixStack(net.minecraft.client.gui.DrawContext.getMatrices()); }
public Object getVertexConsumers() { return wrapperContained.getVertexConsumers(); }
// public static Object getVertexConsumers() { return net.minecraft.client.gui.DrawContext.getVertexConsumers(); }
public void draw() { wrapperContained.draw(); }
// public static void draw() { net.minecraft.client.gui.DrawContext.draw(); }
public void fill(int x1,int y1,int x2,int y2,int z,int color) { wrapperContained.fill(x1,y1,x2,y2,z,color); }
// public static void fill(int x1,int y1,int x2,int y2,int z,int color, ) { net.minecraft.client.gui.DrawContext.fill(x1,y1,x2,y2,z,color); }
public void drawHorizontalLine(yarnwrap.client.render.RenderLayer layer,int x1,int x2,int y,int color) { wrapperContained.drawHorizontalLine(layer.wrapperContained,x1,x2,y,color); }
// public static void drawHorizontalLine(yarnwrap.client.render.RenderLayer layer,int x1,int x2,int y,int color, ) { net.minecraft.client.gui.DrawContext.drawHorizontalLine(layer.wrapperContained,x1,x2,y,color); }
public void fill(yarnwrap.client.render.RenderLayer layer,int x1,int y1,int x2,int y2,int color) { wrapperContained.fill(layer.wrapperContained,x1,y1,x2,y2,color); }
// public static void fill(yarnwrap.client.render.RenderLayer layer,int x1,int y1,int x2,int y2,int color, ) { net.minecraft.client.gui.DrawContext.fill(layer.wrapperContained,x1,y1,x2,y2,color); }
public void fillGradient(yarnwrap.client.render.RenderLayer layer,int startX,int startY,int endX,int endY,int colorStart,int colorEnd,int z) { wrapperContained.fillGradient(layer.wrapperContained,startX,startY,endX,endY,colorStart,colorEnd,z); }
// public static void fillGradient(yarnwrap.client.render.RenderLayer layer,int startX,int startY,int endX,int endY,int colorStart,int colorEnd,int z, ) { net.minecraft.client.gui.DrawContext.fillGradient(layer.wrapperContained,startX,startY,endX,endY,colorStart,colorEnd,z); }
public void draw(java.lang.Runnable drawCallback) { wrapperContained.draw(drawCallback); }
// public static void draw(java.lang.Runnable drawCallback, ) { net.minecraft.client.gui.DrawContext.draw(drawCallback); }
public void drawVerticalLine(yarnwrap.client.render.RenderLayer layer,int x,int y1,int y2,int color) { wrapperContained.drawVerticalLine(layer.wrapperContained,x,y1,y2,color); }
// public static void drawVerticalLine(yarnwrap.client.render.RenderLayer layer,int x,int y1,int y2,int color, ) { net.minecraft.client.gui.DrawContext.drawVerticalLine(layer.wrapperContained,x,y1,y2,color); }
// public void tryDraw() { wrapperContained.tryDraw(); }
// public static void tryDraw() { net.minecraft.client.gui.DrawContext.tryDraw(); }
// public void drawIfRunning() { wrapperContained.drawIfRunning(); }
// public static void drawIfRunning() { net.minecraft.client.gui.DrawContext.drawIfRunning(); }
public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,width,height); }
// public static void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawGuiTexture(texture.wrapperContained,x,y,width,height); }
public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int z,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,z,width,height); }
// public static void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int z,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawGuiTexture(texture.wrapperContained,x,y,z,width,height); }
// public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,width,height); }
// // public static void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawGuiTexture(texture.wrapperContained,x,y,width,height); }
// public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int z,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,z,width,height); }
// // public static void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int z,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawGuiTexture(texture.wrapperContained,x,y,z,width,height); }
// public void drawSprite(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height) { wrapperContained.drawSprite(sprite.wrapperContained,x,y,z,width,height); }
// public static void drawSprite(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawSprite(sprite.wrapperContained,x,y,z,width,height); }
// // public void drawSprite(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height) { wrapperContained.drawSprite(sprite.wrapperContained,x,y,z,width,height); }
// // public static void drawSprite(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawSprite(sprite.wrapperContained,x,y,z,width,height); }
// public void drawSpriteTiled(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height,int tileWidth,int tileHeight) { wrapperContained.drawSpriteTiled(sprite.wrapperContained,x,y,z,width,height,tileWidth,tileHeight); }
// public static void drawSpriteTiled(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height,int tileWidth,int tileHeight, ) { net.minecraft.client.gui.DrawContext.drawSpriteTiled(sprite.wrapperContained,x,y,z,width,height,tileWidth,tileHeight); }
// public void drawSprite(yarnwrap.client.texture.Sprite sprite,Object nineSlice,int x,int y,int z,int width,int height) { wrapperContained.drawSprite(sprite.wrapperContained,nineSlice,x,y,z,width,height); }
// public static void drawSprite(yarnwrap.client.texture.Sprite sprite,Object nineSlice,int x,int y,int z,int width,int height, ) { net.minecraft.client.gui.DrawContext.drawSprite(sprite.wrapperContained,nineSlice,x,y,z,width,height); }
public void drawItemWithoutEntity(yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItemWithoutEntity(stack.wrapperContained,x,y,seed); }
// public static void drawItemWithoutEntity(yarnwrap.item.ItemStack stack,int x,int y,int seed, ) { net.minecraft.client.gui.DrawContext.drawItemWithoutEntity(stack.wrapperContained,x,y,seed); }
public void fillWithLayer(yarnwrap.client.render.RenderLayer layer,int startX,int startY,int endX,int endY,int z) { wrapperContained.fillWithLayer(layer.wrapperContained,startX,startY,endX,endY,z); }
// public static void fillWithLayer(yarnwrap.client.render.RenderLayer layer,int startX,int startY,int endX,int endY,int z, ) { net.minecraft.client.gui.DrawContext.fillWithLayer(layer.wrapperContained,startX,startY,endX,endY,z); }
public boolean scissorContains(int x,int y) { return wrapperContained.scissorContains(x,y); }
// public static boolean scissorContains(int x,int y, ) { return net.minecraft.client.gui.DrawContext.scissorContains(x,y); }
public int drawTextWithBackground(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int width,int color) { return wrapperContained.drawTextWithBackground(textRenderer.wrapperContained,text.wrapperContained,x,y,width,color); }
// public static int drawTextWithBackground(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int width,int color, ) { return net.minecraft.client.gui.DrawContext.drawTextWithBackground(textRenderer.wrapperContained,text.wrapperContained,x,y,width,color); }

}