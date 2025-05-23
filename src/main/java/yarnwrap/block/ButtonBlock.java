package yarnwrap.block;
public class ButtonBlock { public net.minecraft.block.ButtonBlock wrapperContained; public ButtonBlock(net.minecraft.block.ButtonBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ButtonBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ButtonBlock.POWERED = value.wrapperContained; }

// public int pressTicks() { return wrapperContained.pressTicks; }
// public void pressTicks(int value) { wrapperContained.pressTicks = value; }
// public static int pressTicks() { return net.minecraft.block.ButtonBlock.pressTicks; }
// public static void pressTicks(int value, ) { net.minecraft.block.ButtonBlock.pressTicks = value; }

// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
// public void blockSetType(yarnwrap.block.BlockSetType value) { wrapperContained.blockSetType = value.wrapperContained; }
// public static yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(net.minecraft.block.ButtonBlock.blockSetType); }
// public static void blockSetType(yarnwrap.block.BlockSetType value, ) { net.minecraft.block.ButtonBlock.blockSetType = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ButtonBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ButtonBlock.CODEC = value; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.ButtonBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.ButtonBlock.shapeFunction = value; }

// public ButtonBlock(yarnwrap.block.BlockSetType blockSetType,int pressTicks,Object settings) { this.wrapperContained = new net.minecraft.block.ButtonBlock(blockSetType.wrapperContained,pressTicks,settings); }
// public yarnwrap.sound.SoundEvent getClickSound(boolean powered) { return new yarnwrap.sound.SoundEvent(wrapperContained.getClickSound(powered)); }
// public static yarnwrap.sound.SoundEvent getClickSound(boolean powered, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.block.ButtonBlock.getClickSound(powered)); }
// public void updateNeighbors(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateNeighbors(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void updateNeighbors(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.ButtonBlock.updateNeighbors(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void playClickSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,boolean powered) { wrapperContained.playClickSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,powered); }
// public static void playClickSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,boolean powered, ) { net.minecraft.block.ButtonBlock.playClickSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,powered); }
// public void tryPowerWithProjectiles(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.tryPowerWithProjectiles(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void tryPowerWithProjectiles(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.ButtonBlock.tryPowerWithProjectiles(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public void powerOn(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.powerOn(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static void powerOn(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.ButtonBlock.powerOn(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53983(Object instance) { return wrapperContained.method_53983(instance); }
// public static com.mojang.datafixers.kinds.App method_53983(Object instance, ) { return net.minecraft.block.ButtonBlock.method_53983(instance); }
// public java.lang.Integer method_53984(yarnwrap.block.ButtonBlock block) { return wrapperContained.method_53984(block.wrapperContained); }
// public static java.lang.Integer method_53984(yarnwrap.block.ButtonBlock block, ) { return net.minecraft.block.ButtonBlock.method_53984(block.wrapperContained); }
// public yarnwrap.block.BlockSetType method_53985(yarnwrap.block.ButtonBlock block) { return new yarnwrap.block.BlockSetType(wrapperContained.method_53985(block.wrapperContained)); }
// public static yarnwrap.block.BlockSetType method_53985(yarnwrap.block.ButtonBlock block, ) { return new yarnwrap.block.BlockSetType(net.minecraft.block.ButtonBlock.method_53985(block.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape method_66418(java.util.Map state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66418(state)); }
// public static yarnwrap.util.shape.VoxelShape method_66418(java.util.Map state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ButtonBlock.method_66418(state)); }
// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.ButtonBlock.createShapeFunction(); }

}