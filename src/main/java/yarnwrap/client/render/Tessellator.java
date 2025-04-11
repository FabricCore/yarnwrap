package yarnwrap.client.render;
public class Tessellator { public net.minecraft.client.render.Tessellator wrapperContained; public Tessellator(net.minecraft.client.render.Tessellator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.Tessellator INSTANCE() { return new yarnwrap.client.render.Tessellator(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.render.Tessellator value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public yarnwrap.client.util.BufferAllocator allocator() { return new yarnwrap.client.util.BufferAllocator(wrapperContained.allocator); }
// public void allocator(yarnwrap.client.util.BufferAllocator value) { wrapperContained.allocator = value.wrapperContained; }
public Tessellator(int bufferCapacity) { this.wrapperContained = new net.minecraft.client.render.Tessellator(bufferCapacity); }
public yarnwrap.client.render.Tessellator getInstance() { return new yarnwrap.client.render.Tessellator(wrapperContained.getInstance()); }
public void initialize() { wrapperContained.initialize(); }
// public yarnwrap.client.render.BufferBuilder begin(Object drawMode,yarnwrap.client.render.VertexFormat format) { return new yarnwrap.client.render.BufferBuilder(wrapperContained.begin(drawMode,format.wrapperContained)); }
public void clear() { wrapperContained.clear(); }

}