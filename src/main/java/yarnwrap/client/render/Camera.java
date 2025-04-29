package yarnwrap.client.render;
public class Camera { public net.minecraft.client.render.Camera wrapperContained; public Camera(net.minecraft.client.render.Camera wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean ready() { return wrapperContained.ready; }
// public void ready(boolean value) { wrapperContained.ready = value; }
// public static boolean ready() { return net.minecraft.client.render.Camera.ready; }
// public static void ready(boolean value, ) { net.minecraft.client.render.Camera.ready = value; }

// public yarnwrap.world.BlockView area() { return new yarnwrap.world.BlockView(wrapperContained.area); }
// public void area(yarnwrap.world.BlockView value) { wrapperContained.area = value.wrapperContained; }
// public static yarnwrap.world.BlockView area() { return new yarnwrap.world.BlockView(net.minecraft.client.render.Camera.area); }
// public static void area(yarnwrap.world.BlockView value, ) { net.minecraft.client.render.Camera.area = value.wrapperContained; }

// public yarnwrap.entity.Entity focusedEntity() { return new yarnwrap.entity.Entity(wrapperContained.focusedEntity); }
// public void focusedEntity(yarnwrap.entity.Entity value) { wrapperContained.focusedEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity focusedEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.render.Camera.focusedEntity); }
// public static void focusedEntity(yarnwrap.entity.Entity value, ) { net.minecraft.client.render.Camera.focusedEntity = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.Camera.pos); }
// public static void pos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.Camera.pos = value.wrapperContained; }

// public Object blockPos() { return wrapperContained.blockPos; }
// // public void blockPos(Object value) { wrapperContained.blockPos = value; }
// // public static Object blockPos() { return net.minecraft.client.render.Camera.blockPos; }
// // public static void blockPos(Object value, ) { net.minecraft.client.render.Camera.blockPos = value; }

// public org.joml.Vector3f horizontalPlane() { return wrapperContained.horizontalPlane; }
// public void horizontalPlane(org.joml.Vector3f value) { wrapperContained.horizontalPlane = value; }
// public static org.joml.Vector3f horizontalPlane() { return net.minecraft.client.render.Camera.horizontalPlane; }
// public static void horizontalPlane(org.joml.Vector3f value, ) { net.minecraft.client.render.Camera.horizontalPlane = value; }

// public org.joml.Vector3f verticalPlane() { return wrapperContained.verticalPlane; }
// public void verticalPlane(org.joml.Vector3f value) { wrapperContained.verticalPlane = value; }
// public static org.joml.Vector3f verticalPlane() { return net.minecraft.client.render.Camera.verticalPlane; }
// public static void verticalPlane(org.joml.Vector3f value, ) { net.minecraft.client.render.Camera.verticalPlane = value; }

// public org.joml.Vector3f diagonalPlane() { return wrapperContained.diagonalPlane; }
// public void diagonalPlane(org.joml.Vector3f value) { wrapperContained.diagonalPlane = value; }
// public static org.joml.Vector3f diagonalPlane() { return net.minecraft.client.render.Camera.diagonalPlane; }
// public static void diagonalPlane(org.joml.Vector3f value, ) { net.minecraft.client.render.Camera.diagonalPlane = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.Camera.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.Camera.pitch = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.Camera.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.Camera.yaw = value; }

// public boolean thirdPerson() { return wrapperContained.thirdPerson; }
// public void thirdPerson(boolean value) { wrapperContained.thirdPerson = value; }
// public static boolean thirdPerson() { return net.minecraft.client.render.Camera.thirdPerson; }
// public static void thirdPerson(boolean value, ) { net.minecraft.client.render.Camera.thirdPerson = value; }

// public float cameraY() { return wrapperContained.cameraY; }
// public void cameraY(float value) { wrapperContained.cameraY = value; }
// public static float cameraY() { return net.minecraft.client.render.Camera.cameraY; }
// public static void cameraY(float value, ) { net.minecraft.client.render.Camera.cameraY = value; }

// public float lastCameraY() { return wrapperContained.lastCameraY; }
// public void lastCameraY(float value) { wrapperContained.lastCameraY = value; }
// public static float lastCameraY() { return net.minecraft.client.render.Camera.lastCameraY; }
// public static void lastCameraY(float value, ) { net.minecraft.client.render.Camera.lastCameraY = value; }

// public org.joml.Quaternionf rotation() { return wrapperContained.rotation; }
// public void rotation(org.joml.Quaternionf value) { wrapperContained.rotation = value; }
// public static org.joml.Quaternionf rotation() { return net.minecraft.client.render.Camera.rotation; }
// public static void rotation(org.joml.Quaternionf value, ) { net.minecraft.client.render.Camera.rotation = value; }

// public float lastTickDelta() { return wrapperContained.lastTickDelta; }
// public void lastTickDelta(float value) { wrapperContained.lastTickDelta = value; }
// public static float lastTickDelta() { return net.minecraft.client.render.Camera.lastTickDelta; }
// public static void lastTickDelta(float value, ) { net.minecraft.client.render.Camera.lastTickDelta = value; }

// public float BASE_CAMERA_DISTANCE() { return wrapperContained.BASE_CAMERA_DISTANCE; }
// public void BASE_CAMERA_DISTANCE(float value) { wrapperContained.BASE_CAMERA_DISTANCE = value; }
// public static float BASE_CAMERA_DISTANCE() { return net.minecraft.client.render.Camera.BASE_CAMERA_DISTANCE; }
// public static void BASE_CAMERA_DISTANCE(float value, ) { net.minecraft.client.render.Camera.BASE_CAMERA_DISTANCE = value; }

// public org.joml.Vector3f HORIZONTAL() { return wrapperContained.HORIZONTAL; }
// public void HORIZONTAL(org.joml.Vector3f value) { wrapperContained.HORIZONTAL = value; }
// public static org.joml.Vector3f HORIZONTAL() { return net.minecraft.client.render.Camera.HORIZONTAL; }
// public static void HORIZONTAL(org.joml.Vector3f value, ) { net.minecraft.client.render.Camera.HORIZONTAL = value; }

// public org.joml.Vector3f VERTICAL() { return wrapperContained.VERTICAL; }
// public void VERTICAL(org.joml.Vector3f value) { wrapperContained.VERTICAL = value; }
// public static org.joml.Vector3f VERTICAL() { return net.minecraft.client.render.Camera.VERTICAL; }
// public static void VERTICAL(org.joml.Vector3f value, ) { net.minecraft.client.render.Camera.VERTICAL = value; }

// public org.joml.Vector3f DIAGONAL() { return wrapperContained.DIAGONAL; }
// public void DIAGONAL(org.joml.Vector3f value) { wrapperContained.DIAGONAL = value; }
// public static org.joml.Vector3f DIAGONAL() { return net.minecraft.client.render.Camera.DIAGONAL; }
// public static void DIAGONAL(org.joml.Vector3f value, ) { net.minecraft.client.render.Camera.DIAGONAL = value; }

public void updateEyeHeight() { wrapperContained.updateEyeHeight(); }
// public static void updateEyeHeight() { net.minecraft.client.render.Camera.updateEyeHeight(); }
// public float clipToSpace() { return wrapperContained.clipToSpace(); }
// public static float clipToSpace() { return net.minecraft.client.render.Camera.clipToSpace(); }
public void update(yarnwrap.world.BlockView area,yarnwrap.entity.Entity focusedEntity,boolean thirdPerson,boolean inverseView,float tickDelta) { wrapperContained.update(area.wrapperContained,focusedEntity.wrapperContained,thirdPerson,inverseView,tickDelta); }
// public static void update(yarnwrap.world.BlockView area,yarnwrap.entity.Entity focusedEntity,boolean thirdPerson,boolean inverseView,float tickDelta, ) { net.minecraft.client.render.Camera.update(area.wrapperContained,focusedEntity.wrapperContained,thirdPerson,inverseView,tickDelta); }
// public void setPos(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPos(pos.wrapperContained); }
// public static void setPos(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.client.render.Camera.setPos(pos.wrapperContained); }
// public void moveBy() { wrapperContained.moveBy(); }
// public static void moveBy() { net.minecraft.client.render.Camera.moveBy(); }
// public void setRotation(float yaw,float pitch) { wrapperContained.setRotation(yaw,pitch); }
// public static void setRotation(float yaw,float pitch, ) { net.minecraft.client.render.Camera.setRotation(yaw,pitch); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.Camera.getPos()); }
// public void setPos(double x,double y,double z) { wrapperContained.setPos(x,y,z); }
// public static void setPos(double x,double y,double z, ) { net.minecraft.client.render.Camera.setPos(x,y,z); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
// public static yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.client.render.Camera.getBlockPos()); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.client.render.Camera.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.client.render.Camera.getYaw(); }
public yarnwrap.entity.Entity getFocusedEntity() { return new yarnwrap.entity.Entity(wrapperContained.getFocusedEntity()); }
// public static yarnwrap.entity.Entity getFocusedEntity() { return new yarnwrap.entity.Entity(net.minecraft.client.render.Camera.getFocusedEntity()); }
public boolean isReady() { return wrapperContained.isReady(); }
// public static boolean isReady() { return net.minecraft.client.render.Camera.isReady(); }
public boolean isThirdPerson() { return wrapperContained.isThirdPerson(); }
// public static boolean isThirdPerson() { return net.minecraft.client.render.Camera.isThirdPerson(); }
public yarnwrap.block.enums.CameraSubmersionType getSubmersionType() { return new yarnwrap.block.enums.CameraSubmersionType(wrapperContained.getSubmersionType()); }
// public static yarnwrap.block.enums.CameraSubmersionType getSubmersionType() { return new yarnwrap.block.enums.CameraSubmersionType(net.minecraft.client.render.Camera.getSubmersionType()); }
public org.joml.Vector3f getHorizontalPlane() { return wrapperContained.getHorizontalPlane(); }
// public static org.joml.Vector3f getHorizontalPlane() { return net.minecraft.client.render.Camera.getHorizontalPlane(); }
public org.joml.Vector3f getVerticalPlane() { return wrapperContained.getVerticalPlane(); }
// public static org.joml.Vector3f getVerticalPlane() { return net.minecraft.client.render.Camera.getVerticalPlane(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.render.Camera.reset(); }
public org.joml.Quaternionf getRotation() { return wrapperContained.getRotation(); }
// public static org.joml.Quaternionf getRotation() { return net.minecraft.client.render.Camera.getRotation(); }
public org.joml.Vector3f getDiagonalPlane() { return wrapperContained.getDiagonalPlane(); }
// public static org.joml.Vector3f getDiagonalPlane() { return net.minecraft.client.render.Camera.getDiagonalPlane(); }
public Object getProjection() { return wrapperContained.getProjection(); }
// public static Object getProjection() { return net.minecraft.client.render.Camera.getProjection(); }
public float getLastTickDelta() { return wrapperContained.getLastTickDelta(); }
// public static float getLastTickDelta() { return net.minecraft.client.render.Camera.getLastTickDelta(); }

}