package yarnwrap.advancement;
public class AdvancementCriterion { public net.minecraft.advancement.AdvancementCriterion wrapperContained; public AdvancementCriterion(net.minecraft.advancement.AdvancementCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(wrapperContained.conditions); }
// public void conditions(yarnwrap.advancement.criterion.CriterionConditions value) { wrapperContained.conditions = value.wrapperContained; }
// public static yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(net.minecraft.advancement.AdvancementCriterion.conditions); }
// public static void conditions(yarnwrap.advancement.criterion.CriterionConditions value, ) { net.minecraft.advancement.AdvancementCriterion.conditions = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.advancement.AdvancementCriterion.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementCriterion.CODEC = value; }

// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
// public static com.mojang.serialization.MapCodec MAP_CODEC() { return net.minecraft.advancement.AdvancementCriterion.MAP_CODEC; }
// public static void MAP_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.advancement.AdvancementCriterion.MAP_CODEC = value; }

// public yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(wrapperContained.conditions()); }
// // public static yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(net.minecraft.advancement.AdvancementCriterion.conditions()); }
// public com.mojang.serialization.Codec getCodec(yarnwrap.advancement.criterion.Criterion criterion) { return wrapperContained.getCodec(criterion.wrapperContained); }
// public static com.mojang.serialization.Codec getCodec(yarnwrap.advancement.criterion.Criterion criterion, ) { return net.minecraft.advancement.AdvancementCriterion.getCodec(criterion.wrapperContained); }
// public yarnwrap.advancement.AdvancementCriterion method_54936(yarnwrap.advancement.criterion.Criterion conditions) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.method_54936(conditions.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementCriterion method_54936(yarnwrap.advancement.criterion.Criterion conditions, ) { return new yarnwrap.advancement.AdvancementCriterion(net.minecraft.advancement.AdvancementCriterion.method_54936(conditions.wrapperContained)); }

}