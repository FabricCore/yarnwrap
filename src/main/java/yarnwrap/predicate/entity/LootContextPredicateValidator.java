package yarnwrap.predicate.entity;
public class LootContextPredicateValidator { public net.minecraft.predicate.entity.LootContextPredicateValidator wrapperContained; public LootContextPredicateValidator(net.minecraft.predicate.entity.LootContextPredicateValidator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.ErrorReporter errorReporter() { return new yarnwrap.util.ErrorReporter(wrapperContained.errorReporter); }
// public void errorReporter(yarnwrap.util.ErrorReporter value) { wrapperContained.errorReporter = value.wrapperContained; }
// public static yarnwrap.util.ErrorReporter errorReporter() { return new yarnwrap.util.ErrorReporter(net.minecraft.predicate.entity.LootContextPredicateValidator.errorReporter); }
// public static void errorReporter(yarnwrap.util.ErrorReporter value, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.errorReporter = value.wrapperContained; }

// public Object conditionsLookup() { return wrapperContained.conditionsLookup; }
// // public void conditionsLookup(Object value) { wrapperContained.conditionsLookup = value; }
// // public static Object conditionsLookup() { return net.minecraft.predicate.entity.LootContextPredicateValidator.conditionsLookup; }
// // public static void conditionsLookup(Object value, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.conditionsLookup = value; }

// public LootContextPredicateValidator(yarnwrap.util.ErrorReporter errorReporter,Object conditionsLookup) { this.wrapperContained = new net.minecraft.predicate.entity.LootContextPredicateValidator(errorReporter.wrapperContained,conditionsLookup); }
public void validate(yarnwrap.predicate.entity.LootContextPredicate predicate,yarnwrap.util.context.ContextType type,java.lang.String path) { wrapperContained.validate(predicate.wrapperContained,type.wrapperContained,path); }
// public static void validate(yarnwrap.predicate.entity.LootContextPredicate predicate,yarnwrap.util.context.ContextType type,java.lang.String path, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.validate(predicate.wrapperContained,type.wrapperContained,path); }
public void validateEntityPredicate(yarnwrap.predicate.entity.LootContextPredicate predicate,java.lang.String path) { wrapperContained.validateEntityPredicate(predicate.wrapperContained,path); }
// public static void validateEntityPredicate(yarnwrap.predicate.entity.LootContextPredicate predicate,java.lang.String path, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.validateEntityPredicate(predicate.wrapperContained,path); }
// public void method_54963(java.lang.String p) { wrapperContained.method_54963(p); }
// public static void method_54963(java.lang.String p, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.method_54963(p); }
public void validate(java.util.List predicates,yarnwrap.util.context.ContextType type,java.lang.String path) { wrapperContained.validate(predicates,type.wrapperContained,path); }
// public static void validate(java.util.List predicates,yarnwrap.util.context.ContextType type,java.lang.String path, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.validate(predicates,type.wrapperContained,path); }
public void validateEntityPredicates(java.util.List predicates,java.lang.String path) { wrapperContained.validateEntityPredicates(predicates,path); }
// public static void validateEntityPredicates(java.util.List predicates,java.lang.String path, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.validateEntityPredicates(predicates,path); }
public void validateEntityPredicate(java.util.Optional predicate,java.lang.String path) { wrapperContained.validateEntityPredicate(predicate,path); }
// public static void validateEntityPredicate(java.util.Optional predicate,java.lang.String path, ) { net.minecraft.predicate.entity.LootContextPredicateValidator.validateEntityPredicate(predicate,path); }

}