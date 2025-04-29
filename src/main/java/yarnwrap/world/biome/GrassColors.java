package yarnwrap.world.biome;
public class GrassColors { public net.minecraft.world.biome.GrassColors wrapperContained; public GrassColors(net.minecraft.world.biome.GrassColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] colorMap() { return wrapperContained.colorMap; }
// public void colorMap(int[] value) { wrapperContained.colorMap = value; }
// public static int[] colorMap() { return net.minecraft.world.biome.GrassColors.colorMap; }
// public static void colorMap(int[] value, ) { net.minecraft.world.biome.GrassColors.colorMap = value; }

// public int getDefaultColor() { return wrapperContained.getDefaultColor(); }
public static int getDefaultColor() { return net.minecraft.world.biome.GrassColors.getDefaultColor(); }
// public void setColorMap(int map) { wrapperContained.setColorMap(map); }
// public static void setColorMap(int map, ) { net.minecraft.world.biome.GrassColors.setColorMap(map); }
// public int getColor(double temperature,double humidity) { return wrapperContained.getColor(temperature,humidity); }
// public static int getColor(double temperature,double humidity, ) { return net.minecraft.world.biome.GrassColors.getColor(temperature,humidity); }

}