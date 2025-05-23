package yarnwrap.client.render.entity.state;
public class LlamaEntityRenderState { public net.minecraft.client.render.entity.state.LlamaEntityRenderState wrapperContained; public LlamaEntityRenderState(net.minecraft.client.render.entity.state.LlamaEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object variant() { return wrapperContained.variant; }
// public void variant(Object value) { wrapperContained.variant = value; }
// // public static Object variant() { return net.minecraft.client.render.entity.state.LlamaEntityRenderState.variant; }
// // public static void variant(Object value, ) { net.minecraft.client.render.entity.state.LlamaEntityRenderState.variant = value; }

public boolean hasChest() { return wrapperContained.hasChest; }
public void hasChest(boolean value) { wrapperContained.hasChest = value; }
// public static boolean hasChest() { return net.minecraft.client.render.entity.state.LlamaEntityRenderState.hasChest; }
// public static void hasChest(boolean value, ) { net.minecraft.client.render.entity.state.LlamaEntityRenderState.hasChest = value; }

public boolean trader() { return wrapperContained.trader; }
public void trader(boolean value) { wrapperContained.trader = value; }
// public static boolean trader() { return net.minecraft.client.render.entity.state.LlamaEntityRenderState.trader; }
// public static void trader(boolean value, ) { net.minecraft.client.render.entity.state.LlamaEntityRenderState.trader = value; }

public yarnwrap.item.ItemStack bodyArmor() { return new yarnwrap.item.ItemStack(wrapperContained.bodyArmor); }
public void bodyArmor(yarnwrap.item.ItemStack value) { wrapperContained.bodyArmor = value.wrapperContained; }
// public static yarnwrap.item.ItemStack bodyArmor() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.state.LlamaEntityRenderState.bodyArmor); }
// public static void bodyArmor(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.entity.state.LlamaEntityRenderState.bodyArmor = value.wrapperContained; }


}