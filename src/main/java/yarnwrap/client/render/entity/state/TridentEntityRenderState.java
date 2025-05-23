package yarnwrap.client.render.entity.state;
public class TridentEntityRenderState { public net.minecraft.client.render.entity.state.TridentEntityRenderState wrapperContained; public TridentEntityRenderState(net.minecraft.client.render.entity.state.TridentEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.entity.state.TridentEntityRenderState.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.entity.state.TridentEntityRenderState.pitch = value; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.TridentEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.TridentEntityRenderState.yaw = value; }

public boolean enchanted() { return wrapperContained.enchanted; }
public void enchanted(boolean value) { wrapperContained.enchanted = value; }
// public static boolean enchanted() { return net.minecraft.client.render.entity.state.TridentEntityRenderState.enchanted; }
// public static void enchanted(boolean value, ) { net.minecraft.client.render.entity.state.TridentEntityRenderState.enchanted = value; }


}