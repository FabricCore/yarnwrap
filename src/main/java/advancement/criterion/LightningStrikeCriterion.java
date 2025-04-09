package yarnwrap.advancement.criterion;
public class LightningStrikeCriterion { public net.minecraft.advancement.criterion.LightningStrikeCriterion wrapperContained; public LightningStrikeCriterion(net.minecraft.advancement.criterion.LightningStrikeCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.LightningEntity lightning,java.util.List bystanders) { wrapperContained.trigger(player.wrapperContained,lightning.wrapperContained,bystanders); }

}