package yarnwrap.loot.function;
public class CopyStateLootFunction { public net.minecraft.loot.function.CopyStateLootFunction wrapperContained; public CopyStateLootFunction(net.minecraft.loot.function.CopyStateLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry block() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.block); }
// public void block(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry block() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.CopyStateLootFunction.block); }
// public static void block(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.loot.function.CopyStateLootFunction.block = value.wrapperContained; }

// public java.util.Set properties() { return wrapperContained.properties; }
// public void properties(java.util.Set value) { wrapperContained.properties = value; }
// public static java.util.Set properties() { return net.minecraft.loot.function.CopyStateLootFunction.properties; }
// public static void properties(java.util.Set value, ) { net.minecraft.loot.function.CopyStateLootFunction.properties = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.CopyStateLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.CopyStateLootFunction.CODEC = value; }

// public CopyStateLootFunction(java.util.List conditions,yarnwrap.registry.entry.RegistryEntry block,java.util.List properties) { this.wrapperContained = new net.minecraft.loot.function.CopyStateLootFunction(conditions,block.wrapperContained,properties); }
// public CopyStateLootFunction(java.util.List conditions,yarnwrap.registry.entry.RegistryEntry block,java.util.Set properties) { this.wrapperContained = new net.minecraft.loot.function.CopyStateLootFunction(conditions,block.wrapperContained,properties); }
// public Object builder(yarnwrap.block.Block block) { return wrapperContained.builder(block.wrapperContained); }
// public static Object builder(yarnwrap.block.Block block, ) { return net.minecraft.loot.function.CopyStateLootFunction.builder(block.wrapperContained); }
// public java.util.List method_53310(yarnwrap.loot.function.CopyStateLootFunction function) { return wrapperContained.method_53310(function.wrapperContained); }
// public static java.util.List method_53310(yarnwrap.loot.function.CopyStateLootFunction function, ) { return net.minecraft.loot.function.CopyStateLootFunction.method_53310(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53311(Object instance) { return wrapperContained.method_53311(instance); }
// public static com.mojang.datafixers.kinds.App method_53311(Object instance, ) { return net.minecraft.loot.function.CopyStateLootFunction.method_53311(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_53312(yarnwrap.loot.function.CopyStateLootFunction function) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_53312(function.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_53312(yarnwrap.loot.function.CopyStateLootFunction function, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.CopyStateLootFunction.method_53312(function.wrapperContained)); }
// public yarnwrap.component.type.BlockStateComponent method_57636(yarnwrap.block.BlockState component) { return new yarnwrap.component.type.BlockStateComponent(wrapperContained.method_57636(component.wrapperContained)); }
// public static yarnwrap.component.type.BlockStateComponent method_57636(yarnwrap.block.BlockState component, ) { return new yarnwrap.component.type.BlockStateComponent(net.minecraft.loot.function.CopyStateLootFunction.method_57636(component.wrapperContained)); }

}