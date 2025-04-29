package yarnwrap.client.util.math;
public class MatrixStack { public net.minecraft.client.util.math.MatrixStack wrapperContained; public MatrixStack(net.minecraft.client.util.math.MatrixStack wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Deque stack() { return wrapperContained.stack; }
// public void stack(java.util.Deque value) { wrapperContained.stack = value; }
// public static java.util.Deque stack() { return net.minecraft.client.util.math.MatrixStack.stack; }
// public static void stack(java.util.Deque value, ) { net.minecraft.client.util.math.MatrixStack.stack = value; }

public void push() { wrapperContained.push(); }
// public static void push() { net.minecraft.client.util.math.MatrixStack.push(); }
public void translate(double x,double y,double z) { wrapperContained.translate(x,y,z); }
// public static void translate(double x,double y,double z, ) { net.minecraft.client.util.math.MatrixStack.translate(x,y,z); }
public void scale(float x,float y,float z) { wrapperContained.scale(x,y,z); }
// public static void scale(float x,float y,float z, ) { net.minecraft.client.util.math.MatrixStack.scale(x,y,z); }
public void multiply(org.joml.Quaternionf quaternion) { wrapperContained.multiply(quaternion); }
// public static void multiply(org.joml.Quaternionf quaternion, ) { net.minecraft.client.util.math.MatrixStack.multiply(quaternion); }
// public void method_22908(java.util.ArrayDeque stack) { wrapperContained.method_22908(stack); }
// public static void method_22908(java.util.ArrayDeque stack, ) { net.minecraft.client.util.math.MatrixStack.method_22908(stack); }
public void pop() { wrapperContained.pop(); }
// public static void pop() { net.minecraft.client.util.math.MatrixStack.pop(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.util.math.MatrixStack.isEmpty(); }
public Object peek() { return wrapperContained.peek(); }
// public static Object peek() { return net.minecraft.client.util.math.MatrixStack.peek(); }
public void multiplyPositionMatrix(org.joml.Matrix4f matrix) { wrapperContained.multiplyPositionMatrix(matrix); }
// public static void multiplyPositionMatrix(org.joml.Matrix4f matrix, ) { net.minecraft.client.util.math.MatrixStack.multiplyPositionMatrix(matrix); }
public void loadIdentity() { wrapperContained.loadIdentity(); }
// public static void loadIdentity() { net.minecraft.client.util.math.MatrixStack.loadIdentity(); }
public void translate(float x,float y,float z) { wrapperContained.translate(x,y,z); }
// public static void translate(float x,float y,float z, ) { net.minecraft.client.util.math.MatrixStack.translate(x,y,z); }
public void multiply(org.joml.Quaternionf quaternion,float originX,float originY,float originZ) { wrapperContained.multiply(quaternion,originX,originY,originZ); }
// public static void multiply(org.joml.Quaternionf quaternion,float originX,float originY,float originZ, ) { net.minecraft.client.util.math.MatrixStack.multiply(quaternion,originX,originY,originZ); }

}