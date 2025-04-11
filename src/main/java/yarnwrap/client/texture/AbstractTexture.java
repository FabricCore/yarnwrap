package yarnwrap.client.texture;
public class AbstractTexture { public net.minecraft.client.texture.AbstractTexture wrapperContained; public AbstractTexture(net.minecraft.client.texture.AbstractTexture wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_ID() { return wrapperContained.DEFAULT_ID; }
// public void DEFAULT_ID(int value) { wrapperContained.DEFAULT_ID = value; }
// public boolean mipmap() { return wrapperContained.mipmap; }
// public void mipmap(boolean value) { wrapperContained.mipmap = value; }
// public int glId() { return wrapperContained.glId; }
// public void glId(int value) { wrapperContained.glId = value; }
// public boolean bilinear() { return wrapperContained.bilinear; }
// public void bilinear(boolean value) { wrapperContained.bilinear = value; }
public void registerTexture(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id,java.util.concurrent.Executor executor) { wrapperContained.registerTexture(textureManager.wrapperContained,resourceManager.wrapperContained,id.wrapperContained,executor); }
public void bindTexture() { wrapperContained.bindTexture(); }
public void setFilter(boolean bilinear,boolean mipmap) { wrapperContained.setFilter(bilinear,mipmap); }
public void clearGlId() { wrapperContained.clearGlId(); }
public int getGlId() { return wrapperContained.getGlId(); }
// public void load(yarnwrap.resource.ResourceManager manager) { wrapperContained.load(manager.wrapperContained); }

}