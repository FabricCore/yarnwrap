package yarnwrap.client.render.entity.state;
public class ParrotEntityRenderState { public net.minecraft.client.render.entity.state.ParrotEntityRenderState wrapperContained; public ParrotEntityRenderState(net.minecraft.client.render.entity.state.ParrotEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object variant() { return wrapperContained.variant; }
// public void variant(Object value) { wrapperContained.variant = value; }
// // public static Object variant() { return net.minecraft.client.render.entity.state.ParrotEntityRenderState.variant; }
// // public static void variant(Object value, ) { net.minecraft.client.render.entity.state.ParrotEntityRenderState.variant = value; }

public float flapAngle() { return wrapperContained.flapAngle; }
public void flapAngle(float value) { wrapperContained.flapAngle = value; }
// public static float flapAngle() { return net.minecraft.client.render.entity.state.ParrotEntityRenderState.flapAngle; }
// public static void flapAngle(float value, ) { net.minecraft.client.render.entity.state.ParrotEntityRenderState.flapAngle = value; }

public Object parrotPose() { return wrapperContained.parrotPose; }
// public void parrotPose(Object value) { wrapperContained.parrotPose = value; }
// // public static Object parrotPose() { return net.minecraft.client.render.entity.state.ParrotEntityRenderState.parrotPose; }
// // public static void parrotPose(Object value, ) { net.minecraft.client.render.entity.state.ParrotEntityRenderState.parrotPose = value; }


}