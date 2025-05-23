package yarnwrap.client.sound;
public class Sound { public net.minecraft.client.sound.Sound wrapperContained; public Sound(net.minecraft.client.sound.Sound wrapperContained) { this.wrapperContained = wrapperContained; }

// public int attenuation() { return wrapperContained.attenuation; }
// public void attenuation(int value) { wrapperContained.attenuation = value; }
// public static int attenuation() { return net.minecraft.client.sound.Sound.attenuation; }
// public static void attenuation(int value, ) { net.minecraft.client.sound.Sound.attenuation = value; }

// public yarnwrap.util.math.floatprovider.FloatSupplier pitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.pitch); }
// public void pitch(yarnwrap.util.math.floatprovider.FloatSupplier value) { wrapperContained.pitch = value.wrapperContained; }
// public static yarnwrap.util.math.floatprovider.FloatSupplier pitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(net.minecraft.client.sound.Sound.pitch); }
// public static void pitch(yarnwrap.util.math.floatprovider.FloatSupplier value, ) { net.minecraft.client.sound.Sound.pitch = value.wrapperContained; }

// public boolean preload() { return wrapperContained.preload; }
// public void preload(boolean value) { wrapperContained.preload = value; }
// public static boolean preload() { return net.minecraft.client.sound.Sound.preload; }
// public static void preload(boolean value, ) { net.minecraft.client.sound.Sound.preload = value; }

// public yarnwrap.util.math.floatprovider.FloatSupplier volume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.volume); }
// public void volume(yarnwrap.util.math.floatprovider.FloatSupplier value) { wrapperContained.volume = value.wrapperContained; }
// public static yarnwrap.util.math.floatprovider.FloatSupplier volume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(net.minecraft.client.sound.Sound.volume); }
// public static void volume(yarnwrap.util.math.floatprovider.FloatSupplier value, ) { net.minecraft.client.sound.Sound.volume = value.wrapperContained; }

// public boolean stream() { return wrapperContained.stream; }
// public void stream(boolean value) { wrapperContained.stream = value; }
// public static boolean stream() { return net.minecraft.client.sound.Sound.stream; }
// public static void stream(boolean value, ) { net.minecraft.client.sound.Sound.stream = value; }

// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
// public static int weight() { return net.minecraft.client.sound.Sound.weight; }
// public static void weight(int value, ) { net.minecraft.client.sound.Sound.weight = value; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.sound.Sound.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.sound.Sound.id = value.wrapperContained; }

// public Object registrationType() { return wrapperContained.registrationType; }
// // public void registrationType(Object value) { wrapperContained.registrationType = value; }
// // public static Object registrationType() { return net.minecraft.client.sound.Sound.registrationType; }
// // public static void registrationType(Object value, ) { net.minecraft.client.sound.Sound.registrationType = value; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.sound.Sound.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.sound.Sound.FINDER = value.wrapperContained; }

// public Sound(yarnwrap.util.Identifier id,yarnwrap.util.math.floatprovider.FloatSupplier volume,yarnwrap.util.math.floatprovider.FloatSupplier pitch,int weight,Object registrationType,boolean stream,boolean preload,int attenuation) { this.wrapperContained = new net.minecraft.client.sound.Sound(id.wrapperContained,volume.wrapperContained,pitch.wrapperContained,weight,registrationType,stream,preload,attenuation); }
public boolean isPreloaded() { return wrapperContained.isPreloaded(); }
// public static boolean isPreloaded() { return net.minecraft.client.sound.Sound.isPreloaded(); }
public yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(wrapperContained.getLocation()); }
// public static yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(net.minecraft.client.sound.Sound.getLocation()); }
public yarnwrap.util.Identifier getIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.getIdentifier()); }
// public static yarnwrap.util.Identifier getIdentifier() { return new yarnwrap.util.Identifier(net.minecraft.client.sound.Sound.getIdentifier()); }
public Object getRegistrationType() { return wrapperContained.getRegistrationType(); }
// public static Object getRegistrationType() { return net.minecraft.client.sound.Sound.getRegistrationType(); }
public boolean isStreamed() { return wrapperContained.isStreamed(); }
// public static boolean isStreamed() { return net.minecraft.client.sound.Sound.isStreamed(); }
public int getAttenuation() { return wrapperContained.getAttenuation(); }
// public static int getAttenuation() { return net.minecraft.client.sound.Sound.getAttenuation(); }
public yarnwrap.util.math.floatprovider.FloatSupplier getVolume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.getVolume()); }
// public static yarnwrap.util.math.floatprovider.FloatSupplier getVolume() { return new yarnwrap.util.math.floatprovider.FloatSupplier(net.minecraft.client.sound.Sound.getVolume()); }
public yarnwrap.util.math.floatprovider.FloatSupplier getPitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(wrapperContained.getPitch()); }
// public static yarnwrap.util.math.floatprovider.FloatSupplier getPitch() { return new yarnwrap.util.math.floatprovider.FloatSupplier(net.minecraft.client.sound.Sound.getPitch()); }

}