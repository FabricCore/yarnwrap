package yarnwrap.client.texture;
public class Sprite { public net.minecraft.client.texture.Sprite wrapperContained; public Sprite(net.minecraft.client.texture.Sprite wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier atlasId() { return new yarnwrap.util.Identifier(wrapperContained.atlasId); }
// public yarnwrap.client.texture.SpriteContents contents() { return new yarnwrap.client.texture.SpriteContents(wrapperContained.contents); }
// public int y() { return wrapperContained.y; }
// public int x() { return wrapperContained.x; }
// public float maxV() { return wrapperContained.maxV; }
// public float minV() { return wrapperContained.minV; }
// public float maxU() { return wrapperContained.maxU; }
// public float minU() { return wrapperContained.minU; }
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