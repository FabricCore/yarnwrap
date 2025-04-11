package yarnwrap.advancement.criterion;
public class UsedEnderEyeCriterion { public net.minecraft.advancement.criterion.UsedEnderEyeCriterion wrapperContained; public UsedEnderEyeCriterion(net.minecraft.advancement.criterion.UsedEnderEyeCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22540(double conditions) { return wrapperContained.method_22540(conditions); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos strongholdPos) { wrapperContained.trigger(player.wrapperContained,strongholdPos.wrapperContained); }

}