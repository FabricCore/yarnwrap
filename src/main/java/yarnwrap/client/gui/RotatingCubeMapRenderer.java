package yarnwrap.client.gui;
public class RotatingCubeMapRenderer { public net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained; public RotatingCubeMapRenderer(net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.RotatingCubeMapRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.client = value.wrapperContained; }

// public yarnwrap.client.gui.CubeMapRenderer cubeMap() { return new yarnwrap.client.gui.CubeMapRenderer(wrapperContained.cubeMap); }
// public void cubeMap(yarnwrap.client.gui.CubeMapRenderer value) { wrapperContained.cubeMap = value.wrapperContained; }
// public static yarnwrap.client.gui.CubeMapRenderer cubeMap() { return new yarnwrap.client.gui.CubeMapRenderer(net.minecraft.client.gui.RotatingCubeMapRenderer.cubeMap); }
// public static void cubeMap(yarnwrap.client.gui.CubeMapRenderer value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.cubeMap = value.wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.gui.RotatingCubeMapRenderer.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.pitch = value; }

// public yarnwrap.util.Identifier OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_TEXTURE); }
// public void OVERLAY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.OVERLAY_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.RotatingCubeMapRenderer.OVERLAY_TEXTURE); }
// public static void OVERLAY_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.OVERLAY_TEXTURE = value.wrapperContained; }

public RotatingCubeMapRenderer(yarnwrap.client.gui.CubeMapRenderer cubeMap) { this.wrapperContained = new net.minecraft.client.gui.RotatingCubeMapRenderer(cubeMap.wrapperContained); }
// public void render(yarnwrap.client.gui.DrawContext context,int width,int height,boolean rotate) { wrapperContained.render(context.wrapperContained,width,height,rotate); }
// public static void render(yarnwrap.client.gui.DrawContext context,int width,int height,boolean rotate, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.render(context.wrapperContained,width,height,rotate); }
// public float wrapOnce(float a,float b) { return wrapperContained.wrapOnce(a,b); }
// public static float wrapOnce(float a,float b, ) { return net.minecraft.client.gui.RotatingCubeMapRenderer.wrapOnce(a,b); }
// public void registerTextures(yarnwrap.client.texture.TextureManager textureManager) { wrapperContained.registerTextures(textureManager.wrapperContained); }
// public static void registerTextures(yarnwrap.client.texture.TextureManager textureManager, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.registerTextures(textureManager.wrapperContained); }

}