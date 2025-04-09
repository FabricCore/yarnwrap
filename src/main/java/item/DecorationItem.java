package yarnwrap.item;
public class DecorationItem { public net.minecraft.item.DecorationItem wrapperContained; public DecorationItem(net.minecraft.item.DecorationItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text RANDOM_TEXT() { return new yarnwrap.text.Text(wrapperContained.RANDOM_TEXT); }
// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public boolean canPlaceOn(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.Direction side,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceOn(player.wrapperContained,side.wrapperContained,stack.wrapperContained,pos.wrapperContained); }

}