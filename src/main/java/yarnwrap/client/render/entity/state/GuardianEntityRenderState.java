package yarnwrap.client.render.entity.state;
public class GuardianEntityRenderState { public net.minecraft.client.render.entity.state.GuardianEntityRenderState wrapperContained; public GuardianEntityRenderState(net.minecraft.client.render.entity.state.GuardianEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float spikesExtension() { return wrapperContained.spikesExtension; }
public void spikesExtension(float value) { wrapperContained.spikesExtension = value; }
// public static float spikesExtension() { return net.minecraft.client.render.entity.state.GuardianEntityRenderState.spikesExtension; }
// public static void spikesExtension(float value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.spikesExtension = value; }

public float tailAngle() { return wrapperContained.tailAngle; }
public void tailAngle(float value) { wrapperContained.tailAngle = value; }
// public static float tailAngle() { return net.minecraft.client.render.entity.state.GuardianEntityRenderState.tailAngle; }
// public static void tailAngle(float value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.tailAngle = value; }

public yarnwrap.util.math.Vec3d cameraPosVec() { return new yarnwrap.util.math.Vec3d(wrapperContained.cameraPosVec); }
public void cameraPosVec(yarnwrap.util.math.Vec3d value) { wrapperContained.cameraPosVec = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d cameraPosVec() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.GuardianEntityRenderState.cameraPosVec); }
// public static void cameraPosVec(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.cameraPosVec = value.wrapperContained; }

public yarnwrap.util.math.Vec3d rotationVec() { return new yarnwrap.util.math.Vec3d(wrapperContained.rotationVec); }
public void rotationVec(yarnwrap.util.math.Vec3d value) { wrapperContained.rotationVec = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d rotationVec() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.GuardianEntityRenderState.rotationVec); }
// public static void rotationVec(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.rotationVec = value.wrapperContained; }

public yarnwrap.util.math.Vec3d lookAtPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.lookAtPos); }
public void lookAtPos(yarnwrap.util.math.Vec3d value) { wrapperContained.lookAtPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d lookAtPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.GuardianEntityRenderState.lookAtPos); }
// public static void lookAtPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.lookAtPos = value.wrapperContained; }

public yarnwrap.util.math.Vec3d beamTargetPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.beamTargetPos); }
public void beamTargetPos(yarnwrap.util.math.Vec3d value) { wrapperContained.beamTargetPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d beamTargetPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.GuardianEntityRenderState.beamTargetPos); }
// public static void beamTargetPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.beamTargetPos = value.wrapperContained; }

public float beamTicks() { return wrapperContained.beamTicks; }
public void beamTicks(float value) { wrapperContained.beamTicks = value; }
// public static float beamTicks() { return net.minecraft.client.render.entity.state.GuardianEntityRenderState.beamTicks; }
// public static void beamTicks(float value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.beamTicks = value; }

public float beamProgress() { return wrapperContained.beamProgress; }
public void beamProgress(float value) { wrapperContained.beamProgress = value; }
// public static float beamProgress() { return net.minecraft.client.render.entity.state.GuardianEntityRenderState.beamProgress; }
// public static void beamProgress(float value, ) { net.minecraft.client.render.entity.state.GuardianEntityRenderState.beamProgress = value; }


}