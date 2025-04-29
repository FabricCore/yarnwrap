package yarnwrap.client.render.debug;
public class WorldGenAttemptDebugRenderer { public net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer wrapperContained; public WorldGenAttemptDebugRenderer(net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List sizes() { return wrapperContained.sizes; }
// public void sizes(java.util.List value) { wrapperContained.sizes = value; }
// public static java.util.List sizes() { return net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.sizes; }
// public static void sizes(java.util.List value, ) { net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.sizes = value; }

// public java.util.List greens() { return wrapperContained.greens; }
// public void greens(java.util.List value) { wrapperContained.greens = value; }
// public static java.util.List greens() { return net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.greens; }
// public static void greens(java.util.List value, ) { net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.greens = value; }

// public java.util.List alphas() { return wrapperContained.alphas; }
// public void alphas(java.util.List value) { wrapperContained.alphas = value; }
// public static java.util.List alphas() { return net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.alphas; }
// public static void alphas(java.util.List value, ) { net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.alphas = value; }

// public java.util.List blues() { return wrapperContained.blues; }
// public void blues(java.util.List value) { wrapperContained.blues = value; }
// public static java.util.List blues() { return net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.blues; }
// public static void blues(java.util.List value, ) { net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.blues = value; }

// public java.util.List reds() { return wrapperContained.reds; }
// public void reds(java.util.List value) { wrapperContained.reds = value; }
// public static java.util.List reds() { return net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.reds; }
// public static void reds(java.util.List value, ) { net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.reds = value; }

// public java.util.List positions() { return wrapperContained.positions; }
// public void positions(java.util.List value) { wrapperContained.positions = value; }
// public static java.util.List positions() { return net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.positions; }
// public static void positions(java.util.List value, ) { net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.positions = value; }

public void addBox(yarnwrap.util.math.BlockPos pos,float size,float red,float green,float blue,float alpha) { wrapperContained.addBox(pos.wrapperContained,size,red,green,blue,alpha); }
// public static void addBox(yarnwrap.util.math.BlockPos pos,float size,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer.addBox(pos.wrapperContained,size,red,green,blue,alpha); }

}