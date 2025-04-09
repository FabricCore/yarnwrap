package yarnwrap.client.render;
public class Camera { public net.minecraft.client.render.Camera wrapperContained; public Camera(net.minecraft.client.render.Camera wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean ready() { return wrapperContained.ready; }
// public yarnwrap.world.BlockView area() { return new yarnwrap.world.BlockView(wrapperContained.area); }
// public yarnwrap.entity.Entity focusedEntity() { return new yarnwrap.entity.Entity(wrapperContained.focusedEntity); }
// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public Object blockPos() { return wrapperContained.blockPos; }
// public org.joml.Vector3f horizontalPlane() { return wrapperContained.horizontalPlane; }
// public org.joml.Vector3f verticalPlane() { return wrapperContained.verticalPlane; }
// public org.joml.Vector3f diagonalPlane() { return wrapperContained.diagonalPlane; }
// public float pitch() { return wrapperContained.pitch; }
// public float yaw() { return wrapperContained.yaw; }
// public boolean thirdPerson() { return wrapperContained.thirdPerson; }
// public float cameraY() { return wrapperContained.cameraY; }
// public float lastCameraY() { return wrapperContained.lastCameraY; }
// public org.joml.Quaternionf rotation() { return wrapperContained.rotation; }
// public float lastTickDelta() { return wrapperContained.lastTickDelta; }
// public float BASE_CAMERA_DISTANCE() { return wrapperContained.BASE_CAMERA_DISTANCE; }
// public org.joml.Vector3f HORIZONTAL() { return wrapperContained.HORIZONTAL; }
// public org.joml.Vector3f VERTICAL() { return wrapperContained.VERTICAL; }
// public org.joml.Vector3f DIAGONAL() { return wrapperContained.DIAGONAL; }
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