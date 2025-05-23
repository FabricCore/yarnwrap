package yarnwrap.client.render.entity.state;
public class HorseEntityRenderState { public net.minecraft.client.render.entity.state.HorseEntityRenderState wrapperContained; public HorseEntityRenderState(net.minecraft.client.render.entity.state.HorseEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.passive.HorseColor color() { return new yarnwrap.entity.passive.HorseColor(wrapperContained.color); }
public void color(yarnwrap.entity.passive.HorseColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.entity.passive.HorseColor color() { return new yarnwrap.entity.passive.HorseColor(net.minecraft.client.render.entity.state.HorseEntityRenderState.color); }
// public static void color(yarnwrap.entity.passive.HorseColor value, ) { net.minecraft.client.render.entity.state.HorseEntityRenderState.color = value.wrapperContained; }

public yarnwrap.entity.passive.HorseMarking marking() { return new yarnwrap.entity.passive.HorseMarking(wrapperContained.marking); }
public void marking(yarnwrap.entity.passive.HorseMarking value) { wrapperContained.marking = value.wrapperContained; }
// public static yarnwrap.entity.passive.HorseMarking marking() { return new yarnwrap.entity.passive.HorseMarking(net.minecraft.client.render.entity.state.HorseEntityRenderState.marking); }
// public static void marking(yarnwrap.entity.passive.HorseMarking value, ) { net.minecraft.client.render.entity.state.HorseEntityRenderState.marking = value.wrapperContained; }

public yarnwrap.item.ItemStack armor() { return new yarnwrap.item.ItemStack(wrapperContained.armor); }
public void armor(yarnwrap.item.ItemStack value) { wrapperContained.armor = value.wrapperContained; }
// public static yarnwrap.item.ItemStack armor() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.HorseEntityRenderState.armor); }
// public static void armor(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.HorseEntityRenderState.armor = value.wrapperContained; }


}