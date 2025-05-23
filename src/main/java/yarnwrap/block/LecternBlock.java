package yarnwrap.block;
public class LecternBlock { public net.minecraft.block.LecternBlock wrapperContained; public LecternBlock(net.minecraft.block.LecternBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.LecternBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.LecternBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LecternBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LecternBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty HAS_BOOK() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HAS_BOOK); }
// public void HAS_BOOK(yarnwrap.state.property.BooleanProperty value) { wrapperContained.HAS_BOOK = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty HAS_BOOK() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LecternBlock.HAS_BOOK); }
// public static void HAS_BOOK(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LecternBlock.HAS_BOOK = value.wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
// public static int SCHEDULED_TICK_DELAY() { return net.minecraft.block.LecternBlock.SCHEDULED_TICK_DELAY; }
// public static void SCHEDULED_TICK_DELAY(int value, ) { net.minecraft.block.LecternBlock.SCHEDULED_TICK_DELAY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LecternBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LecternBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
// public void BASE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BASE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.LecternBlock.BASE_SHAPE); }
// public static void BASE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.LecternBlock.BASE_SHAPE = value.wrapperContained; }

// public java.util.Map OUTLINE_SHAPES_BY_DIRECTION() { return wrapperContained.OUTLINE_SHAPES_BY_DIRECTION; }
// public void OUTLINE_SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.OUTLINE_SHAPES_BY_DIRECTION = value; }
// public static java.util.Map OUTLINE_SHAPES_BY_DIRECTION() { return net.minecraft.block.LecternBlock.OUTLINE_SHAPES_BY_DIRECTION; }
// public static void OUTLINE_SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.LecternBlock.OUTLINE_SHAPES_BY_DIRECTION = value; }

// public void openScreen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.openScreen(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static void openScreen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.LecternBlock.openScreen(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void setPowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setPowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void setPowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.LecternBlock.setPowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean putBookIfAbsent(yarnwrap.entity.LivingEntity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.item.ItemStack stack) { return wrapperContained.putBookIfAbsent(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,stack.wrapperContained); }
// public static boolean putBookIfAbsent(yarnwrap.entity.LivingEntity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.item.ItemStack stack, ) { return net.minecraft.block.LecternBlock.putBookIfAbsent(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,stack.wrapperContained); }
// public void setHasBook(yarnwrap.entity.Entity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean hasBook) { wrapperContained.setHasBook(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,hasBook); }
// public static void setHasBook(yarnwrap.entity.Entity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean hasBook, ) { net.minecraft.block.LecternBlock.setHasBook(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,hasBook); }
// public void updateNeighborAlways(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighborAlways(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateNeighborAlways(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.LecternBlock.updateNeighborAlways(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void putBook(yarnwrap.entity.LivingEntity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.item.ItemStack stack) { wrapperContained.putBook(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,stack.wrapperContained); }
// public static void putBook(yarnwrap.entity.LivingEntity user,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.item.ItemStack stack, ) { net.minecraft.block.LecternBlock.putBook(user.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,stack.wrapperContained); }
// public void setPowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean powered) { wrapperContained.setPowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained,powered); }
// public static void setPowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean powered, ) { net.minecraft.block.LecternBlock.setPowered(world.wrapperContained,pos.wrapperContained,state.wrapperContained,powered); }

}