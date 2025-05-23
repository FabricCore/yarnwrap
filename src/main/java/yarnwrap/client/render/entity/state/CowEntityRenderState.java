package yarnwrap.client.render.entity.state;
public class CowEntityRenderState { public net.minecraft.client.render.entity.state.CowEntityRenderState wrapperContained; public CowEntityRenderState(net.minecraft.client.render.entity.state.CowEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.passive.CowVariant variant() { return new yarnwrap.entity.passive.CowVariant(wrapperContained.variant); }
public void variant(yarnwrap.entity.passive.CowVariant value) { wrapperContained.variant = value.wrapperContained; }
// public static yarnwrap.entity.passive.CowVariant variant() { return new yarnwrap.entity.passive.CowVariant(net.minecraft.client.render.entity.state.CowEntityRenderState.variant); }
// public static void variant(yarnwrap.entity.passive.CowVariant value, ) { net.minecraft.client.render.entity.state.CowEntityRenderState.variant = value.wrapperContained; }


}