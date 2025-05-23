package yarnwrap.client.render.entity.state;
public class BipedEntityRenderState { public net.minecraft.client.render.entity.state.BipedEntityRenderState wrapperContained; public BipedEntityRenderState(net.minecraft.client.render.entity.state.BipedEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float leaningPitch() { return wrapperContained.leaningPitch; }
public void leaningPitch(float value) { wrapperContained.leaningPitch = value; }
// public static float leaningPitch() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.leaningPitch; }
// public static void leaningPitch(float value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.leaningPitch = value; }

public float handSwingProgress() { return wrapperContained.handSwingProgress; }
public void handSwingProgress(float value) { wrapperContained.handSwingProgress = value; }
// public static float handSwingProgress() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.handSwingProgress; }
// public static void handSwingProgress(float value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.handSwingProgress = value; }

public float limbAmplitudeInverse() { return wrapperContained.limbAmplitudeInverse; }
public void limbAmplitudeInverse(float value) { wrapperContained.limbAmplitudeInverse = value; }
// public static float limbAmplitudeInverse() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.limbAmplitudeInverse; }
// public static void limbAmplitudeInverse(float value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.limbAmplitudeInverse = value; }

public float crossbowPullTime() { return wrapperContained.crossbowPullTime; }
public void crossbowPullTime(float value) { wrapperContained.crossbowPullTime = value; }
// public static float crossbowPullTime() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.crossbowPullTime; }
// public static void crossbowPullTime(float value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.crossbowPullTime = value; }

public int itemUseTime() { return wrapperContained.itemUseTime; }
public void itemUseTime(int value) { wrapperContained.itemUseTime = value; }
// public static int itemUseTime() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.itemUseTime; }
// public static void itemUseTime(int value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.itemUseTime = value; }

public yarnwrap.util.Arm preferredArm() { return new yarnwrap.util.Arm(wrapperContained.preferredArm); }
public void preferredArm(yarnwrap.util.Arm value) { wrapperContained.preferredArm = value.wrapperContained; }
// public static yarnwrap.util.Arm preferredArm() { return new yarnwrap.util.Arm(net.minecraft.client.render.entity.state.BipedEntityRenderState.preferredArm); }
// public static void preferredArm(yarnwrap.util.Arm value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.preferredArm = value.wrapperContained; }

public yarnwrap.util.Hand activeHand() { return new yarnwrap.util.Hand(wrapperContained.activeHand); }
public void activeHand(yarnwrap.util.Hand value) { wrapperContained.activeHand = value.wrapperContained; }
// public static yarnwrap.util.Hand activeHand() { return new yarnwrap.util.Hand(net.minecraft.client.render.entity.state.BipedEntityRenderState.activeHand); }
// public static void activeHand(yarnwrap.util.Hand value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.activeHand = value.wrapperContained; }

public boolean isInSneakingPose() { return wrapperContained.isInSneakingPose; }
public void isInSneakingPose(boolean value) { wrapperContained.isInSneakingPose = value; }
// public static boolean isInSneakingPose() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.isInSneakingPose; }
// public static void isInSneakingPose(boolean value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.isInSneakingPose = value; }

public boolean isGliding() { return wrapperContained.isGliding; }
public void isGliding(boolean value) { wrapperContained.isGliding = value; }
// public static boolean isGliding() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.isGliding; }
// public static void isGliding(boolean value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.isGliding = value; }

public boolean isSwimming() { return wrapperContained.isSwimming; }
public void isSwimming(boolean value) { wrapperContained.isSwimming = value; }
// public static boolean isSwimming() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.isSwimming; }
// public static void isSwimming(boolean value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.isSwimming = value; }

public boolean hasVehicle() { return wrapperContained.hasVehicle; }
public void hasVehicle(boolean value) { wrapperContained.hasVehicle = value; }
// public static boolean hasVehicle() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.hasVehicle; }
// public static void hasVehicle(boolean value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.hasVehicle = value; }

public boolean isUsingItem() { return wrapperContained.isUsingItem; }
public void isUsingItem(boolean value) { wrapperContained.isUsingItem = value; }
// public static boolean isUsingItem() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.isUsingItem; }
// public static void isUsingItem(boolean value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.isUsingItem = value; }

public float leftWingPitch() { return wrapperContained.leftWingPitch; }
public void leftWingPitch(float value) { wrapperContained.leftWingPitch = value; }
// public static float leftWingPitch() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.leftWingPitch; }
// public static void leftWingPitch(float value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.leftWingPitch = value; }

public float leftWingYaw() { return wrapperContained.leftWingYaw; }
public void leftWingYaw(float value) { wrapperContained.leftWingYaw = value; }
// public static float leftWingYaw() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.leftWingYaw; }
// public static void leftWingYaw(float value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.leftWingYaw = value; }

public float leftWingRoll() { return wrapperContained.leftWingRoll; }
public void leftWingRoll(float value) { wrapperContained.leftWingRoll = value; }
// public static float leftWingRoll() { return net.minecraft.client.render.entity.state.BipedEntityRenderState.leftWingRoll; }
// public static void leftWingRoll(float value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.leftWingRoll = value; }

public yarnwrap.item.ItemStack equippedChestStack() { return new yarnwrap.item.ItemStack(wrapperContained.equippedChestStack); }
public void equippedChestStack(yarnwrap.item.ItemStack value) { wrapperContained.equippedChestStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack equippedChestStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedChestStack); }
// public static void equippedChestStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedChestStack = value.wrapperContained; }

public yarnwrap.item.ItemStack equippedLegsStack() { return new yarnwrap.item.ItemStack(wrapperContained.equippedLegsStack); }
public void equippedLegsStack(yarnwrap.item.ItemStack value) { wrapperContained.equippedLegsStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack equippedLegsStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedLegsStack); }
// public static void equippedLegsStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedLegsStack = value.wrapperContained; }

public yarnwrap.item.ItemStack equippedFeetStack() { return new yarnwrap.item.ItemStack(wrapperContained.equippedFeetStack); }
public void equippedFeetStack(yarnwrap.item.ItemStack value) { wrapperContained.equippedFeetStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack equippedFeetStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedFeetStack); }
// public static void equippedFeetStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedFeetStack = value.wrapperContained; }

public yarnwrap.item.ItemStack equippedHeadStack() { return new yarnwrap.item.ItemStack(wrapperContained.equippedHeadStack); }
public void equippedHeadStack(yarnwrap.item.ItemStack value) { wrapperContained.equippedHeadStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack equippedHeadStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedHeadStack); }
// public static void equippedHeadStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.BipedEntityRenderState.equippedHeadStack = value.wrapperContained; }


}