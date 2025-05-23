package yarnwrap.client.render.entity.state;
public class LightningEntityRenderState { public net.minecraft.client.render.entity.state.LightningEntityRenderState wrapperContained; public LightningEntityRenderState(net.minecraft.client.render.entity.state.LightningEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public long seed() { return wrapperContained.seed; }
public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.client.render.entity.state.LightningEntityRenderState.seed; }
// public static void seed(long value, ) { net.minecraft.client.render.entity.state.LightningEntityRenderState.seed = value; }


}