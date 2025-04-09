package yarnwrap.loot.function;
public class ExplosionDecayLootFunction { public net.minecraft.loot.function.ExplosionDecayLootFunction wrapperContained; public ExplosionDecayLootFunction(net.minecraft.loot.function.ExplosionDecayLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder() { return wrapperContained.builder(); }

}