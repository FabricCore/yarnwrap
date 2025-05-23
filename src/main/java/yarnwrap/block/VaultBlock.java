package yarnwrap.block;
public class VaultBlock { public net.minecraft.block.VaultBlock wrapperContained; public VaultBlock(net.minecraft.block.VaultBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.VaultBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.VaultBlock.CODEC = value; }

// public yarnwrap.state.property.Property VAULT_STATE() { return new yarnwrap.state.property.Property(wrapperContained.VAULT_STATE); }
// public void VAULT_STATE(yarnwrap.state.property.Property value) { wrapperContained.VAULT_STATE = value.wrapperContained; }
public static yarnwrap.state.property.Property VAULT_STATE() { return new yarnwrap.state.property.Property(net.minecraft.block.VaultBlock.VAULT_STATE); }
// public static void VAULT_STATE(yarnwrap.state.property.Property value, ) { net.minecraft.block.VaultBlock.VAULT_STATE = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.VaultBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.VaultBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty OMINOUS() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OMINOUS); }
// public void OMINOUS(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OMINOUS = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty OMINOUS() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.VaultBlock.OMINOUS); }
// public static void OMINOUS(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.VaultBlock.OMINOUS = value.wrapperContained; }

// public void method_56718(yarnwrap.server.world.ServerWorld worldx,yarnwrap.world.World pos,yarnwrap.util.math.BlockPos statex,yarnwrap.block.BlockState blockEntity) { wrapperContained.method_56718(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public static void method_56718(yarnwrap.server.world.ServerWorld worldx,yarnwrap.world.World pos,yarnwrap.util.math.BlockPos statex,yarnwrap.block.BlockState blockEntity, ) { net.minecraft.block.VaultBlock.method_56718(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public void method_56719(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.VaultBlockEntity blockEntity) { wrapperContained.method_56719(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }
// public static void method_56719(yarnwrap.world.World worldx,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState statex,yarnwrap.block.entity.VaultBlockEntity blockEntity, ) { net.minecraft.block.VaultBlock.method_56719(worldx.wrapperContained,pos.wrapperContained,statex.wrapperContained,blockEntity.wrapperContained); }

}