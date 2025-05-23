package yarnwrap.client.render.entity.state;
public class DolphinEntityRenderState { public net.minecraft.client.render.entity.state.DolphinEntityRenderState wrapperContained; public DolphinEntityRenderState(net.minecraft.client.render.entity.state.DolphinEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean moving() { return wrapperContained.moving; }
public void moving(boolean value) { wrapperContained.moving = value; }
// public static boolean moving() { return net.minecraft.client.render.entity.state.DolphinEntityRenderState.moving; }
// public static void moving(boolean value, ) { net.minecraft.client.render.entity.state.DolphinEntityRenderState.moving = value; }


}