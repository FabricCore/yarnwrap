package yarnwrap.loot.condition;
public class LocationCheckLootCondition { public net.minecraft.loot.condition.LocationCheckLootCondition wrapperContained; public LocationCheckLootCondition(net.minecraft.loot.condition.LocationCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.MapCodec OFFSET_CODEC() { return wrapperContained.OFFSET_CODEC; }
// public Object builder(Object predicateBuilder,yarnwrap.util.math.BlockPos pos) { return wrapperContained.builder(predicateBuilder,pos.wrapperContained); }
// public Object builder(Object predicateBuilder) { return wrapperContained.builder(predicateBuilder); }

}