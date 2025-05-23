package yarnwrap.client.render.entity.state;
public class AxolotlEntityRenderState { public net.minecraft.client.render.entity.state.AxolotlEntityRenderState wrapperContained; public AxolotlEntityRenderState(net.minecraft.client.render.entity.state.AxolotlEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object variant() { return wrapperContained.variant; }
// public void variant(Object value) { wrapperContained.variant = value; }
// // public static Object variant() { return net.minecraft.client.render.entity.state.AxolotlEntityRenderState.variant; }
// // public static void variant(Object value, ) { net.minecraft.client.render.entity.state.AxolotlEntityRenderState.variant = value; }

public float playingDeadValue() { return wrapperContained.playingDeadValue; }
public void playingDeadValue(float value) { wrapperContained.playingDeadValue = value; }
// public static float playingDeadValue() { return net.minecraft.client.render.entity.state.AxolotlEntityRenderState.playingDeadValue; }
// public static void playingDeadValue(float value, ) { net.minecraft.client.render.entity.state.AxolotlEntityRenderState.playingDeadValue = value; }

public float isMovingValue() { return wrapperContained.isMovingValue; }
public void isMovingValue(float value) { wrapperContained.isMovingValue = value; }
// public static float isMovingValue() { return net.minecraft.client.render.entity.state.AxolotlEntityRenderState.isMovingValue; }
// public static void isMovingValue(float value, ) { net.minecraft.client.render.entity.state.AxolotlEntityRenderState.isMovingValue = value; }

public float inWaterValue() { return wrapperContained.inWaterValue; }
public void inWaterValue(float value) { wrapperContained.inWaterValue = value; }
// public static float inWaterValue() { return net.minecraft.client.render.entity.state.AxolotlEntityRenderState.inWaterValue; }
// public static void inWaterValue(float value, ) { net.minecraft.client.render.entity.state.AxolotlEntityRenderState.inWaterValue = value; }

public float onGroundValue() { return wrapperContained.onGroundValue; }
public void onGroundValue(float value) { wrapperContained.onGroundValue = value; }
// public static float onGroundValue() { return net.minecraft.client.render.entity.state.AxolotlEntityRenderState.onGroundValue; }
// public static void onGroundValue(float value, ) { net.minecraft.client.render.entity.state.AxolotlEntityRenderState.onGroundValue = value; }


}