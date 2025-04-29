package yarnwrap.client.gui;
public class RotatingCubeMapRenderer { public net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained; public RotatingCubeMapRenderer(net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.gui.RotatingCubeMapRenderer.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.pitch = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.gui.RotatingCubeMapRenderer.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.yaw = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.RotatingCubeMapRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.client = value.wrapperContained; }

// public yarnwrap.client.gui.CubeMapRenderer cubeMap() { return new yarnwrap.client.gui.CubeMapRenderer(wrapperContained.cubeMap); }
// public void cubeMap(yarnwrap.client.gui.CubeMapRenderer value) { wrapperContained.cubeMap = value.wrapperContained; }
// public static yarnwrap.client.gui.CubeMapRenderer cubeMap() { return new yarnwrap.client.gui.CubeMapRenderer(net.minecraft.client.gui.RotatingCubeMapRenderer.cubeMap); }
// public static void cubeMap(yarnwrap.client.gui.CubeMapRenderer value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.cubeMap = value.wrapperContained; }

// public yarnwrap.util.Identifier OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_TEXTURE); }
// public void OVERLAY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.OVERLAY_TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.RotatingCubeMapRenderer.OVERLAY_TEXTURE); }
// public static void OVERLAY_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.OVERLAY_TEXTURE = value.wrapperContained; }

public RotatingCubeMapRenderer(yarnwrap.client.gui.CubeMapRenderer cubeMap) { this.wrapperContained = new net.minecraft.client.gui.RotatingCubeMapRenderer(cubeMap.wrapperContained); }
public void render(yarnwrap.client.gui.DrawContext context,int width,int height,float alpha,float tickDelta) { wrapperContained.render(context.wrapperContained,width,height,alpha,tickDelta); }
// public static void render(yarnwrap.client.gui.DrawContext context,int width,int height,float alpha,float tickDelta, ) { net.minecraft.client.gui.RotatingCubeMapRenderer.render(context.wrapperContained,width,height,alpha,tickDelta); }
// public float wrapOnce(float a,float b) { return wrapperContained.wrapOnce(a,b); }
// public static float wrapOnce(float a,float b, ) { return net.minecraft.client.gui.RotatingCubeMapRenderer.wrapOnce(a,b); }

}