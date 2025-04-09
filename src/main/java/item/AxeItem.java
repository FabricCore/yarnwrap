package yarnwrap.item;
public class AxeItem { public net.minecraft.item.AxeItem wrapperContained; public AxeItem(net.minecraft.item.AxeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map STRIPPED_BLOCKS() { return wrapperContained.STRIPPED_BLOCKS; }
// public java.util.Optional getStrippedState(yarnwrap.block.BlockState state) { return wrapperContained.getStrippedState(state.wrapperContained); }
// public java.util.Optional tryStrip(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state) { return wrapperContained.tryStrip(world.wrapperContained,pos.wrapperContained,player.wrapperContained,state.wrapperContained); }
// public boolean shouldCancelStripAttempt(yarnwrap.item.ItemUsageContext context) { return wrapperContained.shouldCancelStripAttempt(context.wrapperContained); }

}