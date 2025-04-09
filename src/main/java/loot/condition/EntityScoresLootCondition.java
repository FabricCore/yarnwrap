package yarnwrap.loot.condition;
public class EntityScoresLootCondition { public net.minecraft.loot.condition.EntityScoresLootCondition wrapperContained; public EntityScoresLootCondition(net.minecraft.loot.condition.EntityScoresLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object entity() { return wrapperContained.entity; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object entity() { return wrapperContained.entity(); }
// public Object create(Object target) { return wrapperContained.create(target); }
// public boolean entityScoreIsInRange(yarnwrap.loot.context.LootContext context,yarnwrap.entity.Entity entity,yarnwrap.scoreboard.Scoreboard scoreboard,java.lang.String objectiveName,yarnwrap.loot.operator.BoundedIntUnaryOperator range) { return wrapperContained.entityScoreIsInRange(context.wrapperContained,entity.wrapperContained,scoreboard.wrapperContained,objectiveName,range.wrapperContained); }

}