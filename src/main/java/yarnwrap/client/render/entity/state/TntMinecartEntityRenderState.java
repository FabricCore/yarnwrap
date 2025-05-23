package yarnwrap.client.render.entity.state;
public class TntMinecartEntityRenderState { public net.minecraft.client.render.entity.state.TntMinecartEntityRenderState wrapperContained; public TntMinecartEntityRenderState(net.minecraft.client.render.entity.state.TntMinecartEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float fuseTicks() { return wrapperContained.fuseTicks; }
public void fuseTicks(float value) { wrapperContained.fuseTicks = value; }
// public static float fuseTicks() { return net.minecraft.client.render.entity.state.TntMinecartEntityRenderState.fuseTicks; }
// public static void fuseTicks(float value, ) { net.minecraft.client.render.entity.state.TntMinecartEntityRenderState.fuseTicks = value; }


}