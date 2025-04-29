package yarnwrap.block;
public class CakeBlock { public net.minecraft.block.CakeBlock wrapperContained; public CakeBlock(net.minecraft.block.CakeBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] BITES_TO_SHAPE() { return wrapperContained.BITES_TO_SHAPE; }
// public void BITES_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.BITES_TO_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] BITES_TO_SHAPE() { return net.minecraft.block.CakeBlock.BITES_TO_SHAPE; }
// public static void BITES_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CakeBlock.BITES_TO_SHAPE = value; }

// public yarnwrap.state.property.IntProperty BITES() { return new yarnwrap.state.property.IntProperty(wrapperContained.BITES); }
// public void BITES(yarnwrap.state.property.IntProperty value) { wrapperContained.BITES = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty BITES() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.CakeBlock.BITES); }
// public static void BITES(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.CakeBlock.BITES = value.wrapperContained; }

// public int DEFAULT_COMPARATOR_OUTPUT() { return wrapperContained.DEFAULT_COMPARATOR_OUTPUT; }
// public void DEFAULT_COMPARATOR_OUTPUT(int value) { wrapperContained.DEFAULT_COMPARATOR_OUTPUT = value; }
public static int DEFAULT_COMPARATOR_OUTPUT() { return net.minecraft.block.CakeBlock.DEFAULT_COMPARATOR_OUTPUT; }
// public static void DEFAULT_COMPARATOR_OUTPUT(int value, ) { net.minecraft.block.CakeBlock.DEFAULT_COMPARATOR_OUTPUT = value; }

// public int MAX_BITES() { return wrapperContained.MAX_BITES; }
// public void MAX_BITES(int value) { wrapperContained.MAX_BITES = value; }
public static int MAX_BITES() { return net.minecraft.block.CakeBlock.MAX_BITES; }
// public static void MAX_BITES(int value, ) { net.minecraft.block.CakeBlock.MAX_BITES = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CakeBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CakeBlock.CODEC = value; }

// public int getComparatorOutput(int bites) { return wrapperContained.getComparatorOutput(bites); }
// public static int getComparatorOutput(int bites, ) { return net.minecraft.block.CakeBlock.getComparatorOutput(bites); }
// public yarnwrap.util.ActionResult tryEat(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ActionResult(wrapperContained.tryEat(world.wrapperContained,pos.wrapperContained,state.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.util.ActionResult tryEat(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.util.ActionResult(net.minecraft.block.CakeBlock.tryEat(world.wrapperContained,pos.wrapperContained,state.wrapperContained,player.wrapperContained)); }

}