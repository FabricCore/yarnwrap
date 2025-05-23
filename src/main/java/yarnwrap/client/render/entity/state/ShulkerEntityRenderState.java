package yarnwrap.client.render.entity.state;
public class ShulkerEntityRenderState { public net.minecraft.client.render.entity.state.ShulkerEntityRenderState wrapperContained; public ShulkerEntityRenderState(net.minecraft.client.render.entity.state.ShulkerEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec3d renderPositionOffset() { return new yarnwrap.util.math.Vec3d(wrapperContained.renderPositionOffset); }
public void renderPositionOffset(yarnwrap.util.math.Vec3d value) { wrapperContained.renderPositionOffset = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d renderPositionOffset() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.entity.state.ShulkerEntityRenderState.renderPositionOffset); }
// public static void renderPositionOffset(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.entity.state.ShulkerEntityRenderState.renderPositionOffset = value.wrapperContained; }

public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(net.minecraft.client.render.entity.state.ShulkerEntityRenderState.color); }
// public static void color(yarnwrap.util.DyeColor value, ) { net.minecraft.client.render.entity.state.ShulkerEntityRenderState.color = value.wrapperContained; }

public float openProgress() { return wrapperContained.openProgress; }
public void openProgress(float value) { wrapperContained.openProgress = value; }
// public static float openProgress() { return net.minecraft.client.render.entity.state.ShulkerEntityRenderState.openProgress; }
// public static void openProgress(float value, ) { net.minecraft.client.render.entity.state.ShulkerEntityRenderState.openProgress = value; }

public float headYaw() { return wrapperContained.headYaw; }
public void headYaw(float value) { wrapperContained.headYaw = value; }
// public static float headYaw() { return net.minecraft.client.render.entity.state.ShulkerEntityRenderState.headYaw; }
// public static void headYaw(float value, ) { net.minecraft.client.render.entity.state.ShulkerEntityRenderState.headYaw = value; }

public float shellYaw() { return wrapperContained.shellYaw; }
public void shellYaw(float value) { wrapperContained.shellYaw = value; }
// public static float shellYaw() { return net.minecraft.client.render.entity.state.ShulkerEntityRenderState.shellYaw; }
// public static void shellYaw(float value, ) { net.minecraft.client.render.entity.state.ShulkerEntityRenderState.shellYaw = value; }

public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
// public static yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.entity.state.ShulkerEntityRenderState.facing); }
// public static void facing(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.entity.state.ShulkerEntityRenderState.facing = value.wrapperContained; }


}