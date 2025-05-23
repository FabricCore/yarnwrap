package yarnwrap.client.render.entity.state;
public class EntityRenderState { public net.minecraft.client.render.entity.state.EntityRenderState wrapperContained; public EntityRenderState(net.minecraft.client.render.entity.state.EntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public double x() { return wrapperContained.x; }
public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.client.render.entity.state.EntityRenderState.x; }
// public static void x(double value, ) { net.minecraft.client.render.entity.state.EntityRenderState.x = value; }

public double y() { return wrapperContained.y; }
public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.client.render.entity.state.EntityRenderState.y; }
// public static void y(double value, ) { net.minecraft.client.render.entity.state.EntityRenderState.y = value; }

public double z() { return wrapperContained.z; }
public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.client.render.entity.state.EntityRenderState.z; }
// public static void z(double value, ) { net.minecraft.client.render.entity.state.EntityRenderState.z = value; }

public float age() { return wrapperContained.age; }
public void age(float value) { wrapperContained.age = value; }
// public static float age() { return net.minecraft.client.render.entity.state.EntityRenderState.age; }
// public static void age(float value, ) { net.minecraft.client.render.entity.state.EntityRenderState.age = value; }

public float width() { return wrapperContained.width; }
public void width(float value) { wrapperContained.width = value; }
// public static float width() { return net.minecraft.client.render.entity.state.EntityRenderState.width; }
// public static void width(float value, ) { net.minecraft.client.render.entity.state.EntityRenderState.width = value; }

public float height() { return wrapperContained.height; }
public void height(float value) { wrapperContained.height = value; }
// public static float height() { return net.minecraft.client.render.entity.state.EntityRenderState.height; }
// public static void height(float value, ) { net.minecraft.client.render.entity.state.EntityRenderState.height = value; }

public float standingEyeHeight() { return wrapperContained.standingEyeHeight; }
public void standingEyeHeight(float value) { wrapperContained.standingEyeHeight = value; }
// public static float standingEyeHeight() { return net.minecraft.client.render.entity.state.EntityRenderState.standingEyeHeight; }
// public static void standingEyeHeight(float value, ) { net.minecraft.client.render.entity.state.EntityRenderState.standingEyeHeight = value; }

public double squaredDistanceToCamera() { return wrapperContained.squaredDistanceToCamera; }
public void squaredDistanceToCamera(double value) { wrapperContained.squaredDistanceToCamera = value; }
// public static double squaredDistanceToCamera() { return net.minecraft.client.render.entity.state.EntityRenderState.squaredDistanceToCamera; }
// public static void squaredDistanceToCamera(double value, ) { net.minecraft.client.render.entity.state.EntityRenderState.squaredDistanceToCamera = value; }

public boolean invisible() { return wrapperContained.invisible; }
public void invisible(boolean value) { wrapperContained.invisible = value; }
// public static boolean invisible() { return net.minecraft.client.render.entity.state.EntityRenderState.invisible; }
// public static void invisible(boolean value, ) { net.minecraft.client.render.entity.state.EntityRenderState.invisible = value; }

public boolean sneaking() { return wrapperContained.sneaking; }
public void sneaking(boolean value) { wrapperContained.sneaking = value; }
// public static boolean sneaking() { return net.minecraft.client.render.entity.state.EntityRenderState.sneaking; }
// public static void sneaking(boolean value, ) { net.minecraft.client.render.entity.state.EntityRenderState.sneaking = value; }

public boolean onFire() { return wrapperContained.onFire; }
public void onFire(boolean value) { wrapperContained.onFire = value; }
// public static boolean onFire() { return net.minecraft.client.render.entity.state.EntityRenderState.onFire; }
// public static void onFire(boolean value, ) { net.minecraft.client.render.entity.state.EntityRenderState.onFire = value; }

