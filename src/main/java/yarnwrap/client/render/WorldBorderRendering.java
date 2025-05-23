package yarnwrap.client.render;
public class WorldBorderRendering { public net.minecraft.client.render.WorldBorderRendering wrapperContained; public WorldBorderRendering(net.minecraft.client.render.WorldBorderRendering wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier FORCEFIELD() { return new yarnwrap.util.Identifier(wrapperContained.FORCEFIELD); }
// public void FORCEFIELD(yarnwrap.util.Identifier value) { wrapperContained.FORCEFIELD = value.wrapperContained; }
public static yarnwrap.util.Identifier FORCEFIELD() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldBorderRendering.FORCEFIELD); }
// public static void FORCEFIELD(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldBorderRendering.FORCEFIELD = value.wrapperContained; }

// public boolean forceRefreshBuffers() { return wrapperContained.forceRefreshBuffers; }
// public void forceRefreshBuffers(boolean value) { wrapperContained.forceRefreshBuffers = value; }
// public static boolean forceRefreshBuffers() { return net.minecraft.client.render.WorldBorderRendering.forceRefreshBuffers; }
// public static void forceRefreshBuffers(boolean value, ) { net.minecraft.client.render.WorldBorderRendering.forceRefreshBuffers = value; }

// public double lastUploadedBoundWest() { return wrapperContained.lastUploadedBoundWest; }
// public void lastUploadedBoundWest(double value) { wrapperContained.lastUploadedBoundWest = value; }
// public static double lastUploadedBoundWest() { return net.minecraft.client.render.WorldBorderRendering.lastUploadedBoundWest; }
// public static void lastUploadedBoundWest(double value, ) { net.minecraft.client.render.WorldBorderRendering.lastUploadedBoundWest = value; }

// public double lastUploadedBoundNorth() { return wrapperContained.lastUploadedBoundNorth; }
// public void lastUploadedBoundNorth(double value) { wrapperContained.lastUploadedBoundNorth = value; }
// public static double lastUploadedBoundNorth() { return net.minecraft.client.render.WorldBorderRendering.lastUploadedBoundNorth; }
// public static void lastUploadedBoundNorth(double value, ) { net.minecraft.client.render.WorldBorderRendering.lastUploadedBoundNorth = value; }

// public com.mojang.blaze3d.buffers.GpuBuffer vertexBuffer() { return wrapperContained.vertexBuffer; }
// public void vertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value) { wrapperContained.vertexBuffer = value; }
// public static com.mojang.blaze3d.buffers.GpuBuffer vertexBuffer() { return net.minecraft.client.render.WorldBorderRendering.vertexBuffer; }
// public static void vertexBuffer(com.mojang.blaze3d.buffers.GpuBuffer value, ) { net.minecraft.client.render.WorldBorderRendering.vertexBuffer = value; }

// public double lastXMin() { return wrapperContained.lastXMin; }
// public void lastXMin(double value) { wrapperContained.lastXMin = value; }
// public static double lastXMin() { return net.minecraft.client.render.WorldBorderRendering.lastXMin; }
// public static void lastXMin(double value, ) { net.minecraft.client.render.WorldBorderRendering.lastXMin = value; }

// public double lastXMax() { return wrapperContained.lastXMax; }
// public void lastXMax(double value) { wrapperContained.lastXMax = value; }
// public static double lastXMax() { return net.minecraft.client.render.WorldBorderRendering.lastXMax; }
// public static void lastXMax(double value, ) { net.minecraft.client.render.WorldBorderRendering.lastXMax = value; }

// public double lastZMin() { return wrapperContained.lastZMin; }
// public void lastZMin(double value) { wrapperContained.lastZMin = value; }
// public static double lastZMin() { return net.minecraft.client.render.WorldBorderRendering.lastZMin; }
// public static void lastZMin(double value, ) { net.minecraft.client.render.WorldBorderRendering.lastZMin = value; }

// public double lastZMax() { return wrapperContained.lastZMax; }
// public void lastZMax(double value) { wrapperContained.lastZMax = value; }
// public static double lastZMax() { return net.minecraft.client.render.WorldBorderRendering.lastZMax; }
// public static void lastZMax(double value, ) { net.minecraft.client.render.WorldBorderRendering.lastZMax = value; }

// public Object indexBuffer() { return wrapperContained.indexBuffer; }
// // public void indexBuffer(Object value) { wrapperContained.indexBuffer = value; }
// // public static Object indexBuffer() { return net.minecraft.client.render.WorldBorderRendering.indexBuffer; }
// // public static void indexBuffer(Object value, ) { net.minecraft.client.render.WorldBorderRendering.indexBuffer = value; }

public void render(yarnwrap.world.border.WorldBorder border,yarnwrap.util.math.Vec3d cameraPos,double viewDistanceBlocks,double farPlaneDistance) { wrapperContained.render(border.wrapperContained,cameraPos.wrapperContained,viewDistanceBlocks,farPlaneDistance); }
// public static void render(yarnwrap.world.border.WorldBorder border,yarnwrap.util.math.Vec3d cameraPos,double viewDistanceBlocks,double farPlaneDistance, ) { net.minecraft.client.render.WorldBorderRendering.render(border.wrapperContained,cameraPos.wrapperContained,viewDistanceBlocks,farPlaneDistance); }
public void markBuffersDirty() { wrapperContained.markBuffersDirty(); }
// public static void markBuffersDirty() { net.minecraft.client.render.WorldBorderRendering.markBuffersDirty(); }
// public boolean shouldRefreshBuffers(yarnwrap.world.border.WorldBorder border) { return wrapperContained.shouldRefreshBuffers(border.wrapperContained); }
// public static boolean shouldRefreshBuffers(yarnwrap.world.border.WorldBorder border, ) { return net.minecraft.client.render.WorldBorderRendering.shouldRefreshBuffers(border.wrapperContained); }
// public void refreshDirectionBuffer(yarnwrap.world.border.WorldBorder border,double viewDistanceBlocks,double z,double x,float farPlaneDistance) { wrapperContained.refreshDirectionBuffer(border.wrapperContained,viewDistanceBlocks,z,x,farPlaneDistance); }
// public static void refreshDirectionBuffer(yarnwrap.world.border.WorldBorder border,double viewDistanceBlocks,double z,double x,float farPlaneDistance, ) { net.minecraft.client.render.WorldBorderRendering.refreshDirectionBuffer(border.wrapperContained,viewDistanceBlocks,z,x,farPlaneDistance); }

}