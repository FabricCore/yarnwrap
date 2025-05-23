package yarnwrap.client.render.entity.state;
public class MinecartEntityRenderState { public net.minecraft.client.render.entity.state.MinecartEntityRenderState wrapperContained; public MinecartEntityRenderState(net.minecraft.client.render.entity.state.MinecartEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec3d pastPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pastPos); }
public void pastPos(yarnwrap.util.math.Vec3d value) { wrapperContained.pastPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pastPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.MinecartEntityRenderState.pastPos); }
// public static void pastPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.pastPos = value.wrapperContained; }

public float lerpedPitch() { return wrapperContained.lerpedPitch; }
public void lerpedPitch(float value) { wrapperContained.lerpedPitch = value; }
// public static float lerpedPitch() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.lerpedPitch; }
// public static void lerpedPitch(float value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.lerpedPitch = value; }

public float lerpedYaw() { return wrapperContained.lerpedYaw; }
public void lerpedYaw(float value) { wrapperContained.lerpedYaw = value; }
// public static float lerpedYaw() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.lerpedYaw; }
// public static void lerpedYaw(float value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.lerpedYaw = value; }

public long hash() { return wrapperContained.hash; }
public void hash(long value) { wrapperContained.hash = value; }
// public static long hash() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.hash; }
// public static void hash(long value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.hash = value; }

public int damageWobbleSide() { return wrapperContained.damageWobbleSide; }
public void damageWobbleSide(int value) { wrapperContained.damageWobbleSide = value; }
// public static int damageWobbleSide() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.damageWobbleSide; }
// public static void damageWobbleSide(int value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.damageWobbleSide = value; }

public float damageWobbleTicks() { return wrapperContained.damageWobbleTicks; }
public void damageWobbleTicks(float value) { wrapperContained.damageWobbleTicks = value; }
// public static float damageWobbleTicks() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.damageWobbleTicks; }
// public static void damageWobbleTicks(float value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.damageWobbleTicks = value; }

public float damageWobbleStrength() { return wrapperContained.damageWobbleStrength; }
public void damageWobbleStrength(float value) { wrapperContained.damageWobbleStrength = value; }
// public static float damageWobbleStrength() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.damageWobbleStrength; }
// public static void damageWobbleStrength(float value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.damageWobbleStrength = value; }

public int blockOffset() { return wrapperContained.blockOffset; }
public void blockOffset(int value) { wrapperContained.blockOffset = value; }
// public static int blockOffset() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.blockOffset; }
// public static void blockOffset(int value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.blockOffset = value; }

public yarnwrap.block.BlockState containedBlock() { return new yarnwrap.block.BlockState(wrapperContained.containedBlock); }
public void containedBlock(yarnwrap.block.BlockState value) { wrapperContained.containedBlock = value.wrapperContained; }
// public static yarnwrap.block.BlockState containedBlock() { return new yarnwrap.block.BlockState(net.minecraft.client.render.entity.state.MinecartEntityRenderState.containedBlock); }
// public static void containedBlock(yarnwrap.block.BlockState value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.containedBlock = value.wrapperContained; }

public boolean usesExperimentalController() { return wrapperContained.usesExperimentalController; }
public void usesExperimentalController(boolean value) { wrapperContained.usesExperimentalController = value; }
// public static boolean usesExperimentalController() { return net.minecraft.client.render.entity.state.MinecartEntityRenderState.usesExperimentalController; }
// public static void usesExperimentalController(boolean value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.usesExperimentalController = value; }

public yarnwrap.util.math.Vec3d lerpedPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.lerpedPos); }
public void lerpedPos(yarnwrap.util.math.Vec3d value) { wrapperContained.lerpedPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d lerpedPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.MinecartEntityRenderState.lerpedPos); }
// public static void lerpedPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.lerpedPos = value.wrapperContained; }

public yarnwrap.util.math.Vec3d presentPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.presentPos); }
public void presentPos(yarnwrap.util.math.Vec3d value) { wrapperContained.presentPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d presentPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.MinecartEntityRenderState.presentPos); }
// public static void presentPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.presentPos = value.wrapperContained; }

public yarnwrap.util.math.Vec3d futurePos() { return new yarnwrap.util.math.Vec3d(wrapperContained.futurePos); }
public void futurePos(yarnwrap.util.math.Vec3d value) { wrapperContained.futurePos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d futurePos() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.MinecartEntityRenderState.futurePos); }
// public static void futurePos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.MinecartEntityRenderState.futurePos = value.wrapperContained; }


}