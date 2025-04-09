package yarnwrap.client.render;
public class Frustum { public net.minecraft.client.render.Frustum wrapperContained; public Frustum(net.minecraft.client.render.Frustum wrapperContained) { this.wrapperContained = wrapperContained; }

// public double x() { return wrapperContained.x; }
// public double y() { return wrapperContained.y; }
// public double z() { return wrapperContained.z; }
public int RECESSION_SCALE() { return wrapperContained.RECESSION_SCALE; }
// public org.joml.Vector4f recession() { return wrapperContained.recession; }
// public org.joml.FrustumIntersection frustumIntersection() { return wrapperContained.frustumIntersection; }
// public org.joml.Matrix4f positionProjectionMatrix() { return wrapperContained.positionProjectionMatrix; }
public void setPosition(double cameraX,double cameraY,double cameraZ) { wrapperContained.setPosition(cameraX,cameraY,cameraZ); }
// public boolean isVisible(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return wrapperContained.isVisible(minX,minY,minZ,maxX,maxY,maxZ); }
// public void init(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix) { wrapperContained.init(positionMatrix,projectionMatrix); }
public boolean isVisible(yarnwrap.util.math.Box box) { return wrapperContained.isVisible(box.wrapperContained); }
public yarnwrap.client.render.Frustum coverBoxAroundSetPosition(int boxSize) { return new yarnwrap.client.render.Frustum(wrapperContained.coverBoxAroundSetPosition(boxSize)); }

}