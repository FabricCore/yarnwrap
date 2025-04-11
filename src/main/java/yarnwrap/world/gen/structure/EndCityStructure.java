package yarnwrap.world.gen.structure;
public class EndCityStructure { public net.minecraft.world.gen.structure.EndCityStructure wrapperContained; public EndCityStructure(net.minecraft.world.gen.structure.EndCityStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void addPieces(yarnwrap.structure.StructurePiecesCollector collector,yarnwrap.util.math.BlockPos pos,yarnwrap.util.BlockRotation rotation,Object context) { wrapperContained.addPieces(collector.wrapperContained,pos.wrapperContained,rotation.wrapperContained,context); }
// public void method_41655(yarnwrap.util.math.BlockPos collector) { wrapperContained.method_41655(collector.wrapperContained); }

}