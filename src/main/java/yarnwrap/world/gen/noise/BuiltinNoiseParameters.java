package yarnwrap.world.gen.noise;
public class BuiltinNoiseParameters { public net.minecraft.world.gen.noise.BuiltinNoiseParameters wrapperContained; public BuiltinNoiseParameters(net.minecraft.world.gen.noise.BuiltinNoiseParameters wrapperContained) { this.wrapperContained = wrapperContained; }

public Object OFFSET() { return wrapperContained.OFFSET; }
// // public void OFFSET(Object value) { wrapperContained.OFFSET = value; }
public void bootstrap(yarnwrap.registry.Registerable noiseParametersRegisterable) { wrapperContained.bootstrap(noiseParametersRegisterable.wrapperContained); }
// public void register(yarnwrap.registry.Registerable noiseParametersRegisterable,yarnwrap.registry.RegistryKey key,int firstOctave,double firstAmplitude,double amplitudes) { wrapperContained.register(noiseParametersRegisterable.wrapperContained,key.wrapperContained,firstOctave,firstAmplitude,amplitudes); }
// public void register(yarnwrap.registry.Registerable noiseParametersRegisterable,int octaveOffset,yarnwrap.registry.RegistryKey temperatureKey,yarnwrap.registry.RegistryKey vegetationKey,yarnwrap.registry.RegistryKey continentalnessKey,yarnwrap.registry.RegistryKey erosionKey) { wrapperContained.register(noiseParametersRegisterable.wrapperContained,octaveOffset,temperatureKey.wrapperContained,vegetationKey.wrapperContained,continentalnessKey.wrapperContained,erosionKey.wrapperContained); }

}