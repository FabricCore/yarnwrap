package yarnwrap.world.biome;
public class FoliageColors { public net.minecraft.world.biome.FoliageColors wrapperContained; public FoliageColors(net.minecraft.world.biome.FoliageColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] colorMap() { return wrapperContained.colorMap; }
public int getMangroveColor() { return wrapperContained.getMangroveColor(); }
// public void setColorMap(int pixels) { wrapperContained.setColorMap(pixels); }
public int getDefaultColor() { return wrapperContained.getDefaultColor(); }
public int getSpruceColor() { return wrapperContained.getSpruceColor(); }
public int getBirchColor() { return wrapperContained.getBirchColor(); }
public int getColor(double temperature,double humidity) { return wrapperContained.getColor(temperature,humidity); }

}