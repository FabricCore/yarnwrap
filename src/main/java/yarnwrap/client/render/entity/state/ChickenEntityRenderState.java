package yarnwrap.client.render.entity.state;
public class ChickenEntityRenderState { public net.minecraft.client.render.entity.state.ChickenEntityRenderState wrapperContained; public ChickenEntityRenderState(net.minecraft.client.render.entity.state.ChickenEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public float flapProgress() { return wrapperContained.flapProgress; }
public void flapProgress(float value) { wrapperContained.flapProgress = value; }
// public static float flapProgress() { return net.minecraft.client.render.entity.state.ChickenEntityRenderState.flapProgress; }
// public static void flapProgress(float value, ) { net.minecraft.client.render.entity.state.ChickenEntityRenderState.flapProgress = value; }

public float maxWingDeviation() { return wrapperContained.maxWingDeviation; }
public void maxWingDeviation(float value) { wrapperContained.maxWingDeviation = value; }
// public static float maxWingDeviation() { return net.minecraft.client.render.entity.state.ChickenEntityRenderState.maxWingDeviation; }
// public static void maxWingDeviation(float value, ) { net.minecraft.client.render.entity.state.ChickenEntityRenderState.maxWingDeviation = value; }

public yarnwrap.entity.passive.ChickenVariant variant() { return new yarnwrap.entity.passive.ChickenVariant(wrapperContained.variant); }
public void variant(yarnwrap.entity.passive.ChickenVariant value) { wrapperContained.variant = value.wrapperContained; }
// public static yarnwrap.entity.passive.ChickenVariant variant() { return new yarnwrap.entity.passive.ChickenVariant(net.minecraft.client.render.entity.state.ChickenEntityRenderState.variant); }
// public static void variant(yarnwrap.entity.passive.ChickenVariant value, ) { net.minecraft.client.render.entity.state.ChickenEntityRenderState.variant = value.wrapperContained; }


}