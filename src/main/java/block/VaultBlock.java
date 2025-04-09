package yarnwrap.block;
public class VaultBlock { public net.minecraft.block.VaultBlock wrapperContained; public VaultBlock(net.minecraft.block.VaultBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.state.property.Property VAULT_STATE() { return new yarnwrap.state.property.Property(wrapperContained.VAULT_STATE); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public yarnwrap.state.property.BooleanProperty OMINOUS() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OMINOUS); }

}