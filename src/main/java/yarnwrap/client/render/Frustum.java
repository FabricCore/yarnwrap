package yarnwrap.client.render;
public class Frustum { public net.minecraft.client.render.Frustum wrapperContained; public Frustum(net.minecraft.client.render.Frustum wrapperContained) { this.wrapperContained = wrapperContained; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.client.render.Frustum.x; }
// public static void x(double value, ) { net.minecraft.client.render.Frustum.x = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.client.render.Frustum.y; }
// public static void y(double value, ) { net.minecraft.client.render.Frustum.y = value; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.client.render.Frustum.z; }
// public static void z(double value, ) { net.minecraft.client.render.Frustum.z = value; }

// public int RECESSION_SCALE() { return wrapperContained.RECESSION_SCALE; }
// public void RECESSION_SCALE(int value) { wrapperContained.RECESSION_SCALE = value; }
public static int RECESSION_SCALE() { return net.minecraft.client.render.Frustum.RECESSION_SCALE; }
// public static void RECESSION_SCALE(int value, ) { net.minecraft.client.render.Frustum.RECESSION_SCALE = value; }

// public org.joml.Vector4f recession() { return wrapperContained.recession; }
// public void recession(org.joml.Vector4f value) { wrapperContained.recession = value; }
// public static org.joml.Vector4f recession() { return net.minecraft.client.render.Frustum.recession; }
// public static void recession(org.joml.Vector4f value, ) { net.minecraft.client.render.Frustum.recession = value; }

// public org.joml.FrustumIntersection frustumIntersection() { return wrapperContained.frustumIntersection; }
// public void frustumIntersection(org.joml.FrustumIntersection value) { wrapperContained.frustumIntersection = value; }
// public static org.joml.FrustumIntersection frustumIntersection() { return net.minecraft.client.render.Frustum.frustumIntersection; }
// public static void frustumIntersection(org.joml.FrustumIntersection value, ) { net.minecraft.client.render.Frustum.frustumIntersection = value; }

// public org.joml.Matrix4f positionProjectionMatrix() { return wrapperContained.positionProjectionMatrix; }
// public void positionProjectionMatrix(org.joml.Matrix4f value) { wrapperContained.positionProjectionMatrix = value; }
// public static org.joml.Matrix4f positionProjectionMatrix() { return net.minecraft.client.render.Frustum.positionProjectionMatrix; }
// public static void positionProjectionMatrix(org.joml.Matrix4f value, ) { net.minecraft.client.render.Frustum.positionProjectionMatrix = value; }

public Frustum(yarnwrap.client.render.Frustum frustum) { this.wrapperContained = new net.minecraft.client.render.Frustum(frustum.wrapperContained); }
public Frustum(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix) { this.wrapperContained = new net.minecraft.client.render.Frustum(positionMatrix,projectionMatrix); }
public void setPosition(double cameraX,double cameraY,double cameraZ) { wrapperContained.setPosition(cameraX,cameraY,cameraZ); }
// public static void setPosition(double cameraX,double cameraY,double cameraZ, ) { net.minecraft.client.render.Frustum.setPosition(cameraX,cameraY,cameraZ); }
// public boolean isVisible(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return wrapperContained.isVisible(minX,minY,minZ,maxX,maxY,maxZ); }
// public static boolean isVisible(double minX,double minY,double minZ,double maxX,double maxY,double maxZ, ) { return net.minecraft.client.render.Frustum.isVisible(minX,minY,minZ,maxX,maxY,maxZ); }
// public void init(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix) { wrapperContained.init(positionMatrix,projectionMatrix); }
// public static void init(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix, ) { net.minecraft.client.render.Frustum.init(positionMatrix,projectionMatrix); }
public boolean isVisible(yarnwrap.util.math.Box box) { return wrapperContained.isVisible(box.wrapperContained); }
// public static boolean isVisible(yarnwrap.util.math.Box box, ) { return net.minecraft.client.render.Frustum.isVisible(box.wrapperContained); }
public yarnwrap.client.render.Frustum coverBoxAroundSetPosition(int boxSize) { return new yarnwrap.client.render.Frustum(wrapperContained.coverBoxAroundSetPosition(boxSize)); }
// public static yarnwrap.client.render.Frustum coverBoxAroundSetPosition(int boxSize, ) { return new yarnwrap.client.render.Frustum(net.minecraft.client.render.Frustum.coverBoxAroundSetPosition(boxSize)); }

}