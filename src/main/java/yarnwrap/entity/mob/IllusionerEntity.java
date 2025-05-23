package yarnwrap.entity.mob;
public class IllusionerEntity { public net.minecraft.entity.mob.IllusionerEntity wrapperContained; public IllusionerEntity(net.minecraft.entity.mob.IllusionerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int mirrorSpellTimer() { return wrapperContained.mirrorSpellTimer; }
// public void mirrorSpellTimer(int value) { wrapperContained.mirrorSpellTimer = value; }
// public static int mirrorSpellTimer() { return net.minecraft.entity.mob.IllusionerEntity.mirrorSpellTimer; }
// public static void mirrorSpellTimer(int value, ) { net.minecraft.entity.mob.IllusionerEntity.mirrorSpellTimer = value; }

// public net.minecraft.util.math.Vec3d[][] mirrorCopyOffsets() { return wrapperContained.mirrorCopyOffsets; }
// public void mirrorCopyOffsets(net.minecraft.util.math.Vec3d[][] value) { wrapperContained.mirrorCopyOffsets = value; }
// public static net.minecraft.util.math.Vec3d[][] mirrorCopyOffsets() { return net.minecraft.entity.mob.IllusionerEntity.mirrorCopyOffsets; }
// public static void mirrorCopyOffsets(net.minecraft.util.math.Vec3d[][] value, ) { net.minecraft.entity.mob.IllusionerEntity.mirrorCopyOffsets = value; }

public net.minecraft.util.math.Vec3d[] getMirrorCopyOffsets(float tickProgress) { return wrapperContained.getMirrorCopyOffsets(tickProgress); }
// public static net.minecraft.util.math.Vec3d[] getMirrorCopyOffsets(float tickProgress, ) { return net.minecraft.entity.mob.IllusionerEntity.getMirrorCopyOffsets(tickProgress); }
// public Object createIllusionerAttributes() { return wrapperContained.createIllusionerAttributes(); }
public static Object createIllusionerAttributes() { return net.minecraft.entity.mob.IllusionerEntity.createIllusionerAttributes(); }

}