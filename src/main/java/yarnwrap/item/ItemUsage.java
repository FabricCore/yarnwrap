package yarnwrap.item;
public class ItemUsage { public net.minecraft.item.ItemUsage wrapperContained; public ItemUsage(net.minecraft.item.ItemUsage wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.TypedActionResult consumeHeldItem(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.TypedActionResult(wrapperContained.consumeHeldItem(world.wrapperContained,player.wrapperContained,hand.wrapperContained)); }
public yarnwrap.item.ItemStack exchangeStack(yarnwrap.item.ItemStack inputStack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack outputStack) { return new yarnwrap.item.ItemStack(wrapperContained.exchangeStack(inputStack.wrapperContained,player.wrapperContained,outputStack.wrapperContained)); }
public yarnwrap.item.ItemStack exchangeStack(yarnwrap.item.ItemStack inputStack,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack outputStack,boolean creativeOverride) { return new yarnwrap.item.ItemStack(wrapperContained.exchangeStack(inputStack.wrapperContained,player.wrapperContained,outputStack.wrapperContained,creativeOverride)); }
public void spawnItemContents(yarnwrap.entity.ItemEntity itemEntity,java.lang.Iterable contents) { wrapperContained.spawnItemContents(itemEntity.wrapperContained,contents); }
// public void method_33265(yarnwrap.world.World stack) { wrapperContained.method_33265(stack.wrapperContained); }

}