package yarnwrap.client.render;
public class Camera { public net.minecraft.client.render.Camera wrapperContained; public Camera(net.minecraft.client.render.Camera wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean ready() { return wrapperContained.ready; }
// public void ready(boolean value) { wrapperContained.ready = value; }
// public yarnwrap.world.BlockView area() { return new yarnwrap.world.BlockView(wrapperContained.area); }
// public void area(yarnwrap.world.BlockView value) { wrapperContained.area = value.wrapperContained; }
// public yarnwrap.entity.Entity focusedEntity() { return new yarnwrap.entity.Entity(wrapperContained.focusedEntity); }
// public void focusedEntity(yarnwrap.entity.Entity value) { wrapperContained.focusedEntity = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public Object blockPos() { return wrapperContained.blockPos; }
// // public void blockPos(Object value) { wrapperContained.blockPos = value; }
// public org.joml.Vector3f horizontalPlane() { return wrapperContained.horizontalPlane; }
// public void horizontalPlane(org.joml.Vector3f value) { wrapperContained.horizontalPlane = value; }
// public org.joml.Vector3f verticalPlane() { return wrapperContained.verticalPlane; }
// public void verticalPlane(org.joml.Vector3f value) { wrapperContained.verticalPlane = value; }
// public org.joml.Vector3f diagonalPlane() { return wrapperContained.diagonalPlane; }
// public void diagonalPlane(org.joml.Vector3f value) { wrapperContained.diagonalPlane = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public boolean thirdPerson() { return wrapperContained.thirdPerson; }
// public void thirdPerson(boolean value) { wrapperContained.thirdPerson = value; }
// public float cameraY() { return wrapperContained.cameraY; }
// public void cameraY(float value) { wrapperContained.cameraY = value; }
// public float lastCameraY() { return wrapperContained.lastCameraY; }
// public void lastCameraY(float value) { wrapperContained.lastCameraY = value; }
// public org.joml.Quaternionf rotation() { return wrapperContained.rotation; }
// public void rotation(org.joml.Quaternionf value) { wrapperContained.rotation = value; }
// public float lastTickDelta() { return wrapperContained.lastTickDelta; }
// public void lastTickDelta(float value) { wrapperContained.lastTickDelta = value; }
// public float BASE_CAMERA_DISTANCE() { return wrapperContained.BASE_CAMERA_DISTANCE; }
// public void BASE_CAMERA_DISTANCE(float value) { wrapperContained.BASE_CAMERA_DISTANCE = value; }
// public org.joml.Vector3f HORIZONTAL() { return wrapperContained.HORIZONTAL; }
// public void HORIZONTAL(org.joml.Vector3f value) { wrapperContained.HORIZONTAL = value; }
// public org.joml.Vector3f VERTICAL() { return wrapperContained.VERTICAL; }
// public void VERTICAL(org.joml.Vector3f value) { wrapperContained.VERTICAL = value; }
// public org.joml.Vector3f DIAGONAL() { return wrapperContained.DIAGONAL; }
// public void DIAGONAL(org.joml.Vector3f value) { wrapperContained.DIAGONAL = value; }
public void updateEyeHeight() { wrapperContained.updateEyeHeight(); }
// public float clipToSpace() { return wrapperContained.clipToSpace(); }
public void update(yarnwrap.world.BlockView area,yarnwrap.entity.Entity focusedEntity,boolean thirdPerson,boolean inverseView,float tickDelta) { wrapperContained.update(area.wrapperContained,focusedEntity.wrapperContained,thirdPerson,inverseView,tickDelta); }
// public void setPos(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPos(pos.wrapperContained); }
// public void moveBy() { wrapperContained.moveBy(); }
// public void setRotation(float yaw,float pitch) { wrapperContained.setRotation(yaw,pitch); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public void setPos(double x,double y,double z) { wrapperContained.setPos(x,y,z); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
public float getPitch() { return wrapperContained.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
public yarnwrap.entity.Entity getFocusedEntity() { return new yarnwrap.entity.Entity(wrapperContained.getFocusedEntity()); }
public boolean isReady() { return wrapperContained.isReady(); }
public boolean isThirdPerson() { return wrapperContained.isThirdPerson(); }
public yarnwrap.block.enums.CameraSubmersionType getSubmersionType() { return new yarnwrap.block.enums.CameraSubmersionType(wrapperContained.getSubmersionType()); }
public org.joml.Vector3f getHorizontalPlane() { return wrapperContained.getHorizontalPlane(); }
public org.joml.Vector3f getVerticalPlane() { return wrapperContained.getVerticalPlane(); }
public void reset() { wrapperContained.reset(); }
public org.joml.Quaternionf getRotation() { return wrapperContained.getRotation(); }
public org.joml.Vector3f getDiagonalPlane() { return wrapperContained.getDiagonalPlane(); }
public Object getProjection() { return wrapperContained.getProjection(); }
public float getLastTickDelta() { return wrapperContained.getLastTickDelta(); }

}