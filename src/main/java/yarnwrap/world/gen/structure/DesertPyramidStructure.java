package yarnwrap.world.gen.structure;
public class DesertPyramidStructure { public net.minecraft.world.gen.structure.DesertPyramidStructure wrapperContained; public DesertPyramidStructure(net.minecraft.world.gen.structure.DesertPyramidStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.DesertPyramidStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.DesertPyramidStructure.CODEC = value; }

// public void placeSuspiciousSand(yarnwrap.util.math.BlockBox box,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.placeSuspiciousSand(box.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void placeSuspiciousSand(yarnwrap.util.math.BlockBox box,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.gen.structure.DesertPyramidStructure.placeSuspiciousSand(box.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void method_51182(yarnwrap.util.math.BlockPos blockEntity) { wrapperContained.method_51182(blockEntity.wrapperContained); }
// public static void method_51182(yarnwrap.util.math.BlockPos blockEntity, ) { net.minecraft.world.gen.structure.DesertPyramidStructure.method_51182(blockEntity.wrapperContained); }

}