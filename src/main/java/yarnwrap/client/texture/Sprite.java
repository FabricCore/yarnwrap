package yarnwrap.client.texture;
public class Sprite { public net.minecraft.client.texture.Sprite wrapperContained; public Sprite(net.minecraft.client.texture.Sprite wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier atlasId() { return new yarnwrap.util.Identifier(wrapperContained.atlasId); }
// public void atlasId(yarnwrap.util.Identifier value) { wrapperContained.atlasId = value.wrapperContained; }
// public yarnwrap.client.texture.SpriteContents contents() { return new yarnwrap.client.texture.SpriteContents(wrapperContained.contents); }
// public void contents(yarnwrap.client.texture.SpriteContents value) { wrapperContained.contents = value.wrapperContained; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public float maxV() { return wrapperContained.maxV; }
// public void maxV(float value) { wrapperContained.maxV = value; }
// public float minV() { return wrapperContained.minV; }
// public void minV(float value) { wrapperContained.minV = value; }
// public float maxU() { return wrapperContained.maxU; }
// public void maxU(float value) { wrapperContained.maxU = value; }
// public float minU() { return wrapperContained.minU; }
// public void minU(float value) { wrapperContained.minU = value; }
// public Sprite(yarnwrap.util.Identifier atlasId,yarnwrap.client.texture.SpriteContents contents,int atlasWidth,int atlasHeight,int x,int y) { this.wrapperContained = new net.minecraft.client.texture.Sprite(atlasId.wrapperContained,contents.wrapperContained,atlasWidth,atlasHeight,x,y); }
// public float getFrameDeltaFactor() { return wrapperContained.getFrameDeltaFactor(); }
public float getAnimationFrameDelta() { return wrapperContained.getAnimationFrameDelta(); }
public yarnwrap.client.render.VertexConsumer getTextureSpecificVertexConsumer(yarnwrap.client.render.VertexConsumer consumer) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.getTextureSpecificVertexConsumer(consumer.wrapperContained)); }
public Object createAnimation() { return wrapperContained.createAnimation(); }
public float getFrameFromU(float u) { return wrapperContained.getFrameFromU(u); }
public float getFrameFromV(float v) { return wrapperContained.getFrameFromV(v); }
public int getX() { return wrapperContained.getX(); }
public int getY() { return wrapperContained.getY(); }
public float getFrameV(float frame) { return wrapperContained.getFrameV(frame); }
public float getMaxV() { return wrapperContained.getMaxV(); }
public float getMaxU() { return wrapperContained.getMaxU(); }
public float getFrameU(float frame) { return wrapperContained.getFrameU(frame); }
public void upload() { wrapperContained.upload(); }
public yarnwrap.client.texture.SpriteContents getContents() { return new yarnwrap.client.texture.SpriteContents(wrapperContained.getContents()); }
public yarnwrap.util.Identifier getAtlasId() { return new yarnwrap.util.Identifier(wrapperContained.getAtlasId()); }
public float getMinV() { return wrapperContained.getMinV(); }
public float getMinU() { return wrapperContained.getMinU(); }

}