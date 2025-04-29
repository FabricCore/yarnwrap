package yarnwrap.client.render;
public class OverlayTexture { public net.minecraft.client.render.OverlayTexture wrapperContained; public OverlayTexture(net.minecraft.client.render.OverlayTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
// public void texture(yarnwrap.client.texture.NativeImageBackedTexture value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(net.minecraft.client.render.OverlayTexture.texture); }
// public static void texture(yarnwrap.client.texture.NativeImageBackedTexture value, ) { net.minecraft.client.render.OverlayTexture.texture = value.wrapperContained; }

// public int DEFAULT_UV() { return wrapperContained.DEFAULT_UV; }
// public void DEFAULT_UV(int value) { wrapperContained.DEFAULT_UV = value; }
public static int DEFAULT_UV() { return net.minecraft.client.render.OverlayTexture.DEFAULT_UV; }
// public static void DEFAULT_UV(int value, ) { net.minecraft.client.render.OverlayTexture.DEFAULT_UV = value; }

public void setupOverlayColor() { wrapperContained.setupOverlayColor(); }
// public static void setupOverlayColor() { net.minecraft.client.render.OverlayTexture.setupOverlayColor(); }
// public int getU(float whiteOverlayProgress) { return wrapperContained.getU(whiteOverlayProgress); }
// public static int getU(float whiteOverlayProgress, ) { return net.minecraft.client.render.OverlayTexture.getU(whiteOverlayProgress); }
// public int getV(boolean hurt) { return wrapperContained.getV(hurt); }
// public static int getV(boolean hurt, ) { return net.minecraft.client.render.OverlayTexture.getV(hurt); }
public void teardownOverlayColor() { wrapperContained.teardownOverlayColor(); }
// public static void teardownOverlayColor() { net.minecraft.client.render.OverlayTexture.teardownOverlayColor(); }
// public int getUv(float whiteOverlayProgress,boolean hurt) { return wrapperContained.getUv(whiteOverlayProgress,hurt); }
// public static int getUv(float whiteOverlayProgress,boolean hurt, ) { return net.minecraft.client.render.OverlayTexture.getUv(whiteOverlayProgress,hurt); }
// public int packUv(int u,int v) { return wrapperContained.packUv(u,v); }
// public static int packUv(int u,int v, ) { return net.minecraft.client.render.OverlayTexture.packUv(u,v); }

}