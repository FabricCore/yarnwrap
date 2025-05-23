package yarnwrap.client.texture;
public class Sprite { public net.minecraft.client.texture.Sprite wrapperContained; public Sprite(net.minecraft.client.texture.Sprite wrapperContained) { this.wrapperContained = wrapperContained; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.client.texture.Sprite.y; }
// public static void y(int value, ) { net.minecraft.client.texture.Sprite.y = value; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.client.texture.Sprite.x; }
// public static void x(int value, ) { net.minecraft.client.texture.Sprite.x = value; }

// public float maxV() { return wrapperContained.maxV; }
// public void maxV(float value) { wrapperContained.maxV = value; }
// public static float maxV() { return net.minecraft.client.texture.Sprite.maxV; }
// public static void maxV(float value, ) { net.minecraft.client.texture.Sprite.maxV = value; }

// public float minV() { return wrapperContained.minV; }
// public void minV(float value) { wrapperContained.minV = value; }
// public static float minV() { return net.minecraft.client.texture.Sprite.minV; }
// public static void minV(float value, ) { net.minecraft.client.texture.Sprite.minV = value; }

// public float maxU() { return wrapperContained.maxU; }
// public void maxU(float value) { wrapperContained.maxU = value; }
// public static float maxU() { return net.minecraft.client.texture.Sprite.maxU; }
// public static void maxU(float value, ) { net.minecraft.client.texture.Sprite.maxU = value; }

// public float minU() { return wrapperContained.minU; }
// public void minU(float value) { wrapperContained.minU = value; }
// public static float minU() { return net.minecraft.client.texture.Sprite.minU; }
// public static void minU(float value, ) { net.minecraft.client.texture.Sprite.minU = value; }

// public yarnwrap.util.Identifier atlasId() { return new yarnwrap.util.Identifier(wrapperContained.atlasId); }
// public void atlasId(yarnwrap.util.Identifier value) { wrapperContained.atlasId = value.wrapperContained; }
// public static yarnwrap.util.Identifier atlasId() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.Sprite.atlasId); }
// public static void atlasId(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.Sprite.atlasId = value.wrapperContained; }

// public yarnwrap.client.texture.SpriteContents contents() { return new yarnwrap.client.texture.SpriteContents(wrapperContained.contents); }
// public void contents(yarnwrap.client.texture.SpriteContents value) { wrapperContained.contents = value.wrapperContained; }
// public static yarnwrap.client.texture.SpriteContents contents() { return new yarnwrap.client.texture.SpriteContents(net.minecraft.client.texture.Sprite.contents); }
// public static void contents(yarnwrap.client.texture.SpriteContents value, ) { net.minecraft.client.texture.Sprite.contents = value.wrapperContained; }

// public boolean animated() { return wrapperContained.animated; }
// public void animated(boolean value) { wrapperContained.animated = value; }
// public static boolean animated() { return net.minecraft.client.texture.Sprite.animated; }
// public static void animated(boolean value, ) { net.minecraft.client.texture.Sprite.animated = value; }

// public Sprite(yarnwrap.util.Identifier atlasId,yarnwrap.client.texture.SpriteContents contents,int atlasWidth,int atlasHeight,int x,int y) { this.wrapperContained = new net.minecraft.client.texture.Sprite(atlasId.wrapperContained,contents.wrapperContained,atlasWidth,atlasHeight,x,y); }
public float getFrameV(float frame) { return wrapperContained.getFrameV(frame); }
// public static float getFrameV(float frame, ) { return net.minecraft.client.texture.Sprite.getFrameV(frame); }
public float getMaxV() { return wrapperContained.getMaxV(); }
// public static float getMaxV() { return net.minecraft.client.texture.Sprite.getMaxV(); }
public float getMaxU() { return wrapperContained.getMaxU(); }
// public static float getMaxU() { return net.minecraft.client.texture.Sprite.getMaxU(); }
public float getFrameU(float frame) { return wrapperContained.getFrameU(frame); }
// public static float getFrameU(float frame, ) { return net.minecraft.client.texture.Sprite.getFrameU(frame); }
public void upload(com.mojang.blaze3d.textures.GpuTexture texture) { wrapperContained.upload(texture); }
// public static void upload(com.mojang.blaze3d.textures.GpuTexture texture, ) { net.minecraft.client.texture.Sprite.upload(texture); }
public float getMinV() { return wrapperContained.getMinV(); }
// public static float getMinV() { return net.minecraft.client.texture.Sprite.getMinV(); }
public float getMinU() { return wrapperContained.getMinU(); }
// public static float getMinU() { return net.minecraft.client.texture.Sprite.getMinU(); }
// public float getUvScaleDeltaFactor() { return wrapperContained.getUvScaleDeltaFactor(); }
// public static float getUvScaleDeltaFactor() { return net.minecraft.client.texture.Sprite.getUvScaleDeltaFactor(); }
public float getUvScaleDelta() { return wrapperContained.getUvScaleDelta(); }
// public static float getUvScaleDelta() { return net.minecraft.client.texture.Sprite.getUvScaleDelta(); }
public yarnwrap.client.render.VertexConsumer getTextureSpecificVertexConsumer(yarnwrap.client.render.VertexConsumer consumer) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getTextureSpecificVertexConsumer(consumer.wrapperContained)); }
// public static yarnwrap.client.render.VertexConsumer getTextureSpecificVertexConsumer(yarnwrap.client.render.VertexConsumer consumer, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.texture.Sprite.getTextureSpecificVertexConsumer(consumer.wrapperContained)); }
public Object createAnimation() { return wrapperContained.createAnimation(); }
// public static Object createAnimation() { return net.minecraft.client.texture.Sprite.createAnimation(); }
public float getFrameFromU(float u) { return wrapperContained.getFrameFromU(u); }
// public static float getFrameFromU(float u, ) { return net.minecraft.client.texture.Sprite.getFrameFromU(u); }
public float getFrameFromV(float v) { return wrapperContained.getFrameFromV(v); }
// public static float getFrameFromV(float v, ) { return net.minecraft.client.texture.Sprite.getFrameFromV(v); }
public int getX() { return wrapperContained.getX(); }
// public static int getX() { return net.minecraft.client.texture.Sprite.getX(); }
public int getY() { return wrapperContained.getY(); }
// public static int getY() { return net.minecraft.client.texture.Sprite.getY(); }
public yarnwrap.client.texture.SpriteContents getContents() { return new yarnwrap.client.texture.SpriteContents(wrapperContained.getContents()); }
// public static yarnwrap.client.texture.SpriteContents getContents() { return new yarnwrap.client.texture.SpriteContents(net.minecraft.client.texture.Sprite.getContents()); }
public yarnwrap.util.Identifier getAtlasId() { return new yarnwrap.util.Identifier(wrapperContained.getAtlasId()); }
// public static yarnwrap.util.Identifier getAtlasId() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.Sprite.getAtlasId()); }
// public boolean isAnimated() { return wrapperContained.isAnimated(); }
// public static boolean isAnimated() { return net.minecraft.client.texture.Sprite.isAnimated(); }

}