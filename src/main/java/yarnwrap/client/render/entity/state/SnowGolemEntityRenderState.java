package yarnwrap.client.render.entity.state;
public class SnowGolemEntityRenderState { public net.minecraft.client.render.entity.state.SnowGolemEntityRenderState wrapperContained; public SnowGolemEntityRenderState(net.minecraft.client.render.entity.state.SnowGolemEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasPumpkin() { return wrapperContained.hasPumpkin; }
public void hasPumpkin(boolean value) { wrapperContained.hasPumpkin = value; }
// public static boolean hasPumpkin() { return net.minecraft.client.render.entity.state.SnowGolemEntityRenderState.hasPumpkin; }
// public static void hasPumpkin(boolean value, ) { net.minecraft.client.render.entity.state.SnowGolemEntityRenderState.hasPumpkin = value; }


}