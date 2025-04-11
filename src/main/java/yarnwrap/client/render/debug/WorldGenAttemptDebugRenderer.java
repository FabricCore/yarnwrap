package yarnwrap.client.render.debug;
public class WorldGenAttemptDebugRenderer { public net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer wrapperContained; public WorldGenAttemptDebugRenderer(net.minecraft.client.render.debug.WorldGenAttemptDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List sizes() { return wrapperContained.sizes; }
// public void sizes(java.util.List value) { wrapperContained.sizes = value; }
// public java.util.List greens() { return wrapperContained.greens; }
// public void greens(java.util.List value) { wrapperContained.greens = value; }
// public java.util.List alphas() { return wrapperContained.alphas; }
// public void alphas(java.util.List value) { wrapperContained.alphas = value; }
// public java.util.List blues() { return wrapperContained.blues; }
// public void blues(java.util.List value) { wrapperContained.blues = value; }
// public java.util.List reds() { return wrapperContained.reds; }
// public void reds(java.util.List value) { wrapperContained.reds = value; }
// public java.util.List positions() { return wrapperContained.positions; }
// public void positions(java.util.List value) { wrapperContained.positions = value; }
public void addBox(yarnwrap.util.math.BlockPos pos,float size,float red,float green,float blue,float alpha) { wrapperContained.addBox(pos.wrapperContained,size,red,green,blue,alpha); }

}