package yarnwrap.client.render.entity.state;
public class LlamaSpitEntityRenderState { public net.minecraft.client.render.entity.state.LlamaSpitEntityRenderState wrapperContained; public LlamaSpitEntityRenderState(net.minecraft.client.render.entity.state.LlamaSpitEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float yaw() { return wrapperContained.yaw; }
public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.client.render.entity.state.LlamaSpitEntityRenderState.yaw; }
// public static void yaw(float value, ) { net.minecraft.client.render.entity.state.LlamaSpitEntityRenderState.yaw = value; }

public float pitch() { return wrapperContained.pitch; }
public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.client.render.entity.state.LlamaSpitEntityRenderState.pitch; }
// public static void pitch(float value, ) { net.minecraft.client.render.entity.state.LlamaSpitEntityRenderState.pitch = value; }


}