package yarnwrap.world.biome;
public class BiomeColors { public net.minecraft.world.biome.BiomeColors wrapperContained; public BiomeColors(net.minecraft.world.biome.BiomeColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public int getColor(double temperature,double downfall,int colormap,int fallback) { return wrapperContained.getColor(temperature,downfall,colormap,fallback); }
// public static int getColor(double temperature,double downfall,int colormap,int fallback, ) { return net.minecraft.world.biome.BiomeColors.getColor(temperature,downfall,colormap,fallback); }

}