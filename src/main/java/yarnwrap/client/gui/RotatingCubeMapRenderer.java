package yarnwrap.client.gui;
public class RotatingCubeMapRenderer { public net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained; public RotatingCubeMapRenderer(net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.client.gui.CubeMapRenderer cubeMap() { return new yarnwrap.client.gui.CubeMapRenderer(wrapperContained.cubeMap); }
// public void cubeMap(yarnwrap.client.gui.CubeMapRenderer value) { wrapperContained.cubeMap = value.wrapperContained; }
public yarnwrap.util.Identifier OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_TEXTURE); }
// public void OVERLAY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.OVERLAY_TEXTURE = value.wrapperContained; }
public RotatingCubeMapRenderer(yarnwrap.client.gui.CubeMapRenderer cubeMap) { this.wrapperContained = new net.minecraft.client.gui.RotatingCubeMapRenderer(cubeMap.wrapperContained); }
public void render(yarnwrap.client.gui.DrawContext context,int width,int height,float alpha,float tickDelta) { wrapperContained.render(context.wrapperContained,width,height,alpha,tickDelta); }
// public float wrapOnce(float a,float b) { return wrapperContained.wrapOnce(a,b); }

}