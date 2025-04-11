package yarnwrap.world.biome;
public class ColorResolver { public net.minecraft.world.biome.ColorResolver wrapperContained; public ColorResolver(net.minecraft.world.biome.ColorResolver wrapperContained) { this.wrapperContained = wrapperContained; }

public int getColor(yarnwrap.world.biome.Biome biome,double x,double z) { return wrapperContained.getColor(biome.wrapperContained,x,z); }

}