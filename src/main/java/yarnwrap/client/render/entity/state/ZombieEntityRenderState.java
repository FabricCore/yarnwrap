package yarnwrap.client.render.entity.state;
public class ZombieEntityRenderState { public net.minecraft.client.render.entity.state.ZombieEntityRenderState wrapperContained; public ZombieEntityRenderState(net.minecraft.client.render.entity.state.ZombieEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean attacking() { return wrapperContained.attacking; }
public void attacking(boolean value) { wrapperContained.attacking = value; }
// public static boolean attacking() { return net.minecraft.client.render.entity.state.ZombieEntityRenderState.attacking; }
// public static void attacking(boolean value, ) { net.minecraft.client.render.entity.state.ZombieEntityRenderState.attacking = value; }

public boolean convertingInWater() { return wrapperContained.convertingInWater; }
public void convertingInWater(boolean value) { wrapperContained.convertingInWater = value; }
// public static boolean convertingInWater() { return net.minecraft.client.render.entity.state.ZombieEntityRenderState.convertingInWater; }
// public static void convertingInWater(boolean value, ) { net.minecraft.client.render.entity.state.ZombieEntityRenderState.convertingInWater = value; }


}