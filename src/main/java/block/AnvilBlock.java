package yarnwrap.block;
public class AnvilBlock { public net.minecraft.block.AnvilBlock wrapperContained; public AnvilBlock(net.minecraft.block.AnvilBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public float FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER() { return wrapperContained.FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER; }
// public int FALLING_BLOCK_ENTITY_MAX_DAMAGE() { return wrapperContained.FALLING_BLOCK_ENTITY_MAX_DAMAGE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape X_FACE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_FACE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_STEP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_STEP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape Z_FACE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_FACE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_AXIS_SHAPE); }
// public yarnwrap.util.shape.VoxelShape X_STEM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.X_STEM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape Z_STEM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_STEM_SHAPE); }
// public yarnwrap.util.shape.VoxelShape Z_STEP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_STEP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape Z_AXIS_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.Z_AXIS_SHAPE); }
public yarnwrap.block.BlockState getLandingState(yarnwrap.block.BlockState fallingState) { return new yarnwrap.block.BlockState(wrapperContained.getLandingState(fallingState.wrapperContained)); }

}