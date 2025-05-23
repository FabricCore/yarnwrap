package yarnwrap.client.render.entity.state;
public class CatEntityRenderState { public net.minecraft.client.render.entity.state.CatEntityRenderState wrapperContained; public CatEntityRenderState(net.minecraft.client.render.entity.state.CatEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.state.CatEntityRenderState.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.state.CatEntityRenderState.texture = value.wrapperContained; }

public boolean nearSleepingPlayer() { return wrapperContained.nearSleepingPlayer; }
public void nearSleepingPlayer(boolean value) { wrapperContained.nearSleepingPlayer = value; }
// public static boolean nearSleepingPlayer() { return net.minecraft.client.render.entity.state.CatEntityRenderState.nearSleepingPlayer; }
// public static void nearSleepingPlayer(boolean value, ) { net.minecraft.client.render.entity.state.CatEntityRenderState.nearSleepingPlayer = value; }

public yarnwrap.util.DyeColor collarColor() { return new yarnwrap.util.DyeColor(wrapperContained.collarColor); }
public void collarColor(yarnwrap.util.DyeColor value) { wrapperContained.collarColor = value.wrapperContained; }
// public static yarnwrap.util.DyeColor collarColor() { return new yarnwrap.util.DyeColor(net.minecraft.client.render.entity.state.CatEntityRenderState.collarColor); }
// public static void collarColor(yarnwrap.util.DyeColor value, ) { net.minecraft.client.render.entity.state.CatEntityRenderState.collarColor = value.wrapperContained; }

// public yarnwrap.util.Identifier DEFAULT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DEFAULT_TEXTURE); }
// public void DEFAULT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DEFAULT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier DEFAULT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.state.CatEntityRenderState.DEFAULT_TEXTURE); }
// public static void DEFAULT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.state.CatEntityRenderState.DEFAULT_TEXTURE = value.wrapperContained; }


}