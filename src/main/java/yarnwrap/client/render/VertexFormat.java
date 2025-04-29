package yarnwrap.client.render;
public class VertexFormat { public net.minecraft.client.render.VertexFormat wrapperContained; public VertexFormat(net.minecraft.client.render.VertexFormat wrapperContained) { this.wrapperContained = wrapperContained; }

// public int vertexSizeByte() { return wrapperContained.vertexSizeByte; }
// public void vertexSizeByte(int value) { wrapperContained.vertexSizeByte = value; }
// public static int vertexSizeByte() { return net.minecraft.client.render.VertexFormat.vertexSizeByte; }
// public static void vertexSizeByte(int value, ) { net.minecraft.client.render.VertexFormat.vertexSizeByte = value; }

// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public static java.util.List elements() { return net.minecraft.client.render.VertexFormat.elements; }
// public static void elements(java.util.List value, ) { net.minecraft.client.render.VertexFormat.elements = value; }

// public yarnwrap.client.gl.VertexBuffer buffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.buffer); }
// public void buffer(yarnwrap.client.gl.VertexBuffer value) { wrapperContained.buffer = value.wrapperContained; }
// public static yarnwrap.client.gl.VertexBuffer buffer() { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.VertexFormat.buffer); }
// public static void buffer(yarnwrap.client.gl.VertexBuffer value, ) { net.minecraft.client.render.VertexFormat.buffer = value.wrapperContained; }

// public java.util.List names() { return wrapperContained.names; }
// public void names(java.util.List value) { wrapperContained.names = value; }
// public static java.util.List names() { return net.minecraft.client.render.VertexFormat.names; }
// public static void names(java.util.List value, ) { net.minecraft.client.render.VertexFormat.names = value; }

// public int requiredMask() { return wrapperContained.requiredMask; }
// public void requiredMask(int value) { wrapperContained.requiredMask = value; }
// public static int requiredMask() { return net.minecraft.client.render.VertexFormat.requiredMask; }
// public static void requiredMask(int value, ) { net.minecraft.client.render.VertexFormat.requiredMask = value; }

// public int[] offsetsByElementId() { return wrapperContained.offsetsByElementId; }
// public void offsetsByElementId(int[] value) { wrapperContained.offsetsByElementId = value; }
// public static int[] offsetsByElementId() { return net.minecraft.client.render.VertexFormat.offsetsByElementId; }
// public static void offsetsByElementId(int[] value, ) { net.minecraft.client.render.VertexFormat.offsetsByElementId = value; }

// public VertexFormat(java.util.List elements,java.util.List names,it.unimi.dsi.fastutil.ints.IntList offsets,int vertexSizeByte) { this.wrapperContained = new net.minecraft.client.render.VertexFormat(elements,names,offsets,vertexSizeByte); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.VertexFormat.equals(o); }
public java.util.List getElements() { return wrapperContained.getElements(); }
// public static java.util.List getElements() { return net.minecraft.client.render.VertexFormat.getElements(); }
public int getVertexSizeByte() { return wrapperContained.getVertexSizeByte(); }
// public static int getVertexSizeByte() { return net.minecraft.client.render.VertexFormat.getVertexSizeByte(); }
public void setupState() { wrapperContained.setupState(); }
// public static void setupState() { net.minecraft.client.render.VertexFormat.setupState(); }
public void clearState() { wrapperContained.clearState(); }
// public static void clearState() { net.minecraft.client.render.VertexFormat.clearState(); }
public java.util.List getAttributeNames() { return wrapperContained.getAttributeNames(); }
// public static java.util.List getAttributeNames() { return net.minecraft.client.render.VertexFormat.getAttributeNames(); }
// public void setupStateInternal() { wrapperContained.setupStateInternal(); }
// public static void setupStateInternal() { net.minecraft.client.render.VertexFormat.setupStateInternal(); }
// public void clearStateInternal() { wrapperContained.clearStateInternal(); }
// public static void clearStateInternal() { net.minecraft.client.render.VertexFormat.clearStateInternal(); }
public yarnwrap.client.gl.VertexBuffer getBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.getBuffer()); }
// public static yarnwrap.client.gl.VertexBuffer getBuffer() { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.VertexFormat.getBuffer()); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.client.render.VertexFormat.builder(); }
// public int method_60834(int a,int b) { return wrapperContained.method_60834(a,b); }
// public static int method_60834(int a,int b, ) { return net.minecraft.client.render.VertexFormat.method_60834(a,b); }
public int getOffset(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.getOffset(element.wrapperContained); }
// public static int getOffset(yarnwrap.client.render.VertexFormatElement element, ) { return net.minecraft.client.render.VertexFormat.getOffset(element.wrapperContained); }
public boolean has(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.has(element.wrapperContained); }
// public static boolean has(yarnwrap.client.render.VertexFormatElement element, ) { return net.minecraft.client.render.VertexFormat.has(element.wrapperContained); }
public java.lang.String getName(yarnwrap.client.render.VertexFormatElement element) { return wrapperContained.getName(element.wrapperContained); }
// public static java.lang.String getName(yarnwrap.client.render.VertexFormatElement element, ) { return net.minecraft.client.render.VertexFormat.getName(element.wrapperContained); }
public int[] getOffsetsByElementId() { return wrapperContained.getOffsetsByElementId(); }
// public static int[] getOffsetsByElementId() { return net.minecraft.client.render.VertexFormat.getOffsetsByElementId(); }
public int getRequiredMask() { return wrapperContained.getRequiredMask(); }
// public static int getRequiredMask() { return net.minecraft.client.render.VertexFormat.getRequiredMask(); }

}