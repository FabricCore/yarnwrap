package yarnwrap.client.network;
public class WorldLoadingState { public net.minecraft.client.network.WorldLoadingState wrapperContained; public WorldLoadingState(net.minecraft.client.network.WorldLoadingState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.renderer); }
// public void renderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.renderer = value.wrapperContained; }
// public Object currentStep() { return wrapperContained.currentStep; }
// // public void currentStep(Object value) { wrapperContained.currentStep = value; }
public void tick() { wrapperContained.tick(); }
public boolean isReady() { return wrapperContained.isReady(); }
public void handleChunksComingPacket() { wrapperContained.handleChunksComingPacket(); }

}