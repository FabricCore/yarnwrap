package yarnwrap.client.render.debug;
public class WorldGenAttemptDebugRenderer { public net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer wrapperContained; public WorldGenAttemptDebugRenderer(net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List sizes() { return wrapperContained.sizes; }
// public java.util.List greens() { return wrapperContained.greens; }
// public java.util.List alphas() { return wrapperContained.alphas; }
// public java.util.List blues() { return wrapperContained.blues; }
// public java.util.List reds() { return wrapperContained.reds; }
// public java.util.List positions() { return wrapperContained.positions; }
public void addBox(yarnwrap.util.math.BlockPos pos,float size,float red,float green,float blue,float alpha) { wrapperContained.addBox(pos.wrapperContained,size,red,green,blue,alpha); }

}