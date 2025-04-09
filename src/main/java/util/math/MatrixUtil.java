package yarnwrap.util.math;
public class MatrixUtil { public net.minecraft.util.math.MatrixUtil wrapperContained; public MatrixUtil(net.minecraft.util.math.MatrixUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public float COT_PI_OVER_8() { return wrapperContained.COT_PI_OVER_8; }
// public yarnwrap.util.math.GivensPair SIN_COS_PI_OVER_8() { return new yarnwrap.util.math.GivensPair(wrapperContained.SIN_COS_PI_OVER_8); }
// public yarnwrap.util.math.GivensPair qrGivensQuaternion(float a1,float a2) { return new yarnwrap.util.math.GivensPair(wrapperContained.qrGivensQuaternion(a1,a2)); }
// public yarnwrap.util.math.GivensPair approximateGivensQuaternion(float a11,float a12,float a22) { return new yarnwrap.util.math.GivensPair(wrapperContained.approximateGivensQuaternion(a11,a12,a22)); }
public org.apache.commons.lang3.tuple.Triple svdDecompose(org.joml.Matrix3f A) { return wrapperContained.svdDecompose(A); }
public org.joml.Matrix4f scale(org.joml.Matrix4f matrix,float scalar) { return wrapperContained.scale(matrix,scalar); }
// public void applyJacobiIteration(org.joml.Matrix3f AtA) { wrapperContained.applyJacobiIteration(AtA); }
public org.joml.Quaternionf applyJacobiIterations(org.joml.Matrix3f AtA,int numJacobiIterations) { return wrapperContained.applyJacobiIterations(AtA,numJacobiIterations); }
// public void conjugate(org.joml.Matrix3f X,org.joml.Matrix3f A) { wrapperContained.conjugate(X,A); }
public boolean isTranslation(org.joml.Matrix4f matrix) { return wrapperContained.isTranslation(matrix); }
public boolean isOrthonormal(org.joml.Matrix4f matrix) { return wrapperContained.isOrthonormal(matrix); }

}