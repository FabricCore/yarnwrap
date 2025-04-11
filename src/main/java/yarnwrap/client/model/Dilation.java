package yarnwrap.client.model;
public class Dilation { public net.minecraft.client.model.Dilation wrapperContained; public Dilation(net.minecraft.client.model.Dilation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.Dilation NONE() { return new yarnwrap.client.model.Dilation(wrapperContained.NONE); }
// public void NONE(yarnwrap.client.model.Dilation value) { wrapperContained.NONE = value.wrapperContained; }
// public float radiusX() { return wrapperContained.radiusX; }
// public void radiusX(float value) { wrapperContained.radiusX = value; }
// public float radiusY() { return wrapperContained.radiusY; }
// public void radiusY(float value) { wrapperContained.radiusY = value; }
// public float radiusZ() { return wrapperContained.radiusZ; }
// public void radiusZ(float value) { wrapperContained.radiusZ = value; }
public Dilation(float radius) { this.wrapperContained = new net.minecraft.client.model.Dilation(radius); }
public Dilation(float radiusX,float radiusY,float radiusZ) { this.wrapperContained = new net.minecraft.client.model.Dilation(radiusX,radiusY,radiusZ); }
public yarnwrap.client.model.Dilation add(float radius) { return new yarnwrap.client.model.Dilation(wrapperContained.add(radius)); }
public yarnwrap.client.model.Dilation add(float radiusX,float radiusY,float radiusZ) { return new yarnwrap.client.model.Dilation(wrapperContained.add(radiusX,radiusY,radiusZ)); }

}