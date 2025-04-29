package yarnwrap.client.sound;
public class GuardianAttackSoundInstance { public net.minecraft.client.sound.GuardianAttackSoundInstance wrapperContained; public GuardianAttackSoundInstance(net.minecraft.client.sound.GuardianAttackSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public float BASE_VOLUME() { return wrapperContained.BASE_VOLUME; }
// public void BASE_VOLUME(float value) { wrapperContained.BASE_VOLUME = value; }
// public static float BASE_VOLUME() { return net.minecraft.client.sound.GuardianAttackSoundInstance.BASE_VOLUME; }
// public static void BASE_VOLUME(float value, ) { net.minecraft.client.sound.GuardianAttackSoundInstance.BASE_VOLUME = value; }

// public float BEAM_PROGRESS_VOLUME_MULTIPLIER() { return wrapperContained.BEAM_PROGRESS_VOLUME_MULTIPLIER; }
// public void BEAM_PROGRESS_VOLUME_MULTIPLIER(float value) { wrapperContained.BEAM_PROGRESS_VOLUME_MULTIPLIER = value; }
// public static float BEAM_PROGRESS_VOLUME_MULTIPLIER() { return net.minecraft.client.sound.GuardianAttackSoundInstance.BEAM_PROGRESS_VOLUME_MULTIPLIER; }
// public static void BEAM_PROGRESS_VOLUME_MULTIPLIER(float value, ) { net.minecraft.client.sound.GuardianAttackSoundInstance.BEAM_PROGRESS_VOLUME_MULTIPLIER = value; }

// public float BASE_PITCH() { return wrapperContained.BASE_PITCH; }
// public void BASE_PITCH(float value) { wrapperContained.BASE_PITCH = value; }
// public static float BASE_PITCH() { return net.minecraft.client.sound.GuardianAttackSoundInstance.BASE_PITCH; }
// public static void BASE_PITCH(float value, ) { net.minecraft.client.sound.GuardianAttackSoundInstance.BASE_PITCH = value; }

// public float BEAM_PROGRESS_PITCH_MULTIPLIER() { return wrapperContained.BEAM_PROGRESS_PITCH_MULTIPLIER; }
// public void BEAM_PROGRESS_PITCH_MULTIPLIER(float value) { wrapperContained.BEAM_PROGRESS_PITCH_MULTIPLIER = value; }
// public static float BEAM_PROGRESS_PITCH_MULTIPLIER() { return net.minecraft.client.sound.GuardianAttackSoundInstance.BEAM_PROGRESS_PITCH_MULTIPLIER; }
// public static void BEAM_PROGRESS_PITCH_MULTIPLIER(float value, ) { net.minecraft.client.sound.GuardianAttackSoundInstance.BEAM_PROGRESS_PITCH_MULTIPLIER = value; }

// public yarnwrap.entity.mob.GuardianEntity guardian() { return new yarnwrap.entity.mob.GuardianEntity(wrapperContained.guardian); }
// public void guardian(yarnwrap.entity.mob.GuardianEntity value) { wrapperContained.guardian = value.wrapperContained; }
// public static yarnwrap.entity.mob.GuardianEntity guardian() { return new yarnwrap.entity.mob.GuardianEntity(net.minecraft.client.sound.GuardianAttackSoundInstance.guardian); }
// public static void guardian(yarnwrap.entity.mob.GuardianEntity value, ) { net.minecraft.client.sound.GuardianAttackSoundInstance.guardian = value.wrapperContained; }

public GuardianAttackSoundInstance(yarnwrap.entity.mob.GuardianEntity guardian) { this.wrapperContained = new net.minecraft.client.sound.GuardianAttackSoundInstance(guardian.wrapperContained); }

}