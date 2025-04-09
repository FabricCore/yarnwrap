package yarnwrap.world.gen.structure;
public class NetherFossilStructure { public net.minecraft.world.gen.structure.NetherFossilStructure wrapperContained; public NetherFossilStructure(net.minecraft.world.gen.structure.NetherFossilStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.world.gen.heightprovider.HeightProvider height() { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.height); }

}