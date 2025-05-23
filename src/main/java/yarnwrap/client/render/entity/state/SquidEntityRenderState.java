package yarnwrap.client.render.entity.state;
public class SquidEntityRenderState { public net.minecraft.client.render.entity.state.SquidEntityRenderState wrapperContained; public SquidEntityRenderState(net.minecraft.client.render.entity.state.SquidEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float tentacleAngle() { return wrapperContained.tentacleAngle; }
public void tentacleAngle(float value) { wrapperContained.tentacleAngle = value; }
// public static float tentacleAngle() { return net.minecraft.client.render.entity.state.SquidEntityRenderState.tentacleAngle; }
// public static void tentacleAngle(float value, ) { net.minecraft.client.render.entity.state.SquidEntityRenderState.tentacleAngle = value; }

public float tiltAngle() { return wrapperContained.tiltAngle; }
public void tiltAngle(float value) { wrapperContained.tiltAngle = value; }
// public static float tiltAngle() { return net.minecraft.client.render.entity.state.SquidEntityRenderState.tiltAngle; }
// public static void tiltAngle(float value, ) { net.minecraft.client.render.entity.state.SquidEntityRenderState.tiltAngle = value; }

public float rollAngle() { return wrapperContained.rollAngle; }
public void rollAngle(float value) { wrapperContained.rollAngle = value; }
// public static float rollAngle() { return net.minecraft.client.render.entity.state.SquidEntityRenderState.rollAngle; }
// public static void rollAngle(float value, ) { net.minecraft.client.render.entity.state.SquidEntityRenderState.rollAngle = value; }


}