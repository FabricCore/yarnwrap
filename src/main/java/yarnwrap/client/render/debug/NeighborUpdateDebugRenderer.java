package yarnwrap.client.render.debug;
public class NeighborUpdateDebugRenderer { public net.minecraft.client.render.debug.NeighborUpdateDebugRenderer wrapperContained; public NeighborUpdateDebugRenderer(net.minecraft.client.render.debug.NeighborUpdateDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Map neighborUpdates() { return wrapperContained.neighborUpdates; }
// public void neighborUpdates(java.util.Map value) { wrapperContained.neighborUpdates = value; }
// public NeighborUpdateDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.NeighborUpdateDebugRenderer(client.wrapperContained); }
// public java.util.Map method_30113(java.lang.Long time2) { return wrapperContained.method_30113(time2); }
public void addNeighborUpdate(long time,yarnwrap.util.math.BlockPos pos) { wrapperContained.addNeighborUpdate(time,pos.wrapperContained); }

}