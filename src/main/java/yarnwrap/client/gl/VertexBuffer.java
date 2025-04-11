package yarnwrap.client.gl;
public class VertexBuffer { public net.minecraft.client.gl.VertexBuffer wrapperContained; public VertexBuffer(net.minecraft.client.gl.VertexBuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int indexCount() { return wrapperContained.indexCount; }
// public void indexCount(int value) { wrapperContained.indexCount = value; }
// public int vertexBufferId() { return wrapperContained.vertexBufferId; }
// public void vertexBufferId(int value) { wrapperContained.vertexBufferId = value; }
// public int indexBufferId() { return wrapperContained.indexBufferId; }
// public void indexBufferId(int value) { wrapperContained.indexBufferId = value; }
// public Object indexType() { return wrapperContained.indexType; }
// // public void indexType(Object value) { wrapperContained.indexType = value; }
// public Object drawMode() { return wrapperContained.drawMode; }
// // public void drawMode(Object value) { wrapperContained.drawMode = value; }
// public int vertexArrayId() { return wrapperContained.vertexArrayId; }
// public void vertexArrayId(int value) { wrapperContained.vertexArrayId = value; }
// public yarnwrap.client.render.VertexFormat vertexFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.vertexFormat); }
// public void vertexFormat(yarnwrap.client.render.VertexFormat value) { wrapperContained.vertexFormat = value.wrapperContained; }
// public Object sharedSequentialIndexBuffer() { return wrapperContained.sharedSequentialIndexBuffer; }
// // public void sharedSequentialIndexBuffer(Object value) { wrapperContained.sharedSequentialIndexBuffer = value; }
// public Object usage() { return wrapperContained.usage; }
// // public void usage(Object value) { wrapperContained.usage = value; }
// public VertexBuffer(Object usage) { this.wrapperContained = new net.minecraft.client.gl.VertexBuffer(usage); }
public void upload(yarnwrap.client.render.BuiltBuffer data) { wrapperContained.upload(data.wrapperContained); }
public void bind() { wrapperContained.bind(); }
public void unbind() { wrapperContained.unbind(); }
public void draw(org.joml.Matrix4f viewMatrix,org.joml.Matrix4f projectionMatrix,yarnwrap.client.gl.ShaderProgram program) { wrapperContained.draw(viewMatrix,projectionMatrix,program.wrapperContained); }
// public void drawInternal(org.joml.Matrix4f viewMatrix,org.joml.Matrix4f projectionMatrix,yarnwrap.client.gl.ShaderProgram shader) { wrapperContained.drawInternal(viewMatrix,projectionMatrix,shader.wrapperContained); }
public yarnwrap.client.render.VertexFormat getVertexFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.getVertexFormat()); }
public void draw() { wrapperContained.draw(); }
// public yarnwrap.client.render.VertexFormat uploadVertexBuffer(Object parameters,java.nio.ByteBuffer vertexBuffer) { return new yarnwrap.client.render.VertexFormat(wrapperContained.uploadVertexBuffer(parameters,vertexBuffer)); }
// public Object uploadIndexBuffer(Object parameters,java.nio.ByteBuffer indexBuffer) { return wrapperContained.uploadIndexBuffer(parameters,indexBuffer); }
public boolean isClosed() { return wrapperContained.isClosed(); }
// public Object getIndexType() { return wrapperContained.getIndexType(); }
// public void uploadIndexBuffer(Object indexBuffer) { wrapperContained.uploadIndexBuffer(indexBuffer); }

}