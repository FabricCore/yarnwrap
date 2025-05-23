package yarnwrap.loot.condition;
public class EntityScoresLootCondition { public net.minecraft.loot.condition.EntityScoresLootCondition wrapperContained; public EntityScoresLootCondition(net.minecraft.loot.condition.EntityScoresLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object entity() { return wrapperContained.entity; }
// // public void entity(Object value) { wrapperContained.entity = value; }
// // public static Object entity() { return net.minecraft.loot.condition.EntityScoresLootCondition.entity; }
// // public static void entity(Object value, ) { net.minecraft.loot.condition.EntityScoresLootCondition.entity = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.EntityScoresLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.EntityScoresLootCondition.CODEC = value; }

// public EntityScoresLootCondition(java.util.Map scores,Object target) { this.wrapperContained = new net.minecraft.loot.condition.EntityScoresLootCondition(scores,target); }
// public Object entity() { return wrapperContained.entity(); }
// // public static Object entity() { return net.minecraft.loot.condition.EntityScoresLootCondition.entity(); }
// public boolean entityScoreIsInRange(yarnwrap.loot.context.LootContext context,yarnwrap.entity.Entity entity,yarnwrap.scoreboard.Scoreboard scoreboard,java.lang.String objectiveName,yarnwrap.loot.operator.BoundedIntUnaryOperator range) { return wrapperContained.entityScoreIsInRange(context.wrapperContained,entity.wrapperContained,scoreboard.wrapperContained,objectiveName,range.wrapperContained); }
// public static boolean entityScoreIsInRange(yarnwrap.loot.context.LootContext context,yarnwrap.entity.Entity entity,yarnwrap.scoreboard.Scoreboard scoreboard,java.lang.String objectiveName,yarnwrap.loot.operator.BoundedIntUnaryOperator range, ) { return net.minecraft.loot.condition.EntityScoresLootCondition.entityScoreIsInRange(context.wrapperContained,entity.wrapperContained,scoreboard.wrapperContained,objectiveName,range.wrapperContained); }
// public java.util.stream.Stream method_32422(yarnwrap.loot.operator.BoundedIntUnaryOperator operator) { return wrapperContained.method_32422(operator.wrapperContained); }
// public static java.util.stream.Stream method_32422(yarnwrap.loot.operator.BoundedIntUnaryOperator operator, ) { return net.minecraft.loot.condition.EntityScoresLootCondition.method_32422(operator.wrapperContained); }
// public Object create(Object target) { return wrapperContained.create(target); }
// public static Object create(Object target, ) { return net.minecraft.loot.condition.EntityScoresLootCondition.create(target); }
// public com.mojang.datafixers.kinds.App method_53413(Object instance) { return wrapperContained.method_53413(instance); }
// public static com.mojang.datafixers.kinds.App method_53413(Object instance, ) { return net.minecraft.loot.condition.EntityScoresLootCondition.method_53413(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.EntityScoresLootCondition.test(context); }

}