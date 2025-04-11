package yarnwrap.world.biome.source.util;
public class VanillaTerrainParametersCreator { public net.minecraft.world.biome.source.util.VanillaTerrainParametersCreator wrapperContained; public VanillaTerrainParametersCreator(net.minecraft.world.biome.source.util.VanillaTerrainParametersCreator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.function.ToFloatFunction IDENTITY() { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.IDENTITY); }
// public void IDENTITY(yarnwrap.util.function.ToFloatFunction value) { wrapperContained.IDENTITY = value.wrapperContained; }
// public yarnwrap.util.function.ToFloatFunction OFFSET_AMPLIFIER() { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.OFFSET_AMPLIFIER); }
// public void OFFSET_AMPLIFIER(yarnwrap.util.function.ToFloatFunction value) { wrapperContained.OFFSET_AMPLIFIER = value.wrapperContained; }
// public yarnwrap.util.function.ToFloatFunction FACTOR_AMPLIFIER() { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.FACTOR_AMPLIFIER); }
// public void FACTOR_AMPLIFIER(yarnwrap.util.function.ToFloatFunction value) { wrapperContained.FACTOR_AMPLIFIER = value.wrapperContained; }
// public yarnwrap.util.function.ToFloatFunction JAGGEDNESS_AMPLIFIER() { return new yarnwrap.util.function.ToFloatFunction(wrapperContained.JAGGEDNESS_AMPLIFIER); }
// public void JAGGEDNESS_AMPLIFIER(yarnwrap.util.function.ToFloatFunction value) { wrapperContained.JAGGEDNESS_AMPLIFIER = value.wrapperContained; }
// public float getOffsetValue() { return wrapperContained.getOffsetValue(); }
// public yarnwrap.util.math.Spline createContinentalOffsetSpline(yarnwrap.util.function.ToFloatFunction erosion,yarnwrap.util.function.ToFloatFunction ridgesFolded,float continentalness,float amplifier) { return new yarnwrap.util.math.Spline(wrapperContained.createContinentalOffsetSpline(erosion.wrapperContained,ridgesFolded.wrapperContained,continentalness,amplifier)); }
public yarnwrap.util.math.Spline createFactorSpline(yarnwrap.util.function.ToFloatFunction continents,yarnwrap.util.function.ToFloatFunction erosion,yarnwrap.util.function.ToFloatFunction ridges,yarnwrap.util.function.ToFloatFunction ridgesFolded,boolean amplified) { return new yarnwrap.util.math.Spline(wrapperContained.createFactorSpline(continents.wrapperContained,erosion.wrapperContained,ridges.wrapperContained,ridgesFolded.wrapperContained,amplified)); }
public yarnwrap.util.math.Spline createOffsetSpline(yarnwrap.util.function.ToFloatFunction continents,yarnwrap.util.function.ToFloatFunction erosion,yarnwrap.util.function.ToFloatFunction ridgesFolded,boolean amplified) { return new yarnwrap.util.math.Spline(wrapperContained.createOffsetSpline(continents.wrapperContained,erosion.wrapperContained,ridgesFolded.wrapperContained,amplified)); }
public yarnwrap.util.math.Spline createJaggednessSpline(yarnwrap.util.function.ToFloatFunction continents,yarnwrap.util.function.ToFloatFunction erosion,yarnwrap.util.function.ToFloatFunction ridges,yarnwrap.util.function.ToFloatFunction ridgesFolded,boolean amplified) { return new yarnwrap.util.math.Spline(wrapperContained.createJaggednessSpline(continents.wrapperContained,erosion.wrapperContained,ridges.wrapperContained,ridgesFolded.wrapperContained,amplified)); }

}