package yarnwrap.client.render.debug;
public class NeighborUpdateDebugRenderer { public net.minecraft.client.render.debug.NeighborUpdateDebugRenderer wrapperContained; public NeighborUpdateDebugRenderer(net.minecraft.client.render.debug.NeighborUpdateDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Map neighborUpdates() { return wrapperContained.neighborUpdates; }
public void addNeighborUpdate(long time,yarnwrap.util.math.BlockPos pos) { wrapperContained.addNeighborUpdate(time,pos.wrapperContained); }

}