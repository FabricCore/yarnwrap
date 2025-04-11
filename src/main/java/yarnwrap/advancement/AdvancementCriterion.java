package yarnwrap.advancement;
public class AdvancementCriterion { public net.minecraft.advancement.AdvancementCriterion wrapperContained; public AdvancementCriterion(net.minecraft.advancement.AdvancementCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(wrapperContained.conditions); }
// public void conditions(yarnwrap.advancement.criterion.CriterionConditions value) { wrapperContained.conditions = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
// public yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(wrapperContained.conditions()); }
// public com.mojang.serialization.Codec getCodec(yarnwrap.advancement.criterion.Criterion criterion) { return wrapperContained.getCodec(criterion.wrapperContained); }
// public yarnwrap.advancement.AdvancementCriterion method_54936(yarnwrap.advancement.criterion.Criterion conditions) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.method_54936(conditions.wrapperContained)); }

}