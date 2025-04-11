package yarnwrap.client.render;
public class Frustum { public net.minecraft.client.render.Frustum wrapperContained; public Frustum(net.minecraft.client.render.Frustum wrapperContained) { this.wrapperContained = wrapperContained; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
public int RECESSION_SCALE() { return wrapperContained.RECESSION_SCALE; }
// public void RECESSION_SCALE(int value) { wrapperContained.RECESSION_SCALE = value; }
// public org.joml.Vector4f recession() { return wrapperContained.recession; }
// public void recession(org.joml.Vector4f value) { wrapperContained.recession = value; }
// public org.joml.FrustumIntersection frustumIntersection() { return wrapperContained.frustumIntersection; }
// public void frustumIntersection(org.joml.FrustumIntersection value) { wrapperContained.frustumIntersection = value; }
// public org.joml.Matrix4f positionProjectionMatrix() { return wrapperContained.positionProjectionMatrix; }
// public void positionProjectionMatrix(org.joml.Matrix4f value) { wrapperContained.positionProjectionMatrix = value; }
public Frustum(yarnwrap.client.render.Frustum frustum) { this.wrapperContained = new net.minecraft.client.render.Frustum(frustum.wrapperContained); }
public Frustum(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix) { this.wrapperContained = new net.minecraft.client.render.Frustum(positionMatrix,projectionMatrix); }
public void setPosition(double cameraX,double cameraY,double cameraZ) { wrapperContained.setPosition(cameraX,cameraY,cameraZ); }
// public boolean isVisible(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return wrapperContained.isVisible(minX,minY,minZ,maxX,maxY,maxZ); }
// public void init(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix) { wrapperContained.init(positionMatrix,projectionMatrix); }
public boolean isVisible(yarnwrap.util.math.Box box) { return wrapperContained.isVisible(box.wrapperContained); }
public yarnwrap.client.render.Frustum coverBoxAroundSetPosition(int boxSize) { return new yarnwrap.client.render.Frustum(wrapperContained.coverBoxAroundSetPosition(boxSize)); }

}