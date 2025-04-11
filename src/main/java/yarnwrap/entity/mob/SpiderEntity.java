package yarnwrap.entity.mob;
public class SpiderEntity { public net.minecraft.entity.mob.SpiderEntity wrapperContained; public SpiderEntity(net.minecraft.entity.mob.SpiderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData SPIDER_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SPIDER_FLAGS); }
// public void SPIDER_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.SPIDER_FLAGS = value.wrapperContained; }
public Object createSpiderAttributes() { return wrapperContained.createSpiderAttributes(); }
public void setClimbingWall(boolean climbing) { wrapperContained.setClimbingWall(climbing); }
public boolean isClimbingWall() { return wrapperContained.isClimbingWall(); }

}