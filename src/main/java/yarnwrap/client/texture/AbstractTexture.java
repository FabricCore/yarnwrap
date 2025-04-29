package yarnwrap.client.texture;
public class AbstractTexture { public net.minecraft.client.texture.AbstractTexture wrapperContained; public AbstractTexture(net.minecraft.client.texture.AbstractTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_ID() { return wrapperContained.DEFAULT_ID; }
// public void DEFAULT_ID(int value) { wrapperContained.DEFAULT_ID = value; }
public static int DEFAULT_ID() { return net.minecraft.client.texture.AbstractTexture.DEFAULT_ID; }
// public static void DEFAULT_ID(int value, ) { net.minecraft.client.texture.AbstractTexture.DEFAULT_ID = value; }

// public boolean mipmap() { return wrapperContained.mipmap; }
// public void mipmap(boolean value) { wrapperContained.mipmap = value; }
// public static boolean mipmap() { return net.minecraft.client.texture.AbstractTexture.mipmap; }
// public static void mipmap(boolean value, ) { net.minecraft.client.texture.AbstractTexture.mipmap = value; }

// public int glId() { return wrapperContained.glId; }
// public void glId(int value) { wrapperContained.glId = value; }
// public static int glId() { return net.minecraft.client.texture.AbstractTexture.glId; }
// public static void glId(int value, ) { net.minecraft.client.texture.AbstractTexture.glId = value; }

// public boolean bilinear() { return wrapperContained.bilinear; }
// public void bilinear(boolean value) { wrapperContained.bilinear = value; }
// public static boolean bilinear() { return net.minecraft.client.texture.AbstractTexture.bilinear; }
// public static void bilinear(boolean value, ) { net.minecraft.client.texture.AbstractTexture.bilinear = value; }

public void registerTexture(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id,java.util.concurrent.Executor executor) { wrapperContained.registerTexture(textureManager.wrapperContained,resourceManager.wrapperContained,id.wrapperContained,executor); }
// public static void registerTexture(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id,java.util.concurrent.Executor executor, ) { net.minecraft.client.texture.AbstractTexture.registerTexture(textureManager.wrapperContained,resourceManager.wrapperContained,id.wrapperContained,executor); }
public void bindTexture() { wrapperContained.bindTexture(); }
// public static void bindTexture() { net.minecraft.client.texture.AbstractTexture.bindTexture(); }
public void setFilter(boolean bilinear,boolean mipmap) { wrapperContained.setFilter(bilinear,mipmap); }
// public static void setFilter(boolean bilinear,boolean mipmap, ) { net.minecraft.client.texture.AbstractTexture.setFilter(bilinear,mipmap); }
public void clearGlId() { wrapperContained.clearGlId(); }
// public static void clearGlId() { net.minecraft.client.texture.AbstractTexture.clearGlId(); }
public int getGlId() { return wrapperContained.getGlId(); }
// public static int getGlId() { return net.minecraft.client.texture.AbstractTexture.getGlId(); }
// public void load(yarnwrap.resource.ResourceManager manager) { wrapperContained.load(manager.wrapperContained); }
// public static void load(yarnwrap.resource.ResourceManager manager, ) { net.minecraft.client.texture.AbstractTexture.load(manager.wrapperContained); }

}