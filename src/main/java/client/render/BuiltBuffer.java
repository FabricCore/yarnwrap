package yarnwrap.client.render;
public class BuiltBuffer { public net.minecraft.client.render.BuiltBuffer wrapperContained; public BuiltBuffer(net.minecraft.client.render.BuiltBuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object buffer() { return wrapperContained.buffer; }
// public Object sortedBuffer() { return wrapperContained.sortedBuffer; }
// public Object drawParameters() { return wrapperContained.drawParameters; }
public java.nio.ByteBuffer getBuffer() { return wrapperContained.getBuffer(); }
// public Object sortQuads(yarnwrap.client.util.BufferAllocator allocator,net.minecraft.class_8251 sorter) { return wrapperContained.sortQuads(allocator.wrapperContained,sorter); }
// public org.joml.Vector3f[] collectCentroids(java.nio.ByteBuffer buf,int vertexCount,yarnwrap.client.render.VertexFormat format) { return wrapperContained.collectCentroids(buf,vertexCount,format.wrapperContained); }
public java.nio.ByteBuffer getSortedBuffer() { return wrapperContained.getSortedBuffer(); }
public Object getDrawParameters() { return wrapperContained.getDrawParameters(); }

}