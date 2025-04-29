package yarnwrap.client.model;
public class ModelTransform { public net.minecraft.client.model.ModelTransform wrapperContained; public ModelTransform(net.minecraft.client.model.ModelTransform wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelTransform NONE() { return new yarnwrap.client.model.ModelTransform(wrapperContained.NONE); }
// public void NONE(yarnwrap.client.model.ModelTransform value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.client.model.ModelTransform NONE() { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.NONE); }
// public static void NONE(yarnwrap.client.model.ModelTransform value, ) { net.minecraft.client.model.ModelTransform.NONE = value.wrapperContained; }

public float pivotX() { return wrapperContained.pivotX; }
// public void pivotX(float value) { wrapperContained.pivotX = value; }
// public static float pivotX() { return net.minecraft.client.model.ModelTransform.pivotX; }
// public static void pivotX(float value, ) { net.minecraft.client.model.ModelTransform.pivotX = value; }

public float pivotY() { return wrapperContained.pivotY; }
// public void pivotY(float value) { wrapperContained.pivotY = value; }
// public static float pivotY() { return net.minecraft.client.model.ModelTransform.pivotY; }
// public static void pivotY(float value, ) { net.minecraft.client.model.ModelTransform.pivotY = value; }

public float pivotZ() { return wrapperContained.pivotZ; }
// public void pivotZ(float value) { wrapperContained.pivotZ = value; }
// public static float pivotZ() { return net.minecraft.client.model.ModelTransform.pivotZ; }
// public static void pivotZ(float value, ) { net.minecraft.client.model.ModelTransform.pivotZ = value; }

public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.model.ModelTransform.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.model.ModelTransform.pitch = value; }

public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.model.ModelTransform.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.model.ModelTransform.yaw = value; }

public float roll() { return wrapperContained.roll; }
// public void roll(float value) { wrapperContained.roll = value; }
// public static float roll() { return net.minecraft.client.model.ModelTransform.roll; }
// public static void roll(float value, ) { net.minecraft.client.model.ModelTransform.roll = value; }

// public ModelTransform(float pivotX,float pivotY,float pivotZ,float pitch,float yaw,float roll) { this.wrapperContained = new net.minecraft.client.model.ModelTransform(pivotX,pivotY,pivotZ,pitch,yaw,roll); }
// public yarnwrap.client.model.ModelTransform pivot(float pivotX,float pivotY,float pivotZ) { return new yarnwrap.client.model.ModelTransform(wrapperContained.pivot(pivotX,pivotY,pivotZ)); }
// public static yarnwrap.client.model.ModelTransform pivot(float pivotX,float pivotY,float pivotZ, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.pivot(pivotX,pivotY,pivotZ)); }
// public yarnwrap.client.model.ModelTransform of(float pivotX,float pivotY,float pivotZ,float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.of(pivotX,pivotY,pivotZ,pitch,yaw,roll)); }
// public static yarnwrap.client.model.ModelTransform of(float pivotX,float pivotY,float pivotZ,float pitch,float yaw,float roll, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.of(pivotX,pivotY,pivotZ,pitch,yaw,roll)); }
// public yarnwrap.client.model.ModelTransform rotation(float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.rotation(pitch,yaw,roll)); }
// public static yarnwrap.client.model.ModelTransform rotation(float pitch,float yaw,float roll, ) { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelTransform.rotation(pitch,yaw,roll)); }

}