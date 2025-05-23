package yarnwrap.client.render.entity.state;
public class LivingEntityRenderState { public net.minecraft.client.render.entity.state.LivingEntityRenderState wrapperContained; public LivingEntityRenderState(net.minecraft.client.render.entity.state.LivingEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float bodyYaw() { return wrapperContained.bodyYaw; }
public void bodyYaw(float value) { wrapperContained.bodyYaw = value; }
// public static float bodyYaw() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.bodyYaw; }
// public static void bodyYaw(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.bodyYaw = value; }

public float relativeHeadYaw() { return wrapperContained.relativeHeadYaw; }
public void relativeHeadYaw(float value) { wrapperContained.relativeHeadYaw = value; }
// public static float relativeHeadYaw() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.relativeHeadYaw; }
// public static void relativeHeadYaw(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.relativeHeadYaw = value; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.pitch = value; }

public float deathTime() { return wrapperContained.deathTime; }
public void deathTime(float value) { wrapperContained.deathTime = value; }
// public static float deathTime() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.deathTime; }
// public static void deathTime(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.deathTime = value; }

public float limbSwingAnimationProgress() { return wrapperContained.limbSwingAnimationProgress; }
public void limbSwingAnimationProgress(float value) { wrapperContained.limbSwingAnimationProgress = value; }
// public static float limbSwingAnimationProgress() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.limbSwingAnimationProgress; }
// public static void limbSwingAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.limbSwingAnimationProgress = value; }

public float limbSwingAmplitude() { return wrapperContained.limbSwingAmplitude; }
public void limbSwingAmplitude(float value) { wrapperContained.limbSwingAmplitude = value; }
// public static float limbSwingAmplitude() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.limbSwingAmplitude; }
// public static void limbSwingAmplitude(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.limbSwingAmplitude = value; }

public float headItemAnimationProgress() { return wrapperContained.headItemAnimationProgress; }
public void headItemAnimationProgress(float value) { wrapperContained.headItemAnimationProgress = value; }
// public static float headItemAnimationProgress() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.headItemAnimationProgress; }
// public static void headItemAnimationProgress(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.headItemAnimationProgress = value; }

public float baseScale() { return wrapperContained.baseScale; }
public void baseScale(float value) { wrapperContained.baseScale = value; }
// public static float baseScale() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.baseScale; }
// public static void baseScale(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.baseScale = value; }

public float ageScale() { return wrapperContained.ageScale; }
public void ageScale(float value) { wrapperContained.ageScale = value; }
// public static float ageScale() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.ageScale; }
// public static void ageScale(float value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.ageScale = value; }

public boolean flipUpsideDown() { return wrapperContained.flipUpsideDown; }
public void flipUpsideDown(boolean value) { wrapperContained.flipUpsideDown = value; }
// public static boolean flipUpsideDown() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.flipUpsideDown; }
// public static void flipUpsideDown(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.flipUpsideDown = value; }

public boolean shaking() { return wrapperContained.shaking; }
public void shaking(boolean value) { wrapperContained.shaking = value; }
// public static boolean shaking() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.shaking; }
// public static void shaking(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.shaking = value; }

public boolean baby() { return wrapperContained.baby; }
public void baby(boolean value) { wrapperContained.baby = value; }
// public static boolean baby() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.baby; }
// public static void baby(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.baby = value; }

public boolean touchingWater() { return wrapperContained.touchingWater; }
public void touchingWater(boolean value) { wrapperContained.touchingWater = value; }
// public static boolean touchingWater() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.touchingWater; }
// public static void touchingWater(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.touchingWater = value; }

public boolean usingRiptide() { return wrapperContained.usingRiptide; }
public void usingRiptide(boolean value) { wrapperContained.usingRiptide = value; }
// public static boolean usingRiptide() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.usingRiptide; }
// public static void usingRiptide(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.usingRiptide = value; }

public boolean hurt() { return wrapperContained.hurt; }
public void hurt(boolean value) { wrapperContained.hurt = value; }
// public static boolean hurt() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.hurt; }
// public static void hurt(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.hurt = value; }

public boolean invisibleToPlayer() { return wrapperContained.invisibleToPlayer; }
public void invisibleToPlayer(boolean value) { wrapperContained.invisibleToPlayer = value; }
// public static boolean invisibleToPlayer() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.invisibleToPlayer; }
// public static void invisibleToPlayer(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.invisibleToPlayer = value; }

public boolean hasOutline() { return wrapperContained.hasOutline; }
public void hasOutline(boolean value) { wrapperContained.hasOutline = value; }
// public static boolean hasOutline() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.hasOutline; }
// public static void hasOutline(boolean value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.hasOutline = value; }

public yarnwrap.util.math.Direction sleepingDirection() { return new yarnwrap.util.math.Direction(wrapperContained.sleepingDirection); }
public void sleepingDirection(yarnwrap.util.math.Direction value) { wrapperContained.sleepingDirection = value.wrapperContained; }
// public static yarnwrap.util.math.Direction sleepingDirection() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.entity.state.LivingEntityRenderState.sleepingDirection); }
// public static void sleepingDirection(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.sleepingDirection = value.wrapperContained; }

public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public static yarnwrap.text.Text customName() { return new yarnwrap.text.Text(net.minecraft.client.render.entity.state.LivingEntityRenderState.customName); }
// public static void customName(yarnwrap.text.Text value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.customName = value.wrapperContained; }

public yarnwrap.entity.EntityPose pose() { return new yarnwrap.entity.EntityPose(wrapperContained.pose); }
public void pose(yarnwrap.entity.EntityPose value) { wrapperContained.pose = value.wrapperContained; }
// public static yarnwrap.entity.EntityPose pose() { return new yarnwrap.entity.EntityPose(net.minecraft.client.render.entity.state.LivingEntityRenderState.pose); }
// public static void pose(yarnwrap.entity.EntityPose value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.pose = value.wrapperContained; }

public yarnwrap.client.render.item.ItemRenderState headItemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.headItemRenderState); }
// public void headItemRenderState(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.headItemRenderState = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState headItemRenderState() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.LivingEntityRenderState.headItemRenderState); }
// public static void headItemRenderState(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.headItemRenderState = value.wrapperContained; }

public Object wearingSkullType() { return wrapperContained.wearingSkullType; }
// public void wearingSkullType(Object value) { wrapperContained.wearingSkullType = value; }
// // public static Object wearingSkullType() { return net.minecraft.client.render.entity.state.LivingEntityRenderState.wearingSkullType; }
// // public static void wearingSkullType(Object value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.wearingSkullType = value; }

public yarnwrap.component.type.ProfileComponent wearingSkullProfile() { return new yarnwrap.component.type.ProfileComponent(wrapperContained.wearingSkullProfile); }
public void wearingSkullProfile(yarnwrap.component.type.ProfileComponent value) { wrapperContained.wearingSkullProfile = value.wrapperContained; }
// public static yarnwrap.component.type.ProfileComponent wearingSkullProfile() { return new yarnwrap.component.type.ProfileComponent(net.minecraft.client.render.entity.state.LivingEntityRenderState.wearingSkullProfile); }
// public static void wearingSkullProfile(yarnwrap.component.type.ProfileComponent value, ) { net.minecraft.client.render.entity.state.LivingEntityRenderState.wearingSkullProfile = value.wrapperContained; }

public boolean isInPose(yarnwrap.entity.EntityPose pose) { return wrapperContained.isInPose(pose.wrapperContained); }
// public static boolean isInPose(yarnwrap.entity.EntityPose pose, ) { return net.minecraft.client.render.entity.state.LivingEntityRenderState.isInPose(pose.wrapperContained); }

}