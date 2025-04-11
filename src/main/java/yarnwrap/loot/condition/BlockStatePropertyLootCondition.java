package yarnwrap.loot.condition;
public class BlockStatePropertyLootCondition { public net.minecraft.loot.condition.BlockStatePropertyLootCondition wrapperContained; public BlockStatePropertyLootCondition(net.minecraft.loot.condition.BlockStatePropertyLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.DataResult validateHasProperties(yarnwrap.loot.condition.BlockStatePropertyLootCondition condition) { return wrapperContained.validateHasProperties(condition.wrapperContained); }
public Object builder(yarnwrap.block.Block block) { return wrapperContained.builder(block.wrapperContained); }

}