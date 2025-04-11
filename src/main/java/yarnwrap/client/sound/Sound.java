package yarnwrap.client.sound;
public class Sound { public net.minecraft.client.sound.Sound wrapperContained; public Sound(net.minecraft.client.sound.Sound wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public int attenuation() { return wrapperContained.attenuation; }
// public void attenuation(int value) { wrapperContained.attenuation = value; }
// public yarnwrap.util.math.floatprovider.FloatSupplier pitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.pitch); }
// public void pitch(yarnwrap.util.math.floatprovider.FloatSupplier value) { wrapperContained.pitch = value.wrapperContained; }
// public boolean preload() { return wrapperContained.preload; }
// public void preload(boolean value) { wrapperContained.preload = value; }
// public yarnwrap.util.math.floatprovider.FloatSupplier volume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.volume); }
// public void volume(yarnwrap.util.math.floatprovider.FloatSupplier value) { wrapperContained.volume = value.wrapperContained; }
// public boolean stream() { return wrapperContained.stream; }
// public void stream(boolean value) { wrapperContained.stream = value; }
// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public Object registrationType() { return wrapperContained.registrationType; }
// // public void registrationType(Object value) { wrapperContained.registrationType = value; }
public boolean isPreloaded() { return wrapperContained.isPreloaded(); }
public yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(wrapperContained.getLocation()); }
public yarnwrap.util.Identifier getIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.getIdentifier()); }
public Object getRegistrationType() { return wrapperContained.getRegistrationType(); }
public boolean isStreamed() { return wrapperContained.isStreamed(); }
public int getAttenuation() { return wrapperContained.getAttenuation(); }
public yarnwrap.util.math.floatprovider.FloatSupplier getVolume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.getVolume()); }
public yarnwrap.util.math.floatprovider.FloatSupplier getPitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.getPitch()); }

}