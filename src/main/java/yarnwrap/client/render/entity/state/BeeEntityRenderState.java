package yarnwrap.client.render.entity.state;
public class BeeEntityRenderState { public net.minecraft.client.render.entity.state.BeeEntityRenderState wrapperContained; public BeeEntityRenderState(net.minecraft.client.render.entity.state.BeeEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float bodyPitch() { return wrapperContained.bodyPitch; }
public void bodyPitch(float value) { wrapperContained.bodyPitch = value; }
// public static float bodyPitch() { return net.minecraft.client.render.entity.state.BeeEntityRenderState.bodyPitch; }
// public static void bodyPitch(float value, ) { net.minecraft.client.render.entity.state.BeeEntityRenderState.bodyPitch = value; }

public boolean hasStinger() { return wrapperContained.hasStinger; }
public void hasStinger(boolean value) { wrapperContained.hasStinger = value; }
// public static boolean hasStinger() { return net.minecraft.client.render.entity.state.BeeEntityRenderState.hasStinger; }
// public static void hasStinger(boolean value, ) { net.minecraft.client.render.entity.state.BeeEntityRenderState.hasStinger = value; }

public boolean stoppedOnGround() { return wrapperContained.stoppedOnGround; }
public void stoppedOnGround(boolean value) { wrapperContained.stoppedOnGround = value; }
// public static boolean stoppedOnGround() { return net.minecraft.client.render.entity.state.BeeEntityRenderState.stoppedOnGround; }
// public static void stoppedOnGround(boolean value, ) { net.minecraft.client.render.entity.state.BeeEntityRenderState.stoppedOnGround = value; }

public boolean angry() { return wrapperContained.angry; }
public void angry(boolean value) { wrapperContained.angry = value; }
// public static boolean angry() { return net.minecraft.client.render.entity.state.BeeEntityRenderState.angry; }
// public static void angry(boolean value, ) { net.minecraft.client.render.entity.state.BeeEntityRenderState.angry = value; }

public boolean hasNectar() { return wrapperContained.hasNectar; }
public void hasNectar(boolean value) { wrapperContained.hasNectar = value; }
// public static boolean hasNectar() { return net.minecraft.client.render.entity.state.BeeEntityRenderState.hasNectar; }
// public static void hasNectar(boolean value, ) { net.minecraft.client.render.entity.state.BeeEntityRenderState.hasNectar = value; }


}