public yarnwrap.util.math.Vec3d positionOffset() { return new yarnwrap.util.math.Vec3d(wrapperContained.positionOffset); }
public void positionOffset(yarnwrap.util.math.Vec3d value) { wrapperContained.positionOffset = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d positionOffset() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.EntityRenderState.positionOffset); }
// public static void positionOffset(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.EntityRenderState.positionOffset = value.wrapperContained; }

public yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(wrapperContained.displayName); }
public void displayName(yarnwrap.text.Text value) { wrapperContained.displayName = value.wrapperContained; }
// public static yarnwrap.text.Text displayName() { return new yarnwrap.text.Text(net.minecraft.client.render.entity.state.EntityRenderState.displayName); }
// public static void displayName(yarnwrap.text.Text value, ) { net.minecraft.client.render.entity.state.EntityRenderState.displayName = value.wrapperContained; }

public yarnwrap.util.math.Vec3d nameLabelPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.nameLabelPos); }
public void nameLabelPos(yarnwrap.util.math.Vec3d value) { wrapperContained.nameLabelPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d nameLabelPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.EntityRenderState.nameLabelPos); }
// public static void nameLabelPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.EntityRenderState.nameLabelPos = value.wrapperContained; }

public yarnwrap.client.render.entity.state.EntityHitboxAndView hitbox() { return new yarnwrap.client.render.entity.state.EntityHitboxAndView(wrapperContained.hitbox); }
public void hitbox(yarnwrap.client.render.entity.state.EntityHitboxAndView value) { wrapperContained.hitbox = value.wrapperContained; }
// public static yarnwrap.client.render.entity.state.EntityHitboxAndView hitbox() { return new yarnwrap.client.render.entity.state.EntityHitboxAndView(net.minecraft.client.render.entity.state.EntityRenderState.hitbox); }
// public static void hitbox(yarnwrap.client.render.entity.state.EntityHitboxAndView value, ) { net.minecraft.client.render.entity.state.EntityRenderState.hitbox = value.wrapperContained; }

public yarnwrap.client.render.entity.state.EntityDebugInfo debugInfo() { return new yarnwrap.client.render.entity.state.EntityDebugInfo(wrapperContained.debugInfo); }
public void debugInfo(yarnwrap.client.render.entity.state.EntityDebugInfo value) { wrapperContained.debugInfo = value.wrapperContained; }
// public static yarnwrap.client.render.entity.state.EntityDebugInfo debugInfo() { return new yarnwrap.client.render.entity.state.EntityDebugInfo(net.minecraft.client.render.entity.state.EntityRenderState.debugInfo); }
// public static void debugInfo(yarnwrap.client.render.entity.state.EntityDebugInfo value, ) { net.minecraft.client.render.entity.state.EntityRenderState.debugInfo = value.wrapperContained; }

public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
public void entityType(yarnwrap.entity.EntityType value) { wrapperContained.entityType = value.wrapperContained; }
// public static yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(net.minecraft.client.render.entity.state.EntityRenderState.entityType); }
// public static void entityType(yarnwrap.entity.EntityType value, ) { net.minecraft.client.render.entity.state.EntityRenderState.entityType = value.wrapperContained; }

// public java.util.List leashDatas() { return wrapperContained.leashDatas; }
// public void leashDatas(java.util.List value) { wrapperContained.leashDatas = value; }
// public static java.util.List leashDatas() { return net.minecraft.client.render.entity.state.EntityRenderState.leashDatas; }
// public static void leashDatas(java.util.List value, ) { net.minecraft.client.render.entity.state.EntityRenderState.leashDatas = value; }

public void addCrashReportDetails(yarnwrap.util.crash.CrashReportSection crashReportSection) { wrapperContained.addCrashReportDetails(crashReportSection.wrapperContained); }
// public static void addCrashReportDetails(yarnwrap.util.crash.CrashReportSection crashReportSection, ) { net.minecraft.client.render.entity.state.EntityRenderState.addCrashReportDetails(crashReportSection.wrapperContained); }

}