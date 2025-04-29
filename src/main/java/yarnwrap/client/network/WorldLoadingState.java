package yarnwrap.client.network;
public class WorldLoadingState { public net.minecraft.client.network.WorldLoadingState wrapperContained; public WorldLoadingState(net.minecraft.client.network.WorldLoadingState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(net.minecraft.client.network.WorldLoadingState.player); }
// public static void player(yarnwrap.client.network.ClientPlayerEntity value, ) { net.minecraft.client.network.WorldLoadingState.player = value.wrapperContained; }

// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.network.WorldLoadingState.world); }
// public static void world(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.network.WorldLoadingState.world = value.wrapperContained; }

// public yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.renderer); }
// public void renderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.renderer = value.wrapperContained; }
// public static yarnwrap.client.render.WorldRenderer renderer() { return new yarnwrap.client.render.WorldRenderer(net.minecraft.client.network.WorldLoadingState.renderer); }
// public static void renderer(yarnwrap.client.render.WorldRenderer value, ) { net.minecraft.client.network.WorldLoadingState.renderer = value.wrapperContained; }

// public Object currentStep() { return wrapperContained.currentStep; }
// // public void currentStep(Object value) { wrapperContained.currentStep = value; }
// // public static Object currentStep() { return net.minecraft.client.network.WorldLoadingState.currentStep; }
// // public static void currentStep(Object value, ) { net.minecraft.client.network.WorldLoadingState.currentStep = value; }

public WorldLoadingState(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.client.world.ClientWorld world,yarnwrap.client.render.WorldRenderer renderer) { this.wrapperContained = new net.minecraft.client.network.WorldLoadingState(player.wrapperContained,world.wrapperContained,renderer.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.network.WorldLoadingState.tick(); }
public boolean isReady() { return wrapperContained.isReady(); }
// public static boolean isReady() { return net.minecraft.client.network.WorldLoadingState.isReady(); }
public void handleChunksComingPacket() { wrapperContained.handleChunksComingPacket(); }
// public static void handleChunksComingPacket() { net.minecraft.client.network.WorldLoadingState.handleChunksComingPacket(); }

}