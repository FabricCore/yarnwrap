package yarnwrap.util.math;
public class AffineTransformation { public net.minecraft.util.math.AffineTransformation wrapperContained; public AffineTransformation(net.minecraft.util.math.AffineTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Matrix4f matrix() { return wrapperContained.matrix; }
// public void matrix(org.joml.Matrix4f value) { wrapperContained.matrix = value; }
// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
// public org.joml.Vector3f translation() { return wrapperContained.translation; }
// public void translation(org.joml.Vector3f value) { wrapperContained.translation = value; }
// public org.joml.Quaternionf leftRotation() { return wrapperContained.leftRotation; }
// public void leftRotation(org.joml.Quaternionf value) { wrapperContained.leftRotation = value; }
// public org.joml.Vector3f scale() { return wrapperContained.scale; }
// public void scale(org.joml.Vector3f value) { wrapperContained.scale = value; }
// public org.joml.Quaternionf rightRotation() { return wrapperContained.rightRotation; }
// public void rightRotation(org.joml.Quaternionf value) { wrapperContained.rightRotation = value; }
// public yarnwrap.util.math.AffineTransformation IDENTITY() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.IDENTITY); }
// public void IDENTITY(yarnwrap.util.math.AffineTransformation value) { wrapperContained.IDENTITY = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec ANY_CODEC() { return wrapperContained.ANY_CODEC; }
// public void ANY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ANY_CODEC = value; }
public AffineTransformation(org.joml.Matrix4f matrix) { this.wrapperContained = new net.minecraft.util.math.AffineTransformation(matrix); }
public AffineTransformation(org.joml.Vector3f translation,org.joml.Quaternionf leftRotation,org.joml.Vector3f scale,org.joml.Quaternionf rightRotation) { this.wrapperContained = new net.minecraft.util.math.AffineTransformation(translation,leftRotation,scale,rightRotation); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.util.math.AffineTransformation identity() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.identity()); }
public yarnwrap.util.math.AffineTransformation multiply(yarnwrap.util.math.AffineTransformation other) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.multiply(other.wrapperContained)); }
// public org.joml.Matrix4f setup(org.joml.Vector3f translation,org.joml.Quaternionf leftRotation,org.joml.Vector3f scale,org.joml.Quaternionf rightRotation) { return wrapperContained.setup(translation,leftRotation,scale,rightRotation); }
public yarnwrap.util.math.AffineTransformation invert() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.invert()); }
public org.joml.Matrix4f getMatrix() { return wrapperContained.getMatrix(); }
public org.joml.Quaternionf getLeftRotation() { return wrapperContained.getLeftRotation(); }
// public void init() { wrapperContained.init(); }
public yarnwrap.util.math.AffineTransformation interpolate(yarnwrap.util.math.AffineTransformation target,float factor) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.interpolate(target.wrapperContained,factor)); }
public org.joml.Vector3f getTranslation() { return wrapperContained.getTranslation(); }
public org.joml.Vector3f getScale() { return wrapperContained.getScale(); }
public org.joml.Quaternionf getRightRotation() { return wrapperContained.getRightRotation(); }
// public com.mojang.datafixers.kinds.App method_49059(Object instance) { return wrapperContained.method_49059(instance); }
// public org.joml.Quaternionf method_49062(yarnwrap.util.math.AffineTransformation affineTransformation) { return wrapperContained.method_49062(affineTransformation.wrapperContained); }
// public org.joml.Vector3f method_49063(yarnwrap.util.math.AffineTransformation affineTransformation) { return wrapperContained.method_49063(affineTransformation.wrapperContained); }
// public org.joml.Quaternionf method_49064(yarnwrap.util.math.AffineTransformation affineTransformation) { return wrapperContained.method_49064(affineTransformation.wrapperContained); }

}