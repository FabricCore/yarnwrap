package yarnwrap.advancement.criterion;
public class CriterionConditions { public net.minecraft.advancement.criterion.CriterionConditions wrapperContained; public CriterionConditions(net.minecraft.advancement.criterion.CriterionConditions wrapperContained) { this.wrapperContained = wrapperContained; }

public void validate(yarnwrap.predicate.entity.LootContextPredicateValidator validator) { wrapperContained.validate(validator.wrapperContained); }

}