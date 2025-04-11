package yarnwrap.world.biome.source.util;
public class VanillaBiomeParameters { public net.minecraft.world.biome.source.util.VanillaBiomeParameters wrapperContained; public VanillaBiomeParameters(net.minecraft.world.biome.source.util.VanillaBiomeParameters wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MAX_VALLEY_WEIRDNESS() { return wrapperContained.MAX_VALLEY_WEIRDNESS; }
// public void MAX_VALLEY_WEIRDNESS(float value) { wrapperContained.MAX_VALLEY_WEIRDNESS = value; }
public float MAX_HIGH_WEIRDNESS() { return wrapperContained.MAX_HIGH_WEIRDNESS; }
// public void MAX_HIGH_WEIRDNESS(float value) { wrapperContained.MAX_HIGH_WEIRDNESS = value; }
// public float MAX_PEAK_WEIRDNESS() { return wrapperContained.MAX_PEAK_WEIRDNESS; }
// public void MAX_PEAK_WEIRDNESS(float value) { wrapperContained.MAX_PEAK_WEIRDNESS = value; }
// public Object defaultParameter() { return wrapperContained.defaultParameter; }
// // public void defaultParameter(Object value) { wrapperContained.defaultParameter = value; }
// public Object temperatureParameters() { return wrapperContained.temperatureParameters; }
// // public void temperatureParameters(Object value) { wrapperContained.temperatureParameters = value; }
// public Object humidityParameters() { return wrapperContained.humidityParameters; }
// // public void humidityParameters(Object value) { wrapperContained.humidityParameters = value; }
// public Object erosionParameters() { return wrapperContained.erosionParameters; }
// // public void erosionParameters(Object value) { wrapperContained.erosionParameters = value; }
// public Object frozenTemperature() { return wrapperContained.frozenTemperature; }
// // public void frozenTemperature(Object value) { wrapperContained.frozenTemperature = value; }
// public Object nonFrozenTemperatureParameters() { return wrapperContained.nonFrozenTemperatureParameters; }
// // public void nonFrozenTemperatureParameters(Object value) { wrapperContained.nonFrozenTemperatureParameters = value; }
// public Object mushroomFieldsContinentalness() { return wrapperContained.mushroomFieldsContinentalness; }
// // public void mushroomFieldsContinentalness(Object value) { wrapperContained.mushroomFieldsContinentalness = value; }
// public Object deepOceanContinentalness() { return wrapperContained.deepOceanContinentalness; }
// // public void deepOceanContinentalness(Object value) { wrapperContained.deepOceanContinentalness = value; }
// public Object oceanContinentalness() { return wrapperContained.oceanContinentalness; }
// // public void oceanContinentalness(Object value) { wrapperContained.oceanContinentalness = value; }
// public Object coastContinentalness() { return wrapperContained.coastContinentalness; }
// // public void coastContinentalness(Object value) { wrapperContained.coastContinentalness = value; }
// public Object riverContinentalness() { return wrapperContained.riverContinentalness; }
// // public void riverContinentalness(Object value) { wrapperContained.riverContinentalness = value; }
// public Object nearInlandContinentalness() { return wrapperContained.nearInlandContinentalness; }
// // public void nearInlandContinentalness(Object value) { wrapperContained.nearInlandContinentalness = value; }
// public Object midInlandContinentalness() { return wrapperContained.midInlandContinentalness; }
// // public void midInlandContinentalness(Object value) { wrapperContained.midInlandContinentalness = value; }
// public Object farInlandContinentalness() { return wrapperContained.farInlandContinentalness; }
// // public void farInlandContinentalness(Object value) { wrapperContained.farInlandContinentalness = value; }
// public net.minecraft.registry.RegistryKey[][] oceanBiomes() { return wrapperContained.oceanBiomes; }
// public void oceanBiomes(net.minecraft.registry.RegistryKey[][] value) { wrapperContained.oceanBiomes = value; }
// public net.minecraft.registry.RegistryKey[][] commonBiomes() { return wrapperContained.commonBiomes; }
// public void commonBiomes(net.minecraft.registry.RegistryKey[][] value) { wrapperContained.commonBiomes = value; }
// public net.minecraft.registry.RegistryKey[][] uncommonBiomes() { return wrapperContained.uncommonBiomes; }
// public void uncommonBiomes(net.minecraft.registry.RegistryKey[][] value) { wrapperContained.uncommonBiomes = value; }
// public net.minecraft.registry.RegistryKey[][] nearMountainBiomes() { return wrapperContained.nearMountainBiomes; }
// public void nearMountainBiomes(net.minecraft.registry.RegistryKey[][] value) { wrapperContained.nearMountainBiomes = value; }
// public net.minecraft.registry.RegistryKey[][] specialNearMountainBiomes() { return wrapperContained.specialNearMountainBiomes; }
// public void specialNearMountainBiomes(net.minecraft.registry.RegistryKey[][] value) { wrapperContained.specialNearMountainBiomes = value; }
public float MAX_MID_WEIRDNESS() { return wrapperContained.MAX_MID_WEIRDNESS; }
// public void MAX_MID_WEIRDNESS(float value) { wrapperContained.MAX_MID_WEIRDNESS = value; }
// public float MAX_LOW_WEIRDNESS() { return wrapperContained.MAX_LOW_WEIRDNESS; }
// public void MAX_LOW_WEIRDNESS(float value) { wrapperContained.MAX_LOW_WEIRDNESS = value; }
// public float MAX_SECOND_HIGH_WEIRDNESS() { return wrapperContained.MAX_SECOND_HIGH_WEIRDNESS; }
// public void MAX_SECOND_HIGH_WEIRDNESS(float value) { wrapperContained.MAX_SECOND_HIGH_WEIRDNESS = value; }
// public net.minecraft.registry.RegistryKey[][] windsweptBiomes() { return wrapperContained.windsweptBiomes; }
// public void windsweptBiomes(net.minecraft.registry.RegistryKey[][] value) { wrapperContained.windsweptBiomes = value; }
public java.lang.String getPeaksValleysDescription(double weirdness) { return wrapperContained.getPeaksValleysDescription(weirdness); }
// public java.lang.String getNoiseRangeIndex(double noisePoint,Object[] noiseRanges) { return wrapperContained.getNoiseRangeIndex(noisePoint,noiseRanges); }
// public yarnwrap.registry.RegistryKey getShoreBiome(int temperature,int humidity) { return new yarnwrap.registry.RegistryKey(wrapperContained.getShoreBiome(temperature,humidity)); }
// public yarnwrap.registry.RegistryKey getRegularBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getRegularBiome(temperature,humidity,weirdness)); }
// public yarnwrap.registry.RegistryKey getWindsweptOrRegularBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getWindsweptOrRegularBiome(temperature,humidity,weirdness)); }
// public yarnwrap.registry.RegistryKey getBadlandsBiome(int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getBadlandsBiome(humidity,weirdness)); }
// public void writeOverworldBiomeParameters(java.util.function.Consumer parameters) { wrapperContained.writeOverworldBiomeParameters(parameters); }
// public void writePeakBiomes(java.util.function.Consumer parameters,Object weirdness) { wrapperContained.writePeakBiomes(parameters,weirdness); }
// public void writeBiomeParameters(java.util.function.Consumer parameters,Object temperature,Object humidity,Object continentalness,Object erosion,Object weirdness,float offset,yarnwrap.registry.RegistryKey biome) { wrapperContained.writeBiomeParameters(parameters,temperature,humidity,continentalness,erosion,weirdness,offset,biome.wrapperContained); }
public java.lang.String getContinentalnessDescription(double continentalness) { return wrapperContained.getContinentalnessDescription(continentalness); }
// public yarnwrap.registry.RegistryKey getBadlandsOrRegularBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getBadlandsOrRegularBiome(temperature,humidity,weirdness)); }
// public void writeOceanBiomes(java.util.function.Consumer parameters) { wrapperContained.writeOceanBiomes(parameters); }
// public void writeHighBiomes(java.util.function.Consumer parameters,Object weirdness) { wrapperContained.writeHighBiomes(parameters,weirdness); }
// public void writeCaveBiomeParameters(java.util.function.Consumer parameters,Object temperature,Object humidity,Object continentalness,Object erosion,Object weirdness,float offset,yarnwrap.registry.RegistryKey biome) { wrapperContained.writeCaveBiomeParameters(parameters,temperature,humidity,continentalness,erosion,weirdness,offset,biome.wrapperContained); }
public java.lang.String getErosionDescription(double erosion) { return wrapperContained.getErosionDescription(erosion); }
// public yarnwrap.registry.RegistryKey getMountainStartBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getMountainStartBiome(temperature,humidity,weirdness)); }
// public void writeLandBiomes(java.util.function.Consumer parameters) { wrapperContained.writeLandBiomes(parameters); }
// public void writeMidBiomes(java.util.function.Consumer parameters,Object weirdness) { wrapperContained.writeMidBiomes(parameters,weirdness); }
public java.lang.String getTemperatureDescription(double temperature) { return wrapperContained.getTemperatureDescription(temperature); }
// public yarnwrap.registry.RegistryKey getErodedShoreBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getErodedShoreBiome(temperature,humidity,weirdness)); }
// public void writeCaveBiomes(java.util.function.Consumer parameters) { wrapperContained.writeCaveBiomes(parameters); }
// public void writeLowBiomes(java.util.function.Consumer parameters,Object weirdness) { wrapperContained.writeLowBiomes(parameters,weirdness); }
public java.lang.String getHumidityDescription(double humidity) { return wrapperContained.getHumidityDescription(humidity); }
// public yarnwrap.registry.RegistryKey getNearMountainBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getNearMountainBiome(temperature,humidity,weirdness)); }
// public void writeValleyBiomes(java.util.function.Consumer parameters,Object weirdness) { wrapperContained.writeValleyBiomes(parameters,weirdness); }
// public yarnwrap.registry.RegistryKey getPeakBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getPeakBiome(temperature,humidity,weirdness)); }
// public yarnwrap.registry.RegistryKey getMountainSlopeBiome(int temperature,int humidity,Object weirdness) { return new yarnwrap.registry.RegistryKey(wrapperContained.getMountainSlopeBiome(temperature,humidity,weirdness)); }
public java.util.List getSpawnSuitabilityNoises() { return wrapperContained.getSpawnSuitabilityNoises(); }
// public yarnwrap.registry.RegistryKey getBiomeOrWindsweptSavanna(int temperature,int humidity,Object weirdness,yarnwrap.registry.RegistryKey biomeKey) { return new yarnwrap.registry.RegistryKey(wrapperContained.getBiomeOrWindsweptSavanna(temperature,humidity,weirdness,biomeKey.wrapperContained)); }
public Object getTemperatureParameters() { return wrapperContained.getTemperatureParameters(); }
public Object getHumidityParameters() { return wrapperContained.getHumidityParameters(); }
public Object getErosionParameters() { return wrapperContained.getErosionParameters(); }
public Object getContinentalnessParameters() { return wrapperContained.getContinentalnessParameters(); }
public Object getPeaksValleysParameters() { return wrapperContained.getPeaksValleysParameters(); }
public Object getWeirdnessParameters() { return wrapperContained.getWeirdnessParameters(); }
// public void writeDeepDarkParameters(java.util.function.Consumer parameters,Object temperature,Object humidity,Object continentalness,Object erosion,Object weirdness,float offset,yarnwrap.registry.RegistryKey biome) { wrapperContained.writeDeepDarkParameters(parameters,temperature,humidity,continentalness,erosion,weirdness,offset,biome.wrapperContained); }
// public boolean inDeepDarkParameters(yarnwrap.world.gen.densityfunction.DensityFunction erosion,yarnwrap.world.gen.densityfunction.DensityFunction depth,Object pos) { return wrapperContained.inDeepDarkParameters(erosion.wrapperContained,depth.wrapperContained,pos); }
// public void writeDebug(java.util.function.Consumer parameters) { wrapperContained.writeDebug(parameters); }

}