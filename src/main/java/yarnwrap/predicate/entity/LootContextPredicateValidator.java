package yarnwrap.predicate.entity;
public class LootContextPredicateValidator { public net.minecraft.predicate.entity.LootContextPredicateValidator wrapperContained; public LootContextPredicateValidator(net.minecraft.predicate.entity.LootContextPredicateValidator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.ErrorReporter errorReporter() { return new yarnwrap.util.ErrorReporter(wrapperContained.errorReporter); }
// public void errorReporter(yarnwrap.util.ErrorReporter value) { wrapperContained.errorReporter = value.wrapperContained; }
// public Object conditionsLookup() { return wrapperContained.conditionsLookup; }
// // public void conditionsLookup(Object value) { wrapperContained.conditionsLookup = value; }
public void validate(yarnwrap.predicate.entity.LootContextPredicate predicate,yarnwrap.loot.context.LootContextType type,java.lang.String path) { wrapperContained.validate(predicate.wrapperContained,type.wrapperContained,path); }
public void validateEntityPredicate(yarnwrap.predicate.entity.LootContextPredicate predicate,java.lang.String path) { wrapperContained.validateEntityPredicate(predicate.wrapperContained,path); }
public void validate(java.util.List predicates,yarnwrap.loot.context.LootContextType type,java.lang.String path) { wrapperContained.validate(predicates,type.wrapperContained,path); }
public void validateEntityPredicates(java.util.List predicates,java.lang.String path) { wrapperContained.validateEntityPredicates(predicates,path); }
public void validateEntityPredicate(java.util.Optional predicate,java.lang.String path) { wrapperContained.validateEntityPredicate(predicate,path); }

}