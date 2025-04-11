package yarnwrap.block;
public class VaultBlock { public net.minecraft.block.VaultBlock wrapperContained; public VaultBlock(net.minecraft.block.VaultBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.state.property.Property VAULT_STATE() { return new yarnwrap.state.property.Property(wrapperContained.VAULT_STATE); }
// public void VAULT_STATE(yarnwrap.state.property.Property value) { wrapperContained.VAULT_STATE = value.wrapperContained; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty OMINOUS() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OMINOUS); }
// public void OMINOUS(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OMINOUS = value.wrapperContained; }
// public void method_56718(yarnwrap.server.world.ServerWorld worldx,yarnwrap.world.World pos,yarnwrap.util.math.BlockPos statex,yarnwrap.block.BlockState blockEntity) { wrapperContained.method_56718(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public void method_56719(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.VaultBlockEntity blockEntity) { wrapperContained.method_56719(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }

}