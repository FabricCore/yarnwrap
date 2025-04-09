package yarnwrap.block;
public class ButtonBlock { public net.minecraft.block.ButtonBlock wrapperContained; public ButtonBlock(net.minecraft.block.ButtonBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape FLOOR_Z_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FLOOR_Z_SHAPE); }
// public yarnwrap.util.shape.VoxelShape CEILING_X_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CEILING_X_PRESSED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_PRESSED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_PRESSED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape CEILING_X_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CEILING_X_SHAPE); }
// public yarnwrap.util.shape.VoxelShape FLOOR_X_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FLOOR_X_PRESSED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape FLOOR_X_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FLOOR_X_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_PRESSED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape CEILING_Z_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CEILING_Z_PRESSED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape CEILING_Z_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CEILING_Z_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public yarnwrap.util.shape.VoxelShape FLOOR_Z_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FLOOR_Z_PRESSED_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_PRESSED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_PRESSED_SHAPE); }
// public int pressTicks() { return wrapperContained.pressTicks; }
// public yarnwrap.block.BlockSetType blockSetType() { return new yarnwrap.block.BlockSetType(wrapperContained.blockSetType); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public void powerOn(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.powerOn(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public yarnwrap.sound.SoundEvent getClickSound(boolean powered) { return new yarnwrap.sound.SoundEvent(wrapperContained.getClickSound(powered)); }
// public void updateNeighbors(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateNeighbors(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void playClickSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,boolean powered) { wrapperContained.playClickSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained,powered); }
// public void tryPowerWithProjectiles(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.tryPowerWithProjectiles(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}