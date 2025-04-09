package yarnwrap.client.render;
public class BufferBuilder { public net.minecraft.client.render.BufferBuilder wrapperContained; public BufferBuilder(net.minecraft.client.render.BufferBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public int vertexCount() { return wrapperContained.vertexCount; }
// public boolean building() { return wrapperContained.building; }
// public yarnwrap.client.render.VertexFormat format() { return new yarnwrap.client.render.VertexFormat(wrapperContained.format); }
// public boolean canSkipElementChecks() { return wrapperContained.canSkipElementChecks; }
// public boolean hasOverlay() { return wrapperContained.hasOverlay; }
// public boolean LITTLE_ENDIAN() { return wrapperContained.LITTLE_ENDIAN; }
// public yarnwrap.client.util.BufferAllocator allocator() { return new yarnwrap.client.util.BufferAllocator(wrapperContained.allocator); }
// public long vertexPointer() { return wrapperContained.vertexPointer; }
// public Object drawMode() { return wrapperContained.drawMode; }
// public int vertexSizeByte() { return wrapperContained.vertexSizeByte; }
// public int requiredMask() { return wrapperContained.requiredMask; }
// public int[] offsetsByElementId() { return wrapperContained.offsetsByElementId; }
// public int currentMask() { return wrapperContained.currentMask; }
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