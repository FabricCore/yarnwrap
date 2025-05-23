package yarnwrap.client.render.entity.state;
public class PigEntityRenderState { public net.minecraft.client.render.entity.state.PigEntityRenderState wrapperContained; public PigEntityRenderState(net.minecraft.client.render.entity.state.PigEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.passive.PigVariant variant() { return new yarnwrap.entity.passive.PigVariant(wrapperContained.variant); }
public void variant(yarnwrap.entity.passive.PigVariant value) { wrapperContained.variant = value.wrapperContained; }
// public static yarnwrap.entity.passive.PigVariant variant() { return new yarnwrap.entity.passive.PigVariant(net.minecraft.client.render.entity.state.PigEntityRenderState.variant); }
// public static void variant(yarnwrap.entity.passive.PigVariant value, ) { net.minecraft.client.render.entity.state.PigEntityRenderState.variant = value.wrapperContained; }

public yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(wrapperContained.saddleStack); }
public void saddleStack(yarnwrap.item.ItemStack value) { wrapperContained.saddleStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.PigEntityRenderState.saddleStack); }
// public static void saddleStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.PigEntityRenderState.saddleStack = value.wrapperContained; }


}