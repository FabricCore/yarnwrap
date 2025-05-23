package yarnwrap.client.render.entity.state;
public class FireworkRocketEntityRenderState { public net.minecraft.client.render.entity.state.FireworkRocketEntityRenderState wrapperContained; public FireworkRocketEntityRenderState(net.minecraft.client.render.entity.state.FireworkRocketEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean shotAtAngle() { return wrapperContained.shotAtAngle; }
public void shotAtAngle(boolean value) { wrapperContained.shotAtAngle = value; }
// public static boolean shotAtAngle() { return net.minecraft.client.render.entity.state.FireworkRocketEntityRenderState.shotAtAngle; }
// public static void shotAtAngle(boolean value, ) { net.minecraft.client.render.entity.state.FireworkRocketEntityRenderState.shotAtAngle = value; }

public yarnwrap.client.render.item.ItemRenderState stack() { return new yarnwrap.client.render.item.ItemRenderState(wrapperContained.stack); }
// public void stack(yarnwrap.client.render.item.ItemRenderState value) { wrapperContained.stack = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderState stack() { return new yarnwrap.client.render.item.ItemRenderState(net.minecraft.client.render.entity.state.FireworkRocketEntityRenderState.stack); }
// public static void stack(yarnwrap.client.render.item.ItemRenderState value, ) { net.minecraft.client.render.entity.state.FireworkRocketEntityRenderState.stack = value.wrapperContained; }


}