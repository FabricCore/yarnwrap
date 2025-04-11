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

}