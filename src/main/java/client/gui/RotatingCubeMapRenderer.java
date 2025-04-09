package yarnwrap.client.gui;
public class RotatingCubeMapRenderer { public net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained; public RotatingCubeMapRenderer(net.minecraft.client.gui.RotatingCubeMapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public float yaw() { return wrapperContained.yaw; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.client.gui.CubeMapRenderer cubeMap() { return new yarnwrap.client.gui.CubeMapRenderer(wrapperContained.cubeMap); }
public yarnwrap.util.Identifier OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_TEXTURE); }
public void render(yarnwrap.client.gui.DrawContext context,int width,int height,float alpha,float tickDelta) { wrapperContained.render(context.wrapperContained,width,height,alpha,tickDelta); }
// public float wrapOnce(float a,float b) { return wrapperContained.wrapOnce(a,b); }

}