package yarnwrap.loot.condition;
public class TableBonusLootCondition { public net.minecraft.loot.condition.TableBonusLootCondition wrapperContained; public TableBonusLootCondition(net.minecraft.loot.condition.TableBonusLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List chances() { return wrapperContained.chances; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.List chances() { return wrapperContained.chances(); }
public Object builder(yarnwrap.registry.entry.RegistryEntry enchantment,float chances) { return wrapperContained.builder(enchantment.wrapperContained,chances); }

}