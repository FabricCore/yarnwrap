package yarnwrap.world.biome;
public class GrassColors { public net.minecraft.world.biome.GrassColors wrapperContained; public GrassColors(net.minecraft.world.biome.GrassColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] colorMap() { return wrapperContained.colorMap; }
// public void colorMap(int[] value) { wrapperContained.colorMap = value; }
public int getDefaultColor() { return wrapperContained.getDefaultColor(); }
// public void setColorMap(int map) { wrapperContained.setColorMap(map); }
public int getColor(double temperature,double humidity) { return wrapperContained.getColor(temperature,humidity); }

}