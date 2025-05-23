package yarnwrap.client.model;
public class ModelTransform { public net.minecraft.client.model.ModelTransform wrapperContained; public ModelTransform(net.minecraft.client.model.ModelTransform wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.model.ModelTransform.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.model.ModelTransform.pitch = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.model.ModelTransform.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.model.ModelTransform.yaw = value; }

// public float roll() { return wrapperContained.roll; }
// public void roll(float value) { wrapperContained.roll = value; }
// public static float roll() { return net.minecraft.client.model.ModelTransform.roll; }
// public static void roll(float value, ) { net.minecraft.client.model.ModelTransform.roll = value; }

// public yarnwrap.client.model.ModelTransform NONE() { return new yarnwrap.client.model.ModelTransform(wrapperContained.NONE); }
// public void NONE(yarnwrap.client.model.ModelTransform value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.client.model.ModelTransform NONE() { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.NONE); }
// public static void NONE(yarnwrap.client.model.ModelTransform value, ) { net.minecraft.client.model.ModelTransform.NONE = value.wrapperContained; }

// public ModelTransform(float pivotX,float pivotY,float pivotZ,float pitch) { this.wrapperContained = new net.minecraft.client.model.ModelTransform(pivotX,pivotY,pivotZ,pitch); }
// public float pitch() { return wrapperContained.pitch(); }
// // public static float pitch() { return net.minecraft.client.model.ModelTransform.pitch(); }
// public float yaw() { return wrapperContained.yaw(); }
// // public static float yaw() { return net.minecraft.client.model.ModelTransform.yaw(); }
// public float roll() { return wrapperContained.roll(); }
// // public static float roll() { return net.minecraft.client.model.ModelTransform.roll(); }
// public yarnwrap.client.model.ModelTransform origin(float x,float y,float z) { return new yarnwrap.client.model.ModelTransform(wrapperContained.origin(x,y,z)); }
// public static yarnwrap.client.model.ModelTransform origin(float x,float y,float z, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.origin(x,y,z)); }
// public yarnwrap.client.model.ModelTransform of(float originX,float originY,float originZ,float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.of(originX,originY,originZ,pitch,yaw,roll)); }
// public static yarnwrap.client.model.ModelTransform of(float originX,float originY,float originZ,float pitch,float yaw,float roll, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.of(originX,originY,originZ,pitch,yaw,roll)); }
// public yarnwrap.client.model.ModelTransform rotation(float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.rotation(pitch,yaw,roll)); }
// public static yarnwrap.client.model.ModelTransform rotation(float pitch,float yaw,float roll, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.rotation(pitch,yaw,roll)); }
public yarnwrap.client.model.ModelTransform withScale(float scale) { return new yarnwrap.client.model.ModelTransform(wrapperContained.withScale(scale)); }
// public static yarnwrap.client.model.ModelTransform withScale(float scale, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.withScale(scale)); }
public yarnwrap.client.model.ModelTransform scaled(float scale) { return new yarnwrap.client.model.ModelTransform(wrapperContained.scaled(scale)); }
// public static yarnwrap.client.model.ModelTransform scaled(float scale, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.scaled(scale)); }
public yarnwrap.client.model.ModelTransform moveOrigin(float x,float y,float z) { return new yarnwrap.client.model.ModelTransform(wrapperContained.moveOrigin(x,y,z)); }
// public static yarnwrap.client.model.ModelTransform moveOrigin(float x,float y,float z, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.moveOrigin(x,y,z)); }
public yarnwrap.client.model.ModelTransform scaled(float xScale,float yScale,float zScale) { return new yarnwrap.client.model.ModelTransform(wrapperContained.scaled(xScale,yScale,zScale)); }
// public static yarnwrap.client.model.ModelTransform scaled(float xScale,float yScale,float zScale, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.scaled(xScale,yScale,zScale)); }

}