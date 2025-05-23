package yarnwrap.client.render.entity.state;
public class ZombifiedPiglinEntityRenderState { public net.minecraft.client.render.entity.state.ZombifiedPiglinEntityRenderState wrapperContained; public ZombifiedPiglinEntityRenderState(net.minecraft.client.render.entity.state.ZombifiedPiglinEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean attacking() { return wrapperContained.attacking; }
public void attacking(boolean value) { wrapperContained.attacking = value; }
// public static boolean attacking() { return net.minecraft.client.render.entity.state.ZombifiedPiglinEntityRenderState.attacking; }
// public static void attacking(boolean value, ) { net.minecraft.client.render.entity.state.ZombifiedPiglinEntityRenderState.attacking = value; }


}