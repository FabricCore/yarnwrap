package yarnwrap.util.math;
public class AffineTransformation { public net.minecraft.util.math.AffineTransformation wrapperContained; public AffineTransformation(net.minecraft.util.math.AffineTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Matrix4f matrix() { return wrapperContained.matrix; }
// public boolean initialized() { return wrapperContained.initialized; }
// public org.joml.Vector3f translation() { return wrapperContained.translation; }
// public org.joml.Quaternionf leftRotation() { return wrapperContained.leftRotation; }
// public org.joml.Vector3f scale() { return wrapperContained.scale; }
// public org.joml.Quaternionf rightRotation() { return wrapperContained.rightRotation; }
// public yarnwrap.util.math.AffineTransformation IDENTITY() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.IDENTITY); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec ANY_CODEC() { return wrapperContained.ANY_CODEC; }
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

}