package yarnwrap.advancement.criterion;
public class ChanneledLightningCriterion { public net.minecraft.advancement.criterion.ChanneledLightningCriterion wrapperContained; public ChanneledLightningCriterion(net.minecraft.advancement.criterion.ChanneledLightningCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection victims) { wrapperContained.trigger(player.wrapperContained,victims); }

}