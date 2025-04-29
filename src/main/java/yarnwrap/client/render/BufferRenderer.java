package yarnwrap.client.render;
public class BufferRenderer { public net.minecraft.client.render.BufferRenderer wrapperContained; public BufferRenderer(net.minecraft.client.render.BufferRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.VertexBuffer currentVertexBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.currentVertexBuffer); }
// public void currentVertexBuffer(yarnwrap.client.gl.VertexBuffer value) { wrapperContained.currentVertexBuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.VertexBuffer currentVertexBuffer() { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.BufferRenderer.currentVertexBuffer); }
// public static void currentVertexBuffer(yarnwrap.client.gl.VertexBuffer value, ) { net.minecraft.client.render.BufferRenderer.currentVertexBuffer = value.wrapperContained; }

// public void reset() { wrapperContained.reset(); }
public static void reset() { net.minecraft.client.render.BufferRenderer.reset(); }
// public void drawWithGlobalProgram(yarnwrap.client.render.BuiltBuffer buffer) { wrapperContained.drawWithGlobalProgram(buffer.wrapperContained); }
// public static void drawWithGlobalProgram(yarnwrap.client.render.BuiltBuffer buffer, ) { net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(buffer.wrapperContained); }
// public void bind(yarnwrap.client.gl.VertexBuffer vertexBuffer) { wrapperContained.bind(vertexBuffer.wrapperContained); }
// public static void bind(yarnwrap.client.gl.VertexBuffer vertexBuffer, ) { net.minecraft.client.render.BufferRenderer.bind(vertexBuffer.wrapperContained); }
// public yarnwrap.client.gl.VertexBuffer bind(yarnwrap.client.render.VertexFormat vertexFormat) { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.bind(vertexFormat.wrapperContained)); }
// public static yarnwrap.client.gl.VertexBuffer bind(yarnwrap.client.render.VertexFormat vertexFormat, ) { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.BufferRenderer.bind(vertexFormat.wrapperContained)); }
// public void resetCurrentVertexBuffer() { wrapperContained.resetCurrentVertexBuffer(); }
public static void resetCurrentVertexBuffer() { net.minecraft.client.render.BufferRenderer.resetCurrentVertexBuffer(); }
// public void draw(yarnwrap.client.render.BuiltBuffer buffer) { wrapperContained.draw(buffer.wrapperContained); }
// public static void draw(yarnwrap.client.render.BuiltBuffer buffer, ) { net.minecraft.client.render.BufferRenderer.draw(buffer.wrapperContained); }
// public void drawWithGlobalProgramInternal(yarnwrap.client.render.BuiltBuffer buffer) { wrapperContained.drawWithGlobalProgramInternal(buffer.wrapperContained); }
// public static void drawWithGlobalProgramInternal(yarnwrap.client.render.BuiltBuffer buffer, ) { net.minecraft.client.render.BufferRenderer.drawWithGlobalProgramInternal(buffer.wrapperContained); }
// public yarnwrap.client.gl.VertexBuffer upload(yarnwrap.client.render.BuiltBuffer buffer) { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.upload(buffer.wrapperContained)); }
// public static yarnwrap.client.gl.VertexBuffer upload(yarnwrap.client.render.BuiltBuffer buffer, ) { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.BufferRenderer.upload(buffer.wrapperContained)); }

}