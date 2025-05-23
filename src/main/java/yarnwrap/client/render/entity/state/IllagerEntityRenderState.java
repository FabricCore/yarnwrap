package yarnwrap.client.render.entity.state;
public class IllagerEntityRenderState { public net.minecraft.client.render.entity.state.IllagerEntityRenderState wrapperContained; public IllagerEntityRenderState(net.minecraft.client.render.entity.state.IllagerEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasVehicle() { return wrapperContained.hasVehicle; }
public void hasVehicle(boolean value) { wrapperContained.hasVehicle = value; }
// public static boolean hasVehicle() { return net.minecraft.client.render.entity.state.IllagerEntityRenderState.hasVehicle; }
// public static void hasVehicle(boolean value, ) { net.minecraft.client.render.entity.state.IllagerEntityRenderState.hasVehicle = value; }

public boolean attacking() { return wrapperContained.attacking; }
public void attacking(boolean value) { wrapperContained.attacking = value; }
// public static boolean attacking() { return net.minecraft.client.render.entity.state.IllagerEntityRenderState.attacking; }
// public static void attacking(boolean value, ) { net.minecraft.client.render.entity.state.IllagerEntityRenderState.attacking = value; }

public yarnwrap.util.Arm illagerMainArm() { return new yarnwrap.util.Arm(wrapperContained.illagerMainArm); }
public void illagerMainArm(yarnwrap.util.Arm value) { wrapperContained.illagerMainArm = value.wrapperContained; }
// public static yarnwrap.util.Arm illagerMainArm() { return new yarnwrap.util.Arm(net.minecraft.client.render.entity.state.IllagerEntityRenderState.illagerMainArm); }
// public static void illagerMainArm(yarnwrap.util.Arm value, ) { net.minecraft.client.render.entity.state.IllagerEntityRenderState.illagerMainArm = value.wrapperContained; }

public Object illagerState() { return wrapperContained.illagerState; }
// public void illagerState(Object value) { wrapperContained.illagerState = value; }
// // public static Object illagerState() { return net.minecraft.client.render.entity.state.IllagerEntityRenderState.illagerState; }
// // public static void illagerState(Object value, ) { net.minecraft.client.render.entity.state.IllagerEntityRenderState.illagerState = value; }

public int crossbowPullTime() { return wrapperContained.crossbowPullTime; }
public void crossbowPullTime(int value) { wrapperContained.crossbowPullTime = value; }
// public static int crossbowPullTime() { return net.minecraft.client.render.entity.state.IllagerEntityRenderState.crossbowPullTime; }
// public static void crossbowPullTime(int value, ) { net.minecraft.client.render.entity.state.IllagerEntityRenderState.crossbowPullTime = value; }

public int itemUseTime() { return wrapperContained.itemUseTime; }
public void itemUseTime(int value) { wrapperContained.itemUseTime = value; }
// public static int itemUseTime() { return net.minecraft.client.render.entity.state.IllagerEntityRenderState.itemUseTime; }
// public static void itemUseTime(int value, ) { net.minecraft.client.render.entity.state.IllagerEntityRenderState.itemUseTime = value; }

public float handSwingProgress() { return wrapperContained.handSwingProgress; }
public void handSwingProgress(float value) { wrapperContained.handSwingProgress = value; }
// public static float handSwingProgress() { return net.minecraft.client.render.entity.state.IllagerEntityRenderState.handSwingProgress; }
// public static void handSwingProgress(float value, ) { net.minecraft.client.render.entity.state.IllagerEntityRenderState.handSwingProgress = value; }


}