package yarnwrap.client.render;
public class OverlayTexture { public net.minecraft.client.render.OverlayTexture wrapperContained; public OverlayTexture(net.minecraft.client.render.OverlayTexture wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
public int DEFAULT_UV() { return wrapperContained.DEFAULT_UV; }
public void setupOverlayColor() { wrapperContained.setupOverlayColor(); }
public int getU(float whiteOverlayProgress) { return wrapperContained.getU(whiteOverlayProgress); }
public int getV(boolean hurt) { return wrapperContained.getV(hurt); }
public void teardownOverlayColor() { wrapperContained.teardownOverlayColor(); }
public int getUv(float whiteOverlayProgress,boolean hurt) { return wrapperContained.getUv(whiteOverlayProgress,hurt); }
public int packUv(int u,int v) { return wrapperContained.packUv(u,v); }

}