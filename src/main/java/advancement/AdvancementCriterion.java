package yarnwrap.advancement;
public class AdvancementCriterion { public net.minecraft.advancement.AdvancementCriterion wrapperContained; public AdvancementCriterion(net.minecraft.advancement.AdvancementCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(wrapperContained.conditions); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public yarnwrap.advancement.criterion.CriterionConditions conditions() { return new yarnwrap.advancement.criterion.CriterionConditions(wrapperContained.conditions()); }
// public com.mojang.serialization.Codec getCodec(yarnwrap.advancement.criterion.Criterion criterion) { return wrapperContained.getCodec(criterion.wrapperContained); }

}