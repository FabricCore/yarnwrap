package yarnwrap.client.model;
public class ModelTransform { public net.minecraft.client.model.ModelTransform wrapperContained; public ModelTransform(net.minecraft.client.model.ModelTransform wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelTransform NONE() { return new yarnwrap.client.model.ModelTransform(wrapperContained.NONE); }
public float pivotX() { return wrapperContained.pivotX; }
public float pivotY() { return wrapperContained.pivotY; }
public float pivotZ() { return wrapperContained.pivotZ; }
public float pitch() { return wrapperContained.pitch; }
public float yaw() { return wrapperContained.yaw; }
public float roll() { return wrapperContained.roll; }
public yarnwrap.client.model.ModelTransform pivot(float pivotX,float pivotY,float pivotZ) { return new yarnwrap.client.model.ModelTransform(wrapperContained.pivot(pivotX,pivotY,pivotZ)); }
public yarnwrap.client.model.ModelTransform of(float pivotX,float pivotY,float pivotZ,float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.of(pivotX,pivotY,pivotZ,pitch,yaw,roll)); }
public yarnwrap.client.model.ModelTransform rotation(float pitch,float yaw,float roll) { return new yarnwrap.client.model.ModelTransform(wrapperContained.rotation(pitch,yaw,roll)); }

}