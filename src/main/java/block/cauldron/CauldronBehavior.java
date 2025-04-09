package yarnwrap.block.cauldron;
public class CauldronBehavior { public net.minecraft.block.cauldron.CauldronBehavior wrapperContained; public CauldronBehavior(net.minecraft.block.cauldron.CauldronBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

public Object EMPTY_CAULDRON_BEHAVIOR() { return wrapperContained.EMPTY_CAULDRON_BEHAVIOR; }
public Object WATER_CAULDRON_BEHAVIOR() { return wrapperContained.WATER_CAULDRON_BEHAVIOR; }
public Object LAVA_CAULDRON_BEHAVIOR() { return wrapperContained.LAVA_CAULDRON_BEHAVIOR; }
public yarnwrap.block.cauldron.CauldronBehavior FILL_WITH_WATER() { return new yarnwrap.block.cauldron.CauldronBehavior(wrapperContained.FILL_WITH_WATER); }
public yarnwrap.block.cauldron.CauldronBehavior FILL_WITH_LAVA() { return new yarnwrap.block.cauldron.CauldronBehavior(wrapperContained.FILL_WITH_LAVA); }
public yarnwrap.block.cauldron.CauldronBehavior CLEAN_SHULKER_BOX() { return new yarnwrap.block.cauldron.CauldronBehavior(wrapperContained.CLEAN_SHULKER_BOX); }
public yarnwrap.block.cauldron.CauldronBehavior CLEAN_BANNER() { return new yarnwrap.block.cauldron.CauldronBehavior(wrapperContained.CLEAN_BANNER); }
public yarnwrap.block.cauldron.CauldronBehavior CLEAN_DYEABLE_ITEM() { return new yarnwrap.block.cauldron.CauldronBehavior(wrapperContained.CLEAN_DYEABLE_ITEM); }
public Object POWDER_SNOW_CAULDRON_BEHAVIOR() { return wrapperContained.POWDER_SNOW_CAULDRON_BEHAVIOR; }
public yarnwrap.block.cauldron.CauldronBehavior FILL_WITH_POWDER_SNOW() { return new yarnwrap.block.cauldron.CauldronBehavior(wrapperContained.FILL_WITH_POWDER_SNOW); }
public java.util.Map BEHAVIOR_MAPS() { return wrapperContained.BEHAVIOR_MAPS; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public Object createMap(java.lang.String name) { return wrapperContained.createMap(name); }
// public yarnwrap.util.ItemActionResult fillCauldron(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state,yarnwrap.sound.SoundEvent soundEvent) { return new yarnwrap.util.ItemActionResult(wrapperContained.fillCauldron(world.wrapperContained,pos.wrapperContained,player.wrapperContained,hand.wrapperContained,stack.wrapperContained,state.wrapperContained,soundEvent.wrapperContained)); }
// public yarnwrap.util.ItemActionResult emptyCauldron(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack output,java.util.function.Predicate fullPredicate,yarnwrap.sound.SoundEvent soundEvent) { return new yarnwrap.util.ItemActionResult(wrapperContained.emptyCauldron(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained,hand.wrapperContained,stack.wrapperContained,output.wrapperContained,fullPredicate,soundEvent.wrapperContained)); }
// public void registerBehavior() { wrapperContained.registerBehavior(); }
// public void registerBucketBehavior(java.util.Map behavior) { wrapperContained.registerBucketBehavior(behavior); }

}