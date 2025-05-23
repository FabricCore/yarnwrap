package yarnwrap.client.render;
public class BufferBuilder { public net.minecraft.client.render.BufferBuilder wrapperContained; public BufferBuilder(net.minecraft.client.render.BufferBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int vertexCount() { return wrapperContained.vertexCount; }
// public void vertexCount(int value) { wrapperContained.vertexCount = value; }
// public static int vertexCount() { return net.minecraft.client.render.BufferBuilder.vertexCount; }
// public static void vertexCount(int value, ) { net.minecraft.client.render.BufferBuilder.vertexCount = value; }

// public boolean building() { return wrapperContained.building; }
// public void building(boolean value) { wrapperContained.building = value; }
// public static boolean building() { return net.minecraft.client.render.BufferBuilder.building; }
// public static void building(boolean value, ) { net.minecraft.client.render.BufferBuilder.building = value; }

// public com.mojang.blaze3d.vertex.VertexFormat vertexFormat() { return wrapperContained.vertexFormat; }
// public void vertexFormat(com.mojang.blaze3d.vertex.VertexFormat value) { wrapperContained.vertexFormat = value; }
// public static com.mojang.blaze3d.vertex.VertexFormat vertexFormat() { return net.minecraft.client.render.BufferBuilder.vertexFormat; }
// public static void vertexFormat(com.mojang.blaze3d.vertex.VertexFormat value, ) { net.minecraft.client.render.BufferBuilder.vertexFormat = value; }

// public boolean canSkipElementChecks() { return wrapperContained.canSkipElementChecks; }
// public void canSkipElementChecks(boolean value) { wrapperContained.canSkipElementChecks = value; }
// public static boolean canSkipElementChecks() { return net.minecraft.client.render.BufferBuilder.canSkipElementChecks; }
// public static void canSkipElementChecks(boolean value, ) { net.minecraft.client.render.BufferBuilder.canSkipElementChecks = value; }

// public boolean hasOverlay() { return wrapperContained.hasOverlay; }
// public void hasOverlay(boolean value) { wrapperContained.hasOverlay = value; }
// public static boolean hasOverlay() { return net.minecraft.client.render.BufferBuilder.hasOverlay; }
// public static void hasOverlay(boolean value, ) { net.minecraft.client.render.BufferBuilder.hasOverlay = value; }

// public boolean LITTLE_ENDIAN() { return wrapperContained.LITTLE_ENDIAN; }
// public void LITTLE_ENDIAN(boolean value) { wrapperContained.LITTLE_ENDIAN = value; }
// public static boolean LITTLE_ENDIAN() { return net.minecraft.client.render.BufferBuilder.LITTLE_ENDIAN; }
// public static void LITTLE_ENDIAN(boolean value, ) { net.minecraft.client.render.BufferBuilder.LITTLE_ENDIAN = value; }

// public yarnwrap.client.util.BufferAllocator allocator() { return new yarnwrap.client.util.BufferAllocator(wrapperContained.allocator); }
// public void allocator(yarnwrap.client.util.BufferAllocator value) { wrapperContained.allocator = value.wrapperContained; }
// public static yarnwrap.client.util.BufferAllocator allocator() { return new yarnwrap.client.util.BufferAllocator(net.minecraft.client.render.BufferBuilder.allocator); }
// public static void allocator(yarnwrap.client.util.BufferAllocator value, ) { net.minecraft.client.render.BufferBuilder.allocator = value.wrapperContained; }

// public long vertexPointer() { return wrapperContained.vertexPointer; }
// public void vertexPointer(long value) { wrapperContained.vertexPointer = value; }
// public static long vertexPointer() { return net.minecraft.client.render.BufferBuilder.vertexPointer; }
// public static void vertexPointer(long value, ) { net.minecraft.client.render.BufferBuilder.vertexPointer = value; }

// public Object drawMode() { return wrapperContained.drawMode; }
// // public void drawMode(Object value) { wrapperContained.drawMode = value; }
// // public static Object drawMode() { return net.minecraft.client.render.BufferBuilder.drawMode; }
// // public static void drawMode(Object value, ) { net.minecraft.client.render.BufferBuilder.drawMode = value; }

// public int vertexSizeByte() { return wrapperContained.vertexSizeByte; }
// public void vertexSizeByte(int value) { wrapperContained.vertexSizeByte = value; }
// public static int vertexSizeByte() { return net.minecraft.client.render.BufferBuilder.vertexSizeByte; }
// public static void vertexSizeByte(int value, ) { net.minecraft.client.render.BufferBuilder.vertexSizeByte = value; }

// public int requiredMask() { return wrapperContained.requiredMask; }
// public void requiredMask(int value) { wrapperContained.requiredMask = value; }
// public static int requiredMask() { return net.minecraft.client.render.BufferBuilder.requiredMask; }
// public static void requiredMask(int value, ) { net.minecraft.client.render.BufferBuilder.requiredMask = value; }

// public int[] offsetsByElementId() { return wrapperContained.offsetsByElementId; }
// public void offsetsByElementId(int[] value) { wrapperContained.offsetsByElementId = value; }
// public static int[] offsetsByElementId() { return net.minecraft.client.render.BufferBuilder.offsetsByElementId; }
// public static void offsetsByElementId(int[] value, ) { net.minecraft.client.render.BufferBuilder.offsetsByElementId = value; }

// public int currentMask() { return wrapperContained.currentMask; }
// public void currentMask(int value) { wrapperContained.currentMask = value; }
// public static int currentMask() { return net.minecraft.client.render.BufferBuilder.currentMask; }
// public static void currentMask(int value, ) { net.minecraft.client.render.BufferBuilder.currentMask = value; }

// public BufferBuilder(yarnwrap.client.util.BufferAllocator allocator,Object drawMode,com.mojang.blaze3d.vertex.VertexFormat vertexFormat) { this.wrapperContained = new net.minecraft.client.render.BufferBuilder(allocator.wrapperContained,drawMode,vertexFormat); }
public yarnwrap.client.render.BuiltBuffer endNullable() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.endNullable()); }
// public static yarnwrap.client.render.BuiltBuffer endNullable() { return new yarnwrap.client.render.BuiltBuffer(net.minecraft.client.render.BufferBuilder.endNullable()); }
// public byte floatToByte(float f) { return wrapperContained.floatToByte(f); }
// public static byte floatToByte(float f, ) { return net.minecraft.client.render.BufferBuilder.floatToByte(f); }
// public void putColor(long pointer,int argb) { wrapperContained.putColor(pointer,argb); }
// public static void putColor(long pointer,int argb, ) { net.minecraft.client.render.BufferBuilder.putColor(pointer,argb); }
// public long beginElement(com.mojang.blaze3d.vertex.VertexFormatElement element) { return wrapperContained.beginElement(element); }
// public static long beginElement(com.mojang.blaze3d.vertex.VertexFormatElement element, ) { return net.minecraft.client.render.BufferBuilder.beginElement(element); }
// public yarnwrap.client.render.VertexConsumer uv(short u,short v,com.mojang.blaze3d.vertex.VertexFormatElement element) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.uv(u,v,element)); }
// public static yarnwrap.client.render.VertexConsumer uv(short u,short v,com.mojang.blaze3d.vertex.VertexFormatElement element, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.BufferBuilder.uv(u,v,element)); }
public yarnwrap.client.render.BuiltBuffer end() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.end()); }
// public static yarnwrap.client.render.BuiltBuffer end() { return new yarnwrap.client.render.BuiltBuffer(net.minecraft.client.render.BufferBuilder.end()); }
// public void putInt(long pointer,int i) { wrapperContained.putInt(pointer,i); }
// public static void putInt(long pointer,int i, ) { net.minecraft.client.render.BufferBuilder.putInt(pointer,i); }
// public void ensureBuilding() { wrapperContained.ensureBuilding(); }
// public static void ensureBuilding() { net.minecraft.client.render.BufferBuilder.ensureBuilding(); }
// public yarnwrap.client.render.BuiltBuffer build() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.build()); }
// public static yarnwrap.client.render.BuiltBuffer build() { return new yarnwrap.client.render.BuiltBuffer(net.minecraft.client.render.BufferBuilder.build()); }
// public long beginVertex() { return wrapperContained.beginVertex(); }
// public static long beginVertex() { return net.minecraft.client.render.BufferBuilder.beginVertex(); }
// public void endVertex() { wrapperContained.endVertex(); }
// public static void endVertex() { net.minecraft.client.render.BufferBuilder.endVertex(); }

}