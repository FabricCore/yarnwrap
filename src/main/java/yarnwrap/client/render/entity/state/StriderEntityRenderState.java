package yarnwrap.client.render.entity.state;
public class StriderEntityRenderState { public net.minecraft.client.render.entity.state.StriderEntityRenderState wrapperContained; public StriderEntityRenderState(net.minecraft.client.render.entity.state.StriderEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean cold() { return wrapperContained.cold; }
public void cold(boolean value) { wrapperContained.cold = value; }
// public static boolean cold() { return net.minecraft.client.render.entity.state.StriderEntityRenderState.cold; }
// public static void cold(boolean value, ) { net.minecraft.client.render.entity.state.StriderEntityRenderState.cold = value; }

public boolean hasPassengers() { return wrapperContained.hasPassengers; }
public void hasPassengers(boolean value) { wrapperContained.hasPassengers = value; }
// public static boolean hasPassengers() { return net.minecraft.client.render.entity.state.StriderEntityRenderState.hasPassengers; }
// public static void hasPassengers(boolean value, ) { net.minecraft.client.render.entity.state.StriderEntityRenderState.hasPassengers = value; }

public yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(wrapperContained.saddleStack); }
public void saddleStack(yarnwrap.item.ItemStack value) { wrapperContained.saddleStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack saddleStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.StriderEntityRenderState.saddleStack); }
// public static void saddleStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.StriderEntityRenderState.saddleStack = value.wrapperContained; }


}