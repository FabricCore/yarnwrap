package yarnwrap.client.sound;
public class Sound { public net.minecraft.client.sound.Sound wrapperContained; public Sound(net.minecraft.client.sound.Sound wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public int attenuation() { return wrapperContained.attenuation; }
// public yarnwrap.util.math.floatprovider.FloatSupplier pitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.pitch); }
// public boolean preload() { return wrapperContained.preload; }
// public yarnwrap.util.math.floatprovider.FloatSupplier volume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.volume); }
// public boolean stream() { return wrapperContained.stream; }
// public int weight() { return wrapperContained.weight; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public Object registrationType() { return wrapperContained.registrationType; }
public boolean isPreloaded() { return wrapperContained.isPreloaded(); }
public yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(wrapperContained.getLocation()); }
public yarnwrap.util.Identifier getIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.getIdentifier()); }
public Object getRegistrationType() { return wrapperContained.getRegistrationType(); }
public boolean isStreamed() { return wrapperContained.isStreamed(); }
public int getAttenuation() { return wrapperContained.getAttenuation(); }
public yarnwrap.util.math.floatprovider.FloatSupplier getVolume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.getVolume()); }
public yarnwrap.util.math.floatprovider.FloatSupplier getPitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.getPitch()); }

}