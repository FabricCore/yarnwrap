package yarnwrap.entity.mob;
public class SpiderEntity { public net.minecraft.entity.mob.SpiderEntity wrapperContained; public SpiderEntity(net.minecraft.entity.mob.SpiderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData SPIDER_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SPIDER_FLAGS); }
// public void SPIDER_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.SPIDER_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SPIDER_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.SpiderEntity.SPIDER_FLAGS); }
// public static void SPIDER_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.SpiderEntity.SPIDER_FLAGS = value.wrapperContained; }

// public Object createSpiderAttributes() { return wrapperContained.createSpiderAttributes(); }
public static Object createSpiderAttributes() { return net.minecraft.entity.mob.SpiderEntity.createSpiderAttributes(); }
// public boolean method_56086(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_56086(entity.wrapperContained); }
// public static boolean method_56086(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.mob.SpiderEntity.method_56086(entity.wrapperContained); }
public void setClimbingWall(boolean climbing) { wrapperContained.setClimbingWall(climbing); }
// public static void setClimbingWall(boolean climbing, ) { net.minecraft.entity.mob.SpiderEntity.setClimbingWall(climbing); }
public boolean isClimbingWall() { return wrapperContained.isClimbingWall(); }
// public static boolean isClimbingWall() { return net.minecraft.entity.mob.SpiderEntity.isClimbingWall(); }

}