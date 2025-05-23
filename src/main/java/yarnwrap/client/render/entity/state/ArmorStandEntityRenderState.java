package yarnwrap.client.render.entity.state;
public class ArmorStandEntityRenderState { public net.minecraft.client.render.entity.state.ArmorStandEntityRenderState wrapperContained; public ArmorStandEntityRenderState(net.minecraft.client.render.entity.state.ArmorStandEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.yaw = value; }

public float timeSinceLastHit() { return wrapperContained.timeSinceLastHit; }
public void timeSinceLastHit(float value) { wrapperContained.timeSinceLastHit = value; }
// public static float timeSinceLastHit() { return net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.timeSinceLastHit; }
// public static void timeSinceLastHit(float value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.timeSinceLastHit = value; }

public boolean marker() { return wrapperContained.marker; }
public void marker(boolean value) { wrapperContained.marker = value; }
// public static boolean marker() { return net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.marker; }
// public static void marker(boolean value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.marker = value; }

public boolean small() { return wrapperContained.small; }
public void small(boolean value) { wrapperContained.small = value; }
// public static boolean small() { return net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.small; }
// public static void small(boolean value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.small = value; }

public boolean showArms() { return wrapperContained.showArms; }
public void showArms(boolean value) { wrapperContained.showArms = value; }
// public static boolean showArms() { return net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.showArms; }
// public static void showArms(boolean value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.showArms = value; }

public boolean showBasePlate() { return wrapperContained.showBasePlate; }
public void showBasePlate(boolean value) { wrapperContained.showBasePlate = value; }
// public static boolean showBasePlate() { return net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.showBasePlate; }
// public static void showBasePlate(boolean value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.showBasePlate = value; }

public yarnwrap.util.math.EulerAngle headRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.headRotation); }
public void headRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.headRotation = value.wrapperContained; }
// public static yarnwrap.util.math.EulerAngle headRotation() { return new yarnwrap.util.math.EulerAngle(net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.headRotation); }
// public static void headRotation(yarnwrap.util.math.EulerAngle value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.headRotation = value.wrapperContained; }

public yarnwrap.util.math.EulerAngle bodyRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.bodyRotation); }
public void bodyRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.bodyRotation = value.wrapperContained; }
// public static yarnwrap.util.math.EulerAngle bodyRotation() { return new yarnwrap.util.math.EulerAngle(net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.bodyRotation); }
// public static void bodyRotation(yarnwrap.util.math.EulerAngle value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.bodyRotation = value.wrapperContained; }

public yarnwrap.util.math.EulerAngle leftArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.leftArmRotation); }
public void leftArmRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.leftArmRotation = value.wrapperContained; }
// public static yarnwrap.util.math.EulerAngle leftArmRotation() { return new yarnwrap.util.math.EulerAngle(net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.leftArmRotation); }
// public static void leftArmRotation(yarnwrap.util.math.EulerAngle value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.leftArmRotation = value.wrapperContained; }

public yarnwrap.util.math.EulerAngle rightArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.rightArmRotation); }
public void rightArmRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.rightArmRotation = value.wrapperContained; }
// public static yarnwrap.util.math.EulerAngle rightArmRotation() { return new yarnwrap.util.math.EulerAngle(net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.rightArmRotation); }
// public static void rightArmRotation(yarnwrap.util.math.EulerAngle value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.rightArmRotation = value.wrapperContained; }

public yarnwrap.util.math.EulerAngle leftLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.leftLegRotation); }
public void leftLegRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.leftLegRotation = value.wrapperContained; }
// public static yarnwrap.util.math.EulerAngle leftLegRotation() { return new yarnwrap.util.math.EulerAngle(net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.leftLegRotation); }
// public static void leftLegRotation(yarnwrap.util.math.EulerAngle value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.leftLegRotation = value.wrapperContained; }

public yarnwrap.util.math.EulerAngle rightLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.rightLegRotation); }
public void rightLegRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.rightLegRotation = value.wrapperContained; }
// public static yarnwrap.util.math.EulerAngle rightLegRotation() { return new yarnwrap.util.math.EulerAngle(net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.rightLegRotation); }
// public static void rightLegRotation(yarnwrap.util.math.EulerAngle value, ) { net.minecraft.client.render.entity.state.ArmorStandEntityRenderState.rightLegRotation = value.wrapperContained; }


}