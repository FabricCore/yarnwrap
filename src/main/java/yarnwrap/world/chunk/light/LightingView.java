package yarnwrap.world.chunk.light;
public class LightingView { public net.minecraft.world.chunk.light.LightingView wrapperContained; public LightingView(net.minecraft.world.chunk.light.LightingView wrapperContained) { this.wrapperContained = wrapperContained; }

public void setColumnEnabled(yarnwrap.util.math.ChunkPos pos,boolean retainData) { wrapperContained.setColumnEnabled(pos.wrapperContained,retainData); }
// public static void setColumnEnabled(yarnwrap.util.math.ChunkPos pos,boolean retainData, ) { net.minecraft.world.chunk.light.LightingView.setColumnEnabled(pos.wrapperContained,retainData); }
public void checkBlock(yarnwrap.util.math.BlockPos pos) { wrapperContained.checkBlock(pos.wrapperContained); }
// public static void checkBlock(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.chunk.light.LightingView.checkBlock(pos.wrapperContained); }
public int doLightUpdates() { return wrapperContained.doLightUpdates(); }
// public static int doLightUpdates() { return net.minecraft.world.chunk.light.LightingView.doLightUpdates(); }
public boolean hasUpdates() { return wrapperContained.hasUpdates(); }
// public static boolean hasUpdates() { return net.minecraft.world.chunk.light.LightingView.hasUpdates(); }
public void setSectionStatus(yarnwrap.util.math.ChunkSectionPos pos,boolean notReady) { wrapperContained.setSectionStatus(pos.wrapperContained,notReady); }
// public static void setSectionStatus(yarnwrap.util.math.ChunkSectionPos pos,boolean notReady, ) { net.minecraft.world.chunk.light.LightingView.setSectionStatus(pos.wrapperContained,notReady); }
public void setSectionStatus(yarnwrap.util.math.BlockPos pos,boolean notReady) { wrapperContained.setSectionStatus(pos.wrapperContained,notReady); }
// public static void setSectionStatus(yarnwrap.util.math.BlockPos pos,boolean notReady, ) { net.minecraft.world.chunk.light.LightingView.setSectionStatus(pos.wrapperContained,notReady); }
public void propagateLight(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.propagateLight(chunkPos.wrapperContained); }
// public static void propagateLight(yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.world.chunk.light.LightingView.propagateLight(chunkPos.wrapperContained); }

}