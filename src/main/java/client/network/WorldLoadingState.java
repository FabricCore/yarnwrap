package yarnwrap.client.network;
public class WorldLoadingState { public net.minecraft.client.network.WorldLoadingState wrapperContained; public WorldLoadingState(net.minecraft.client.network.WorldLoadingState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.renderer); }
// public Object currentStep() { return wrapperContained.currentStep; }
public void tick() { wrapperContained.tick(); }
public boolean isReady() { return wrapperContained.isReady(); }
public void handleChunksComingPacket() { wrapperContained.handleChunksComingPacket(); }

}