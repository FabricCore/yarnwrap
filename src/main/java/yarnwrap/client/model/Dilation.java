package yarnwrap.client.model;
public class Dilation { public net.minecraft.client.model.Dilation wrapperContained; public Dilation(net.minecraft.client.model.Dilation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.Dilation NONE() { return new yarnwrap.client.model.Dilation(wrapperContained.NONE); }
// public void NONE(yarnwrap.client.model.Dilation value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.client.model.Dilation NONE() { return new yarnwrap.client.model.Dilation(net.minecraft.client.model.Dilation.NONE); }
// public static void NONE(yarnwrap.client.model.Dilation value, ) { net.minecraft.client.model.Dilation.NONE = value.wrapperContained; }

// public float radiusX() { return wrapperContained.radiusX; }
// public void radiusX(float value) { wrapperContained.radiusX = value; }
// public static float radiusX() { return net.minecraft.client.model.Dilation.radiusX; }
// public static void radiusX(float value, ) { net.minecraft.client.model.Dilation.radiusX = value; }

// public float radiusY() { return wrapperContained.radiusY; }
// public void radiusY(float value) { wrapperContained.radiusY = value; }
// public static float radiusY() { return net.minecraft.client.model.Dilation.radiusY; }
// public static void radiusY(float value, ) { net.minecraft.client.model.Dilation.radiusY = value; }

// public float radiusZ() { return wrapperContained.radiusZ; }
// public void radiusZ(float value) { wrapperContained.radiusZ = value; }
// public static float radiusZ() { return net.minecraft.client.model.Dilation.radiusZ; }
// public static void radiusZ(float value, ) { net.minecraft.client.model.Dilation.radiusZ = value; }

public Dilation(float radius) { this.wrapperContained = new net.minecraft.client.model.Dilation(radius); }
public Dilation(float radiusX,float radiusY,float radiusZ) { this.wrapperContained = new net.minecraft.client.model.Dilation(radiusX,radiusY,radiusZ); }
public yarnwrap.client.model.Dilation add(float radius) { return new yarnwrap.client.model.Dilation(wrapperContained.add(radius)); }
// public static yarnwrap.client.model.Dilation add(float radius, ) { return new yarnwrap.client.model.Dilation(net.minecraft.client.model.Dilation.add(radius)); }
public yarnwrap.client.model.Dilation add(float radiusX,float radiusY,float radiusZ) { return new yarnwrap.client.model.Dilation(wrapperContained.add(radiusX,radiusY,radiusZ)); }
// public static yarnwrap.client.model.Dilation add(float radiusX,float radiusY,float radiusZ, ) { return new yarnwrap.client.model.Dilation(net.minecraft.client.model.Dilation.add(radiusX,radiusY,radiusZ)); }

}