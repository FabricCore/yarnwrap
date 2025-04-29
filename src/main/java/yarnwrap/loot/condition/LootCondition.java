package yarnwrap.loot.condition;
public class LootCondition { public net.minecraft.loot.condition.LootCondition wrapperContained; public LootCondition(net.minecraft.loot.condition.LootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.loot.condition.LootCondition.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.condition.LootCondition.BASE_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.loot.condition.LootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.condition.LootCondition.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.loot.condition.LootCondition.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.condition.LootCondition.ENTRY_CODEC = value; }

public yarnwrap.loot.condition.LootConditionType getType() { return new yarnwrap.loot.condition.LootConditionType(wrapperContained.getType()); }
// public static yarnwrap.loot.condition.LootConditionType getType() { return new yarnwrap.loot.condition.LootConditionType(net.minecraft.loot.condition.LootCondition.getType()); }

}