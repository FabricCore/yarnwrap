package yarnwrap.client.render.entity.state;
public class SkeletonEntityRenderState { public net.minecraft.client.render.entity.state.SkeletonEntityRenderState wrapperContained; public SkeletonEntityRenderState(net.minecraft.client.render.entity.state.SkeletonEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean attacking() { return wrapperContained.attacking; }
public void attacking(boolean value) { wrapperContained.attacking = value; }
// public static boolean attacking() { return net.minecraft.client.render.entity.state.SkeletonEntityRenderState.attacking; }
// public static void attacking(boolean value, ) { net.minecraft.client.render.entity.state.SkeletonEntityRenderState.attacking = value; }

public boolean shaking() { return wrapperContained.shaking; }
public void shaking(boolean value) { wrapperContained.shaking = value; }
// public static boolean shaking() { return net.minecraft.client.render.entity.state.SkeletonEntityRenderState.shaking; }
// public static void shaking(boolean value, ) { net.minecraft.client.render.entity.state.SkeletonEntityRenderState.shaking = value; }

public boolean holdingBow() { return wrapperContained.holdingBow; }
public void holdingBow(boolean value) { wrapperContained.holdingBow = value; }
// public static boolean holdingBow() { return net.minecraft.client.render.entity.state.SkeletonEntityRenderState.holdingBow; }
// public static void holdingBow(boolean value, ) { net.minecraft.client.render.entity.state.SkeletonEntityRenderState.holdingBow = value; }


}