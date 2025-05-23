package yarnwrap.entity.mob;
public class ElytraFlightController { public net.minecraft.entity.mob.ElytraFlightController wrapperContained; public ElytraFlightController(net.minecraft.entity.mob.ElytraFlightController wrapperContained) { this.wrapperContained = wrapperContained; }

// public float leftWingPitch() { return wrapperContained.leftWingPitch; }
// public void leftWingPitch(float value) { wrapperContained.leftWingPitch = value; }
// public static float leftWingPitch() { return net.minecraft.entity.mob.ElytraFlightController.leftWingPitch; }
// public static void leftWingPitch(float value, ) { net.minecraft.entity.mob.ElytraFlightController.leftWingPitch = value; }

// public float leftWingYaw() { return wrapperContained.leftWingYaw; }
// public void leftWingYaw(float value) { wrapperContained.leftWingYaw = value; }
// public static float leftWingYaw() { return net.minecraft.entity.mob.ElytraFlightController.leftWingYaw; }
// public static void leftWingYaw(float value, ) { net.minecraft.entity.mob.ElytraFlightController.leftWingYaw = value; }

// public float leftWingRoll() { return wrapperContained.leftWingRoll; }
// public void leftWingRoll(float value) { wrapperContained.leftWingRoll = value; }
// public static float leftWingRoll() { return net.minecraft.entity.mob.ElytraFlightController.leftWingRoll; }
// public static void leftWingRoll(float value, ) { net.minecraft.entity.mob.ElytraFlightController.leftWingRoll = value; }

// public float lastLeftWingPitch() { return wrapperContained.lastLeftWingPitch; }
// public void lastLeftWingPitch(float value) { wrapperContained.lastLeftWingPitch = value; }
// public static float lastLeftWingPitch() { return net.minecraft.entity.mob.ElytraFlightController.lastLeftWingPitch; }
// public static void lastLeftWingPitch(float value, ) { net.minecraft.entity.mob.ElytraFlightController.lastLeftWingPitch = value; }

// public float lastLeftWingYaw() { return wrapperContained.lastLeftWingYaw; }
// public void lastLeftWingYaw(float value) { wrapperContained.lastLeftWingYaw = value; }
// public static float lastLeftWingYaw() { return net.minecraft.entity.mob.ElytraFlightController.lastLeftWingYaw; }
// public static void lastLeftWingYaw(float value, ) { net.minecraft.entity.mob.ElytraFlightController.lastLeftWingYaw = value; }

// public float lastLeftWingRoll() { return wrapperContained.lastLeftWingRoll; }
// public void lastLeftWingRoll(float value) { wrapperContained.lastLeftWingRoll = value; }
// public static float lastLeftWingRoll() { return net.minecraft.entity.mob.ElytraFlightController.lastLeftWingRoll; }
// public static void lastLeftWingRoll(float value, ) { net.minecraft.entity.mob.ElytraFlightController.lastLeftWingRoll = value; }

// public yarnwrap.entity.LivingEntity entity() { return new yarnwrap.entity.LivingEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.LivingEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity entity() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.ElytraFlightController.entity); }
// public static void entity(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.mob.ElytraFlightController.entity = value.wrapperContained; }

public ElytraFlightController(yarnwrap.entity.LivingEntity entity) { this.wrapperContained = new net.minecraft.entity.mob.ElytraFlightController(entity.wrapperContained); }
public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.entity.mob.ElytraFlightController.update(); }
// public float leftWingPitch(float tickProgress) { return wrapperContained.leftWingPitch(tickProgress); }
// // public static float leftWingPitch(float tickProgress, ) { return net.minecraft.entity.mob.ElytraFlightController.leftWingPitch(tickProgress); }
// public float leftWingYaw(float tickProgress) { return wrapperContained.leftWingYaw(tickProgress); }
// // public static float leftWingYaw(float tickProgress, ) { return net.minecraft.entity.mob.ElytraFlightController.leftWingYaw(tickProgress); }
// public float leftWingRoll(float tickProgress) { return wrapperContained.leftWingRoll(tickProgress); }
// // public static float leftWingRoll(float tickProgress, ) { return net.minecraft.entity.mob.ElytraFlightController.leftWingRoll(tickProgress); }

}