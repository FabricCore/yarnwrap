package yarnwrap.loot.condition;
public class AlternativeLootCondition { public net.minecraft.loot.condition.AlternativeLootCondition wrapperContained; public AlternativeLootCondition(net.minecraft.loot.condition.AlternativeLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List terms() { return wrapperContained.terms; }
// public void terms(java.util.List value) { wrapperContained.terms = value; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
// public com.mojang.serialization.MapCodec createCodec(java.util.function.Function termsToCondition) { return wrapperContained.createCodec(termsToCondition); }
// public com.mojang.serialization.Codec createInlineCodec(java.util.function.Function termsToCondition) { return wrapperContained.createInlineCodec(termsToCondition); }

}