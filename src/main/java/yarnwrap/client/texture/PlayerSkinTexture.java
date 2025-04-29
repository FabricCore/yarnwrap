package yarnwrap.client.texture;
public class PlayerSkinTexture { public net.minecraft.client.texture.PlayerSkinTexture wrapperContained; public PlayerSkinTexture(net.minecraft.client.texture.PlayerSkinTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean convertLegacy() { return wrapperContained.convertLegacy; }
// public void convertLegacy(boolean value) { wrapperContained.convertLegacy = value; }
// public static boolean convertLegacy() { return net.minecraft.client.texture.PlayerSkinTexture.convertLegacy; }
// public static void convertLegacy(boolean value, ) { net.minecraft.client.texture.PlayerSkinTexture.convertLegacy = value; }

// public java.lang.Runnable loadedCallback() { return wrapperContained.loadedCallback; }
// public void loadedCallback(java.lang.Runnable value) { wrapperContained.loadedCallback = value; }
// public static java.lang.Runnable loadedCallback() { return net.minecraft.client.texture.PlayerSkinTexture.loadedCallback; }
// public static void loadedCallback(java.lang.Runnable value, ) { net.minecraft.client.texture.PlayerSkinTexture.loadedCallback = value; }

// public java.util.concurrent.CompletableFuture loader() { return wrapperContained.loader; }
// public void loader(java.util.concurrent.CompletableFuture value) { wrapperContained.loader = value; }
// public static java.util.concurrent.CompletableFuture loader() { return net.minecraft.client.texture.PlayerSkinTexture.loader; }
// public static void loader(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.texture.PlayerSkinTexture.loader = value; }

// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
// public static int WIDTH() { return net.minecraft.client.texture.PlayerSkinTexture.WIDTH; }
// public static void WIDTH(int value, ) { net.minecraft.client.texture.PlayerSkinTexture.WIDTH = value; }

// public int HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(int value) { wrapperContained.HEIGHT = value; }
// public static int HEIGHT() { return net.minecraft.client.texture.PlayerSkinTexture.HEIGHT; }
// public static void HEIGHT(int value, ) { net.minecraft.client.texture.PlayerSkinTexture.HEIGHT = value; }

// public int OLD_HEIGHT() { return wrapperContained.OLD_HEIGHT; }
// public void OLD_HEIGHT(int value) { wrapperContained.OLD_HEIGHT = value; }
// public static int OLD_HEIGHT() { return net.minecraft.client.texture.PlayerSkinTexture.OLD_HEIGHT; }
// public static void OLD_HEIGHT(int value, ) { net.minecraft.client.texture.PlayerSkinTexture.OLD_HEIGHT = value; }

// public java.io.File cacheFile() { return wrapperContained.cacheFile; }
// public void cacheFile(java.io.File value) { wrapperContained.cacheFile = value; }
// public static java.io.File cacheFile() { return net.minecraft.client.texture.PlayerSkinTexture.cacheFile; }
// public static void cacheFile(java.io.File value, ) { net.minecraft.client.texture.PlayerSkinTexture.cacheFile = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.PlayerSkinTexture.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.PlayerSkinTexture.LOGGER = value; }

// public java.lang.String url() { return wrapperContained.url; }
// public void url(java.lang.String value) { wrapperContained.url = value; }
// public static java.lang.String url() { return net.minecraft.client.texture.PlayerSkinTexture.url; }
// public static void url(java.lang.String value, ) { net.minecraft.client.texture.PlayerSkinTexture.url = value; }

// public boolean loaded() { return wrapperContained.loaded; }
// public void loaded(boolean value) { wrapperContained.loaded = value; }
// public static boolean loaded() { return net.minecraft.client.texture.PlayerSkinTexture.loaded; }
// public static void loaded(boolean value, ) { net.minecraft.client.texture.PlayerSkinTexture.loaded = value; }

public PlayerSkinTexture(java.io.File cacheFile,java.lang.String url,yarnwrap.util.Identifier fallbackSkin,boolean convertLegacy,java.lang.Runnable callback) { this.wrapperContained = new net.minecraft.client.texture.PlayerSkinTexture(cacheFile,url,fallbackSkin.wrapperContained,convertLegacy,callback); }
// public void stripColor(yarnwrap.client.texture.NativeImage image,int x1,int y1,int x2,int y2) { wrapperContained.stripColor(image.wrapperContained,x1,y1,x2,y2); }
// public static void stripColor(yarnwrap.client.texture.NativeImage image,int x1,int y1,int x2,int y2, ) { net.minecraft.client.texture.PlayerSkinTexture.stripColor(image.wrapperContained,x1,y1,x2,y2); }
// public yarnwrap.client.texture.NativeImage loadTexture(java.io.InputStream stream) { return new yarnwrap.client.texture.NativeImage(wrapperContained.loadTexture(stream)); }
// public static yarnwrap.client.texture.NativeImage loadTexture(java.io.InputStream stream, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.PlayerSkinTexture.loadTexture(stream)); }
// public void stripAlpha(yarnwrap.client.texture.NativeImage image,int x1,int y1,int x2,int y2) { wrapperContained.stripAlpha(image.wrapperContained,x1,y1,x2,y2); }
// public static void stripAlpha(yarnwrap.client.texture.NativeImage image,int x1,int y1,int x2,int y2, ) { net.minecraft.client.texture.PlayerSkinTexture.stripAlpha(image.wrapperContained,x1,y1,x2,y2); }
// public yarnwrap.client.texture.NativeImage remapTexture(yarnwrap.client.texture.NativeImage image) { return new yarnwrap.client.texture.NativeImage(wrapperContained.remapTexture(image.wrapperContained)); }
// public static yarnwrap.client.texture.NativeImage remapTexture(yarnwrap.client.texture.NativeImage image, ) { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.PlayerSkinTexture.remapTexture(image.wrapperContained)); }
// public void uploadTexture(yarnwrap.client.texture.NativeImage image) { wrapperContained.uploadTexture(image.wrapperContained); }
// public static void uploadTexture(yarnwrap.client.texture.NativeImage image, ) { net.minecraft.client.texture.PlayerSkinTexture.uploadTexture(image.wrapperContained); }
// public void onTextureLoaded(yarnwrap.client.texture.NativeImage image) { wrapperContained.onTextureLoaded(image.wrapperContained); }
// public static void onTextureLoaded(yarnwrap.client.texture.NativeImage image, ) { net.minecraft.client.texture.PlayerSkinTexture.onTextureLoaded(image.wrapperContained); }

}