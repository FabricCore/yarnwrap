package yarnwrap.entity.ai.brain;
public class EntityLookTarget { public net.minecraft.entity.ai.brain.EntityLookTarget wrapperContained; public EntityLookTarget(net.minecraft.entity.ai.brain.EntityLookTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.entity.ai.brain.EntityLookTarget.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.entity.ai.brain.EntityLookTarget.entity = value.wrapperContained; }

// public boolean useEyeHeight() { return wrapperContained.useEyeHeight; }
// public void useEyeHeight(boolean value) { wrapperContained.useEyeHeight = value; }
// public static boolean useEyeHeight() { return net.minecraft.entity.ai.brain.EntityLookTarget.useEyeHeight; }
// public static void useEyeHeight(boolean value, ) { net.minecraft.entity.ai.brain.EntityLookTarget.useEyeHeight = value; }

// public boolean blockPosAtEye() { return wrapperContained.blockPosAtEye; }
// public void blockPosAtEye(boolean value) { wrapperContained.blockPosAtEye = value; }
// public static boolean blockPosAtEye() { return net.minecraft.entity.ai.brain.EntityLookTarget.blockPosAtEye; }
// public static void blockPosAtEye(boolean value, ) { net.minecraft.entity.ai.brain.EntityLookTarget.blockPosAtEye = value; }

public EntityLookTarget(yarnwrap.entity.Entity entity,boolean useEyeHeight) { this.wrapperContained = new net.minecraft.entity.ai.brain.EntityLookTarget(entity.wrapperContained,useEyeHeight); }
// public EntityLookTarget(yarnwrap.entity.Entity entity,boolean useEyeHeight,boolean blockPosAtEye) { this.wrapperContained = new net.minecraft.entity.ai.brain.EntityLookTarget(entity.wrapperContained,useEyeHeight,blockPosAtEye); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }
// public static yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(net.minecraft.entity.ai.brain.EntityLookTarget.getEntity()); }

}