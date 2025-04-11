package yarnwrap.loot.condition;
public class BlockStatePropertyLootCondition { public net.minecraft.loot.condition.BlockStatePropertyLootCondition wrapperContained; public BlockStatePropertyLootCondition(net.minecraft.loot.condition.BlockStatePropertyLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_53417(Object instance) { return wrapperContained.method_53417(instance); }
// public com.mojang.serialization.DataResult validateHasProperties(yarnwrap.loot.condition.BlockStatePropertyLootCondition condition) { return wrapperContained.validateHasProperties(condition.wrapperContained); }
// public java.util.Optional method_53419(yarnwrap.loot.condition.BlockStatePropertyLootCondition predicate) { return wrapperContained.method_53419(predicate.wrapperContained); }
// public com.mojang.serialization.DataResult method_53420(yarnwrap.loot.condition.BlockStatePropertyLootCondition property) { return wrapperContained.method_53420(property.wrapperContained); }
public Object builder(yarnwrap.block.Block block) { return wrapperContained.builder(block.wrapperContained); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}