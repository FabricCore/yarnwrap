package yarnwrap.loot.context;
public class LootContextTypes { public net.minecraft.loot.context.LootContextTypes wrapperContained; public LootContextTypes(net.minecraft.loot.context.LootContextTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.BiMap MAP() { return wrapperContained.MAP; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.loot.context.LootContextType register(java.lang.String name,java.util.function.Consumer type) { return new yarnwrap.loot.context.LootContextType(wrapperContained.register(name,type)); }

}