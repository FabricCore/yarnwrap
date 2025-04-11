package yarnwrap.block;
public class AbstractSignBlock { public net.minecraft.block.AbstractSignBlock wrapperContained; public AbstractSignBlock(net.minecraft.block.AbstractSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public yarnwrap.block.WoodType type() { return new yarnwrap.block.WoodType(wrapperContained.type); }
// public void type(yarnwrap.block.WoodType value) { wrapperContained.type = value.wrapperContained; }
// public AbstractSignBlock(yarnwrap.block.WoodType type,Object settings) { this.wrapperContained = new net.minecraft.block.AbstractSignBlock(type.wrapperContained,settings); }
public yarnwrap.block.WoodType getWoodType() { return new yarnwrap.block.WoodType(wrapperContained.getWoodType()); }
public yarnwrap.block.WoodType getWoodType(yarnwrap.block.Block block) { return new yarnwrap.block.WoodType(wrapperContained.getWoodType(block.wrapperContained)); }
public float getRotationDegrees(yarnwrap.block.BlockState state) { return wrapperContained.getRotationDegrees(state.wrapperContained); }
// public boolean isOtherPlayerEditing(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.SignBlockEntity blockEntity) { return wrapperContained.isOtherPlayerEditing(player.wrapperContained,blockEntity.wrapperContained); }
public void openEditScreen(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.SignBlockEntity blockEntity,boolean front) { wrapperContained.openEditScreen(player.wrapperContained,blockEntity.wrapperContained,front); }
public yarnwrap.util.math.Vec3d getCenter(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Vec3d(wrapperContained.getCenter(state.wrapperContained)); }
// public boolean method_51172(yarnwrap.text.Text message) { return wrapperContained.method_51172(message.wrapperContained); }
// public boolean isTextLiteralOrEmpty(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.SignBlockEntity blockEntity,boolean front) { return wrapperContained.isTextLiteralOrEmpty(player.wrapperContained,blockEntity.wrapperContained,front); }

}