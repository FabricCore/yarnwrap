package yarnwrap.client.render.entity.state;
public class BoatEntityRenderState { public net.minecraft.client.render.entity.state.BoatEntityRenderState wrapperContained; public BoatEntityRenderState(net.minecraft.client.render.entity.state.BoatEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.yaw = value; }

public int damageWobbleSide() { return wrapperContained.damageWobbleSide; }
public void damageWobbleSide(int value) { wrapperContained.damageWobbleSide = value; }
// public static int damageWobbleSide() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.damageWobbleSide; }
// public static void damageWobbleSide(int value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.damageWobbleSide = value; }

public float damageWobbleTicks() { return wrapperContained.damageWobbleTicks; }
public void damageWobbleTicks(float value) { wrapperContained.damageWobbleTicks = value; }
// public static float damageWobbleTicks() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.damageWobbleTicks; }
// public static void damageWobbleTicks(float value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.damageWobbleTicks = value; }

public float damageWobbleStrength() { return wrapperContained.damageWobbleStrength; }
public void damageWobbleStrength(float value) { wrapperContained.damageWobbleStrength = value; }
// public static float damageWobbleStrength() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.damageWobbleStrength; }
// public static void damageWobbleStrength(float value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.damageWobbleStrength = value; }

public float bubbleWobble() { return wrapperContained.bubbleWobble; }
public void bubbleWobble(float value) { wrapperContained.bubbleWobble = value; }
// public static float bubbleWobble() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.bubbleWobble; }
// public static void bubbleWobble(float value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.bubbleWobble = value; }

public boolean submergedInWater() { return wrapperContained.submergedInWater; }
public void submergedInWater(boolean value) { wrapperContained.submergedInWater = value; }
// public static boolean submergedInWater() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.submergedInWater; }
// public static void submergedInWater(boolean value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.submergedInWater = value; }

public float leftPaddleAngle() { return wrapperContained.leftPaddleAngle; }
public void leftPaddleAngle(float value) { wrapperContained.leftPaddleAngle = value; }
// public static float leftPaddleAngle() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.leftPaddleAngle; }
// public static void leftPaddleAngle(float value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.leftPaddleAngle = value; }

public float rightPaddleAngle() { return wrapperContained.rightPaddleAngle; }
public void rightPaddleAngle(float value) { wrapperContained.rightPaddleAngle = value; }
// public static float rightPaddleAngle() { return net.minecraft.client.render.entity.state.BoatEntityRenderState.rightPaddleAngle; }
// public static void rightPaddleAngle(float value, ) { net.minecraft.client.render.entity.state.BoatEntityRenderState.rightPaddleAngle = value; }


}