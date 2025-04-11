package yarnwrap.block;
public class Blocks { public net.minecraft.block.Blocks wrapperContained; public Blocks(net.minecraft.block.Blocks wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.Block PUMPKIN() { return new yarnwrap.block.Block(wrapperContained.PUMPKIN); }
// public void PUMPKIN(yarnwrap.block.Block value) { wrapperContained.PUMPKIN = value.wrapperContained; }
public yarnwrap.block.Block MELON() { return new yarnwrap.block.Block(wrapperContained.MELON); }
// public void MELON(yarnwrap.block.Block value) { wrapperContained.MELON = value.wrapperContained; }
public yarnwrap.block.Block ATTACHED_PUMPKIN_STEM() { return new yarnwrap.block.Block(wrapperContained.ATTACHED_PUMPKIN_STEM); }
// public void ATTACHED_PUMPKIN_STEM(yarnwrap.block.Block value) { wrapperContained.ATTACHED_PUMPKIN_STEM = value.wrapperContained; }
public yarnwrap.block.Block ATTACHED_MELON_STEM() { return new yarnwrap.block.Block(wrapperContained.ATTACHED_MELON_STEM); }
// public void ATTACHED_MELON_STEM(yarnwrap.block.Block value) { wrapperContained.ATTACHED_MELON_STEM = value.wrapperContained; }
public yarnwrap.block.Block PUMPKIN_STEM() { return new yarnwrap.block.Block(wrapperContained.PUMPKIN_STEM); }
// public void PUMPKIN_STEM(yarnwrap.block.Block value) { wrapperContained.PUMPKIN_STEM = value.wrapperContained; }
public yarnwrap.block.Block MELON_STEM() { return new yarnwrap.block.Block(wrapperContained.MELON_STEM); }
// public void MELON_STEM(yarnwrap.block.Block value) { wrapperContained.MELON_STEM = value.wrapperContained; }
// public Object SHULKER_BOX_SUFFOCATES_PREDICATE() { return wrapperContained.SHULKER_BOX_SUFFOCATES_PREDICATE; }
// // public void SHULKER_BOX_SUFFOCATES_PREDICATE(Object value) { wrapperContained.SHULKER_BOX_SUFFOCATES_PREDICATE = value; }
// public yarnwrap.block.Block createLeavesBlock(yarnwrap.sound.BlockSoundGroup soundGroup) { return new yarnwrap.block.Block(wrapperContained.createLeavesBlock(soundGroup.wrapperContained)); }
// public java.util.function.ToIntFunction createLightLevelFromLitBlockState(int litLevel) { return wrapperContained.createLightLevelFromLitBlockState(litLevel); }
// public yarnwrap.block.Block createBedBlock(yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.createBedBlock(color.wrapperContained)); }
// public yarnwrap.block.Block createShulkerBoxBlock(yarnwrap.util.DyeColor color,yarnwrap.block.MapColor mapColor) { return new yarnwrap.block.Block(wrapperContained.createShulkerBoxBlock(color.wrapperContained,mapColor.wrapperContained)); }
// public boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public java.lang.Boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public yarnwrap.block.Block createNetherStemBlock(yarnwrap.block.MapColor mapColor) { return new yarnwrap.block.Block(wrapperContained.createNetherStemBlock(mapColor.wrapperContained)); }
// public yarnwrap.block.Block createLogBlock(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor) { return new yarnwrap.block.Block(wrapperContained.createLogBlock(topMapColor.wrapperContained,sideMapColor.wrapperContained)); }
// public yarnwrap.block.Block createPistonBlock(boolean sticky) { return new yarnwrap.block.Block(wrapperContained.createPistonBlock(sticky)); }
// public yarnwrap.block.Block createStainedGlassBlock(yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.createStainedGlassBlock(color.wrapperContained)); }
// public boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public java.lang.Boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public java.lang.Boolean canSpawnOnLeaves(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.canSpawnOnLeaves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
public void refreshShapeCache() { wrapperContained.refreshShapeCache(); }
// public yarnwrap.block.Block createWoodenButtonBlock(yarnwrap.block.BlockSetType blockSetType) { return new yarnwrap.block.Block(wrapperContained.createWoodenButtonBlock(blockSetType.wrapperContained)); }
// public yarnwrap.block.Block createStoneButtonBlock() { return new yarnwrap.block.Block(wrapperContained.createStoneButtonBlock()); }
// public yarnwrap.block.Block createLogBlock(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor,yarnwrap.sound.BlockSoundGroup soundGroup) { return new yarnwrap.block.Block(wrapperContained.createLogBlock(topMapColor.wrapperContained,sideMapColor.wrapperContained,soundGroup.wrapperContained)); }
// public yarnwrap.block.Block createFlowerPotBlock(yarnwrap.block.Block flower) { return new yarnwrap.block.Block(wrapperContained.createFlowerPotBlock(flower.wrapperContained)); }
// public yarnwrap.block.Block createCandleBlock(yarnwrap.block.MapColor color) { return new yarnwrap.block.Block(wrapperContained.createCandleBlock(color.wrapperContained)); }
public yarnwrap.block.Block register(yarnwrap.registry.RegistryKey key,yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.register(key.wrapperContained,block.wrapperContained)); }
// public yarnwrap.block.Block createStairsBlock(yarnwrap.block.Block base) { return new yarnwrap.block.Block(wrapperContained.createStairsBlock(base.wrapperContained)); }
// public yarnwrap.block.Block createOldStairsBlock(yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.createOldStairsBlock(block.wrapperContained)); }
// public java.util.function.Function createMapColorFromWaterloggedBlockState(yarnwrap.block.MapColor mapColor) { return wrapperContained.createMapColorFromWaterloggedBlockState(mapColor.wrapperContained); }
public yarnwrap.block.Block register(java.lang.String id,yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.register(id,block.wrapperContained)); }

}