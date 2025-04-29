package yarnwrap.block;
public class StructureBlock { public net.minecraft.block.StructureBlock wrapperContained; public StructureBlock(net.minecraft.block.StructureBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty MODE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.MODE); }
// public void MODE(yarnwrap.state.property.EnumProperty value) { wrapperContained.MODE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty MODE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.StructureBlock.MODE); }
// public static void MODE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.StructureBlock.MODE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.StructureBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.StructureBlock.CODEC = value; }

// public void doAction(yarnwrap.server.world.ServerWorld world,yarnwrap.block.entity.StructureBlockBlockEntity blockEntity) { wrapperContained.doAction(world.wrapperContained,blockEntity.wrapperContained); }
// public static void doAction(yarnwrap.server.world.ServerWorld world,yarnwrap.block.entity.StructureBlockBlockEntity blockEntity, ) { net.minecraft.block.StructureBlock.doAction(world.wrapperContained,blockEntity.wrapperContained); }

}