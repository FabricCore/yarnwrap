package yarnwrap.client.util.math;
public class MatrixStack { public net.minecraft.client.util.math.MatrixStack wrapperContained; public MatrixStack(net.minecraft.client.util.math.MatrixStack wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Deque stack() { return wrapperContained.stack; }
public void push() { wrapperContained.push(); }
public void translate(double x,double y,double z) { wrapperContained.translate(x,y,z); }
public void scale(float x,float y,float z) { wrapperContained.scale(x,y,z); }
public void multiply(org.joml.Quaternionf quaternion) { wrapperContained.multiply(quaternion); }
public void pop() { wrapperContained.pop(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public Object peek() { return wrapperContained.peek(); }
public void multiplyPositionMatrix(org.joml.Matrix4f matrix) { wrapperContained.multiplyPositionMatrix(matrix); }
public void loadIdentity() { wrapperContained.loadIdentity(); }
public void translate(float x,float y,float z) { wrapperContained.translate(x,y,z); }
public void multiply(org.joml.Quaternionf quaternion,float originX,float originY,float originZ) { wrapperContained.multiply(quaternion,originX,originY,originZ); }

}