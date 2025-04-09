package yarnwrap.advancement.criterion;
public class AbstractCriterion { public net.minecraft.advancement.criterion.AbstractCriterion wrapperContained; public AbstractCriterion(net.minecraft.advancement.criterion.AbstractCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map progressions() { return wrapperContained.progressions; }
// public void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Predicate predicate) { wrapperContained.trigger(player.wrapperContained,predicate); }

}