package yarnwrap.client.gl;
public class VertexBuffer { public net.minecraft.client.gl.VertexBuffer wrapperContained; public VertexBuffer(net.minecraft.client.gl.VertexBuffer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int indexCount() { return wrapperContained.indexCount; }
// public int vertexBufferId() { return wrapperContained.vertexBufferId; }
// public int indexBufferId() { return wrapperContained.indexBufferId; }
// public Object indexType() { return wrapperContained.indexType; }
// public Object drawMode() { return wrapperContained.drawMode; }
// public int vertexArrayId() { return wrapperContained.vertexArrayId; }
// public yarnwrap.client.render.VertexFormat vertexFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.vertexFormat); }
// public Object sharedSequentialIndexBuffer() { return wrapperContained.sharedSequentialIndexBuffer; }
// public Object usage() { return wrapperContained.usage; }
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