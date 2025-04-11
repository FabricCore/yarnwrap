package yarnwrap.client.gui;
public class DrawContext { public net.minecraft.client.gui.DrawContext wrapperContained; public DrawContext(net.minecraft.client.gui.DrawContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.client.util.math.MatrixStack matrices() { return new yarnwrap.client.util.math.MatrixStack(wrapperContained.matrices); }
// public void matrices(yarnwrap.client.util.math.MatrixStack value) { wrapperContained.matrices = value.wrapperContained; }
// public Object vertexConsumers() { return wrapperContained.vertexConsumers; }
// // public void vertexConsumers(Object value) { wrapperContained.vertexConsumers = value; }
// public Object scissorStack() { return wrapperContained.scissorStack; }
// // public void scissorStack(Object value) { wrapperContained.scissorStack = value; }
// public boolean runningDrawCallback() { return wrapperContained.runningDrawCallback; }
// public void runningDrawCallback(boolean value) { wrapperContained.runningDrawCallback = value; }
// public yarnwrap.client.texture.GuiAtlasManager guiAtlasManager() { return new yarnwrap.client.texture.GuiAtlasManager(wrapperContained.guiAtlasManager); }
// public void guiAtlasManager(yarnwrap.client.texture.GuiAtlasManager value) { wrapperContained.guiAtlasManager = value.wrapperContained; }
// public DrawContext(yarnwrap.client.MinecraftClient client,yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers) { this.wrapperContained = new net.minecraft.client.gui.DrawContext(client.wrapperContained,matrices.wrapperContained,vertexConsumers); }
// public DrawContext(yarnwrap.client.MinecraftClient client,Object vertexConsumers) { this.wrapperContained = new net.minecraft.client.gui.DrawContext(client.wrapperContained,vertexConsumers); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,float u,float v,int width,int height,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x,y,u,v,width,height,textureWidth,textureHeight); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int z,float u,float v,int width,int height,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x,y,z,u,v,width,height,textureWidth,textureHeight); }
public void drawHorizontalLine(int x1,int x2,int y,int color) { wrapperContained.drawHorizontalLine(x1,x2,y,color); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height,float u,float v,int regionWidth,int regionHeight,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x,y,width,height,u,v,regionWidth,regionHeight,textureWidth,textureHeight); }
public void fill(int x1,int y1,int x2,int y2,int color) { wrapperContained.fill(x1,y1,x2,y2,color); }
// public void drawTexturedQuad(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,float u1,float u2,float v1,float v2) { wrapperContained.drawTexturedQuad(texture.wrapperContained,x1,x2,y1,y2,z,u1,u2,v1,v2); }
public void fillGradient(int startX,int startY,int endX,int endY,int colorStart,int colorEnd) { wrapperContained.fillGradient(startX,startY,endX,endY,colorStart,colorEnd); }
// public void drawTexture(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,int regionWidth,int regionHeight,float u,float v,int textureWidth,int textureHeight) { wrapperContained.drawTexture(texture.wrapperContained,x1,x2,y1,y2,z,regionWidth,regionHeight,u,v,textureWidth,textureHeight); }
public void drawSprite(int x,int y,int z,int width,int height,yarnwrap.client.texture.Sprite sprite) { wrapperContained.drawSprite(x,y,z,width,height,sprite.wrapperContained); }
public void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int centerX,int y,int color) { wrapperContained.drawCenteredTextWithShadow(textRenderer.wrapperContained,text,centerX,y,color); }
public void drawVerticalLine(int x,int y1,int y2,int color) { wrapperContained.drawVerticalLine(x,y1,y2,color); }
public void drawTexture(yarnwrap.util.Identifier texture,int x,int y,int u,int v,int width,int height) { wrapperContained.drawTexture(texture.wrapperContained,x,y,u,v,width,height); }
public int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int x,int y,int color) { return wrapperContained.drawTextWithShadow(textRenderer.wrapperContained,text,x,y,color); }
// public void fillGradient(yarnwrap.client.render.VertexConsumer vertexConsumer,int startX,int startY,int endX,int endY,int z,int colorStart,int colorEnd) { wrapperContained.fillGradient(vertexConsumer.wrapperContained,startX,startY,endX,endY,z,colorStart,colorEnd); }
public void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int centerX,int y,int color) { wrapperContained.drawCenteredTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,centerX,y,color); }
public int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int color) { return wrapperContained.drawTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,x,y,color); }
public void fillGradient(int startX,int startY,int endX,int endY,int z,int colorStart,int colorEnd) { wrapperContained.fillGradient(startX,startY,endX,endY,z,colorStart,colorEnd); }
public void drawCenteredTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int centerX,int y,int color) { wrapperContained.drawCenteredTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,centerX,y,color); }
public int drawTextWithShadow(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int x,int y,int color) { return wrapperContained.drawTextWithShadow(textRenderer.wrapperContained,text.wrapperContained,x,y,color); }
public void enableScissor(int x1,int y1,int x2,int y2) { wrapperContained.enableScissor(x1,y1,x2,y2); }
public void disableScissor() { wrapperContained.disableScissor(); }
public void fill(yarnwrap.client.render.RenderLayer layer,int x1,int y1,int x2,int y2,int z,int color) { wrapperContained.fill(layer.wrapperContained,x1,y1,x2,y2,z,color); }
public void drawSprite(int x,int y,int z,int width,int height,yarnwrap.client.texture.Sprite sprite,float red,float green,float blue,float alpha) { wrapperContained.drawSprite(x,y,z,width,height,sprite.wrapperContained,red,green,blue,alpha); }
// public void drawTexturedQuad(yarnwrap.util.Identifier texture,int x1,int x2,int y1,int y2,int z,float u1,float u2,float v1,float v2,float red,float green,float blue,float alpha) { wrapperContained.drawTexturedQuad(texture.wrapperContained,x1,x2,y1,y2,z,u1,u2,v1,v2,red,green,blue,alpha); }
public void drawBorder(int x,int y,int width,int height,int color) { wrapperContained.drawBorder(x,y,width,height,color); }
// public void setScissor(yarnwrap.client.gui.ScreenRect rect) { wrapperContained.setScissor(rect.wrapperContained); }
public int getScaledWindowWidth() { return wrapperContained.getScaledWindowWidth(); }
public void setShaderColor(float red,float green,float blue,float alpha) { wrapperContained.setShaderColor(red,green,blue,alpha); }
public void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItem(entity.wrapperContained,stack.wrapperContained,x,y,seed); }
// public void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItem(entity.wrapperContained,world.wrapperContained,stack.wrapperContained,x,y,seed); }
// public void drawItem(yarnwrap.entity.LivingEntity entity,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,int x,int y,int seed,int z) { wrapperContained.drawItem(entity.wrapperContained,world.wrapperContained,stack.wrapperContained,x,y,seed,z); }
public void drawItem(yarnwrap.item.ItemStack item,int x,int y) { wrapperContained.drawItem(item.wrapperContained,x,y); }
public void drawItem(yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItem(stack.wrapperContained,x,y,seed); }
public void drawItem(yarnwrap.item.ItemStack stack,int x,int y,int seed,int z) { wrapperContained.drawItem(stack.wrapperContained,x,y,seed,z); }
public int drawText(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.OrderedText text,int x,int y,int color,boolean shadow) { return wrapperContained.drawText(textRenderer.wrapperContained,text.wrapperContained,x,y,color,shadow); }
public void drawItemInSlot(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y) { wrapperContained.drawItemInSlot(textRenderer.wrapperContained,stack.wrapperContained,x,y); }
public void drawItemInSlot(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y,java.lang.String countOverride) { wrapperContained.drawItemInSlot(textRenderer.wrapperContained,stack.wrapperContained,x,y,countOverride); }
public int drawText(yarnwrap.client.font.TextRenderer textRenderer,java.lang.String text,int x,int y,int color,boolean shadow) { return wrapperContained.drawText(textRenderer.wrapperContained,text,x,y,color,shadow); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text,x,y); }
// public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List components,int x,int y,yarnwrap.client.gui.tooltip.TooltipPositioner positioner) { wrapperContained.drawTooltip(textRenderer.wrapperContained,components,x,y,positioner.wrapperContained); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,yarnwrap.client.gui.tooltip.TooltipPositioner positioner,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text,positioner.wrapperContained,x,y); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,java.util.Optional data,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text,data,x,y); }
public void drawTooltip(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y) { wrapperContained.drawTooltip(textRenderer.wrapperContained,text.wrapperContained,x,y); }
public int drawText(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int color,boolean shadow) { return wrapperContained.drawText(textRenderer.wrapperContained,text.wrapperContained,x,y,color,shadow); }
public void drawTextWrapped(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.StringVisitable text,int x,int y,int width,int color) { wrapperContained.drawTextWrapped(textRenderer.wrapperContained,text.wrapperContained,x,y,width,color); }
public void drawHoverEvent(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Style style,int x,int y) { wrapperContained.drawHoverEvent(textRenderer.wrapperContained,style.wrapperContained,x,y); }
// public void method_51442(java.util.List data) { wrapperContained.method_51442(data); }
public int getScaledWindowHeight() { return wrapperContained.getScaledWindowHeight(); }
public void drawItemWithoutEntity(yarnwrap.item.ItemStack stack,int x,int y) { wrapperContained.drawItemWithoutEntity(stack.wrapperContained,x,y); }
public void drawItemTooltip(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.item.ItemStack stack,int x,int y) { wrapperContained.drawItemTooltip(textRenderer.wrapperContained,stack.wrapperContained,x,y); }
public void drawOrderedTooltip(yarnwrap.client.font.TextRenderer textRenderer,java.util.List text,int x,int y) { wrapperContained.drawOrderedTooltip(textRenderer.wrapperContained,text,x,y); }
public yarnwrap.client.util.math.MatrixStack getMatrices() { return new yarnwrap.client.util.math.MatrixStack(wrapperContained.getMatrices()); }
public Object getVertexConsumers() { return wrapperContained.getVertexConsumers(); }
public void draw() { wrapperContained.draw(); }
public void fill(int x1,int y1,int x2,int y2,int z,int color) { wrapperContained.fill(x1,y1,x2,y2,z,color); }
public void drawHorizontalLine(yarnwrap.client.render.RenderLayer layer,int x1,int x2,int y,int color) { wrapperContained.drawHorizontalLine(layer.wrapperContained,x1,x2,y,color); }
public void fill(yarnwrap.client.render.RenderLayer layer,int x1,int y1,int x2,int y2,int color) { wrapperContained.fill(layer.wrapperContained,x1,y1,x2,y2,color); }
public void fillGradient(yarnwrap.client.render.RenderLayer layer,int startX,int startY,int endX,int endY,int colorStart,int colorEnd,int z) { wrapperContained.fillGradient(layer.wrapperContained,startX,startY,endX,endY,colorStart,colorEnd,z); }
public void draw(java.lang.Runnable drawCallback) { wrapperContained.draw(drawCallback); }
public void drawVerticalLine(yarnwrap.client.render.RenderLayer layer,int x,int y1,int y2,int color) { wrapperContained.drawVerticalLine(layer.wrapperContained,x,y1,y2,color); }
// public void tryDraw() { wrapperContained.tryDraw(); }
// public void drawIfRunning() { wrapperContained.drawIfRunning(); }
public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,width,height); }
public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int z,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,z,width,height); }
// public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,width,height); }
// public void drawGuiTexture(yarnwrap.util.Identifier texture,int x,int y,int z,int width,int height) { wrapperContained.drawGuiTexture(texture.wrapperContained,x,y,z,width,height); }
// public void drawSprite(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height) { wrapperContained.drawSprite(sprite.wrapperContained,x,y,z,width,height); }
// // public void drawSprite(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height) { wrapperContained.drawSprite(sprite.wrapperContained,x,y,z,width,height); }
// public void drawSpriteTiled(yarnwrap.client.texture.Sprite sprite,int x,int y,int z,int width,int height,int tileWidth,int tileHeight) { wrapperContained.drawSpriteTiled(sprite.wrapperContained,x,y,z,width,height,tileWidth,tileHeight); }
// public void drawSprite(yarnwrap.client.texture.Sprite sprite,Object nineSlice,int x,int y,int z,int width,int height) { wrapperContained.drawSprite(sprite.wrapperContained,nineSlice,x,y,z,width,height); }
public void drawItemWithoutEntity(yarnwrap.item.ItemStack stack,int x,int y,int seed) { wrapperContained.drawItemWithoutEntity(stack.wrapperContained,x,y,seed); }
public void fillWithLayer(yarnwrap.client.render.RenderLayer layer,int startX,int startY,int endX,int endY,int z) { wrapperContained.fillWithLayer(layer.wrapperContained,startX,startY,endX,endY,z); }
public boolean scissorContains(int x,int y) { return wrapperContained.scissorContains(x,y); }
public int drawTextWithBackground(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text text,int x,int y,int width,int color) { return wrapperContained.drawTextWithBackground(textRenderer.wrapperContained,text.wrapperContained,x,y,width,color); }

}