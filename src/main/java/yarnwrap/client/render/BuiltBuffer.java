package yarnwrap.client.render;
public class BuiltBuffer { public net.minecraft.client.render.BuiltBuffer wrapperContained; public BuiltBuffer(net.minecraft.client.render.BuiltBuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object buffer() { return wrapperContained.buffer; }
// // public void buffer(Object value) { wrapperContained.buffer = value; }
// // public static Object buffer() { return net.minecraft.client.render.BuiltBuffer.buffer; }
// // public static void buffer(Object value, ) { net.minecraft.client.render.BuiltBuffer.buffer = value; }

// public Object sortedBuffer() { return wrapperContained.sortedBuffer; }
// // public void sortedBuffer(Object value) { wrapperContained.sortedBuffer = value; }
// // public static Object sortedBuffer() { return net.minecraft.client.render.BuiltBuffer.sortedBuffer; }
// // public static void sortedBuffer(Object value, ) { net.minecraft.client.render.BuiltBuffer.sortedBuffer = value; }

// public Object drawParameters() { return wrapperContained.drawParameters; }
// // public void drawParameters(Object value) { wrapperContained.drawParameters = value; }
// // public static Object drawParameters() { return net.minecraft.client.render.BuiltBuffer.drawParameters; }
// // public static void drawParameters(Object value, ) { net.minecraft.client.render.BuiltBuffer.drawParameters = value; }

// public BuiltBuffer(Object buffer,Object drawParameters) { this.wrapperContained = new net.minecraft.client.render.BuiltBuffer(buffer,drawParameters); }
public java.nio.ByteBuffer getBuffer() { return wrapperContained.getBuffer(); }
// public static java.nio.ByteBuffer getBuffer() { return net.minecraft.client.render.BuiltBuffer.getBuffer(); }
// public Object sortQuads(yarnwrap.client.util.BufferAllocator allocator,net.minecraft.class_8251 sorter) { return wrapperContained.sortQuads(allocator.wrapperContained,sorter); }
// // public static Object sortQuads(yarnwrap.client.util.BufferAllocator allocator,net.minecraft.class_8251 sorter, ) { return net.minecraft.client.render.BuiltBuffer.sortQuads(allocator.wrapperContained,sorter); }
// public org.joml.Vector3f[] collectCentroids(java.nio.ByteBuffer buffer,int vertexCount,com.mojang.blaze3d.vertex.VertexFormat format) { return wrapperContained.collectCentroids(buffer,vertexCount,format); }
// public static org.joml.Vector3f[] collectCentroids(java.nio.ByteBuffer buffer,int vertexCount,com.mojang.blaze3d.vertex.VertexFormat format, ) { return net.minecraft.client.render.BuiltBuffer.collectCentroids(buffer,vertexCount,format); }
public java.nio.ByteBuffer getSortedBuffer() { return wrapperContained.getSortedBuffer(); }
// public static java.nio.ByteBuffer getSortedBuffer() { return net.minecraft.client.render.BuiltBuffer.getSortedBuffer(); }
public Object getDrawParameters() { return wrapperContained.getDrawParameters(); }
// public static Object getDrawParameters() { return net.minecraft.client.render.BuiltBuffer.getDrawParameters(); }

}