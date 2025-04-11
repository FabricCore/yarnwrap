package yarnwrap.client.render;
public class BufferBuilder { public net.minecraft.client.render.BufferBuilder wrapperContained; public BufferBuilder(net.minecraft.client.render.BufferBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int vertexCount() { return wrapperContained.vertexCount; }
// public void vertexCount(int value) { wrapperContained.vertexCount = value; }
// public boolean building() { return wrapperContained.building; }
// public void building(boolean value) { wrapperContained.building = value; }
// public yarnwrap.client.render.VertexFormat format() { return new yarnwrap.client.render.VertexFormat(wrapperContained.format); }
// public void format(yarnwrap.client.render.VertexFormat value) { wrapperContained.format = value.wrapperContained; }
// public boolean canSkipElementChecks() { return wrapperContained.canSkipElementChecks; }
// public void canSkipElementChecks(boolean value) { wrapperContained.canSkipElementChecks = value; }
// public boolean hasOverlay() { return wrapperContained.hasOverlay; }
// public void hasOverlay(boolean value) { wrapperContained.hasOverlay = value; }
// public boolean LITTLE_ENDIAN() { return wrapperContained.LITTLE_ENDIAN; }
// public void LITTLE_ENDIAN(boolean value) { wrapperContained.LITTLE_ENDIAN = value; }
// public yarnwrap.client.util.BufferAllocator allocator() { return new yarnwrap.client.util.BufferAllocator(wrapperContained.allocator); }
// public void allocator(yarnwrap.client.util.BufferAllocator value) { wrapperContained.allocator = value.wrapperContained; }
// public long vertexPointer() { return wrapperContained.vertexPointer; }
// public void vertexPointer(long value) { wrapperContained.vertexPointer = value; }
// public Object drawMode() { return wrapperContained.drawMode; }
// // public void drawMode(Object value) { wrapperContained.drawMode = value; }
// public int vertexSizeByte() { return wrapperContained.vertexSizeByte; }
// public void vertexSizeByte(int value) { wrapperContained.vertexSizeByte = value; }
// public int requiredMask() { return wrapperContained.requiredMask; }
// public void requiredMask(int value) { wrapperContained.requiredMask = value; }
// public int[] offsetsByElementId() { return wrapperContained.offsetsByElementId; }
// public void offsetsByElementId(int[] value) { wrapperContained.offsetsByElementId = value; }
// public int currentMask() { return wrapperContained.currentMask; }
// public void currentMask(int value) { wrapperContained.currentMask = value; }
// public BufferBuilder(yarnwrap.client.util.BufferAllocator allocator,Object drawMode,yarnwrap.client.render.VertexFormat format) { this.wrapperContained = new net.minecraft.client.render.BufferBuilder(allocator.wrapperContained,drawMode,format.wrapperContained); }
public yarnwrap.client.render.BuiltBuffer endNullable() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.endNullable()); }
// public byte floatToByte(float f) { return wrapperContained.floatToByte(f); }
// public void putColor(long pointer,int argb) { wrapperContained.putColor(pointer,argb); }
// public long beginElement(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.beginElement(element.wrapperContained); }
// public yarnwrap.client.render.VertexConsumer putUv(short u,short v,yarnwrap.client.render.VertexFormatElement element) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.putUv(u,v,element.wrapperContained)); }
public yarnwrap.client.render.BuiltBuffer end() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.end()); }
// public void putInt(long pointer,int i) { wrapperContained.putInt(pointer,i); }
// public void ensureBuilding() { wrapperContained.ensureBuilding(); }
// public yarnwrap.client.render.BuiltBuffer build() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.build()); }
// public long beginVertex() { return wrapperContained.beginVertex(); }
// public void endVertex() { wrapperContained.endVertex(); }

}