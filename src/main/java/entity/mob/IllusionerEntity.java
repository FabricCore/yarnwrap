package yarnwrap.entity.mob;
public class IllusionerEntity { public net.minecraft.entity.mob.IllusionerEntity wrapperContained; public IllusionerEntity(net.minecraft.entity.mob.IllusionerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int mirrorSpellTimer() { return wrapperContained.mirrorSpellTimer; }
// public net.minecraft.util.math.Vec3d[][] mirrorCopyOffsets() { return wrapperContained.mirrorCopyOffsets; }
public Object createIllusionerAttributes() { return wrapperContained.createIllusionerAttributes(); }
public net.minecraft.util.math.Vec3d[] getMirrorCopyOffsets(float tickDelta) { return wrapperContained.getMirrorCopyOffsets(tickDelta); }

}