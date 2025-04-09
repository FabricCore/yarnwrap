package yarnwrap.client.model;
public class Dilation { public net.minecraft.client.model.Dilation wrapperContained; public Dilation(net.minecraft.client.model.Dilation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.Dilation NONE() { return new yarnwrap.client.model.Dilation(wrapperContained.NONE); }
// public float radiusX() { return wrapperContained.radiusX; }
// public float radiusY() { return wrapperContained.radiusY; }
// public float radiusZ() { return wrapperContained.radiusZ; }
public yarnwrap.client.model.Dilation add(float radius) { return new yarnwrap.client.model.Dilation(wrapperContained.add(radius)); }
public yarnwrap.client.model.Dilation add(float radiusX,float radiusY,float radiusZ) { return new yarnwrap.client.model.Dilation(wrapperContained.add(radiusX,radiusY,radiusZ)); }

}