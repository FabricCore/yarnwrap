package yarnwrap.client.model;
public class ModelTransform { public net.minecraft.client.model.ModelTransform wrapperContained; public ModelTransform(net.minecraft.client.model.ModelTransform wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelTransform NONE() { return new yarnwrap.client.model.ModelTransform(wrapperContained.NONE); }
// public void NONE(yarnwrap.client.model.ModelTransform value) { wrapperContained.NONE = value.wrapperContained; }
public float pivotX() { return wrapperContained.pivotX; }
// public void pivotX(float value) { wrapperContained.pivotX = value; }
public float pivotY() { return wrapperContained.pivotY; }
// public void pivotY(float value) { wrapperContained.pivotY = value; }
public float pivotZ() { return wrapperContained.pivotZ; }
// public void pivotZ(float value) { wrapperContained.pivotZ = value; }
public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
public float roll() { return wrapperContained.roll; }
// public void roll(float value) { wrapperContained.roll = value; }
// public ModelTransform(float pivotX,float pivotY,float pivotZ,float pitch,float yaw,float roll) { this.wrapperContained = new net.minecraft.client.model.ModelTransform(pivotX,pivotY,pivotZ,pitch,yaw,roll); }
public yarnwrap.client.model.ModelTransform pivot(float pivotX,float pivotY,float pivotZ) { return new yarnwrap.client.model.ModelTransform(wrapperContained.pivot(pivotX,pivotY,pivotZ)); }
public yarnwrap.client.model.ModelTransform of(float pivotX,float pivotY,float pivotZ,float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.of(pivotX,pivotY,pivotZ,pitch,yaw,roll)); }
public yarnwrap.client.model.ModelTransform rotation(float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.rotation(pitch,yaw,roll)); }

}