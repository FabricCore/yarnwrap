package yarnwrap.world.biome.source.util;
public class VanillaBiomeParameters { public net.minecraft.world.biome.source.util.VanillaBiomeParameters wrapperContained; public VanillaBiomeParameters(net.minecraft.world.biome.source.util.VanillaBiomeParameters wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MAX_VALLEY_WEIRDNESS() { return wrapperContained.MAX_VALLEY_WEIRDNESS; }
public float MAX_HIGH_WEIRDNESS() { return wrapperContained.MAX_HIGH_WEIRDNESS; }
// public float MAX_PEAK_WEIRDNESS() { return wrapperContained.MAX_PEAK_WEIRDNESS; }
// public Object defaultParameter() { return wrapperContained.defaultParameter; }
// public Object temperatureParameters() { return wrapperContained.temperatureParameters; }
// public Object humidityParameters() { return wrapperContained.humidityParameters; }
// public Object erosionParameters() { return wrapperContained.erosionParameters; }
// public Object frozenTemperature() { return wrapperContained.frozenTemperature; }
// public Object nonFrozenTemperatureParameters() { return wrapperContained.nonFrozenTemperatureParameters; }
// public Object mushroomFieldsContinentalness() { return wrapperContained.mushroomFieldsContinentalness; }
// public Object deepOceanContinentalness() { return wrapperContained.deepOceanContinentalness; }
// public Object oceanContinentalness() { return wrapperContained.oceanContinentalness; }
// public Object coastContinentalness() { return wrapperContained.coastContinentalness; }
// public Object riverContinentalness() { return wrapperContained.riverContinentalness; }
// public Object nearInlandContinentalness() { return wrapperContained.nearInlandContinentalness; }
// public Object midInlandContinentalness() { return wrapperContained.midInlandContinentalness; }
// public Object farInlandContinentalness() { return wrapperContained.farInlandContinentalness; }
// public net.minecraft.registry.RegistryKey[][] oceanBiomes() { return wrapperContained.oceanBiomes; }
// public net.minecraft.registry.RegistryKey[][] commonBiomes() { return wrapperContained.commonBiomes; }
// public net.minecraft.registry.RegistryKey[][] uncommonBiomes() { return wrapperContained.uncommonBiomes; }
// public net.minecraft.registry.RegistryKey[][] nearMountainBiomes() { return wrapperContained.nearMountainBiomes; }
// public net.minecraft.registry.RegistryKey[][] specialNearMountainBiomes() { return wrapperContained.specialNearMountainBiomes; }
public float MAX_MID_WEIRDNESS() { return wrapperContained.MAX_MID_WEIRDNESS; }
// public float MAX_LOW_WEIRDNESS() { return wrapperContained.MAX_LOW_WEIRDNESS; }
// public float MAX_SECOND_HIGH_WEIRDNESS() { return wrapperContained.MAX_SECOND_HIGH_WEIRDNESS; }
// public net.minecraft.registry.RegistryKey[][] windsweptBiomes() { return wrapperContained.windsweptBiomes; }
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