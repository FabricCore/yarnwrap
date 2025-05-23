package yarnwrap.client.render.entity.state;
public class RavagerEntityRenderState { public net.minecraft.client.render.entity.state.RavagerEntityRenderState wrapperContained; public RavagerEntityRenderState(net.minecraft.client.render.entity.state.RavagerEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float stunTick() { return wrapperContained.stunTick; }
public void stunTick(float value) { wrapperContained.stunTick = value; }
// public static float stunTick() { return net.minecraft.client.render.entity.state.RavagerEntityRenderState.stunTick; }
// public static void stunTick(float value, ) { net.minecraft.client.render.entity.state.RavagerEntityRenderState.stunTick = value; }

public float attackTick() { return wrapperContained.attackTick; }
public void attackTick(float value) { wrapperContained.attackTick = value; }
// public static float attackTick() { return net.minecraft.client.render.entity.state.RavagerEntityRenderState.attackTick; }
// public static void attackTick(float value, ) { net.minecraft.client.render.entity.state.RavagerEntityRenderState.attackTick = value; }

public float roarTick() { return wrapperContained.roarTick; }
public void roarTick(float value) { wrapperContained.roarTick = value; }
// public static float roarTick() { return net.minecraft.client.render.entity.state.RavagerEntityRenderState.roarTick; }
// public static void roarTick(float value, ) { net.minecraft.client.render.entity.state.RavagerEntityRenderState.roarTick = value; }


}