package yarnwrap.block;
public class AnvilBlock { public net.minecraft.block.AnvilBlock wrapperContained; public AnvilBlock(net.minecraft.block.AnvilBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public float FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER() { return wrapperContained.FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER; }
// public void FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER(float value) { wrapperContained.FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER = value; }
// public int FALLING_BLOCK_ENTITY_MAX_DAMAGE() { return wrapperContained.FALLING_BLOCK_ENTITY_MAX_DAMAGE; }
// public void FALLING_BLOCK_ENTITY_MAX_DAMAGE(int value) { wrapperContained.FALLING_BLOCK_ENTITY_MAX_DAMAGE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
// public void BASE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BASE_SHAPE = value.wrapperContained; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_FACE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_FACE_SHAPE); }
// public void X_FACE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_FACE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_STEP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_STEP_SHAPE); }
// public void X_STEP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_STEP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_FACE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_FACE_SHAPE); }
// public void Z_FACE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_FACE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_SHAPE); }
// public void X_AXIS_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_AXIS_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape X_STEM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_STEM_SHAPE); }
// public void X_STEM_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.X_STEM_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_STEM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_STEM_SHAPE); }
// public void Z_STEM_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_STEM_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_STEP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_STEP_SHAPE); }
// public void Z_STEP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_STEP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_SHAPE); }
// public void Z_AXIS_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.Z_AXIS_SHAPE = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandler method_17453(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17453(syncId.wrapperContained,inventory.wrapperContained,player)); }
public yarnwrap.block.BlockState getLandingState(yarnwrap.block.BlockState fallingState) { return new yarnwrap.block.BlockState(wrapperContained.getLandingState(fallingState.wrapperContained)); }

}