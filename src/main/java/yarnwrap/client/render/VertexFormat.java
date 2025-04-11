package yarnwrap.client.render;
public class VertexFormat { public net.minecraft.client.render.VertexFormat wrapperContained; public VertexFormat(net.minecraft.client.render.VertexFormat wrapperContained) { this.wrapperContained = wrapperContained; }

// public int vertexSizeByte() { return wrapperContained.vertexSizeByte; }
// public void vertexSizeByte(int value) { wrapperContained.vertexSizeByte = value; }
// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public yarnwrap.client.gl.VertexBuffer buffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.buffer); }
// public void buffer(yarnwrap.client.gl.VertexBuffer value) { wrapperContained.buffer = value.wrapperContained; }
// public java.util.List names() { return wrapperContained.names; }
// public void names(java.util.List value) { wrapperContained.names = value; }
// public int requiredMask() { return wrapperContained.requiredMask; }
// public void requiredMask(int value) { wrapperContained.requiredMask = value; }
// public int[] offsetsByElementId() { return wrapperContained.offsetsByElementId; }
// public void offsetsByElementId(int[] value) { wrapperContained.offsetsByElementId = value; }
// public VertexFormat(java.util.List elements,java.util.List names,it.unimi.dsi.fastutil.ints.IntList offsets,int vertexSizeByte) { this.wrapperContained = new net.minecraft.client.render.VertexFormat(elements,names,offsets,vertexSizeByte); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.util.List getElements() { return wrapperContained.getElements(); }
public int getVertexSizeByte() { return wrapperContained.getVertexSizeByte(); }
public void setupState() { wrapperContained.setupState(); }
public void clearState() { wrapperContained.clearState(); }
public java.util.List getAttributeNames() { return wrapperContained.getAttributeNames(); }
// public void setupStateInternal() { wrapperContained.setupStateInternal(); }
// public void clearStateInternal() { wrapperContained.clearStateInternal(); }
public yarnwrap.client.gl.VertexBuffer getBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.getBuffer()); }
public Object builder() { return wrapperContained.builder(); }
// public int method_60834(int a,int b) { return wrapperContained.method_60834(a,b); }
public int getOffset(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.getOffset(element.wrapperContained); }
public boolean has(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.has(element.wrapperContained); }
public java.lang.String getName(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.getName(element.wrapperContained); }
public int[] getOffsetsByElementId() { return wrapperContained.getOffsetsByElementId(); }
public int getRequiredMask() { return wrapperContained.getRequiredMask(); }

}