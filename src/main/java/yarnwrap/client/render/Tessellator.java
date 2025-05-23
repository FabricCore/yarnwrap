package yarnwrap.client.render;
public class Tessellator { public net.minecraft.client.render.Tessellator wrapperContained; public Tessellator(net.minecraft.client.render.Tessellator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.Tessellator INSTANCE() { return new yarnwrap.client.render.Tessellator(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.render.Tessellator value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public static yarnwrap.client.render.Tessellator INSTANCE() { return new yarnwrap.client.render.Tessellator(net.minecraft.client.render.Tessellator.INSTANCE); }
// public static void INSTANCE(yarnwrap.client.render.Tessellator value, ) { net.minecraft.client.render.Tessellator.INSTANCE = value.wrapperContained; }

// public int MAX_BUFFER_SIZE() { return wrapperContained.MAX_BUFFER_SIZE; }
// public void MAX_BUFFER_SIZE(int value) { wrapperContained.MAX_BUFFER_SIZE = value; }
// public static int MAX_BUFFER_SIZE() { return net.minecraft.client.render.Tessellator.MAX_BUFFER_SIZE; }
// public static void MAX_BUFFER_SIZE(int value, ) { net.minecraft.client.render.Tessellator.MAX_BUFFER_SIZE = value; }

// public yarnwrap.client.util.BufferAllocator allocator() { return new yarnwrap.client.util.BufferAllocator(wrapperContained.allocator); }
// public void allocator(yarnwrap.client.util.BufferAllocator value) { wrapperContained.allocator = value.wrapperContained; }
// public static yarnwrap.client.util.BufferAllocator allocator() { return new yarnwrap.client.util.BufferAllocator(net.minecraft.client.render.Tessellator.allocator); }
// public static void allocator(yarnwrap.client.util.BufferAllocator value, ) { net.minecraft.client.render.Tessellator.allocator = value.wrapperContained; }

public Tessellator(int bufferCapacity) { this.wrapperContained = new net.minecraft.client.render.Tessellator(bufferCapacity); }
// public yarnwrap.client.render.Tessellator getInstance() { return new yarnwrap.client.render.Tessellator(wrapperContained.getInstance()); }
public static yarnwrap.client.render.Tessellator getInstance() { return new yarnwrap.client.render.Tessellator(net.minecraft.client.render.Tessellator.getInstance()); }
// public void initialize() { wrapperContained.initialize(); }
public static void initialize() { net.minecraft.client.render.Tessellator.initialize(); }
// public yarnwrap.client.render.BufferBuilder begin(Object drawMode,com.mojang.blaze3d.vertex.VertexFormat format) { return new yarnwrap.client.render.BufferBuilder(wrapperContained.begin(drawMode,format)); }
// public static yarnwrap.client.render.BufferBuilder begin(Object drawMode,com.mojang.blaze3d.vertex.VertexFormat format, ) { return new yarnwrap.client.render.BufferBuilder(net.minecraft.client.render.Tessellator.begin(drawMode,format)); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.Tessellator.clear(); }

}