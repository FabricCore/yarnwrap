package yarnwrap.item;
public class DebugStickItem { public net.minecraft.item.DebugStickItem wrapperContained; public DebugStickItem(net.minecraft.item.DebugStickItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState cycle(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property,boolean inverse) { return new yarnwrap.block.BlockState(wrapperContained.cycle(state.wrapperContained,property.wrapperContained,inverse)); }
// public static yarnwrap.block.BlockState cycle(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property,boolean inverse, ) { return new yarnwrap.block.BlockState(net.minecraft.item.DebugStickItem.cycle(state.wrapperContained,property.wrapperContained,inverse)); }
// public boolean use(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,boolean update,yarnwrap.item.ItemStack stack) { return wrapperContained.use(player.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,update,stack.wrapperContained); }
// public static boolean use(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,boolean update,yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.DebugStickItem.use(player.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,update,stack.wrapperContained); }
// public java.lang.Object cycle(java.lang.Iterable elements,java.lang.Object current,boolean inverse) { return wrapperContained.cycle(elements,current,inverse); }
// public static java.lang.Object cycle(java.lang.Iterable elements,java.lang.Object current,boolean inverse, ) { return net.minecraft.item.DebugStickItem.cycle(elements,current,inverse); }
// public java.lang.String getValueString(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property) { return wrapperContained.getValueString(state.wrapperContained,property.wrapperContained); }
// public static java.lang.String getValueString(yarnwrap.block.BlockState state,yarnwrap.state.property.Property property, ) { return net.minecraft.item.DebugStickItem.getValueString(state.wrapperContained,property.wrapperContained); }
// public void sendMessage(yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.Text message) { wrapperContained.sendMessage(player.wrapperContained,message.wrapperContained); }
// public static void sendMessage(yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.Text message, ) { net.minecraft.item.DebugStickItem.sendMessage(player.wrapperContained,message.wrapperContained); }

}