package yarnwrap.loot.function;
public class LootFunctionTypes { public net.minecraft.loot.function.LootFunctionTypes wrapperContained; public LootFunctionTypes(net.minecraft.loot.function.LootFunctionTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.BiFunction NOOP() { return wrapperContained.NOOP; }
// public void NOOP(java.util.function.BiFunction value) { wrapperContained.NOOP = value; }
public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.function.LootFunctionType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.function.LootFunctionType(wrapperContained.register(id,codec)); }
// public yarnwrap.item.ItemStack method_53347(java.util.List stack,yarnwrap.item.ItemStack context) { return new yarnwrap.item.ItemStack(wrapperContained.method_53347(stack,context.wrapperContained)); }
// public yarnwrap.item.ItemStack method_591(java.util.function.BiFunction stack,java.util.function.BiFunction context) { return new yarnwrap.item.ItemStack(wrapperContained.method_591(stack,context)); }
// public yarnwrap.item.ItemStack method_592(yarnwrap.item.ItemStack stack,yarnwrap.loot.context.LootContext context) { return new yarnwrap.item.ItemStack(wrapperContained.method_592(stack.wrapperContained,context.wrapperContained)); }
public java.util.function.BiFunction join(java.util.List terms) { return wrapperContained.join(terms); }

}