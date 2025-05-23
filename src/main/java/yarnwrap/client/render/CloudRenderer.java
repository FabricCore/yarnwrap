package yarnwrap.client.render;
public class CloudRenderer { public net.minecraft.client.render.CloudRenderer wrapperContained; public CloudRenderer(net.minecraft.client.render.CloudRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.CloudRenderer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.CloudRenderer.LOGGER = value; }

// public yarnwrap.util.Identifier CLOUD_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CLOUD_TEXTURE); }
// public void CLOUD_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CLOUD_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier CLOUD_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.CloudRenderer.CLOUD_TEXTURE); }
// public static void CLOUD_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.CloudRenderer.CLOUD_TEXTURE = value.wrapperContained; }

// public boolean rebuild() { return wrapperContained.rebuild; }
// public void rebuild(boolean value) { wrapperContained.rebuild = value; }
// public static boolean rebuild() { return net.minecraft.client.render.CloudRenderer.rebuild; }
// public static void rebuild(boolean value, ) { net.minecraft.client.render.CloudRenderer.rebuild = value; }

// public int centerX() { return wrapperContained.centerX; }
// public void centerX(int value) { wrapperContained.centerX = value; }
// public static int centerX() { return net.minecraft.client.render.CloudRenderer.centerX; }
// public static void centerX(int value, ) { net.minecraft.client.render.CloudRenderer.centerX = value; }

// public int centerZ() { return wrapperContained.centerZ; }
// public void centerZ(int value) { wrapperContained.centerZ = value; }
// public static int centerZ() { return net.minecraft.client.render.CloudRenderer.centerZ; }
// public static void centerZ(int value, ) { net.minecraft.client.render.CloudRenderer.centerZ = value; }

// public Object viewMode() { return wrapperContained.viewMode; }
// // public void viewMode(Object value) { wrapperContained.viewMode = value; }
// // public static Object viewMode() { return net.minecraft.client.render.CloudRenderer.viewMode; }
// // public static void viewMode(Object value, ) { net.minecraft.client.render.CloudRenderer.viewMode = value; }

// public yarnwrap.client.option.CloudRenderMode renderMode() { return new yarnwrap.client.option.CloudRenderMode(wrapperContained.renderMode); }
// public void renderMode(yarnwrap.client.option.CloudRenderMode value) { wrapperContained.renderMode = value.wrapperContained; }
// public static yarnwrap.client.option.CloudRenderMode renderMode() { return new yarnwrap.client.option.CloudRenderMode(net.minecraft.client.render.CloudRenderer.renderMode); }
// public static void renderMode(yarnwrap.client.option.CloudRenderMode value, ) { net.minecraft.client.render.CloudRenderer.renderMode = value.wrapperContained; }

// public Object cells() { return wrapperContained.cells; }
// // public void cells(Object value) { wrapperContained.cells = value; }
// // public static Object cells() { return net.minecraft.client.render.CloudRenderer.cells; }
// // public static void cells(Object value, ) { net.minecraft.client.render.CloudRenderer.cells = value; }

// public Object indexBuffer() { return wrapperContained.indexBuffer; }
// // public void indexBuffer(Object value) { wrapperContained.indexBuffer = value; }
// // public static Object indexBuffer() { return net.minecraft.client.render.CloudRenderer.indexBuffer; }
// // public static void indexBuffer(Object value, ) { net.minecraft.client.render.CloudRenderer.indexBuffer = value; }

// public yarnwrap.client.gl.MappableRingBuffer cloudInfoBuffer() { return new yarnwrap.client.gl.MappableRingBuffer(wrapperContained.cloudInfoBuffer); }
// public void cloudInfoBuffer(yarnwrap.client.gl.MappableRingBuffer value) { wrapperContained.cloudInfoBuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.MappableRingBuffer cloudInfoBuffer() { return new yarnwrap.client.gl.MappableRingBuffer(net.minecraft.client.render.CloudRenderer.cloudInfoBuffer); }
// public static void cloudInfoBuffer(yarnwrap.client.gl.MappableRingBuffer value, ) { net.minecraft.client.render.CloudRenderer.cloudInfoBuffer = value.wrapperContained; }

// public yarnwrap.client.gl.MappableRingBuffer cloudFacesBuffer() { return new yarnwrap.client.gl.MappableRingBuffer(wrapperContained.cloudFacesBuffer); }
// public void cloudFacesBuffer(yarnwrap.client.gl.MappableRingBuffer value) { wrapperContained.cloudFacesBuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.MappableRingBuffer cloudFacesBuffer() { return new yarnwrap.client.gl.MappableRingBuffer(net.minecraft.client.render.CloudRenderer.cloudFacesBuffer); }
// public static void cloudFacesBuffer(yarnwrap.client.gl.MappableRingBuffer value, ) { net.minecraft.client.render.CloudRenderer.cloudFacesBuffer = value.wrapperContained; }

// public int UBO_SIZE() { return wrapperContained.UBO_SIZE; }
// public void UBO_SIZE(int value) { wrapperContained.UBO_SIZE = value; }
// public static int UBO_SIZE() { return net.minecraft.client.render.CloudRenderer.UBO_SIZE; }
// public static void UBO_SIZE(int value, ) { net.minecraft.client.render.CloudRenderer.UBO_SIZE = value; }

// public int instanceCount() { return wrapperContained.instanceCount; }
// public void instanceCount(int value) { wrapperContained.instanceCount = value; }
// public static int instanceCount() { return net.minecraft.client.render.CloudRenderer.instanceCount; }
// public static void instanceCount(int value, ) { net.minecraft.client.render.CloudRenderer.instanceCount = value; }

public void scheduleTerrainUpdate() { wrapperContained.scheduleTerrainUpdate(); }
// public static void scheduleTerrainUpdate() { net.minecraft.client.render.CloudRenderer.scheduleTerrainUpdate(); }
// public boolean isEmpty(int color) { return wrapperContained.isEmpty(color); }
// public static boolean isEmpty(int color, ) { return net.minecraft.client.render.CloudRenderer.isEmpty(color); }
public void renderClouds(int color,yarnwrap.client.option.CloudRenderMode mode,float cloudHeight,yarnwrap.util.math.Vec3d cameraPos,float cloudsHeight) { wrapperContained.renderClouds(color,mode.wrapperContained,cloudHeight,cameraPos.wrapperContained,cloudsHeight); }
// public static void renderClouds(int color,yarnwrap.client.option.CloudRenderMode mode,float cloudHeight,yarnwrap.util.math.Vec3d cameraPos,float cloudsHeight, ) { net.minecraft.client.render.CloudRenderer.renderClouds(color,mode.wrapperContained,cloudHeight,cameraPos.wrapperContained,cloudsHeight); }
// public long packCloudCell(int color,boolean borderNorth,boolean borderEast,boolean borderSouth,boolean borderWest) { return wrapperContained.packCloudCell(color,borderNorth,borderEast,borderSouth,borderWest); }
// public static long packCloudCell(int color,boolean borderNorth,boolean borderEast,boolean borderSouth,boolean borderWest, ) { return net.minecraft.client.render.CloudRenderer.packCloudCell(color,borderNorth,borderEast,borderSouth,borderWest); }
// public void buildCloudCellFast(java.nio.ByteBuffer color,int x) { wrapperContained.buildCloudCellFast(color,x); }
// public static void buildCloudCellFast(java.nio.ByteBuffer color,int x, ) { net.minecraft.client.render.CloudRenderer.buildCloudCellFast(color,x); }
// public void buildCloudCellFancy(Object viewMode) { wrapperContained.buildCloudCellFancy(viewMode); }
// public static void buildCloudCellFancy(Object viewMode, ) { net.minecraft.client.render.CloudRenderer.buildCloudCellFancy(viewMode); }
// public void buildCloudCells(Object viewMode,java.nio.ByteBuffer x,int z) { wrapperContained.buildCloudCells(viewMode,x,z); }
// public static void buildCloudCells(Object viewMode,java.nio.ByteBuffer x,int z, ) { net.minecraft.client.render.CloudRenderer.buildCloudCells(viewMode,x,z); }
// public boolean hasBorderNorth(long packed) { return wrapperContained.hasBorderNorth(packed); }
// public static boolean hasBorderNorth(long packed, ) { return net.minecraft.client.render.CloudRenderer.hasBorderNorth(packed); }
// public boolean hasBorderEast(long packed) { return wrapperContained.hasBorderEast(packed); }
// public static boolean hasBorderEast(long packed, ) { return net.minecraft.client.render.CloudRenderer.hasBorderEast(packed); }
// public boolean hasBorderSouth(long packed) { return wrapperContained.hasBorderSouth(packed); }
// public static boolean hasBorderSouth(long packed, ) { return net.minecraft.client.render.CloudRenderer.hasBorderSouth(packed); }
// public boolean hasBorderWest(long packed) { return wrapperContained.hasBorderWest(packed); }
// public static boolean hasBorderWest(long packed, ) { return net.minecraft.client.render.CloudRenderer.hasBorderWest(packed); }
// public void rotate() { wrapperContained.rotate(); }
// public static void rotate() { net.minecraft.client.render.CloudRenderer.rotate(); }
// public int calcCloudBufferSize(int cloudRange) { return wrapperContained.calcCloudBufferSize(cloudRange); }
// public static int calcCloudBufferSize(int cloudRange, ) { return net.minecraft.client.render.CloudRenderer.calcCloudBufferSize(cloudRange); }

}