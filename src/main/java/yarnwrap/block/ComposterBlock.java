package yarnwrap.block;
public class ComposterBlock { public net.minecraft.block.ComposterBlock wrapperContained; public ComposterBlock(net.minecraft.block.ComposterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
// public void LEVEL(yarnwrap.state.property.IntProperty value) { wrapperContained.LEVEL = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.ComposterBlock.LEVEL); }
// public static void LEVEL(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.ComposterBlock.LEVEL = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2FloatMap ITEM_TO_LEVEL_INCREASE_CHANCE() { return wrapperContained.ITEM_TO_LEVEL_INCREASE_CHANCE; }
// public void ITEM_TO_LEVEL_INCREASE_CHANCE(it.unimi.dsi.fastutil.objects.Object2FloatMap value) { wrapperContained.ITEM_TO_LEVEL_INCREASE_CHANCE = value; }
public static it.unimi.dsi.fastutil.objects.Object2FloatMap ITEM_TO_LEVEL_INCREASE_CHANCE() { return net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE; }
// public static void ITEM_TO_LEVEL_INCREASE_CHANCE(it.unimi.dsi.fastutil.objects.Object2FloatMap value, ) { net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE = value; }

// public yarnwrap.util.shape.VoxelShape RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.RAYCAST_SHAPE); }
// public void RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.RAYCAST_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape RAYCAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ComposterBlock.RAYCAST_SHAPE); }
// public static void RAYCAST_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.ComposterBlock.RAYCAST_SHAPE = value.wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] LEVEL_TO_COLLISION_SHAPE() { return wrapperContained.LEVEL_TO_COLLISION_SHAPE; }
// public void LEVEL_TO_COLLISION_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.LEVEL_TO_COLLISION_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] LEVEL_TO_COLLISION_SHAPE() { return net.minecraft.block.ComposterBlock.LEVEL_TO_COLLISION_SHAPE; }
// public static void LEVEL_TO_COLLISION_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.ComposterBlock.LEVEL_TO_COLLISION_SHAPE = value; }

// public int NUM_LEVELS() { return wrapperContained.NUM_LEVELS; }
// public void NUM_LEVELS(int value) { wrapperContained.NUM_LEVELS = value; }
public static int NUM_LEVELS() { return net.minecraft.block.ComposterBlock.NUM_LEVELS; }
// public static void NUM_LEVELS(int value, ) { net.minecraft.block.ComposterBlock.NUM_LEVELS = value; }

// public int MIN_LEVEL() { return wrapperContained.MIN_LEVEL; }
// public void MIN_LEVEL(int value) { wrapperContained.MIN_LEVEL = value; }
public static int MIN_LEVEL() { return net.minecraft.block.ComposterBlock.MIN_LEVEL; }
// public static void MIN_LEVEL(int value, ) { net.minecraft.block.ComposterBlock.MIN_LEVEL = value; }

// public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public void MAX_LEVEL(int value) { wrapperContained.MAX_LEVEL = value; }
public static int MAX_LEVEL() { return net.minecraft.block.ComposterBlock.MAX_LEVEL; }
// public static void MAX_LEVEL(int value, ) { net.minecraft.block.ComposterBlock.MAX_LEVEL = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ComposterBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ComposterBlock.CODEC = value; }

// public void registerCompostableItem(float levelIncreaseChance,yarnwrap.item.ItemConvertible item) { wrapperContained.registerCompostableItem(levelIncreaseChance,item.wrapperContained); }
// public static void registerCompostableItem(float levelIncreaseChance,yarnwrap.item.ItemConvertible item, ) { net.minecraft.block.ComposterBlock.registerCompostableItem(levelIncreaseChance,item.wrapperContained); }
// public void method_17755(net.minecraft.util.shape.VoxelShape[] shapes) { wrapperContained.method_17755(shapes); }
// public static void method_17755(net.minecraft.util.shape.VoxelShape[] shapes, ) { net.minecraft.block.ComposterBlock.method_17755(shapes); }
// public yarnwrap.block.BlockState addToComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { return new yarnwrap.block.BlockState(wrapperContained.addToComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.block.BlockState addToComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.block.BlockState(net.minecraft.block.ComposterBlock.addToComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained)); }
// public void registerDefaultCompostableItems() { wrapperContained.registerDefaultCompostableItems(); }
public static void registerDefaultCompostableItems() { net.minecraft.block.ComposterBlock.registerDefaultCompostableItems(); }
// public yarnwrap.block.BlockState emptyComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.emptyComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState emptyComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.ComposterBlock.emptyComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public void playEffects(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean fill) { wrapperContained.playEffects(world.wrapperContained,pos.wrapperContained,fill); }
// public static void playEffects(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean fill, ) { net.minecraft.block.ComposterBlock.playEffects(world.wrapperContained,pos.wrapperContained,fill); }
// public yarnwrap.block.BlockState compost(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.compost(user.wrapperContained,state.wrapperContained,world.wrapperContained,stack.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState compost(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.ComposterBlock.compost(user.wrapperContained,state.wrapperContained,world.wrapperContained,stack.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.block.BlockState emptyFullComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.emptyFullComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState emptyFullComposter(yarnwrap.entity.Entity user,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.ComposterBlock.emptyFullComposter(user.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }

}