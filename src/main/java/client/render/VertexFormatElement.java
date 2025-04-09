package yarnwrap.client.render;
public class VertexFormatElement { public net.minecraft.client.render.VertexFormatElement wrapperContained; public VertexFormatElement(net.minecraft.client.render.VertexFormatElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public int uvIndex() { return wrapperContained.uvIndex; }
public yarnwrap.client.render.VertexFormatElement POSITION() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.POSITION); }
public yarnwrap.client.render.VertexFormatElement COLOR() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.COLOR); }
public yarnwrap.client.render.VertexFormatElement UV_0() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV_0); }
public yarnwrap.client.render.VertexFormatElement UV() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV); }
public yarnwrap.client.render.VertexFormatElement UV_1() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV_1); }
public yarnwrap.client.render.VertexFormatElement UV_2() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.UV_2); }
public yarnwrap.client.render.VertexFormatElement NORMAL() { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.NORMAL); }
// public net.minecraft.client.render.VertexFormatElement[] ELEMENTS() { return wrapperContained.ELEMENTS; }
// public java.util.List ELEMENTS_LIST() { return wrapperContained.ELEMENTS_LIST; }
// public int uvIndex() { return wrapperContained.uvIndex(); }
// public boolean isValidType(int uvIndex,Object type) { return wrapperContained.isValidType(uvIndex,type); }
public void setupState(int elementIndex,long offset,int stride) { wrapperContained.setupState(elementIndex,offset,stride); }
public int getBit() { return wrapperContained.getBit(); }
public yarnwrap.client.render.VertexFormatElement get(int id) { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.get(id)); }
// public yarnwrap.client.render.VertexFormatElement register(int id,int uvIndex,Object type,Object usage,int count) { return new yarnwrap.client.render.VertexFormatElement(wrapperContained.register(id,uvIndex,type,usage,count)); }
public int getSizeInBytes() { return wrapperContained.getSizeInBytes(); }
public java.util.stream.Stream streamFromMask(int mask) { return wrapperContained.streamFromMask(mask); }

}