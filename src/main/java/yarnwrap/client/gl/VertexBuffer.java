package yarnwrap.client.gl;
public class VertexBuffer { public net.minecraft.client.gl.VertexBuffer wrapperContained; public VertexBuffer(net.minecraft.client.gl.VertexBuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int indexCount() { return wrapperContained.indexCount; }
// public void indexCount(int value) { wrapperContained.indexCount = value; }
// public static int indexCount() { return net.minecraft.client.gl.VertexBuffer.indexCount; }
// public static void indexCount(int value, ) { net.minecraft.client.gl.VertexBuffer.indexCount = value; }

// public int vertexBufferId() { return wrapperContained.vertexBufferId; }
// public void vertexBufferId(int value) { wrapperContained.vertexBufferId = value; }
// public static int vertexBufferId() { return net.minecraft.client.gl.VertexBuffer.vertexBufferId; }
// public static void vertexBufferId(int value, ) { net.minecraft.client.gl.VertexBuffer.vertexBufferId = value; }

// public int indexBufferId() { return wrapperContained.indexBufferId; }
// public void indexBufferId(int value) { wrapperContained.indexBufferId = value; }
// public static int indexBufferId() { return net.minecraft.client.gl.VertexBuffer.indexBufferId; }
// public static void indexBufferId(int value, ) { net.minecraft.client.gl.VertexBuffer.indexBufferId = value; }

// public Object indexType() { return wrapperContained.indexType; }
// // public void indexType(Object value) { wrapperContained.indexType = value; }
// // public static Object indexType() { return net.minecraft.client.gl.VertexBuffer.indexType; }
// // public static void indexType(Object value, ) { net.minecraft.client.gl.VertexBuffer.indexType = value; }

// public Object drawMode() { return wrapperContained.drawMode; }
// // public void drawMode(Object value) { wrapperContained.drawMode = value; }
// // public static Object drawMode() { return net.minecraft.client.gl.VertexBuffer.drawMode; }
// // public static void drawMode(Object value, ) { net.minecraft.client.gl.VertexBuffer.drawMode = value; }

// public int vertexArrayId() { return wrapperContained.vertexArrayId; }
// public void vertexArrayId(int value) { wrapperContained.vertexArrayId = value; }
// public static int vertexArrayId() { return net.minecraft.client.gl.VertexBuffer.vertexArrayId; }
// public static void vertexArrayId(int value, ) { net.minecraft.client.gl.VertexBuffer.vertexArrayId = value; }

// public yarnwrap.client.render.VertexFormat vertexFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.vertexFormat); }
// public void vertexFormat(yarnwrap.client.render.VertexFormat value) { wrapperContained.vertexFormat = value.wrapperContained; }
// public static yarnwrap.client.render.VertexFormat vertexFormat() { return new yarnwrap.client.render.VertexFormat(net.minecraft.client.gl.VertexBuffer.vertexFormat); }
// public static void vertexFormat(yarnwrap.client.render.VertexFormat value, ) { net.minecraft.client.gl.VertexBuffer.vertexFormat = value.wrapperContained; }

// public Object sharedSequentialIndexBuffer() { return wrapperContained.sharedSequentialIndexBuffer; }
// // public void sharedSequentialIndexBuffer(Object value) { wrapperContained.sharedSequentialIndexBuffer = value; }
// // public static Object sharedSequentialIndexBuffer() { return net.minecraft.client.gl.VertexBuffer.sharedSequentialIndexBuffer; }
// // public static void sharedSequentialIndexBuffer(Object value, ) { net.minecraft.client.gl.VertexBuffer.sharedSequentialIndexBuffer = value; }

// public Object usage() { return wrapperContained.usage; }
// // public void usage(Object value) { wrapperContained.usage = value; }
// // public static Object usage() { return net.minecraft.client.gl.VertexBuffer.usage; }
// // public static void usage(Object value, ) { net.minecraft.client.gl.VertexBuffer.usage = value; }

// public VertexBuffer(Object usage) { this.wrapperContained = new net.minecraft.client.gl.VertexBuffer(usage); }
public void upload(yarnwrap.client.render.BuiltBuffer data) { wrapperContained.upload(data.wrapperContained); }
// public static void upload(yarnwrap.client.render.BuiltBuffer data, ) { net.minecraft.client.gl.VertexBuffer.upload(data.wrapperContained); }
public void bind() { wrapperContained.bind(); }
// public static void bind() { net.minecraft.client.gl.VertexBuffer.bind(); }
// public void unbind() { wrapperContained.unbind(); }
public static void unbind() { net.minecraft.client.gl.VertexBuffer.unbind(); }
public void draw(org.joml.Matrix4f viewMatrix,org.joml.Matrix4f projectionMatrix,yarnwrap.client.gl.ShaderProgram program) { wrapperContained.draw(viewMatrix,projectionMatrix,program.wrapperContained); }
// public static void draw(org.joml.Matrix4f viewMatrix,org.joml.Matrix4f projectionMatrix,yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.gl.VertexBuffer.draw(viewMatrix,projectionMatrix,program.wrapperContained); }
// public void drawInternal(org.joml.Matrix4f viewMatrix,org.joml.Matrix4f projectionMatrix,yarnwrap.client.gl.ShaderProgram shader) { wrapperContained.drawInternal(viewMatrix,projectionMatrix,shader.wrapperContained); }
// public static void drawInternal(org.joml.Matrix4f viewMatrix,org.joml.Matrix4f projectionMatrix,yarnwrap.client.gl.ShaderProgram shader, ) { net.minecraft.client.gl.VertexBuffer.drawInternal(viewMatrix,projectionMatrix,shader.wrapperContained); }
public yarnwrap.client.render.VertexFormat getVertexFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.getVertexFormat()); }
// public static yarnwrap.client.render.VertexFormat getVertexFormat() { return new yarnwrap.client.render.VertexFormat(net.minecraft.client.gl.VertexBuffer.getVertexFormat()); }
public void draw() { wrapperContained.draw(); }
// public static void draw() { net.minecraft.client.gl.VertexBuffer.draw(); }
// public yarnwrap.client.render.VertexFormat uploadVertexBuffer(Object parameters,java.nio.ByteBuffer vertexBuffer) { return new yarnwrap.client.render.VertexFormat(wrapperContained.uploadVertexBuffer(parameters,vertexBuffer)); }
// public static yarnwrap.client.render.VertexFormat uploadVertexBuffer(Object parameters,java.nio.ByteBuffer vertexBuffer, ) { return new yarnwrap.client.render.VertexFormat(net.minecraft.client.gl.VertexBuffer.uploadVertexBuffer(parameters,vertexBuffer)); }
// public Object uploadIndexBuffer(Object parameters,java.nio.ByteBuffer indexBuffer) { return wrapperContained.uploadIndexBuffer(parameters,indexBuffer); }
// public static Object uploadIndexBuffer(Object parameters,java.nio.ByteBuffer indexBuffer, ) { return net.minecraft.client.gl.VertexBuffer.uploadIndexBuffer(parameters,indexBuffer); }
public boolean isClosed() { return wrapperContained.isClosed(); }
// public static boolean isClosed() { return net.minecraft.client.gl.VertexBuffer.isClosed(); }
// public Object getIndexType() { return wrapperContained.getIndexType(); }
// public static Object getIndexType() { return net.minecraft.client.gl.VertexBuffer.getIndexType(); }
// public void uploadIndexBuffer(Object indexBuffer) { wrapperContained.uploadIndexBuffer(indexBuffer); }
// public static void uploadIndexBuffer(Object indexBuffer, ) { net.minecraft.client.gl.VertexBuffer.uploadIndexBuffer(indexBuffer); }

}