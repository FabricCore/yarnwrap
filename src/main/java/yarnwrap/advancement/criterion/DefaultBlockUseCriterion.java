package yarnwrap.advancement.criterion;
public class DefaultBlockUseCriterion { public net.minecraft.advancement.criterion.DefaultBlockUseCriterion wrapperContained; public DefaultBlockUseCriterion(net.minecraft.advancement.criterion.DefaultBlockUseCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos) { wrapperContained.trigger(player.wrapperContained,pos.wrapperContained); }

}