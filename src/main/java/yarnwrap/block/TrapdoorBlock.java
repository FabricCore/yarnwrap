package yarnwrap.block;
public class TrapdoorBlock { public net.minecraft.block.TrapdoorBlock wrapperContained; public TrapdoorBlock(net.minecraft.block.TrapdoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
// public void HALF(yarnwrap.state.property.EnumProperty value) { wrapperContained.HALF = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.TrapdoorBlock.HALF); }
// public static void HALF(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.TrapdoorBlock.HALF = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TrapdoorBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TrapdoorBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TrapdoorBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TrapdoorBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
// public void OPEN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OPEN = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TrapdoorBlock.OPEN); }
// public static void OPEN(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TrapdoorBlock.OPEN = value.wrapperContained; }

// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
// public void blockSetType(yarnwrap.block.BlockSetType value) { wrapperContained.blockSetType = value.wrapperContained; }
// public static yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(net.minecraft.block.TrapdoorBlock.blockSetType); }
// public static void blockSetType(yarnwrap.block.BlockSetType value, ) { net.minecraft.block.TrapdoorBlock.blockSetType = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TrapdoorBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TrapdoorBlock.CODEC = value; }

// public java.util.Map shapeByDirection() { return wrapperContained.shapeByDirection; }
// public void shapeByDirection(java.util.Map value) { wrapperContained.shapeByDirection = value; }
// public static java.util.Map shapeByDirection() { return net.minecraft.block.TrapdoorBlock.shapeByDirection; }
// public static void shapeByDirection(java.util.Map value, ) { net.minecraft.block.TrapdoorBlock.shapeByDirection = value; }

// public TrapdoorBlock(yarnwrap.block.BlockSetType type,Object settings) { this.wrapperContained = new net.minecraft.block.TrapdoorBlock(type.wrapperContained,settings); }
// public void playToggleSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean open) { wrapperContained.playToggleSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,open); }
// public static void playToggleSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean open, ) { net.minecraft.block.TrapdoorBlock.playToggleSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,open); }
// public com.mojang.datafixers.kinds.App method_54058(Object instance) { return wrapperContained.method_54058(instance); }
// public static com.mojang.datafixers.kinds.App method_54058(Object instance, ) { return net.minecraft.block.TrapdoorBlock.method_54058(instance); }
// public yarnwrap.block.BlockSetType method_54059(yarnwrap.block.TrapdoorBlock block) { return new yarnwrap.block.BlockSetType(wrapperContained.method_54059(block.wrapperContained)); }
// public static yarnwrap.block.BlockSetType method_54059(yarnwrap.block.TrapdoorBlock block, ) { return new yarnwrap.block.BlockSetType(net.minecraft.block.TrapdoorBlock.method_54059(block.wrapperContained)); }
// public yarnwrap.block.BlockSetType getBlockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.getBlockSetType()); }
// public static yarnwrap.block.BlockSetType getBlockSetType() { return new yarnwrap.block.BlockSetType(net.minecraft.block.TrapdoorBlock.getBlockSetType()); }
// public void flip(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.flip(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static void flip(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.TrapdoorBlock.flip(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }

}