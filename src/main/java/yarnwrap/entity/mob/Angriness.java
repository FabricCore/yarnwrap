package yarnwrap.entity.mob;
public class Angriness { public net.minecraft.entity.mob.Angriness wrapperContained; public Angriness(net.minecraft.entity.mob.Angriness wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.entity.mob.Angriness[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.entity.mob.Angriness[] value) { wrapperContained.VALUES = value; }
// public static net.minecraft.entity.mob.Angriness[] VALUES() { return net.minecraft.entity.mob.Angriness.VALUES; }
// public static void VALUES(net.minecraft.entity.mob.Angriness[] value, ) { net.minecraft.entity.mob.Angriness.VALUES = value; }

// public int threshold() { return wrapperContained.threshold; }
// public void threshold(int value) { wrapperContained.threshold = value; }
// public static int threshold() { return net.minecraft.entity.mob.Angriness.threshold; }
// public static void threshold(int value, ) { net.minecraft.entity.mob.Angriness.threshold = value; }

// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public void sound(yarnwrap.sound.SoundEvent value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.Angriness.sound); }
// public static void sound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.entity.mob.Angriness.sound = value.wrapperContained; }

// public yarnwrap.sound.SoundEvent listeningSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.listeningSound); }
// public void listeningSound(yarnwrap.sound.SoundEvent value) { wrapperContained.listeningSound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent listeningSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.Angriness.listeningSound); }
// public static void listeningSound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.entity.mob.Angriness.listeningSound = value.wrapperContained; }

// // public Angriness(java.lang.String threshold,int sound,int listeningSound) { this.wrapperContained = new net.minecraft.entity.mob.Angriness(threshold,sound,listeningSound); }
public int getThreshold() { return wrapperContained.getThreshold(); }
// public static int getThreshold() { return net.minecraft.entity.mob.Angriness.getThreshold(); }
// public yarnwrap.entity.mob.Angriness getForAnger(int anger) { return new yarnwrap.entity.mob.Angriness(wrapperContained.getForAnger(anger)); }
// public static yarnwrap.entity.mob.Angriness getForAnger(int anger, ) { return new yarnwrap.entity.mob.Angriness(net.minecraft.entity.mob.Angriness.getForAnger(anger)); }
// public int method_42172(yarnwrap.entity.mob.Angriness a,yarnwrap.entity.mob.Angriness b) { return wrapperContained.method_42172(a.wrapperContained,b.wrapperContained); }
// public static int method_42172(yarnwrap.entity.mob.Angriness a,yarnwrap.entity.mob.Angriness b, ) { return net.minecraft.entity.mob.Angriness.method_42172(a.wrapperContained,b.wrapperContained); }
// public void method_42173(net.minecraft.entity.mob.Angriness[] values) { wrapperContained.method_42173(values); }
// public static void method_42173(net.minecraft.entity.mob.Angriness[] values, ) { net.minecraft.entity.mob.Angriness.method_42173(values); }
public yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound()); }
// public static yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.Angriness.getSound()); }
public yarnwrap.sound.SoundEvent getListeningSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getListeningSound()); }
// public static yarnwrap.sound.SoundEvent getListeningSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.Angriness.getListeningSound()); }
public boolean isAngry() { return wrapperContained.isAngry(); }
// public static boolean isAngry() { return net.minecraft.entity.mob.Angriness.isAngry(); }

}