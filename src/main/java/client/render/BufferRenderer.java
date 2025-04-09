package yarnwrap.client.render;
public class BufferRenderer { public net.minecraft.client.render.BufferRenderer wrapperContained; public BufferRenderer(net.minecraft.client.render.BufferRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.VertexBuffer currentVertexBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.currentVertexBuffer); }
public void reset() { wrapperContained.reset(); }
public void drawWithGlobalProgram(yarnwrap.client.render.BuiltBuffer buffer) { wrapperContained.drawWithGlobalProgram(buffer.wrapperContained); }
// public void bind(yarnwrap.client.gl.VertexBuffer vertexBuffer) { wrapperContained.bind(vertexBuffer.wrapperContained); }
// public yarnwrap.client.gl.VertexBuffer bind(yarnwrap.client.render.VertexFormat vertexFormat) { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.bind(vertexFormat.wrapperContained)); }
public void resetCurrentVertexBuffer() { wrapperContained.resetCurrentVertexBuffer(); }
public void draw(yarnwrap.client.render.BuiltBuffer buffer) { wrapperContained.draw(buffer.wrapperContained); }
// public void drawWithGlobalProgramInternal(yarnwrap.client.render.BuiltBuffer buffer) { wrapperContained.drawWithGlobalProgramInternal(buffer.wrapperContained); }
// public yarnwrap.client.gl.VertexBuffer upload(yarnwrap.client.render.BuiltBuffer buffer) { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.upload(buffer.wrapperContained)); }

}