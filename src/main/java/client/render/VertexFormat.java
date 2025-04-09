package yarnwrap.client.render;
public class VertexFormat { public net.minecraft.client.render.VertexFormat wrapperContained; public VertexFormat(net.minecraft.client.render.VertexFormat wrapperContained) { this.wrapperContained = wrapperContained; }

// public int vertexSizeByte() { return wrapperContained.vertexSizeByte; }
// public java.util.List elements() { return wrapperContained.elements; }
// public yarnwrap.client.gl.VertexBuffer buffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.buffer); }
// public java.util.List names() { return wrapperContained.names; }
// public int requiredMask() { return wrapperContained.requiredMask; }
// public int[] offsetsByElementId() { return wrapperContained.offsetsByElementId; }
public java.util.List getElements() { return wrapperContained.getElements(); }
public int getVertexSizeByte() { return wrapperContained.getVertexSizeByte(); }
public void setupState() { wrapperContained.setupState(); }
public void clearState() { wrapperContained.clearState(); }
public java.util.List getAttributeNames() { return wrapperContained.getAttributeNames(); }
// public void setupStateInternal() { wrapperContained.setupStateInternal(); }
// public void clearStateInternal() { wrapperContained.clearStateInternal(); }
public yarnwrap.client.gl.VertexBuffer getBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.getBuffer()); }
public Object builder() { return wrapperContained.builder(); }
public int getOffset(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.getOffset(element.wrapperContained); }
public boolean has(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.has(element.wrapperContained); }
public java.lang.String getName(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.getName(element.wrapperContained); }
public int[] getOffsetsByElementId() { return wrapperContained.getOffsetsByElementId(); }
public int getRequiredMask() { return wrapperContained.getRequiredMask(); }

}