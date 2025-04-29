package yarnwrap.world.biome;
public class FoliageColors { public net.minecraft.world.biome.FoliageColors wrapperContained; public FoliageColors(net.minecraft.world.biome.FoliageColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] colorMap() { return wrapperContained.colorMap; }
// public void colorMap(int[] value) { wrapperContained.colorMap = value; }
// public static int[] colorMap() { return net.minecraft.world.biome.FoliageColors.colorMap; }
// public static void colorMap(int[] value, ) { net.minecraft.world.biome.FoliageColors.colorMap = value; }

// public int getMangroveColor() { return wrapperContained.getMangroveColor(); }
public static int getMangroveColor() { return net.minecraft.world.biome.FoliageColors.getMangroveColor(); }
// public void setColorMap(int pixels) { wrapperContained.setColorMap(pixels); }
// public static void setColorMap(int pixels, ) { net.minecraft.world.biome.FoliageColors.setColorMap(pixels); }
// public int getDefaultColor() { return wrapperContained.getDefaultColor(); }
public static int getDefaultColor() { return net.minecraft.world.biome.FoliageColors.getDefaultColor(); }
// public int getSpruceColor() { return wrapperContained.getSpruceColor(); }
public static int getSpruceColor() { return net.minecraft.world.biome.FoliageColors.getSpruceColor(); }
// public int getBirchColor() { return wrapperContained.getBirchColor(); }
public static int getBirchColor() { return net.minecraft.world.biome.FoliageColors.getBirchColor(); }
// public int getColor(double temperature,double humidity) { return wrapperContained.getColor(temperature,humidity); }
// public static int getColor(double temperature,double humidity, ) { return net.minecraft.world.biome.FoliageColors.getColor(temperature,humidity); }

}