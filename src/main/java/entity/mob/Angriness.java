package yarnwrap.entity.mob;
public class Angriness { public net.minecraft.entity.mob.Angriness wrapperContained; public Angriness(net.minecraft.entity.mob.Angriness wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.entity.mob.Angriness[] VALUES() { return wrapperContained.VALUES; }
// public int threshold() { return wrapperContained.threshold; }
// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public yarnwrap.sound.SoundEvent listeningSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.listeningSound); }
public int getThreshold() { return wrapperContained.getThreshold(); }
public yarnwrap.entity.mob.Angriness getForAnger(int anger) { return new yarnwrap.entity.mob.Angriness(wrapperContained.getForAnger(anger)); }
public yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound()); }
public yarnwrap.sound.SoundEvent getListeningSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getListeningSound()); }
public boolean isAngry() { return wrapperContained.isAngry(); }

}