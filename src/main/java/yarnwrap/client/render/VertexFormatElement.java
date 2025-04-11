package yarnwrap.client.render;
public class VertexFormatElement { public net.minecraft.client.render.VertexFormatElement wrapperContained; public VertexFormatElement(net.minecraft.client.render.VertexFormatElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public int uvIndex() { return wrapperContained.uvIndex; }
// public void uvIndex(int value) { wrapperContained.uvIndex = value; }
public yarnwrap.client.render.VertexFormatElement POSITION() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.POSITION); }
// public void POSITION(yarnwrap.client.render.VertexFormatElement value) { wrapperContained.POSITION = value.wrapperContained; }
public yarnwrap.client.render.VertexFormatElement COLOR() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.COLOR); }
// public void COLOR(yarnwrap.client.render.VertexFormatElement value) { wrapperContained.COLOR = value.wrapperContained; }
public yarnwrap.client.render.VertexFormatElement UV_0() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV_0); }
// public void UV_0(yarnwrap.client.render.VertexFormatElement value) { wrapperContained.UV_0 = value.wrapperContained; }
public yarnwrap.client.render.VertexFormatElement UV() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV); }
// public void UV(yarnwrap.client.render.VertexFormatElement value) { wrapperContained.UV = value.wrapperContained; }
public yarnwrap.client.render.VertexFormatElement UV_1() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV_1); }
// public void UV_1(yarnwrap.client.render.VertexFormatElement value) { wrapperContained.UV_1 = value.wrapperContained; }
public yarnwrap.client.render.VertexFormatElement UV_2() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV_2); }
// public void UV_2(yarnwrap.client.render.VertexFormatElement value) { wrapperContained.UV_2 = value.wrapperContained; }
public yarnwrap.client.render.VertexFormatElement NORMAL() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.NORMAL); }
// public void NORMAL(yarnwrap.client.render.VertexFormatElement value) { wrapperContained.NORMAL = value.wrapperContained; }
// public net.minecraft.client.render.VertexFormatElement[] ELEMENTS() { return wrapperContained.ELEMENTS; }
// public void ELEMENTS(net.minecraft.client.render.VertexFormatElement[] value) { wrapperContained.ELEMENTS = value; }
// public java.util.List ELEMENTS_LIST() { return wrapperContained.ELEMENTS_LIST; }
// public void ELEMENTS_LIST(java.util.List value) { wrapperContained.ELEMENTS_LIST = value; }
// public VertexFormatElement(int uvIndex) { this.wrapperContained = new net.minecraft.client.render.VertexFormatElement(uvIndex); }
// public int uvIndex() { return wrapperContained.uvIndex(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public boolean isValidType(int uvIndex,Object type) { return wrapperContained.isValidType(uvIndex,type); }
public void setupState(int elementIndex,long offset,int stride) { wrapperContained.setupState(elementIndex,offset,stride); }
public int getBit() { return wrapperContained.getBit(); }
public yarnwrap.client.render.VertexFormatElement get(int id) { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.get(id)); }
// public yarnwrap.client.render.VertexFormatElement register(int id,int uvIndex,Object type,Object usage,int count) { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.register(id,uvIndex,type,usage,count)); }
// public boolean method_60846(int element) { return wrapperContained.method_60846(element); }
public int getSizeInBytes() { return wrapperContained.getSizeInBytes(); }
public java.util.stream.Stream streamFromMask(int mask) { return wrapperContained.streamFromMask(mask); }

}