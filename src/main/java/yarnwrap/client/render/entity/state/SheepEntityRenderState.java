package yarnwrap.client.render.entity.state;
public class SheepEntityRenderState { public net.minecraft.client.render.entity.state.SheepEntityRenderState wrapperContained; public SheepEntityRenderState(net.minecraft.client.render.entity.state.SheepEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float neckAngle() { return wrapperContained.neckAngle; }
public void neckAngle(float value) { wrapperContained.neckAngle = value; }
// public static float neckAngle() { return net.minecraft.client.render.entity.state.SheepEntityRenderState.neckAngle; }
// public static void neckAngle(float value, ) { net.minecraft.client.render.entity.state.SheepEntityRenderState.neckAngle = value; }

public float headAngle() { return wrapperContained.headAngle; }
public void headAngle(float value) { wrapperContained.headAngle = value; }
// public static float headAngle() { return net.minecraft.client.render.entity.state.SheepEntityRenderState.headAngle; }
// public static void headAngle(float value, ) { net.minecraft.client.render.entity.state.SheepEntityRenderState.headAngle = value; }

public boolean sheared() { return wrapperContained.sheared; }
public void sheared(boolean value) { wrapperContained.sheared = value; }
// public static boolean sheared() { return net.minecraft.client.render.entity.state.SheepEntityRenderState.sheared; }
// public static void sheared(boolean value, ) { net.minecraft.client.render.entity.state.SheepEntityRenderState.sheared = value; }

public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(net.minecraft.client.render.entity.state.SheepEntityRenderState.color); }
// public static void color(yarnwrap.util.DyeColor value, ) { net.minecraft.client.render.entity.state.SheepEntityRenderState.color = value.wrapperContained; }

public int id() { return wrapperContained.id; }
public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.client.render.entity.state.SheepEntityRenderState.id; }
// public static void id(int value, ) { net.minecraft.client.render.entity.state.SheepEntityRenderState.id = value; }

public int getRgbColor() { return wrapperContained.getRgbColor(); }
// public static int getRgbColor() { return net.minecraft.client.render.entity.state.SheepEntityRenderState.getRgbColor(); }
public boolean isJeb() { return wrapperContained.isJeb(); }
// public static boolean isJeb() { return net.minecraft.client.render.entity.state.SheepEntityRenderState.isJeb(); }

}