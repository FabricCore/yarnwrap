package yarnwrap.item;
public class AxeItem { public net.minecraft.item.AxeItem wrapperContained; public AxeItem(net.minecraft.item.AxeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map STRIPPED_BLOCKS() { return wrapperContained.STRIPPED_BLOCKS; }
// public void STRIPPED_BLOCKS(java.util.Map value) { wrapperContained.STRIPPED_BLOCKS = value; }
// public java.util.Optional getStrippedState(yarnwrap.block.BlockState state) { return wrapperContained.getStrippedState(state.wrapperContained); }
// public yarnwrap.block.BlockState method_34717(yarnwrap.block.BlockState block) { return new yarnwrap.block.BlockState(wrapperContained.method_34717(block.wrapperContained)); }
// public java.util.Optional tryStrip(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state) { return wrapperContained.tryStrip(world.wrapperContained,pos.wrapperContained,player.wrapperContained,state.wrapperContained); }
// public yarnwrap.block.BlockState method_54761(yarnwrap.block.BlockState block) { return new yarnwrap.block.BlockState(wrapperContained.method_54761(block.wrapperContained)); }
// public boolean shouldCancelStripAttempt(yarnwrap.item.ItemUsageContext context) { return wrapperContained.shouldCancelStripAttempt(context.wrapperContained); }

}