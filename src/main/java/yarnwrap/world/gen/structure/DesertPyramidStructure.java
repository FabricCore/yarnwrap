package yarnwrap.world.gen.structure;
public class DesertPyramidStructure { public net.minecraft.world.gen.structure.DesertPyramidStructure wrapperContained; public DesertPyramidStructure(net.minecraft.world.gen.structure.DesertPyramidStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void placeSuspiciousSand(yarnwrap.util.math.BlockBox box,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.placeSuspiciousSand(box.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}