package yarnwrap.world.gen.structure;
public class NetherFossilStructure { public net.minecraft.world.gen.structure.NetherFossilStructure wrapperContained; public NetherFossilStructure(net.minecraft.world.gen.structure.NetherFossilStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.heightprovider.HeightProvider height() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.height); }
// public void height(yarnwrap.world.gen.heightprovider.HeightProvider value) { wrapperContained.height = value.wrapperContained; }

}