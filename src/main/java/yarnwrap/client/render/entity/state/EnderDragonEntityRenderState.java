package yarnwrap.client.render.entity.state;
public class EnderDragonEntityRenderState { public net.minecraft.client.render.entity.state.EnderDragonEntityRenderState wrapperContained; public EnderDragonEntityRenderState(net.minecraft.client.render.entity.state.EnderDragonEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float wingPosition() { return wrapperContained.wingPosition; }
public void wingPosition(float value) { wrapperContained.wingPosition = value; }
// public static float wingPosition() { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.wingPosition; }
// public static void wingPosition(float value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.wingPosition = value; }

public float ticksSinceDeath() { return wrapperContained.ticksSinceDeath; }
public void ticksSinceDeath(float value) { wrapperContained.ticksSinceDeath = value; }
// public static float ticksSinceDeath() { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.ticksSinceDeath; }
// public static void ticksSinceDeath(float value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.ticksSinceDeath = value; }

public boolean hurt() { return wrapperContained.hurt; }
public void hurt(boolean value) { wrapperContained.hurt = value; }
// public static boolean hurt() { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.hurt; }
// public static void hurt(boolean value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.hurt = value; }

public yarnwrap.util.math.Vec3d crystalBeamPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.crystalBeamPos); }
public void crystalBeamPos(yarnwrap.util.math.Vec3d value) { wrapperContained.crystalBeamPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d crystalBeamPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.crystalBeamPos); }
// public static void crystalBeamPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.crystalBeamPos = value.wrapperContained; }

public boolean inLandingOrTakeoffPhase() { return wrapperContained.inLandingOrTakeoffPhase; }
public void inLandingOrTakeoffPhase(boolean value) { wrapperContained.inLandingOrTakeoffPhase = value; }
// public static boolean inLandingOrTakeoffPhase() { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.inLandingOrTakeoffPhase; }
// public static void inLandingOrTakeoffPhase(boolean value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.inLandingOrTakeoffPhase = value; }

public boolean sittingOrHovering() { return wrapperContained.sittingOrHovering; }
public void sittingOrHovering(boolean value) { wrapperContained.sittingOrHovering = value; }
// public static boolean sittingOrHovering() { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.sittingOrHovering; }
// public static void sittingOrHovering(boolean value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.sittingOrHovering = value; }

public double squaredDistanceFromOrigin() { return wrapperContained.squaredDistanceFromOrigin; }
public void squaredDistanceFromOrigin(double value) { wrapperContained.squaredDistanceFromOrigin = value; }
// public static double squaredDistanceFromOrigin() { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.squaredDistanceFromOrigin; }
// public static void squaredDistanceFromOrigin(double value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.squaredDistanceFromOrigin = value; }

public float tickProgress() { return wrapperContained.tickProgress; }
public void tickProgress(float value) { wrapperContained.tickProgress = value; }
// public static float tickProgress() { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.tickProgress; }
// public static void tickProgress(float value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.tickProgress = value; }

public yarnwrap.entity.boss.dragon.EnderDragonFrameTracker frameTracker() { return new yarnwrap.entity.boss.dragon.EnderDragonFrameTracker(wrapperContained.frameTracker); }
// public void frameTracker(yarnwrap.entity.boss.dragon.EnderDragonFrameTracker value) { wrapperContained.frameTracker = value.wrapperContained; }
// public static yarnwrap.entity.boss.dragon.EnderDragonFrameTracker frameTracker() { return new yarnwrap.entity.boss.dragon.EnderDragonFrameTracker(net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.frameTracker); }
// public static void frameTracker(yarnwrap.entity.boss.dragon.EnderDragonFrameTracker value, ) { net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.frameTracker = value.wrapperContained; }

public Object getLerpedFrame(int age) { return wrapperContained.getLerpedFrame(age); }
// public static Object getLerpedFrame(int age, ) { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.getLerpedFrame(age); }
// public float getNeckPartPitchOffset(int id,Object bodyFrame,Object neckFrame) { return wrapperContained.getNeckPartPitchOffset(id,bodyFrame,neckFrame); }
// public static float getNeckPartPitchOffset(int id,Object bodyFrame,Object neckFrame, ) { return net.minecraft.client.render.entity.state.EnderDragonEntityRenderState.getNeckPartPitchOffset(id,bodyFrame,neckFrame); }

}