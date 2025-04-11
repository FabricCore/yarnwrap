package yarnwrap.world.gen.structure;
public class NetherFossilStructure { public net.minecraft.world.gen.structure.NetherFossilStructure wrapperContained; public NetherFossilStructure(net.minecraft.world.gen.structure.NetherFossilStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.heightprovider.HeightProvider height() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.height); }
// public void height(yarnwrap.world.gen.heightprovider.HeightProvider value) { wrapperContained.height = value.wrapperContained; }
// public NetherFossilStructure(Object config,yarnwrap.world.gen.heightprovider.HeightProvider height) { this.wrapperContained = new net.minecraft.world.gen.structure.NetherFossilStructure(config,height.wrapperContained); }
// public void method_41672(Object collector,yarnwrap.util.math.random.ChunkRandom holder) { wrapperContained.method_41672(collector,holder.wrapperContained); }
// public yarnwrap.world.gen.heightprovider.HeightProvider method_41673(yarnwrap.world.gen.structure.NetherFossilStructure structure) { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.method_41673(structure.wrapperContained)); }

}